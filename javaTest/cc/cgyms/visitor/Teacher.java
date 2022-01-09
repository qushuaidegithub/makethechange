package book.cgyms.visitor;

public class Teacher implements Visitor {
	public StringBuffer checkList = new StringBuffer("老师检查学生作业：");

	@Override
	public void check(Student student) {
		checkList.append(student.getName()).append("作业检查完毕……");
	}
	
	@Override
	public String showCheckList() {
		return checkList.toString();
	}
}
