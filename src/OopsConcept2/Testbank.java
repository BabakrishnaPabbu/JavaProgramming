package OopsConcept2;

public class Testbank {

	public static void main(String[] args) {
		System.out.println(RBI.minbal);
		
		Localbank l = new Localbank();
		l.credit();
		l.debit();
		l.loan();
		l.invest();
		l.SavingAcc();
		RBI r = new Localbank();
		r.credit();
		r.debit();
		r.loan();

	}

}
