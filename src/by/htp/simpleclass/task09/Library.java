package by.htp.simpleclass.task09;

public class Library {
	
 Book [] book = new Book[5];

	Library(){}

	Library(Book book){
	        this.book[0] = book;
	    }

	    public void addBook(Book book){
	        for(int i = 0; i < this.book.length; i++){
	            if(this.book[i] == null){
	                this.book[i] = book;
	                break;
	            }
	            if(i == this.book.length - 1 && this.book[i] != null){
	                System.out.println("Невозможно ввести более "+this.book.length + "книг");
	            }
	        }
	    }

	    public void removeBook(int id){
	        for(int i = 0; i < this.book.length; i++){
	            if(this.book[i] != null && this.book[i].getId() == id){
	                this.book[i] = null;
	                break;
	            }
	            if(i == this.book.length - 1 && (this.book[i] == null || this.book[i].getId() != id)){
	                System.out.println("Книга с таким номером отсутствует" + id);
	            }
	        }
	    }

	    public Book[] showBook(){
	        int countBook = 0;
	        for(int i = 0; i < book.length; i++){
	            if(book[i] != null){
	                countBook++;
	            }
	        }

	        Book [] booksInLibrary = new Book[countBook];

	        for (int i = 0, j = 0; i < this.book.length; i++) {
	            if (this.book[i] != null) {
	                booksInLibrary[j] = this.book[i];
	                j++;
	                continue;
	            }
	        }

	        return booksInLibrary;
	    }


	    public void booksOfAuthor(String author){

	        for (int i = 0; i < showBook().length; i++){
	            if (showBook()[i].getAuthor().contains(author)){
	                System.out.println(showBook()[i]);
	            }
	        }
	    }


	    public void booksPublishBy(String publishingComp){
	        for (int i = 0; i < showBook().length; i++){
	            if (showBook()[i].getPublishingComp().contains(publishingComp)){
	                System.out.println(showBook()[i]);
	            }
	        }
	    }


	    public void booksPublishAfter(int year){
	        for (int i = 0; i < showBook().length; i++){
	            if (showBook()[i].getYear() > year){
	                System.out.println(showBook()[i]);
	            }
	        }
	    }

}
