class problem3 {
	public static void main (String[] args) throws java.lang.Exception {
		long lastFactor = 2L;
		
		long currNum = 600851475143L;
		
		for(int factorCounter = 0; factorCounter < 4000; factorCounter++) {
		    for(long currFactor = lastFactor; currFactor <= currNum; currFactor++) {
		        if(currNum % currFactor == 0) {
		            currNum /= currFactor;
		            lastFactor = currFactor;
		            break;
		        }
		    }
		    
		    if(currNum == 1) {
		        break;
		    }
		}
		
		System.out.println(lastFactor);
	}
}
