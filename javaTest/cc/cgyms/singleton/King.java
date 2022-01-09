package book.cgyms.singleton;

public class King {
	private static King king = new King();

	private King() {}

	public static King getInstance() {
//		if (king == null) {
//			return new King();
//		}
		return king;
	}
}
