import java.util.*;

class problem8try2 {

    public static ArrayList<String> decontaminate(String sequence) {
        ArrayList<String> decontaminated = new ArrayList<>();
        ArrayList<Integer> zeroes = new ArrayList<>();
        int sequenceIndex = 0;

        zeroes.add(-1);

        for(char num : sequence.toCharArray()) {
            if(num == '0') {
                zeroes.add(sequenceIndex);
            }
            sequenceIndex++;
        }

        zeroes.add(1000);

        for(int zeroesCounter = 0; zeroesCounter < zeroes.size() - 1; zeroesCounter++) {
            if(zeroes.get(zeroesCounter + 1) - zeroes.get(zeroesCounter) > 13) {
                String temp = sequence.substring(zeroes.get(zeroesCounter) + 1, zeroes.get(zeroesCounter + 1));

                decontaminated.add(temp);
            }
        }

        return decontaminated;
    }

    public static long largestProduct(String subsequence) {
        long largest = 0L;
        long curr = 1L;

        for(int first13 = 0; first13 < 13; first13++) {
            curr *= (long) subsequence.charAt(first13) - 48;
        }

        largest = curr;

        if(subsequence.length() > 13) {
            for(int subsequenceCounter = 13; subsequenceCounter < subsequence.length(); subsequenceCounter++) {
                
                curr /= (long) subsequence.charAt(subsequenceCounter - 13) - 48;
                curr *= (long) subsequence.charAt(subsequenceCounter) - 48;

                if(curr > largest) {
                    largest = curr;
                }
            }
        }

        return largest;
    }

	public static void main (String[] args) throws java.lang.Exception {
        String sequence = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        
        ArrayList<String> decontaminated = decontaminate(sequence);

        long largest = 0L;

        for(String subsequence : decontaminated) {
            long curr = largestProduct(subsequence);
            if(curr > largest) {
                largest = curr;
            }
        }

        System.out.println(largest);
    }
}
