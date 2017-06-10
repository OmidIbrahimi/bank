package bank;

public class kabul extends bank{
	String branch;
	kabul(int nsiumberOfEmpaloyee, int numberOfYear, address myAddress,String branch) {
		super(nsiumberOfEmpaloyee, numberOfYear, myAddress);
		this.branch = branch;
	}

	public void info() {
		System.out.println("welcome to the kabul bank");
		System.out.println("you can chang dollar to afg");

	}

	public void changemony(double i) {

		System.out.println(i + "AF(s) is equal to " + i / 60 + "dollar(s)");
	}
}
