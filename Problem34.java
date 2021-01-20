public class Problem34 {
    private static int zeroFactorial = 1;
    private static int oneFactorial = 1;
    private static int twoFactorial = 2;
    private static int threeFactorial = 3 * 2;
    private static int fourFactorial = 4 * 3 * 2;
    private static int fiveFactorial = 5 * 4 * 3 * 2;
    private static int sixFactorial = 6 * 5 * 4 * 3 * 2;
    private static int sevenFactorial = 7 * 6 * 5 * 4 * 3 * 2;
    private static int eightFactorial = 8 * 7 * 6 * 5 * 4 * 3 * 2;
    private static int nineFactorial = 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2;

    private static int sumFactorial(int num) {
        int sum = 0;

        while(num > 0) {
            int curr = num % 10;
            num /= 10;

            switch(curr) {
                case 0:
                    sum += zeroFactorial;
                    break;
                case 1:
                    sum += oneFactorial;
                    break;
                case 2:
                    sum += twoFactorial;
                    break;
                case 3:
                    sum += threeFactorial;
                    break;
                case 4:
                    sum += fourFactorial;
                    break;
                case 5:
                    sum += fiveFactorial;
                    break;
                case 6:
                    sum += sixFactorial;
                    break;
                case 7:
                    sum += sevenFactorial;
                    break;
                case 8:
                    sum += eightFactorial;
                    break;
                case 9:
                    sum += nineFactorial;
                    break;
            }
        }

        return sum;
    }

    public static void main (String[] args) {
        long sum = 0;

        for(int i = 3; i < Integer.MAX_VALUE; i++) { // 100000 instead of Integer.MAX_VALUE suggested
            if(i == sumFactorial(i)) {
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println(sum);
    }
}
