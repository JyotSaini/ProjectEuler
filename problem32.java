class problem32 {
    public static boolean checkNoRepeatDigits(Integer multiplicand, Integer multiplier, Integer product) {
        boolean[] digitsUsed = {false, false, false, false, false, false, false, false, false, false};

        String concatenated = multiplicand.toString() + multiplier.toString() + product.toString();

        if(concatenated.length() < 9) {
            return false;
        }

        for(char dig : concatenated.toCharArray()) {
            int currDig = Character.getNumericValue(dig);

            if(digitsUsed[currDig]) {
                return false;
            }

            digitsUsed[currDig] = true;
        }

        return true;
    }

    public static void main (String[] args) throws java.lang.Exception {
        int multiplicand = 0;
        int multiplier = 0;
        int product = 0;

        
    }
}
