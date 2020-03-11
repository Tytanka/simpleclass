package by.htp.simpleclass.task08;

public class CustomerInspektor {

	public static void main(String[] args) {
		 Customer ivanov = new Customer("Ivanov", " Ivan","Ivanovich","Vitebsk, Lenina,43" ,"2354.2547.2544.5787", 1234587962);
	        Customer petrov = new Customer("Petrov", "Petr", "Petrovich", "Minsk, Lokomotivnaya,20", "4572.1445.5879.3564", 584542311);
	        Customer ivanova = new Customer("Ivanova", " Marina","Nikolaevna","Mogilev,Melioratorov,35","5874.2658.4412.6887",584113353);
	        Customer kovalev = new Customer("Kovalev", "Andrei","Igorevich","Vitebsk, Brovki,17", "7854.5858.5687.1487",332154422);
	        Customer kuzmenkova = new Customer("Kuzmenkova", "Anna", "Andreevna", "Vitebsk,Smolenskaya, 1", "2547.5844.6898.9633", 589523655);

	        CustomersArray bank = new CustomersArray();
	        bank.addCustomer(ivanov);
	        bank.addCustomer(petrov);
	        bank.addCustomer(ivanova);
	        bank.addCustomer(kovalev);
	        bank.addCustomer(kuzmenkova);

	       
	        for (Customer cust : bank.showCustomer()){
	            System.out.println(cust);
	        }
	        
	        System.out.println("список клиентов в алфавитном порядке");
	        for (Customer cust : bank.sortCustomer()){
	            System.out.println(cust);
	        }
	       
	       

	        System.out.println(" список клиентов, у которых номер кредитной карточки находится в заданном интервале");

	        bank.showCardFromTo(0, 4572_1445_5879_3565L);
	    }

	}


