class problem6 {    

    public static int sum(int range) {
        int total = 0;

        for(int natural = 1; natural <= 100; natural++) {
            total += natural;
        }

        return total;
    }

    public static int square(int num) {
        return num * num;
    }

    public static int squareSum(int range) {
        int total = 0;

        for(int natural = 0; natural <= range; natural++) {
            total += square(natural);
        }

        return total;
    }

	public static void main (String[] args) throws java.lang.Exception {
        int range = 100;

        int sumSquare = square(sum(range));

        int difference = sumSquare - squareSum(range);

        System.out.println(difference);
	}
}
