package book.cgyms.visitor.visitor;

public class StringNode extends AbstractNode {
	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitStringNode(this);
	}
}
