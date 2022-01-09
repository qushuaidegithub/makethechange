package book.cgyms.visitor;

public interface Student {
	public void passOn(Visitor visitor);
	public String getName();
}
