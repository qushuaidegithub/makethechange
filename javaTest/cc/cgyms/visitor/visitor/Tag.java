package book.cgyms.visitor.visitor;

public class Tag extends AbstractNode {
	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitTag(this);
	}
}
