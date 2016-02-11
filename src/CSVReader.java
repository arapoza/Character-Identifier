import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

  public static void main(String[] args) {

	CSVReader obj = new CSVReader();
	obj.run();

  }

  public void run() {

	String csvFile = "/Users/araposa/Downloads/entityfacts.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";

	try {

		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {

		        // use comma as separator
			String[] character = line.split(cvsSplitBy);

//			for ( int i=0; i<character.length ; i++ )
		    {
			character[0] = character[0].replaceAll("\\s", "");
			System.out.println(line);

		    }
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
