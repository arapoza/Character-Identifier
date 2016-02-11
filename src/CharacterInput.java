import java.util.Scanner;

public class CharacterInput
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CharacterInput obj = new CharacterInput();
		System.out.println(obj.convertToHex());
	}
	public String convertToHex(){
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int decValue = s.codePointAt(0);
		input.close();
		
		String hexValue = Integer.toHexString(decValue);
		return hexValue;
		
	}
}
