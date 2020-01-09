import java.util.Arrays;

class problem24 {

    public static int firstCharIndex(String toParse) {
        int index;

        for(index = toParse.length() - 2; index >= 0; index--) {
            if(toParse.charAt(index) < toParse.charAt(index + 1)) {
                break;
            }
        }

        return index;
    }

    public static int secondCharIndex(String toParse, int firstCharIndex) {
        int secondCharIndex = firstCharIndex + 1;

        char lower = toParse.charAt(firstCharIndex);
        char upper = toParse.charAt(secondCharIndex);

        for(int secondCharIterator = firstCharIndex + 2; secondCharIterator < toParse.length(); secondCharIterator++) {
            if(lower < toParse.charAt(secondCharIterator) && toParse.charAt(secondCharIterator) < upper) {
                secondCharIndex = secondCharIterator;
                upper = toParse.charAt(secondCharIterator);
            }
        }

        return secondCharIndex;
    }

    public static String swap(String toSwap, int firstCharIndex, int secondCharIndex) {
        char[] tempArr = toSwap.toCharArray();
        
        tempArr[firstCharIndex] = toSwap.charAt(secondCharIndex);
        tempArr[secondCharIndex] = toSwap.charAt(firstCharIndex);

        return new String(tempArr);
    }

    public static String sort(String toSort, int firstCharIndex) {
        char[] sortedSubstring = toSort.substring(firstCharIndex + 1).toCharArray();
        char[] sorted = toSort.substring(0, firstCharIndex + 1).toCharArray();

        Arrays.sort(sortedSubstring);

        String sortedString = new String(sorted) + new String(sortedSubstring);

        return sortedString;
    }

    public static void main (String[] args) throws java.lang.Exception {
        String nums = "0123456789";

        for(int index = 1; index < 1000000; index++) {
            int first = firstCharIndex(nums);
            int second = secondCharIndex(nums, first);
            
            nums = swap(nums, first, second);
            nums = sort(nums, first);
        }

        System.out.println(nums);
    }
}
