import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor
{
	public String[] run(String hexValue) {
		String csvFile = "/Users/araposa/Downloads/entityfacts.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) 
			{

				// use comma as separator
				String[] character = line.split(cvsSplitBy);


				for ( int i=0; i<character.length ; i++ )
				{

					character[i] = character[i].replaceAll("\\s","");

				}
				if(character.length > 1)
				{
					if(hexValue.equals(character[1]))
					{
						//						System.out.println(character[4]);
						return character;	
					}
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
		return null;
	}

	public int convertToDec(String s){
		Integer decValue = s.codePointAt(0);
		return decValue;
	}

	public String convertToHex(String s){
		int decValue = convertToDec(s);
		String hexValue = Integer.toHexString(decValue);
		hexValue = ("0x" + hexValue);
		return hexValue;
	}
}
