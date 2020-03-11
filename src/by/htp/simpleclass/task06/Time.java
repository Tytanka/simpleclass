package by.htp.simpleclass.task06;
/*
 * 6. Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и изменения его отдельных полей 
 * (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 *  недопустимых значений полей поле устанавливается в значение 0. Создать методы
 *   изменения времени на заданное количество часов, минут и секунд. 
 */

public class Time {

	private int hour;
	private int minute;
	private int second;

	Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	Time(int hour, int minute, int second) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
			System.out.println("Значение " + hour + " недопустимо. Установлено значение по умолчанию 0");
		}

		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
			System.out.println("Значение  " + minute + " недопустимо. Установлено значение по умолчанию 0");
		}

		if (second >= 0 && second < 60) {
			this.second = second;
		} else {
			this.second = 0;
			System.out.println("Значение " + second + "недопустимо. Установлено значение по умолчанию 0");
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
			System.out.println("Значение " + hour + " недопустимо. Установлено значение по умолчанию 0");

		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
			System.out.println("Значение " + minute + " недопустимо. Установлено значение по умолчанию 0");
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= 0 && second < 60) {
			this.second = second;
		} else {
			this.second = 0;
			System.out.println("Значение " + second + " недопустимо. Установлено значение по умолчанию 0");
		}
	}

	public void correctHours(int hour) {
		if (this.hour + hour < 24 && this.hour + hour >= 0) {
			this.hour += hour;
		} else {
			System.out.println("Неверно. Значение  " + hour + "выходит за пределы суток. Часы не изменены");
		}

	}

	public void correctMinutes(int minute) {
		if (this.minute + minute >= 0 && this.minute + minute < 60) {
			this.minute += minute;
		} else {
			if (this.hour + minute / 60 >= 0 && this.hour + minute / 60 < 24) {
				this.hour += (int) minute / 60;
				this.minute += minute % 60;
			} else {
				System.out.println("Неверно значение " + minute + ". Время не изменено");
			}
		}
	}

	public void correctSeconds(int second) {

		if (this.second + second >= 0 && this.second + second < 60) {
			this.second += second;
		} else {
			if ((this.minute + (second / 60)) >= 0 && (this.minute + (second / 60)) < 60) {
				this.minute += (int) second / 60;
				this.second += second % 60;

			} else {
				if (this.hour + (second / 60) / 60 >= 0 && this.hour + (second / 60) / 60 < 24) {

					this.second += second % 60;
					this.minute += second / 60;

					this.hour += (int) this.minute / 60;

					this.minute %= 60;

				} else {
					System.out.println("Неверно значение " + second + ". Время не изменено");
				}
			}
		}

	}

	public void printTime() {
		System.out.format("%02d:%02d:%02d%n", hour, minute, second);
	}
}
