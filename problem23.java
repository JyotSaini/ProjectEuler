import java.util.ArrayList;

class problem23 {
    public static boolean isAbundant(int toCheck) {
        int limit = (int) Math.sqrt(toCheck);
        int sum = 0;
        boolean abundant = false;

        for(int possibleFactor = 1; possibleFactor <= limit; possibleFactor++) {
            if(toCheck % possibleFactor == 0) {
                sum += (possibleFactor == toCheck / possibleFactor) ? possibleFactor : possibleFactor + toCheck / possibleFactor;
            }
        }

        if(sum > toCheck * 2) {
            abundant = true;
        }

        return abundant;
    }

    public static ArrayList<Boolean> abundantSums(ArrayList<Boolean> abundants) {
        ArrayList<Boolean> abundantsSums = new ArrayList<>();
        ArrayList<Integer> abundantsConverted = new ArrayList<>();

        abundantsSums.add(false);

        for(int abundantIndex = 1; abundantIndex < abundants.size(); abundantIndex++) {
            if(abundants.get(abundantIndex)) {
                abundantsConverted.add(abundantIndex);
            }

            abundantsSums.add(false);
        }

        for(int convertedAbundantIndex = 0; convertedAbundantIndex < abundantsConverted.size(); convertedAbundantIndex++) {
            for(int convertedAbundantIndex2 = convertedAbundantIndex; abundantsConverted.get(convertedAbundantIndex) + abundantsConverted.get(convertedAbundantIndex2) < abundantsSums.size(); convertedAbundantIndex2++) {
                abundantsSums.set(abundantsConverted.get(convertedAbundantIndex) + abundantsConverted.get(convertedAbundantIndex2), true);
            }
        }

        return abundantsSums;
    }

    public static void main (String[] args) throws java.lang.Exception {
        ArrayList<Boolean> abundants = new ArrayList<>();
        ArrayList<Boolean> abundantsSums = new ArrayList<>();
        long nonAbundantSumsSum = 0L;

        abundants.add(false); // 0 is false, only done so we can access element using same number index
        abundantsSums.add(false); // Same here

        for(int num = 1; num < 28123; num++) {
            abundants.add(isAbundant(num));
        }

        abundantsSums = abundantSums(abundants);

        for(int abundantSumIndex = 0; abundantSumIndex < abundantsSums.size(); abundantSumIndex++) {
            if(!abundantsSums.get(abundantSumIndex)) {
                nonAbundantSumsSum += abundantSumIndex;
            }
        }

        System.out.println(nonAbundantSumsSum);
    }
}
