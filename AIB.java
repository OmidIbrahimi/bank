package bank;

public class AIB extends bank{
	String branch;
	AIB(int nsiumberOfEmpaloyee, int numberOfYear, address myAddress,String branch) {
		super(nsiumberOfEmpaloyee, numberOfYear, myAddress);
		this.branch = branch;
	}

	public void info() {
		System.out.println("welcome to the AIB bank");
		System.out.println("you can chang tonam to afg");

	}

	public void changemony(double i) {

		System.out.println(i + "AF(s) is equal to " + i / 18 + "toman(s)");
	}

}
