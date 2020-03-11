package by.htp.simpleclass.task09;

/*
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
 *  set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Book,
 *   с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
 *    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
 *    Найти и вывести:  a) список книг заданного автора;  b) список книг, выпущенных заданным издательством;  
 *     c) список книг, выпущенных после заданного года. 
 */

public class Book {

	    private int id;
	
	    private String titel;
	    private String author;
	    private String publishingComp;
	    private int year;
	    private int pages;
	    private double price;
	    private String cover;
		  
	    private static int countId;
	    
       
	    Book(String titel, String author, String publishingComp, int year, int pages, double price, String  cover){
	       
	        countId++;
	        
	    	this.id = id+countId;
	        this.titel = titel;
	        this.author = author;
	        this.publishingComp = publishingComp;
	        this.cover = cover;
	        
	        if(year > 1500 && year <= 2020) {
	            this.year = year;
	        }else{
	            System.out.println("Неверно введены данные 1500<год<2020" );
	        }

	        if(pages > 0){
	            this.pages =  pages;

	        }else{
	            System.out.println("Количество страниц не может быть меньше 1");
	        }

	        if(price > 0){
	            this.price = price;

	        }else{
	            System.out.println("Цена не может быть меньше 1");
	        }

	    }

	    public int getId(){
	        return id;
	    }
	    public void setId(int id) {
	    	 this.id = id;
	    }

	    public String getTitel() {
	        return titel;
	    }

	    public void setTitel(String titel) {
	        this.titel = titel;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getPublishingComp() {
	        return publishingComp;
	    }

	    public void setPublishingComp(String publishingComp) {
	        this.publishingComp = publishingComp;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public int getPages() {
	        return pages;
	    }

	    public void setPages(int pages) {
	        this.pages = pages;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public String getCover(){
	        return cover;
	    }
	    
	    public void setCover(String cover) {
	        this.cover = cover;
	    }
	   
	
	    @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((author == null) ? 0 : author.hashCode());
			result = prime * result + ((cover == null) ? 0 : cover.hashCode());
			result = prime * result + id;
			result = prime * result + pages;
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((publishingComp == null) ? 0 : publishingComp.hashCode());
			result = prime * result + ((titel == null) ? 0 : titel.hashCode());
			result = prime * result + year;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			if (author == null) {
				if (other.author != null)
					return false;
			} else if (!author.equals(other.author))
				return false;
			if (cover == null) {
				if (other.cover != null)
					return false;
			} else if (!cover.equals(other.cover))
				return false;
			if (id != other.id)
				return false;
			if (pages != other.pages)
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			if (publishingComp == null) {
				if (other.publishingComp != null)
					return false;
			} else if (!publishingComp.equals(other.publishingComp))
				return false;
			if (titel == null) {
				if (other.titel != null)
					return false;
			} else if (!titel.equals(other.titel))
				return false;
			if (year != other.year)
				return false;
			return true;
		}

		@Override
	    public String toString(){
	        return "ID№" + id + "\nНазвание: " + titel + "\nАвтор(ы): " + author + "\nИздательство: " + publishingComp + "\nГод издания: " + year + "\nКол-во страниц: " + pages + "\nТип обложки: " +cover + "\nЦена: " + price + " руб.\n\n";
	    }


	}


