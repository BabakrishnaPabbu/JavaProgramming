package Day1;

public class Array {
	public static void main(String[] args) {
		
		int i[] = new int[3];

           i[0]=1;
		   i[1]=2;
		 i[2]=3;
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		Object o[] = new Object[4];

        o[0]=1;
		   o[1]="o";
		 o[2]="bk";
		 o[3]=1.19;
		 
		for(int p=0;p<i.length;p++) {
			System.out.println(o[p]);
		}
		

		int a[][] = new int[2][2];

           a[0][0]=1;
           a[1][0]=2;
           a[0][1]=3;
           a[1][1]=4;
           for(int b=0;b<a.length;b++) {
        	   for(int c=0;c<a[0].length;c++) {
   			System.out.println(a[b][c]);
   		}
	}
}
}