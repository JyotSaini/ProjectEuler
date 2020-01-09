class problem4 {
    
    public static boolean isPalindrome(int toCheck) {
        String stringToCheck = String.valueOf(toCheck);
        
        while(stringToCheck.length() > 2) {
            if(stringToCheck.charAt(0) != (stringToCheck.charAt(stringToCheck.length() - 1))) {
                return false;
            }
            
            stringToCheck = stringToCheck.substring(1, stringToCheck.length() - 1);
        }
        
        if(stringToCheck.length() == 1) {
            return true;
        }
        
        if(stringToCheck.charAt(0) == (stringToCheck.charAt(1))) {
            return true;
        }
        
        return false;
    }
    
	public static void main (String[] args) throws java.lang.Exception {
		int firstNum = 999;
        int secondNum = 999;

        int largestProduct = 0;

        for(int num1 = firstNum; num1 >= 100; num1--) {
            for(int num2 = secondNum; num2 > 100; num2--) {
                int product = num1 * num2;

                if(isPalindrome(product) && product > largestProduct) {
                    largestProduct = product;
                }
            }
        }

        System.out.println(largestProduct);
	}
}
