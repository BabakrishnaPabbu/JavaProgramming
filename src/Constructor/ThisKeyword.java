package Constructor;

public class ThisKeyword {
	
	String company;
	int workExperience;
	public ThisKeyword(String company,int workExperience) {
		this.company= company;
		this.workExperience= workExperience;
		System.out.println(company);
		 System.out.println(workExperience);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword t = new ThisKeyword("steadfast",2);

	}

}
