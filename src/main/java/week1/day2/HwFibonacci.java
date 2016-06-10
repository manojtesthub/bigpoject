package week1.day2;

public class HwFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b=0, c=1;
		for(int i=1;i<15;i++){
			System.out.print(" "+c);
			a = b;
			b = c;
			c = a + b;
			
		}
	
	}

}
