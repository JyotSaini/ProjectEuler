class problem9 {

    public static boolean checkTriplet(int a, int b, int c) {
        if(a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception {
        for(int a = 1; a < 998; a++) {
            for(int b = 1; b < 999 - a; b++) {
                int c = 1000 - (a + b);

                if(checkTriplet(a, b, c)) {
                    System.out.println("A: " + a + ", B: " + b + ", C: " + c);
                    System.out.println("Product = " + (a * b * c));
                }
            }
        }
	}
}
