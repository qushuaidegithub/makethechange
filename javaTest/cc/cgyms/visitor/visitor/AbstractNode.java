package book.cgyms.visitor.visitor;

public abstract class AbstractNode implements Node {
	@Override
	public abstract void accept(NodeVisitor nodeVisitor);
}
