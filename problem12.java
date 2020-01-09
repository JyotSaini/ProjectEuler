class problem12 {

    public static int numFactors(int toCheck) {
        int totalFactors = 2;

        // Checks the number of factors till the square root of the number to check. And then the threshold for the number of factors we are looking for(500) has been halved.
        for(int factorIterator = 2; factorIterator * factorIterator <= toCheck; factorIterator++) {
            if(toCheck % factorIterator == 0) {
                totalFactors++;
            }
        }

        return totalFactors;
    }

	public static void main (String[] args) throws java.lang.Exception {
        int triangleNum = 1;

        for(int currIteration = 2; triangleNum < Integer.MAX_VALUE; currIteration++) {
            triangleNum += currIteration;

            int currFactors = numFactors(triangleNum);

            System.out.println(triangleNum + ": " + currFactors);

            if(currFactors > 250) {
                System.out.println(triangleNum + ": " + currFactors);

                break;
            }
        }
	}
}
