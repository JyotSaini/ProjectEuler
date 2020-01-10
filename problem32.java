import java.util.HashSet;
import java.util.Set;

class problem32 {
    public static boolean checkNoRepeatDigits(Integer multiplicand, Integer multiplier, Integer product) {
        boolean[] digitsUsed = {false, false, false, false, false, false, false, false, false};

        String concatenated = multiplicand.toString() + multiplier.toString() + product.toString();

        if(concatenated.length() < 9 || concatenated.length() > 9) {
            return false;
        }

        for(char dig : concatenated.toCharArray()) {
            int currDig = Character.getNumericValue(dig);

            if(currDig == 0) {
                return false;
            } else if(digitsUsed[currDig - 1]) {
                return false;
            }

            digitsUsed[currDig - 1] = true;
        }

        return true;
    }

    public static void main (String[] args) throws java.lang.Exception {
        int multiplicand = 0;
        int multiplier = 0;
        int product = 0;
        Set<Integer> pandigitalProducts = new HashSet<>();
        Integer sum = 0;

        for(multiplicand = 0; multiplicand < 10000; multiplicand++) {
            for(multiplier = 0; multiplier < 10000; multiplier++) {
                product = multiplicand * multiplier;
                if(checkNoRepeatDigits(multiplicand, multiplier, product)) {
                    pandigitalProducts.add(product);
                }
            }
        }

        for(Integer pandigitalProduct : pandigitalProducts) {
            sum += pandigitalProduct;
        }

        System.out.println("Total Sum: " + sum);
        System.out.println(pandigitalProducts);
    }
}
