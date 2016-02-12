import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class csvReaderTest {

  public static void main(String[] args) {

	csvReaderTest obj = new csvReaderTest();
	obj.run();

  }

  public void run() {

	String csvFile = "/Users/wshuhda/Desktop/entityfacts.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";

	try {

		Map<String, String> maps = new HashMap<String, String>();

		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {

			// use comma as separator
			String[] category = line.split(cvsSplitBy);

			maps.put(category[4], category[5]);

		}

		//loop map
		for (Map.Entry<String, String> entry : maps.entrySet()) {

			System.out.println("Category [code= " + entry.getKey() + " , name="
				+ entry.getValue() + "]");

		}

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	System.out.println("Done");
  }

}