
public class MethodRun {
	public static void main(String[] args) {
		
		long fib1 = 0;
        long fib2 = 1;
        long sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += fib2;
            long temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }
        
        System.out.println(sum);
	}
}
