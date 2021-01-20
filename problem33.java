class problem33 {
    private static int numeratorProd = 1;
    private static int denominatorProd = 1;

    public static void main (String[] args) {
        for(float numerator = 11; numerator < 90; numerator ++) { // Cases ending in 0 are considered trivial, and numerator is always 2 digs so we start at 11
            if(numerator % 10 == 0 || (int) numerator / 10 == numerator % 10) {
                continue;
            }

            for(float denominator = (numerator % 10) * 10; denominator < ((numerator % 10) * 10) + 10; denominator++) { // Denominator > Numerator, so that fraction is smaller than 1
                float onesNumerator = (float) ((int) numerator / 10);
                float onesDenominator = denominator % 10;

                if(numerator / denominator == onesNumerator / onesDenominator) {
                    numeratorProd *= (int) numerator;
                    denominatorProd *= (int) denominator;
                    System.out.println("Numerator: " + numerator + ", Denominator: " + denominator);
                    System.out.println("NumeratorProd: " + numeratorProd + ", DenominatorProd: " + denominatorProd);
                }
            }
        }

        float currFactor = 2;

        // Reduce numerator and denominator
        while(currFactor <= numeratorProd) {
            if(numeratorProd % currFactor == 0 && denominatorProd % currFactor == 0) {
                numeratorProd /= currFactor;
                denominatorProd /= currFactor;
            } else {
                currFactor++;
            }
        }

        System.out.println("Numerator: " + numeratorProd + ", Denominator: " + denominatorProd);
    }
}
