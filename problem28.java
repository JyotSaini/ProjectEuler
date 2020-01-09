class problem28 {
    public static void main (String[] args) throws java.lang.Exception {
        long sum = 1L;
        int currDiagonal = 1;

        for(int size = 2; size <= 1001; size += 2) {
            for(int edge = 0; edge < 4; edge++) {
                currDiagonal += size;
                sum += currDiagonal;
            }
        }

        System.out.println(sum);
    }
}
