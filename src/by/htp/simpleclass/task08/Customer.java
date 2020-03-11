package by.htp.simpleclass.task08;

/*
 * 8. Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими 
 * конструкторами и методами. Задать критерии выбора данных и вывести эти
 *  данные на консоль.  Класс Customer: id, фамилия, имя, отчество, адрес, 
 *  номер кредитной карточки, номер банковского счета.  Найти и вывести:  
 *  a) список покупателей в алфавитном порядке;  b) список покупателей, у 
 *  которых номер кредитной карточки находится в заданном интервале 
 */

public class Customer {

	private int id;
	private String lastName;
	private String firstName;
	private String middleName;
	private String adress;
	private String cardNumber;
	private long bankAccount;

	private static int idCount = 0;

	Customer() {
		

	}

	Customer(String lastName, String firstName, String middleName, String adress, String cardNumber, long bankAccount) {
		idCount++;
		id = idCount;

		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.adress = adress;
		if (bankAccount > 0) {
			this.bankAccount = bankAccount;
		} else {
			System.out.println("Bank account cann't be negative" + bankAccount + " Check id#" + id);
		}

		this.cardNumber = cardNumber.replaceAll("[ .,-]", "");

	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCardNumber() {
		return cardNumber.substring(0, 4) + "." + cardNumber.substring(4, 8) + "." + cardNumber.substring(8, 12) + "."
				+ cardNumber.substring(12);
	}

	public long getLongCardNumber() {
		return Long.parseLong(cardNumber);
	}

	public void setCardNumber(String cardNumber) {

		this.cardNumber = cardNumber.replaceAll("[ .,-]", "");
	}

	public long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {

		this.bankAccount = bankAccount;

	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + (int) (bankAccount ^ (bankAccount >>> 32));
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
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
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (bankAccount != other.bankAccount)
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		return true;
	}

	@Override
	public String toString() {

		return "\ni№" + id + "\nlast name: " + lastName + " first name: " + firstName + " middleName: "
				+ middleName + "\nadress: " + adress + "\ncard number: " + cardNumber  + "\nbank account: " + bankAccount + "\n\n";

	}
}
