import java.math.BigInteger;

class problem20 {
    public static void main (String[] args) throws java.lang.Exception {
        BigInteger factorial = new BigInteger("100");
        int sum = 0;

        for(Integer factorialIterator = 99; factorialIterator > 1; factorialIterator--) {
            factorial = factorial.multiply(new BigInteger(factorialIterator.toString()));
        }

        String factorialString = factorial.toString();

        for(char dig : factorialString.toCharArray()) {
            sum += (int) dig - 48;
        }

        System.out.println(sum);
	}
}
