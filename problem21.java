import java.util.ArrayList;

class problem21 {

    public static int findDivisorSum(int toFindFor) {
        int sum = 1;

        for(int divisorsIterator = 2; divisorsIterator <= toFindFor / 2; divisorsIterator++) {
            if(toFindFor % divisorsIterator == 0) {
                sum += divisorsIterator;
            }
        }

        return sum;
    }

    public static void main (String[] args) throws java.lang.Exception {
        ArrayList<Integer> divisorSum = new ArrayList<>();
        int sumAmicable = 0;

        for(int sumsIterator = 0; sumsIterator < 10000; sumsIterator++) {
            divisorSum.add(findDivisorSum(sumsIterator));
        }

        for(int sumsIterator = 2; sumsIterator < 10000; sumsIterator++) {
            int firstLevelSum = divisorSum.get(sumsIterator);
            int secondLevelSum = 0;

            if(firstLevelSum < 10000) {
                secondLevelSum = divisorSum.get(firstLevelSum);

                if(secondLevelSum == sumsIterator && firstLevelSum != secondLevelSum) {
                    sumAmicable += sumsIterator;
                }
            } else {
                continue;
            }
        }

        System.out.println(sumAmicable);
	}
}
