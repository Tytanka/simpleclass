package by.htp.simpleclass.task06;

public class TimeInspektor {

	public static void main(String[] args) {
		Time time = new Time();
		time.printTime();
		Time time2 = new Time(12, 15, 01);
		time2.printTime();
		time2.correctHours(3);
		time2.printTime();
		time2.correctMinutes(8);
		time2.printTime();
		time2.correctSeconds(15);
		time2.printTime();

	}

}
