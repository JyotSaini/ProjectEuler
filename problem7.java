import java.util.*;

class problem7 {

	public static void main (String[] args) throws java.lang.Exception {
        Set<Integer> primes = new HashSet<>();
        ArrayList<Integer> primesList = new ArrayList<>();
        boolean factorFound = false;

        primes.add(2);

        for(int numToCheck = 3; numToCheck < Integer.MAX_VALUE; numToCheck++) {
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

            if(primes.size() == 10001) {
                break;
            }
        }

        for(int prime : primes) {
            primesList.add(prime);
        }

        Collections.sort(primesList);

        System.out.println(primesList.get(10000));
	}
}
