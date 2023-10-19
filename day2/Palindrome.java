package week.day2;

public class Palindrome {
	public static void main(String[] args) {
		int n,sum;
		n=12321;
		sum=0;
		for (int i = n; i >0; i/=10) {
			int r =i%10;
			sum=sum*10+r;
			
		}
		if (n== sum) {
			System.out.println(n+" is palindrome");
			
		}
		else {
			System.out.println(n+" is not palindrome");
		}
	}

}
