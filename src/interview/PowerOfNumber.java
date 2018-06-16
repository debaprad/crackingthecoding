package interview;

public class PowerOfNumber {

	public static void main(String[] args) {
		System.out.println(isPower(32));
	}
	 static boolean isPower(int n)
	    {
	        for (int x = 2; x <= Math.sqrt(n); x++) {
	            int p = x;
	            while (p <= n) {
	                p = p * x;
	                if (p == n)
	                    return true;
	            }
	        }
	        return false;
	    }
}
