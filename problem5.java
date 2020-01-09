import java.util.*;

class problem5 {

    public static ArrayList<Integer> getFactors(int currNum) {
        ArrayList<Integer> factors = new ArrayList<>();

        int lastFactor = 2;

		for(int factorCounter = 0; factorCounter < 4000; factorCounter++) {
		    for(int currFactor = lastFactor; currFactor <= currNum; currFactor++) {
		        if(currNum % currFactor == 0) {
		            currNum /= currFactor;
		            lastFactor = currFactor;
                    factors.add(currFactor);
		            break;
		        }
		    }
		    
		    if(currNum == 1) {
		        break;
		    }
		}

        return factors;
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int num : list1) {
            if(list2.contains(num)) {
                list2.remove(list2.indexOf(num));
            }
        }

        ArrayList<Integer> mergedList = new ArrayList<>();

        for(int num : list1) {
            mergedList.add(num);
        }

        for(int num : list2) {
            mergedList.add(num);
        }

        return mergedList;
    }
    
	public static void main (String[] args) throws java.lang.Exception {
        ArrayList<Integer> allFactors = new ArrayList<>();
        int product = 1;

		for(int num = 2; num <= 20; num++) {
            allFactors = mergeLists(allFactors, getFactors(num));
        }

        for(int factor : allFactors) {
            product *= factor;
        }

        System.out.println(product);
	}
}
