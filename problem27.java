import java.util.ArrayList;

class problem27 {
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

    public static int consecutives(ArrayList<Boolean> primesList, int a, int b) {
        int consecutives = 0;
        int n = 0;

        while(true) {
            int temp = (n * n) + (a * n) + b;

            if(temp < 0) {
                temp *= -1;
            }
            
            if(primesList.get(temp)) {
                consecutives++;
            } else {
                break;
            }

            n++;
        }

        return consecutives;
    }

    public static void main (String[] args) throws java.lang.Exception {
        ArrayList<Integer> primesList = new ArrayList<>();
        ArrayList<Boolean> primesListBoolean = new ArrayList<>();
        int maxProduct = 0;
        int maxConsecutives = 0;
        int numsToCheck = 10000000;

        for(int booleanCounter = 0; booleanCounter < numsToCheck; booleanCounter++) {
            primesListBoolean.add(false);
        }

        primesList.add(2);
        primesListBoolean.set(2, true);

        for(int possiblePrimeCounter = 3; possiblePrimeCounter < numsToCheck; possiblePrimeCounter++) {
            if(isNumPrime(primesList, possiblePrimeCounter)) {
                primesList.add(possiblePrimeCounter);
                primesListBoolean.set(possiblePrimeCounter, true);
            }
        }

        for(int a = -999; a < 1000; a++) {
            for(int b = 0; b <= 1000; b++) {
                if(!primesListBoolean.get(b)) {
                    continue;
                }

                int temp = consecutives(primesListBoolean, a, b);

                if(temp > maxConsecutives) {
                    maxConsecutives = temp;
                    maxProduct = a * b;
                }
            }
        }

        System.out.println(maxProduct);
    }
}
