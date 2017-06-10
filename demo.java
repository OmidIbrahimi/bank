package bank;

public class demo {

	public static void main(String[] args) {
		address d = new address("45-st");
		
		bank b1 = new azizi(50,1350,d,"4");
		b1.info();
		b1.changemony(7000);
		
		System.out.println();
		bank b2 = new kabul(30,1380,d,"4");
		b2.info();
		b2.changemony(6000);
		
		System.out.println();
		bank b3 = new AIB(70,1390,d,"4");
		b3.info();
		b3.changemony(1800);
		
		
		
	}

}
