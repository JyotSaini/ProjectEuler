class problem30 {
    public static void main (String[] args) throws java.lang.Exception {
        int[] powers = new int[10];
        int totalSums = 0;

        for(int digs = 0; digs < 10; digs++) {
            System.out.println(digs + ": " + digs * digs * digs * digs * digs);
            powers[digs] = digs * digs * digs * digs * digs;
        }

        for(Integer counter = 2; counter < 1000000; counter++) {
            String temp = counter.toString();
            int sum = 0;

            for(char digit : temp.toCharArray()) {
                sum += powers[Character.getNumericValue(digit)];
            }

            if(sum == counter) {
                System.out.println(sum);
                totalSums += sum;
            }
        }

        System.out.println(totalSums);
    }
}
