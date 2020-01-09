import java.util.*;

class problem10 {

	public static void main (String[] args) throws java.lang.Exception {
        Set<Integer> primes = new HashSet<>();
        boolean factorFound = false;
        long sum = 0L;

        primes.add(2);

        for(int numToCheck = 3; numToCheck < 2000000; numToCheck += 2) {
            for(int prime : primes) {
                if(numToCheck % prime == 0) {
                    factorFound = true;
                    break;
                }
            }

            if(factorFound) {
                factorFound = false;
            } else {
                primes.add(numToCheck);
            }
        }

        for(int prime : primes) {
            sum += prime;
        }

        System.out.println(sum);
	}
}
