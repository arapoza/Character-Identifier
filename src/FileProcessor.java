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

					character[i] = character[i].trim();

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

	public String convertToDecEntity(String s){
		String decEntity = String.valueOf(s.codePointAt(0));
		decEntity = ("&#" + decEntity);
		return decEntity;
	}
	
	public String convertToHex(String s){
		int decValue = convertToDec(s);
		String hexValue = Integer.toHexString(decValue);
		hexValue = ("0x" + hexValue);
		return hexValue;
	}
	
	public String convertToHexEntity(String s){
		int decValue = convertToDec(s);
		String hexEntity = Integer.toHexString(decValue);
		
		if(Integer.toHexString(decValue).length() == 1){
			hexEntity = ("&#x000" + hexEntity);
			}
		if(Integer.toHexString(decValue).length() == 2){
			hexEntity = ("&#x00" + hexEntity);
		}
		if(Integer.toHexString(decValue).length() == 3){
			hexEntity = ("&#x0" + hexEntity);
		}
		if(Integer.toHexString(decValue).length() == 4){
			hexEntity = ("&#x" + hexEntity);
		}
		
		return hexEntity;
	}
	
	public String convertToJava(String s){
		int decValue = convertToDec(s);
		String javaEntity = Integer.toHexString(decValue);
		
		if(Integer.toHexString(decValue).length() == 1){
			javaEntity = ("\\u000" + javaEntity);
			}
		if(Integer.toHexString(decValue).length() == 2){
			javaEntity = ("\\u00" + javaEntity);
		}
		if(Integer.toHexString(decValue).length() == 3){
			javaEntity = ("\\u0" + javaEntity);
		}
		if(Integer.toHexString(decValue).length() == 4){
			javaEntity = ("\\u" + javaEntity);
		}
		
		return javaEntity;
	}
	
	public String convertToUtf8(String s){
		int decValue = convertToDec(s);
		String utf8Entity = Integer.toHexString(decValue);
		
		if(utf8Entity.length() <= 2){
			return utf8Entity;
		}
		else{
			return null;
		}
	}
}
