import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class problem29Better {
	public static void main(String[] args) {
		List<BigInteger> sequence = new ArrayList<>();

		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				BigInteger value = BigInteger.valueOf(i).pow(j);
				if (sequence.indexOf(value) == -1) {
					sequence.add(value);
				}
			}
		}

		System.out.println(sequence.size());
	}
}
