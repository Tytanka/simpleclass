package by.htp.simpleclass.task10;

public class AirlineInspector {
	 public static void main(String[] args){
	        Airline moskow = new Airline("Moskow", "1120", "BOEING", "10:00", DayOfWeek.MONDAY);
	        Airline paris = new Airline("Paris", "1452", "BOEING", "11:30", DayOfWeek.FRIDAY);
	        Airline helsinki = new Airline("Helsinki", "2355","AIRBUS", "12:45", DayOfWeek.WEDNESDAY);
	        Airline helsinki2 = new Airline("Helsinki", "2255", "Il", "13:15", DayOfWeek.SUNDAY);
	        Airline london = new Airline("London", "5552", "TY", "14:20", DayOfWeek.FRIDAY);

	                      

	        WizzAir wizz = new WizzAir();
	        wizz.addFlight(moskow);
	        wizz.addFlight(paris);
	        wizz.addFlight(helsinki);
	        wizz.addFlight(helsinki2);
	        wizz.addFlight(london);
	       
	      
	        for(Airline fl: wizz.showFlights()){
	            System.out.println(fl);
	        }

	       wizz.removeFlight("5552");
	   
	        System.out.println("-----------------");
	        for(Airline fl: wizz.showFlights()){
	            System.out.println(fl);
	        }

	       
	      wizz.addFlight(london);
	        System.out.println("-----------------");
	        for(Airline fl: wizz.showFlights()){
	            System.out.println(fl);
	        }

	       
	        System.out.println("\n\n список рейсов для заданного пункта назначения:");
	        wizz.showFlightsTo("Helsinki");

	        System.out.println("\n\n список рейсов для заданного дня недели");

	        wizz.showFlightsOfDay(DayOfWeek.MONDAY);

	        System.out.println("\n\n список рейсов для заданного дня недели, время вылета для которых больше заданного");
	        wizz.showFlightsOfDayAfter(DayOfWeek.FRIDAY, "12-00");

	    }

}
