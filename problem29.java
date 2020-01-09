import java.util.ArrayList;
import java.util.HashSet;

class problem29 {
    public static boolean isNumPrime(ArrayList<Integer> primesList, int currNum) {
        boolean isPrime = true;

        for(int prime : primesList) {
            if(prime * prime > currNum) {
                break;
            } else if(currNum % prime == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static ArrayList<Integer> primeFactors(ArrayList<Integer> primesList, int currNum) {
        ArrayList<Integer> factors = new ArrayList<>();

        while(currNum > 1) {
            for(Integer prime : primesList) {
                if(currNum % prime == 0) {
                    currNum /= prime;
                    factors.add(prime);

                    break;
                }
            }
        }

        return factors;
    }

    public static void main (String[] args) throws java.lang.Exception {
        ArrayList<Integer> primesList = new ArrayList<>();
        HashSet<String> powersFactors = new HashSet<>();
        int numsToCheck = 101;

        primesList.add(2);

        for(int possiblePrimeCounter = 3; possiblePrimeCounter < numsToCheck; possiblePrimeCounter++) {
            if(isNumPrime(primesList, possiblePrimeCounter)) {
                primesList.add(possiblePrimeCounter);
            }
        }
        
        for(int a = 2; a < numsToCheck; a++) {
            ArrayList<Integer> currFactors = primeFactors(primesList, a);
            String currFactorsExpanded = "";

            for(int b = 2; b < numsToCheck; b++) {
                for(Integer currFactor : currFactors) {
                    for(int bCounter = 1; bCounter <= b; bCounter++) {
                        currFactorsExpanded += "," + currFactor.toString();
                    }
                }

                powersFactors.add(currFactorsExpanded);
                currFactorsExpanded = "";
            }
        }

        System.out.println(powersFactors.size());
    }
}
