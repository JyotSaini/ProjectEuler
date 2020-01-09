class problem17 {
    public static void main (String[] args) throws java.lang.Exception {
        int[] numLetters = new int[1001];
        int sum = 0;
        numLetters[1] = 3;
        numLetters[2] = 3;
        numLetters[3] = 5;
        numLetters[4] = 4;
        numLetters[5] = 4;
        numLetters[6] = 3;
        numLetters[7] = 5;
        numLetters[8] = 5;
        numLetters[9] = 4;
        numLetters[10] = 3;
        numLetters[11] = 6;
        numLetters[12] = 6;
        numLetters[13] = 8;
        numLetters[14] = 8;
        numLetters[15] = 7;
        numLetters[16] = 7;
        numLetters[17] = 9;
        numLetters[18] = 8;
        numLetters[19] = 8;
        numLetters[20] = 6;
        numLetters[30] = 6;
        numLetters[40] = 5;
        numLetters[50] = 5;
        numLetters[60] = 5;
        numLetters[70] = 7;
        numLetters[80] = 6;
        numLetters[90] = 6;
        numLetters[100] = 10;
        numLetters[200] = 10;
        numLetters[300] = 12;
        numLetters[400] = 11;
        numLetters[500] = 11;
        numLetters[600] = 10;
        numLetters[700] = 12;
        numLetters[800] = 12;
        numLetters[900] = 11;
        numLetters[1000] = 11;

        for(int iterator = 21; iterator < 1000; iterator++) {
            if(numLetters[iterator] != 0) {
                continue;
            }
            if(iterator > 100) {
                if(iterator % 100 > 20) {
                    numLetters[iterator] += numLetters[(iterator / 100) * 100] + 3 + numLetters[((iterator % 100) / 10) * 10] + numLetters[iterator % 10];
                } else {
                    numLetters[iterator] += numLetters[(iterator / 100) * 100] + 3 + numLetters[iterator % 100];
                }
            } else if(iterator > 20) {
                numLetters[iterator] += numLetters[((iterator % 100) / 10) * 10] + numLetters[iterator % 10];
            }
        }

        for(int iterator = 1; iterator < 1001; iterator++) {
            sum += numLetters[iterator];
        }

        System.out.println(sum);
	}
}
