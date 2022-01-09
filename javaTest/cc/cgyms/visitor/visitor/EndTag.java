package book.cgyms.visitor.visitor;

public class EndTag extends AbstractNode {
	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitEndTag(this);
	}
}
