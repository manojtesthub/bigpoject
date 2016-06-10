package week1.day2;

public class HwPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 45;
        
        boolean isPrime = true;
        for (int i = 2; i < n-1; i++) {
     	     if (n % i == 0) {   	
        	                isPrime = false;	
        	                break;
        	                }
        }
        	   if (isPrime==true) {
        
        	            System.out.println(n + " is prime");
        	            
        
        	        } else {
        
        	            System.out.println(n + " not prime");
        	            
        
        	       }

}
}





