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
		
		JLabel hexunilabel = new JLabel("Hex Unicode number:");
		
		JLabel hexentlabel = new JLabel("HTML hex entity:");
		
		JLabel decunilabel = new JLabel("Decimal Unicode number:");
		
		JLabel decentlabel = new JLabel("Decimal HTML entity:");
		
		JLabel alphalabel = new JLabel("Alpha entity:");
		
		JLabel javalabel = new JLabel("How to code in Java:");
		
		JLabel utf8label = new JLabel("UTF-8 encoding");
		
		JLabel desclabel = new JLabel("Description of Character:");
		
		//the following all create individual text fields
		JTextField textField = new JTextField();
		
		JTextField characterfield = new JTextField();
		
		Font font1 = new Font("Arial", Font.BOLD, 36);
		
		
		JTextField hexunifield = new JTextField();
		
		
		JTextField hexentfield = new JTextField();
		

		JTextField decunifield = new JTextField();
		
		
		JTextField decentfield = new JTextField();
		
		
		JTextField alphafield = new JTextField();
		
		
		JTextField javafield = new JTextField();
		
		
		JTextField utf8field = new JTextField();
		
		
		JTextField descfield = new JTextField();
		private final JLabel label_1 = new JLabel("");
		private final JLabel label_2 = new JLabel("");
		private final JLabel label_3 = new JLabel("");
		private final JLabel label_4 = new JLabel("");
		private final JLabel label_5 = new JLabel("");
		private final JLabel label_6 = new JLabel("");
		private final JLabel label_7 = new JLabel("");
		private final JLabel label_8 = new JLabel("");
		private final JLabel label_9 = new JLabel("");
		private final JLabel label_10 = new JLabel("");
		private final JLabel label_11 = new JLabel("");
		private final JLabel label_12 = new JLabel("");
		private final JLabel label_13 = new JLabel("");
		private final JLabel label_14 = new JLabel("");
		private final JLabel label_15 = new JLabel("");
		private final JLabel label_16 = new JLabel("");

		

  // location of rectangle northwest corner 
  public IdentifierLayout2(){
	  
    setPreferredSize(new Dimension(800,400));
    setBackground(Color.white);
    setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    
    
    // place quit button in panel
    this.add(quit); 
    // panel is listener for quit button 
    quit.addActionListener(this);
    // add position input components to panel 
    this.add(label);
	
	add(label_1);
	
	add(label_2);
	textField.setColumns(2);
	this.add(textField);
	// place square button in panel
	this.add(button); 
	// panel is listener for square button 
	button.addActionListener(this);
	
	//add the TextFields and their labels and configure each based on how many columns needed 
	this.add(button);
	
	add(label_3);
	
	add(label_4);
	
	this.add(characterlabel);
	
	add(label_5);
	characterfield.setColumns(1);
	this.add(characterfield);
	characterfield.setFont(font1);
	
	this.add(hexunilabel);
	
	add(label_6);
	
	add(label_7);
	hexunifield.setColumns(7);
	this.add(hexunifield);
	
	this.add(hexentlabel);
	hexentfield.setColumns(7);
	this.add(hexentfield);
	
	add(label_8);
	
	this.add(decunilabel);
	
	add(label_9);
	decunifield.setColumns(7);
	this.add(decunifield);
	
	this.add(decentlabel);
	
	add(label_10);
	
	add(label_11);
	decentfield.setColumns(6);
	this.add(decentfield);
	
	this.add(alphalabel);
	
	add(label_12);
	alphafield.setColumns(7);
	this.add(alphafield);
	
	this.add(javalabel);
	
	add(label_13);
	javafield.setColumns(7);
	this.add(javafield);
	
	add(label_14);
	
	add(label_15);
	
	add(label_16);
	
	this.add(utf8label);
	utf8field.setColumns(6);
	this.add(utf8field);
	
	this.add(desclabel);
	descfield.setHorizontalAlignment(SwingConstants.CENTER);
	descfield.setColumns(20);
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
    	  hexentfield.setText(input.convertToHexEntity(textField.getText()));
    	  
    	  decunifield.setText(String.valueOf(input.convertToDec(textField.getText())));
    	  decentfield.setText(input.convertToDecEntity(textField.getText()));
    	  
    	  alphafield.setText(character[3]);
    	  
    	  javafield.setText(input.convertToJava(textField.getText()));
    	  
    	  utf8field.setText(input.convertToUtf8(textField.getText()));
    	  
    	  descfield.setText(character[4]);
	
    }
  }
}
