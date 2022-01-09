package book.cgyms.singleton;

public class Test {

	public static void main(String[] args) {
		King king = King.getInstance();

		King king2 = King.getInstance();

		System.out.println(king == king2);
	}

}
