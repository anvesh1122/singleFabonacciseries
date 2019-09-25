package Programmes;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int temp1 = 0;
		int temp2 =1;
		 for(int i=0;i<=n;i++) {
			 int sumtotal = temp1+ temp2 ;
			 temp1 =temp2;
			 temp2 = sumtotal ;
			 System.out.println(sumtotal);
			 
		 }

	}

}
