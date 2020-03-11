package by.htp.simpleclass.task03;

//Добавьте возможность вывода фамилий и номеров групп студентов,
//имеющих оценки, равные только 5 или 4.

public class StudentsInspector {

	public static void main(String[] args) {

		Student[] mas = new Student[10];

		mas[0] = new Student("Ivan", "Ivanov", 123456, new int[] { 5, 5, 4, 4, 4 });
		mas[1] = new Student("Yanush", "Khotyan", 123456, new int[] { 2, 1, 3, 2, 2 });
		mas[2] = new Student("Alena", "Ivanova", 123456, new int[] { 5, 5, 5, 5, 5 });
		mas[3] = new Student("Tatsiana", "Makarevich", 123456, new int[] { 2, 4, 1, 3, 4 });
		mas[4] = new Student("Aleh", "Nikalaichanka", 123456, new int[] { 6, 6, 6, 6, 6 });
		mas[5] = new Student("Petr", "Petrov", 123456, new int[] { 2, 5, 7, 3, 5 });
		mas[6] = new Student("Nikita", "Ivanov", 123456, new int[] { 6, 5, 7, 2, 4 });
		mas[7] = new Student("Vlad", "Mikhnenok", 12345, new int[] { 1, 2, 3, 4, 5 });
		mas[8] = new Student("Tatsiana", "Kuzmina", 123456, new int[] { 5, 4, 5, 3, 5 });
		mas[9] = new Student("Sidor", "Sidorov", 123456, new int[] { 5, 3, 2, 3, 4 });

		Student[] aLevelStudents;

		aLevelStudents = StudentAction.findALevelStudents(mas);
		StudentAction.printNameSurname(aLevelStudents);

	}

}