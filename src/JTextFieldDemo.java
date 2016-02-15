import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.TextArea;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class JTextFieldDemo {

	
	public static void main(String[] args) {

		  //Create dropdown menu for fonts
    	  
    	  GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    	  String [] names = ge.getAvailableFontFamilyNames();
    	  
    	  final JComboBox fontselect = new JComboBox( );
    	 
    	  for ( int i=0; i<names.length; i++ )
          {
              fontselect.addItem( names[i] );
          }


    	  //Create dropdown menu for styles
    	  
    	  final JComboBox styleselect = new JComboBox();
    	  styleselect.addItem("Plain");
    	  styleselect.addItem("Bold");
    	  styleselect.addItem("Italics");
    	  styleselect.addItem("Bold and Italics");

	      
	    
    	  //Create dropdown menu for sizes
	    
		  final JComboBox sizeselect = new JComboBox();
	
		  for ( int i = 6; i < 40; i+=2){
		    	
			  sizeselect.addItem(i);   	 
		  }
		  
		  sizeselect.setSelectedItem(12);
		  sizeselect.setEditable(true);
		    

	    
		  //Create area for sample text
		    
		  final TextArea sample = new TextArea(30,100);
		  sample.setEditable(false);
		  
		  
		    
		  //Add text to area
		  
		  String sampletext = "The quick brown fox jumped over the lazy dog’s back\nPack my box with five dozen liquor jugs.\nJackdaws love my big sphinx of quartz.\nMr.Jock, TV quiz PhD, bags few lynx\nabcdefghijklmnopqrstuvwxyz\nABCDEFGHIJKLMNOPQRSTUVWXYZ\n0123456789\n€†™´¸¢©¤°÷½¼¾>¡¿«‘’<¯µ ·¬ªº¶±£" +""+ "»®§­¹²³ß×™¨¥\nÀÁÂÃÄÅÆÇÈÉ ÊËÌÍÎÏÐÑÒÓÔ ÕÖØÙÚÛÜÝÞÿ\nàáâãäåæçèé êëìíîïðñòóô õöøùúûüýþÿ\n!#$%&'()*+,-./:;<=>?@[^_z{|}~\nuvw wW gq9 2z 5s il17|!j oO08 `' ;:,. m nn rn {[()]}u)";
				
		  sample.append(sampletext);

		    
		  Font defaultfont = new Font("Abadi MT Condensed Extra Bold", Font.PLAIN, 12);
		  sample.setFont(defaultfont);
		    
		    
		    
		  //Choose text color
		    
		  JButton fontcolorselect = new JButton("Select text color");
		    
		  fontcolorselect.addActionListener(new ActionListener() {
		    	 
	          public void actionPerformed(ActionEvent e)
	          {
	        	  Color a = JColorChooser.showDialog(null, "Select text color", sample.getForeground());
	              if (a != null)
	              sample.setForeground(a);
	          }
		  });
	            
	         
	    
		  //Choose background color
		    
		  JButton backgroundcolorselect = new JButton("Select background color");
        	    
	      backgroundcolorselect.addActionListener(new ActionListener() {
	        	    	 
	    	  public void actionPerformed(ActionEvent e)
	    	  {
	    		  Color b = JColorChooser.showDialog(null, "Select background color", sample.getBackground());
	    		  if (b != null)
	    		  sample.setBackground(b);
	    	  }
	        
	        });
	         

		  //Result button - click to see result from choices in sample text area

		  JButton seeresult = new JButton("See font");
		    
		  seeresult.addActionListener(new ActionListener() {
		    	 
	          	public void actionPerformed(ActionEvent e)
	            {
	
	          		Object x = fontselect.getSelectedItem();
	            	String fontfont = (String) x; //sets font
	
	            	
	            	Object y = styleselect.getSelectedIndex();
	            	int style = (Integer) y;
	            	int fontstyle = 0;
	            	
	            	if (style == 0) {
	            		fontstyle = Font.PLAIN; //sets style
	            	}
	            	
	            	if (style == 1) {
	            		fontstyle = Font.BOLD;
	            	}
	            	if (style == 2) {
	            		fontstyle = Font.ITALIC;
	            	}
	            	if (style == 3) {
	            		fontstyle = Font.BOLD + Font.ITALIC;
	            	}
	            	
	            	
	        	    Object z = sizeselect.getSelectedItem();
	        	    int fontsize = (Integer) z; //sets size
	        	    
	        	            	    
	            	Font font = new Font (fontfont, fontstyle , fontsize);
	        	    sample.setFont(font);

	            }
	        });  
	
		    
	
	      JPanel frame = new JPanel();
	      frame.setLayout(new FlowLayout());
	      frame.add(fontselect);
	      frame.add(styleselect);
	      frame.add(sizeselect);
	      frame.add(fontcolorselect);
	      frame.add(backgroundcolorselect); //creates JPanel for the 'toolbar'
	
	      JPanel frame2 = new JPanel(); //Read somewhere about nesting JPanels, wanted button to go between toolbar and textarea
	      frame2.add(seeresult);
	        
	        
	      JPanel frame3 = new JPanel();
	      frame3.setLayout(new FlowLayout()); //creates JPanel for sample text area
	      frame3.add(sample);
	        
	        
	      JPanel mainframe = new JPanel();
	      mainframe.setLayout(new BoxLayout(mainframe, BoxLayout.Y_AXIS)); //Adds previous JPanels to new JPanel
	        
	      mainframe.add(frame);
	      mainframe.add(frame2);
	      mainframe.add(frame3);

	        
	      //Display the window.
	        
	      JFrame mainmainframe = new JFrame(); //JPanels can't be displayed so I put it in a new JFrame
	      mainmainframe.add(mainframe);
	        
	      mainmainframe.pack();
	      mainmainframe.setVisible(true);
	
	        
	    }
	
		}
	
