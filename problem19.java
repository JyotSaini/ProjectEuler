class problem19 {

    public static int addDays(int curr, int toAdd) {
        int updated = curr + toAdd;

        updated = updated % 7;

        return updated;
    }
    
    public static void main (String[] args) throws java.lang.Exception {
        int[] normalYear = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
        int currDay = 2; // Starts at Tuesday (Sunday is Zero) since Jan 1, 1901 was a Tuesday
        int totalSundays = 0;

        for(int year = 1;  year <= 100; year++) {
            if(year % 4 == 0) {
                for(int month = 0; month < 12; month++) {
                    currDay = addDays(currDay, leapYear[month]);

                    if(currDay == 0) { // Check for Sunday
                        totalSundays++;
                    }
                }
            } else {
                for(int month = 0; month < 12; month++) {
                    currDay = addDays(currDay, normalYear[month]);

                    if(currDay == 0) { // Check for Sunday
                        totalSundays++;
                    }
                }
            }
        }

        System.out.println(totalSundays);
	}
}
