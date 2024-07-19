package Abstraction;

public class TestBank {

	public static void main(String[] args) {

		SBI sb = new SBI();
		sb.credit();
		sb.moneylending();
		sb.reporate();
		sb.reversereporate();
		RBI r = new SBI();
		r.reporate();
		r.reversereporate();
		r.moneylending();
		
		
	}

}
