import java.math.BigInteger;

class problem15 {

    // After thinking about this problem for a little it can be determined that there are two kinds of
    // movements here, right and down, or 0 and 1. There will always be 20 0s and 20 1s, we simply have
    // to calculate the total number of combinations they can have.

    // Further, we can reduce this configuration to a permutation problem, where we are trying to find
    // the total number of permutations for a  set of 20 contained within a set of 40.
    // => P(40,20) = 40! / (20! * 20!) = (40 * 39 * ... * 21) / (20 * 19 * ... * 1)

	public static void main (String[] args) throws java.lang.Exception {
        BigInteger permutations = new BigInteger("40");

        for(Integer num = 39; num > 20; num--) {
            permutations = permutations.multiply(new BigInteger(num.toString()));
        }

        for(Integer num = 20; num > 1; num--) {
            permutations = permutations.divide(new BigInteger(num.toString()));
        }

        System.out.println(permutations);
	}
}
