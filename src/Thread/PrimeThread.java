package Thread;

import java.util.List;

public class PrimeThread extends Thread {
    long threadNumber;
    public static int max = 0;
    public static int min =0;
    public static int[] primes = new int[100000];
    public static int count =0;
    PrimeThread(long threadnbr) {
    	 threadNumber = threadnbr;
    }

    public void run() {
    	// compute primes larger than minPrime
    	for(int i=min; i<=max;i++){
    		if(prime(i)){
    			System.out.println(count+" : "+i);
    			primes[count]=i;
    			count++;
    		}
    	}
          
    	
         //  . . .
    }
    public static boolean prime(final long n) {
        final long maxI = (long) Math.sqrt(n); // faster than calculation of i*i each time
        for (long i = 3; i <= maxI; i += 2)
            if (n%i==0) return false;
        return true;
    }
}
