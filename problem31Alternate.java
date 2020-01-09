class problem31Alternate {

    public static int combo(int[] coins, int total, int place) {
        if(place == 0) {
            return 1;
        }

        int sum = 0;

        for(int placesLeft = 0; placesLeft <= total / coins[place]; placesLeft++) {
            sum += combo(coins, total - (coins[place] * placesLeft), place - 1);
        }

        return sum;
    }

    public static void main (String[] args) throws java.lang.Exception {
        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int total = 200;
        int initPlace = coins.length - 1;

        System.out.println(combo(coins, total, initPlace) + 1); // +1 to compensate for 200p coin
    }
}
