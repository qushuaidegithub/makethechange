package book.cgyms.visitor.visitor;

public interface NodeVisitor {
	public abstract void visitTag(Tag tag);

	public abstract void visitEndTag(EndTag endTag);

	public abstract void visitLinkTag(LinkTag linkTag);

	public abstract void visitStringNode(StringNode stringNode);
}
