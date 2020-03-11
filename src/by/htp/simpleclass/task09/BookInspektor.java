package by.htp.simpleclass.task09;

public class BookInspektor {

	public static void main(String[] args) {
	
		 Book BookOne = new Book("Алиса в стране чудес","Льюис Кэрролл","ОАО \"Полиграфкомбинат им. Я. Коласа\"", 2018,140,13.35 ,"Твердый");
	        Book BookTwo = new Book("Алиса в зазеркалье","Льюис Кэрролл","ОАО \"Полиграфкомбинат им. Я. Коласа\"", 2018,143,14.00 ,"Твердый");
	        Book BookThree = new Book("Федорино горе","Корней Чуковский","ООО \"РОСМЭН-ПРЕСС\"",2013,14,2.5, "Мягкий");
	        Book BookFour = new Book("Айболит и другие сказки", "Корней Чуковский","ЗАО \"Омега-пресс\"", 2013, 64,8.67, "Твердый");
	        Book BookFive = new Book("Любимые стихи", "Агния Барто", "ООО \"Клуб Семейного досуга\"", 2012, 64,12.3,"Твердый");


	        Library archive = new Library(BookOne);
	        archive.addBook(BookTwo);
	        archive.addBook(BookThree);
	        archive.addBook(BookFour);
	        archive.addBook(BookFive);
	    
	   
	        for(Book b: archive.showBook()) {
	            System.out.println(b);

	        }
	        archive.removeBook(1);

	        System.out.println("Список после удаления");
	        for(Book b: archive.showBook()) {
	            System.out.println(b);

	        }


	        System.out.println(" список книг заданного автора:");
	        archive.booksOfAuthor("Льюис Кэрролл");



	        System.out.println("список книг, выпущенных заданным издательством:");
	        archive.booksPublishBy("РОСМЭН-ПРЕСС");

	        System.out.println("\tВыпущена после:");
	        archive.booksPublishAfter(2015);

	    }
	}


