/*This creates a Jframe, 
* with a text box for user input of a character and a button, 
* and it organizes all the values in non-editable boxes.
* This code is not for functionality,
* just for format.
*
*/

import java.awt.FlowLayout;
import javax.swing.*;

public class IndentifierLayout {

	public static void main(String s[]) {

		//Creates jframe
		JFrame frame = new JFrame("Character Indentifier");

		//creates the panel
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		//the following creates individual labels
		JLabel label = new JLabel("Enter your character here:");
		
		JLabel characterlabel = new JLabel("Larger font:");
		
		JLabel hexunilabel = new JLabel("Hex Unicode and entity:");
		
		JLabel decunilabel = new JLabel("Decimal Unicode and entity:");
		
		JLabel alphalabel = new JLabel("Alpha entity:");
		
		JLabel javalabel = new JLabel("How to code in Java:");
		
		JLabel desclabel = new JLabel("Description of Character:");
		
		//the following all create individual text fields
		JTextField textField = new JTextField(1);
		
		JTextField characterfield = new JTextField();
		characterfield.setText("Bigger character will be here");
		characterfield.setEditable(false);
		
		JTextField hexunifield = new JTextField();
		hexunifield.setText("Hex Unicode and Entity will be here");
		hexunifield.setEditable(false);

		JTextField decunifield = new JTextField();
		decunifield.setText("Decimal Unicode and Entity will be here");
		decunifield.setEditable(false);
		
		JTextField alphafield = new JTextField();
		alphafield.setText("Alpha Entity will be here");
		alphafield.setEditable(false);
		
		JTextField javafield = new JTextField();
		javafield.setText("Java code will be here");
		javafield.setEditable(false);
		
		JTextField descfield = new JTextField();
		descfield.setText("Description will be here");
		descfield.setEditable(false);
		
		//submit button
		JButton button = new JButton();
		button.setText("Submit");
		
//adds buttons, labels, and textfields to the jframe
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		panel.add(characterlabel);
		panel.add(characterfield);
		panel.add(hexunilabel);
		panel.add(hexunifield);
		panel.add(decunilabel);
		panel.add(decunifield);
		panel.add(alphalabel);
		panel.add(alphafield);
		panel.add(javalabel);
		panel.add(javafield);
		panel.add(desclabel);
		panel.add(descfield);

		//sets jframe
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	      
	}

}