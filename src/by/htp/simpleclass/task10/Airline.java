package by.htp.simpleclass.task10;

/*10. Создать класс Airline, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.  Airline: пункт назначения, номер рейса, 
 * тип самолета, время вылета, дни недели.  Найти и вывести:  a) список рейсов для заданного пункта назначения; 
 *  b) список рейсов для заданного дня недели;  c) список рейсов для заданного дня недели, время вылета для которых больше заданного. 
*/
public class Airline {
	private String destination;
	private String flightNum;
	private String type;
	private String departureTime;
	private DayOfWeek dayOfWeek;

	public Airline() {

	}

	Airline(String destination, String flightNum, String type, String departureTime, DayOfWeek dayOfWeek) {
		this.destination = destination;
		this.flightNum = flightNum;
		this.type = type;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlight(String flight) {

		this.flightNum = flight;

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {

		this.departureTime = departureTime;

	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightNum == null) ? 0 : flightNum.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Airline other = (Airline) obj;
		if (dayOfWeek != other.dayOfWeek)
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNum == null) {
			if (other.flightNum != null)
				return false;
		} else if (!flightNum.equals(other.flightNum))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNum=" + flightNum + ", type=" + type
				+ ", departureTime=" + departureTime + ", dayOfWeek=" + dayOfWeek + "]";
	}

}
