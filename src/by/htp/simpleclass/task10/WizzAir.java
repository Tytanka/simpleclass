package by.htp.simpleclass.task10;

public class WizzAir {
	 private Airline [] airline = new Airline[5];

	 WizzAir(){};
	 WizzAir(Airline flight){
	        this.airline[0] = flight;
	    }


	    public void addFlight(Airline flightNum){
	        for(int i = 0; i < this.airline.length; i++){
	            if(this.airline[i] == null){
	                this.airline[i] = flightNum;
	                break;
	            }
	            if(i == this.airline.length - 1 && this.airline[i] != null){
	                System.out.println("Невозможно добавить номер рейса");
	            }
	        }
	    }


	    public void removeFlight(String flightNum){
	        for(int i = 0; i < this.airline.length; i++){
	            if(this.airline[i] != null && this.airline[i].getFlightNum().toLowerCase().contains(flightNum)){
	                this.airline[i] = null;
	                break;
	            }

	            if(i == this.airline.length - 1 && (this.airline[i] == null || !(this.airline[i].getFlightNum().toLowerCase().contains(flightNum)))){
	                System.out.println("Такого номера рейса нет " + flightNum);
	            }
	        }
	    }


	    public Airline[] showFlights(){
	        int countFlights = 0;

	        for(int i = 0; i < airline.length; i++){
	            if(airline[i] != null){
	                countFlights++;
	            }
	        }

	        Airline[] showFlights = new Airline[countFlights];

	        for(int i = 0, j = 0; i < airline.length; i++){
	            if(airline[i] != null){
	                showFlights[j] = airline[i];
	                j++;
	            }
	        }


	        return showFlights;
	    }

	    public void showFlightsTo(String destination){
	        for (int i = 0; i < showFlights().length; i++){
	            if(showFlights()[i].getDestination().toLowerCase().contains(destination.toLowerCase())){
	                System.out.println(showFlights()[i]);
	            }
	        }
	    }


	    public  void showFlightsOfDay(DayOfWeek day){
	        for (int i = 0; i < showFlights().length; i++){
	            if(showFlights()[i].getDayOfWeek() == day){
	                System.out.println(showFlights()[i]);
	            }
	        }
	    }


	    public void showFlightsOfDayAfter(DayOfWeek day, String departureAfter){
	       
	            String [] hourMinutesAfter = departureAfter.split("[ :-]");
	            int hourAfter = Integer.parseInt(hourMinutesAfter[0]);
	            int minutesAfter = Integer.parseInt(hourMinutesAfter[1]);
	            for (int i = 0; i < showFlights().length; i++) {
	                String[] hourMinutesFlight = showFlights()[i].getDepartureTime().split("[ :-]");
	                int hourFlight = Integer.parseInt(hourMinutesFlight[0]);
	                int minutesFlight = Integer.parseInt(hourMinutesFlight[1]);

	                if(hourAfter < hourFlight && day == showFlights()[i].getDayOfWeek()){
	                    System.out.println(showFlights()[i]);
	                }else if(hourAfter == hourFlight && minutesAfter < minutesFlight && day == showFlights()[i].getDayOfWeek()){
	                    System.out.println(showFlights()[i]);
	                }else{
	                    continue;
	                }
	            }
	        
	        }
	    }


