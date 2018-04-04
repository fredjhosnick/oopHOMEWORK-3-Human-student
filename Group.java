package oppHomeWork3;

public class Group {

	private Student[] group = new Student[10];

	private int p = 11;

	public void add(Student student) throws MyException {
		if (p == 10) {
			throw new MyException();
		}
		group[p++] = student;
	}

	public String findStudent(String surname) {
		for (Student elem : group) {
			if (elem != null && elem.getSurname().equals(surname)) {
				return elem.toString();
			}
		}
		return "This person is not in the student group";
	}

}
