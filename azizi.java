package bank;

public class azizi extends bank {

	String branch;

	azizi(int nsiumberOfEmpaloyee, int numberOfYear, address myAddress, String branch) {
		super(nsiumberOfEmpaloyee, numberOfYear, myAddress);
		this.branch = branch;

	}

	public void info() {
		System.out.println("welcome to the azizi bank");
		System.out.println("you can chang euro to afg");

	}

	public void changemony(double i) {

		System.out.println(i + "AF(s) is equal to " + i / 70 + "euro(s)");
	}

}
