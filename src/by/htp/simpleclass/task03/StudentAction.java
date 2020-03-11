package by.htp.simpleclass.task03;

public class StudentAction {
	public static Student[] findALevelStudents(Student[] students) {
		Student[] rezult = new Student[students.length];

		int i = 0;
		for (Student st : students) {
			if (isALevelStudent(st)) {
				rezult[i] = st;
				i++;
			}
		}

		Student[] finalRezult = new Student[i];
		for (int j = 0; j < finalRezult.length; j++) {
			finalRezult[j] = rezult[j];
		}

		return finalRezult;
	}

	public static boolean isALevelStudent(Student student) {
		int[] marks;

		marks = student.getMarks();

		for (int mark : marks) {
			if (mark < 4) {
				return false;
			}
		}

		return true;

	}

	public static void printNameSurname(Student[] students) {

		for (Student st : students) {
			System.out.println(st.getName() + ", " + st.getGroupNumber());
		}

	}

}