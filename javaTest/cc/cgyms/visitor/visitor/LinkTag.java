package book.cgyms.visitor.visitor;

public class LinkTag extends AbstractNode {
	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitLinkTag(this);
	}
}
