import java.util.ArrayList;

class problem14 {

    public static int sequenceSize(long toCheck, ArrayList<Integer> knownSizes) {
        int currSize = 0;

        while(toCheck != 1) {
            if(toCheck < 1000000 && toCheck > 0) {
                if(knownSizes.get((int) toCheck) != -1) {
                    currSize += knownSizes.get((int) toCheck);
                    break;
                }
            }

            toCheck = (toCheck % 2 == 0) ? even(toCheck) : odd(toCheck);
            currSize++;
        }

        return currSize;
    }

    public static long even(long toChange) {
        return toChange / 2;
    }

    public static long odd(long toChange) {
        return 3 * toChange + 1;
    }

	public static void main (String[] args) throws java.lang.Exception {
        ArrayList<Integer> sizeKeeper = new ArrayList<>();

        int biggestInt = 1;
        int biggestSize = 1;

        for(int iterator = 0; iterator < 1000000; iterator++) {
            sizeKeeper.add(-1);
        }

        for(int iterator = 1; iterator < 1000000; iterator++) {
            sizeKeeper.set(iterator, sequenceSize((long) iterator, sizeKeeper));

            if(sizeKeeper.get(iterator) > biggestSize) {
                biggestInt = iterator;
                biggestSize = sizeKeeper.get(iterator);
            }
        }

        System.out.println(biggestInt + ": " + biggestSize);
	}
}
