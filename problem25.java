import java.math.BigInteger;

class problem25 {
    public static void main (String[] args) throws java.lang.Exception {
        BigInteger currFibonacci = new BigInteger("1");
        BigInteger prevFibonacci = new BigInteger("1");
        BigInteger temp = new BigInteger("1");
        int index = 2;

        while(currFibonacci.toString().length() < 1000) {
            temp = currFibonacci;
            currFibonacci = currFibonacci.add(prevFibonacci);
            prevFibonacci = temp;

            index++;
        }

        System.out.println(index);
    }
}
