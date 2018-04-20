package de.hszemi.rmsplugin;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.TokenType;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.IElementType;
import de.hszemi.rmsplugin.psi.RmsTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class RmsBlock extends AbstractBlock {
	private SpacingBuilder spacingBuilder;

	protected RmsBlock(@NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment,
					   SpacingBuilder spacingBuilder) {
		super(node, wrap, alignment);
		this.spacingBuilder = spacingBuilder;
	}

	@Override
	protected List<Block> buildChildren() {
		List<Block> blocks = new ArrayList<>();
		ASTNode child = myNode.getFirstChildNode();
		while (child != null) {
			IElementType type = child.getElementType();
			if (type != TokenType.WHITE_SPACE) {
				Block block = new RmsBlock(child, Wrap.createWrap(WrapType.NONE, false), Alignment.createAlignment(),
						spacingBuilder);
				blocks.add(block);
			}
			child = child.getTreeNext();
		}
		return blocks;
	}

	@Override
	public Indent getIndent() {
		ASTNode treeParent = this.getNode().getTreeParent();
		if (treeParent != null) {
			IElementType elementType = treeParent.getElementType();
			if (elementType == RmsTypes.BLOCK_CONTENT) {
			return Indent.getNormalIndent();
		}
			if (elementType == RmsTypes.PERCENT_CHANCE_BLOCK) {
			return Indent.getNormalIndent();
		}
			if (elementType == RmsTypes.NON_BRACKETS_COMMAND_IN_BRACKETS) {
			return Indent.getNormalIndent();
			}
		}
		return Indent.getNoneIndent();
	}

	@Nullable
	@Override
	public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
		return spacingBuilder.getSpacing(this, child1, child2);
	}

	@Override
	public boolean isLeaf() {
		return myNode.getFirstChildNode() == null;
	}
}
