class problem26 {
    
    // We're going to use an extremely weird way of tracking the existence of a cycle and its length
    // Basically, you create a 2d int array of size 10 * n (where n is the divisor) with the length of the array corresponding 
    // to the latest digit in the quotient, found using long division, and the width corresponding to the current remainder,
    // which should always be less than the divisor (which will always be less than 1000).
    // In this array we are saving how many steps of long division were executed before the current combo is found. If a combo
    // is found with a "non null" value, then it has occured before, which means we can find the length of the current cycle.
    // TADA

    public static int longDivision(Integer divisor) {
        int[][] comboes = new int[10][divisor];
        int dividend = 10 ^ divisor.toString().length();
        int remainder = -1;
        int currStep = 0;
        int cycleSize = 0;

        // Initialize array to "null"
        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < divisor; col++) {
                comboes[row][col] = -1;
            }
        }

        while(remainder != 0) {
            int temp = dividend / divisor;
            remainder = dividend % divisor;

            if(comboes[temp][remainder] != -1) {
                cycleSize = currStep - comboes[temp][remainder];
                break;
            }

            comboes[temp][remainder] = currStep;
            dividend = remainder * 10;
            currStep++;
        }

        return cycleSize;
    }

    public static void main (String[] args) throws java.lang.Exception {
        int largest = 0;

        for(int counter = 2; counter < 1000; counter++) {
            largest = (longDivision(counter) > largest) ? counter : largest;
        }

        System.out.println(largest);
    }
}
