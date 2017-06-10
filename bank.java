package bank;

public class bank {

	private int numberOfEmpaloyee;
	private int numberOfYear;
	private address myAddress;

	bank(int nsiumberOfEmpaloyee, int numberOfYear, address myAddress) {
		this.numberOfEmpaloyee = numberOfEmpaloyee;
		this.numberOfYear = numberOfYear;
		this.myAddress = myAddress;
	}

	public void info() {
		System.out.println("welcome to the bank");

	}

	public void changemony(double i) {
		System.out.println(i);
	}

	public int getNumberOfEmpaloyee() {
		return numberOfEmpaloyee;
	}

	public void setNumberOfEmpaloyee(int numberOfEmpaloyee) {
		this.numberOfEmpaloyee = numberOfEmpaloyee;
	}

	public int getNumberOfYear() {
		return numberOfYear;
	}

	public void setNumberOfYear(int numberOfYear) {
		this.numberOfYear = numberOfYear;
	}

}
