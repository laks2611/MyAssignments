package week.day2;

public class IsPrime {
	public static void main(String[] args) {
		int n=23;
		boolean isPrime = true;
		for (int i = 2; i <= n/2; ++i) {
			if (n%i==0) {
				isPrime = false;
				break;
				
			}
			
		}
		if (isPrime) {
			System.out.println("Prime number:"+n);
		}
		else {
			System.out.println("Not a Prime number:"+n);
		}
	}

}


