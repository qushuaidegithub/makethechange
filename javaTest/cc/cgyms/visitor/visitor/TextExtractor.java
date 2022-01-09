package book.cgyms.visitor.visitor;

public class TextExtractor implements NodeVisitor {
	Node node;

	public String etractText() {
		for (NodeIterator e = parser.elements(); e.hasMoreNodes();) {
			node = e.nextNode();
			node.accept(this);
		}
	}

	@Override
	public void visitTag(Tag tag) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitEndTag(EndTag endTag) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitLinkTag(LinkTag linkTag) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitStringNode(StringNode stringNode) {
		// TODO Auto-generated method stub

	}

}
