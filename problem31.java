class problem31 {
    public static void main (String[] args) throws java.lang.Exception {
        int solutions = 1; // The first solution is the 2 pound coin

        for(int p100 = 0; p100 <= 2; p100++) {
            for(int p50 = 0; p50 <= 4; p50++) {
                for(int p20 = 0; p20 <= 10; p20++) {
                    for(int p10 = 0; p10 <= 20; p10++) {
                        for(int p5 = 0; p5 <= 40; p5++) {
                            for(int p2 = 0; p2 <= 100; p2++) {
                                for(int p1 = 0; p1 <= 200; p1++) {
                                    if(((p100 * 100) + (p50 * 50) + (p20 * 20) + (p10 * 10) + (p5 * 5) + (p2 * 2) + p1) == 200) {
                                        solutions++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(solutions);
    }
}
