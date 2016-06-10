package week2.day2;

public class Jaacode {

	public static void main(String args[])
    {
        int i, j, k=1;
        for(i=0; i<5; i++)
        {
            for(j=0; j<k; j++)
            {
                System.out.print("* ");
            }
            k = k + 2;
            System.out.println();
        }
    }
}
	
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int max = 5;    //max no. in series
	        //Upper Triangle
	        for(int i=1;i<=max;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print("*");
	            }
	            for(int k=i-1;k>=1;k--){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        //Lower Triangle
	        for(int i=1;i<=max-1;i++){
	            for(int j=1;j<=max-i;j++){
	                System.out.print(j);
	            }
	            for(int k=max-i-1;k>=1;k--){
	                System.out.print(k);
	            }
	            System.out.println();
	        }
	    }
	
	}




*/