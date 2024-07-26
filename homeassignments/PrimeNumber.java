package week1.day1.homeassignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 10;
        if(n == 0||n==1) {
            System.out.println("0 and 1 is not a prime number");
            }
        
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println(n + " not a prime number");
                return;
            }
        }
        
        System.out.println(n +" is a prime number");

	}

}
