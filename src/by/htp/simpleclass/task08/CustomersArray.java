package by.htp.simpleclass.task08;

public class CustomersArray {
	private Customer[] customer = new Customer[5];

	CustomersArray() {
	}

	CustomersArray(Customer customer) {
		this.customer[0] = customer;
	}

	public void addCustomer(Customer customer) {
		for (int i = 0; i < this.customer.length; i++) {
			if (this.customer[i] == null) {
				this.customer[i] = customer;
				break;
			}

			if (i == this.customer.length - 1 && this.customer[i] != null) {
				System.out.println("Cann't add, array is full");
			}
		}

	}

	public void removeCustomer(int custId) {
		for (int i = 0; i < this.customer.length; i++) {
			if (this.customer[i] != null && this.customer[i].getId() == custId) {
				this.customer[i] = null;
				break;
			}

			if (i == this.customer.length - 1 && (this.customer[i] == null || this.customer[i].getId() != custId)) {
				System.out.println("There is no customer with id#" + custId);
			}

		}
	}

	public Customer[] showCustomer() {
		int countBook = 0;
		for (int i = 0; i < customer.length; i++) {
			if (customer[i] != null) {
				countBook++;
			}
		}

		Customer[] booksInLibrary = new Customer[countBook];

		for (int i = 0, j = 0; i < this.customer.length; i++) {
			if (this.customer[i] != null) {
				booksInLibrary[j] = this.customer[i];
				j++;
				continue;
			}
		}

		return booksInLibrary;
	}

	public Customer[] sortCustomer() {
		int countCustomers = 0;
		for (int i = 0; i < customer.length; i++) {
			if (customer[i] != null) {
				countCustomers++;
			}
		}

		Customer[] sortCustomer = new Customer[countCustomers];

		for (int i = 0, j = 0; i < customer.length; i++) {
			if (customer[i] != null) {
				sortCustomer[j] = customer[i];
				j++;
			}
		}

		for (int i = 1; i < sortCustomer.length; i++) {

			char[] firstCustomer = sortCustomer[i - 1].getLastName().trim().toCharArray();
			char[] secondCustomer = sortCustomer[i].getLastName().trim().toCharArray();
			for (int j = 0; j < firstCustomer.length && j < secondCustomer.length; j++) {
				if (firstCustomer[j] < secondCustomer[j]) {
					break;
				} else if (firstCustomer[j] > secondCustomer[j]) {
					Customer change = sortCustomer[i];
					sortCustomer[i] = sortCustomer[i - 1];
					sortCustomer[i - 1] = change;
					if (i > 1) {
						i -= 2;
					} else {
						i--;
					}
					break;
				} else {
					continue;
				}
			}
		}
		return sortCustomer;
	}

	public void showCardFromTo(long rangeFrom, long rangeTo) {
		int countTrue = 0;
		for (int i = 0; i < sortCustomer().length; i++) {
			if (sortCustomer()[i].getLongCardNumber() > rangeFrom && sortCustomer()[i].getLongCardNumber() < rangeTo) {
				System.out.println(sortCustomer()[i]);
				countTrue++;
			}
		}
		if (countTrue == 0) {
			System.out.println("Не найдено покупателей с номером кредитной карточки в заданном интервале ");
		} else {
			System.out.println("Найдено " + countTrue + "покупателя");
		}
	}

}
