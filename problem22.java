import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;

class problem22 {
    public static void main (String[] args) throws java.lang.Exception {
        File file = new File("p022_names.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        String str = new String(data, "UTF-8");
        ArrayList<String> names = new ArrayList<>();
        names.add("");
        int nameNum = 0;
        long sum = 0L;

        for(char letter : str.toCharArray()) {
            if(letter == ',') {
                nameNum++;
                names.add("");
                continue;
            }

            if(letter != '"') {
                String currName = names.get(nameNum) + letter;
                names.set(nameNum, currName);
            }
        }

        Collections.sort(names);

        nameNum = 0;

        for(String name : names) {
            int alphabeticalValue = 0;

            for(char letter : name.toLowerCase().toCharArray()) {
                alphabeticalValue += (int) letter - 96;
            }

            nameNum++;
            alphabeticalValue *= nameNum;
            sum += alphabeticalValue;
        }

        System.out.println(sum);
	}
}
