package week1.day1.homeassignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int a=0;
		int b=1;
		System.out.println(a +"\n"+ b);
		int c;	
		for(int i=0;i<range;i++)
			{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
