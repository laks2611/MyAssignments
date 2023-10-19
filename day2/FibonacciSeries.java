package week.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,count=7;
		System.out.println(n1);
		System.out.println(n2);
		for (int j = 2; j < count; ++j) {
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
	}

}
