import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // needed for event handling

public  class IdentifierLayout2 extends JPanel implements ActionListener{
  // make quit button 
  JButton quit = new JButton("Quit"); 
//submit button
		JButton button = new JButton("Submit");

//creates the panel
	JPanel panel = new JPanel();

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
		
		Font font1 = new Font("Arial", Font.BOLD, 36);
		
		
		JTextField hexunifield = new JTextField();
		

		JTextField decunifield = new JTextField();
		
		
		JTextField alphafield = new JTextField();
		
		
		JTextField javafield = new JTextField();
		
		JTextField descfield = new JTextField();

		

  // location of rectangle northwest corner 
  public IdentifierLayout2(){
	  
    setPreferredSize(new Dimension(600,200));
    setBackground(Color.white);
    
    
    // place quit button in panel
    this.add(quit); 
    // panel is listener for quit button 
    quit.addActionListener(this); 
    // place square button in panel
    this.add(button); 
    // panel is listener for square button 
    button.addActionListener(this);
    // add position input components to panel 
    this.add(label);
	this.add(textField);
	this.add(button);
	
	this.add(characterlabel);
	this.add(characterfield);
	characterfield.setFont(font1);
	
	this.add(hexunilabel);
	this.add(hexunifield);
	
	this.add(decunilabel);
	this.add(decunifield);
	
	this.add(alphalabel);
	this.add(alphafield);
	
	this.add(javalabel);
	this.add(javafield);
	
	this.add(desclabel);
	this.add(descfield);
	
  }
  // This method specifies listener actions
  public void actionPerformed(ActionEvent e){
    // quit button signal 
    if (e.getSource() == quit)
      // terminate program 
      System.exit(0); 
    else
      // square button signal 
      if(e.getSource() == button){
    	  FileProcessor input = new FileProcessor();
    	  String hexValue = input.convertToHex(textField.getText());
    	  String[] character = input.run(hexValue);
    	  characterfield.setText(textField.getText());
    	  
    	  hexunifield.setText(character[1]);
    	  alphafield.setText(character[3]);
    	  descfield.setText(character[4]);

    	
    }
  }
}
