import java.math.BigInteger;

class problem16 {
    public static void main (String[] args) throws java.lang.Exception {
        BigInteger powersOf2 = new BigInteger("2");
        long sum = 0L;

        powersOf2 = powersOf2.shiftLeft(999);

        String powerString = powersOf2.toString();

        for(char dig : powerString.toCharArray()) {
            sum += (long) dig - 48;
        }

        System.out.println(sum);
	}
}
