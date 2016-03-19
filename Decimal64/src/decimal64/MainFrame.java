/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal64;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author John JP Andres
 */
public class MainFrame extends JFrame{
    private final JTextField textField = new JTextField(),
                    textField2 = new JTextField();
	private final JLabel textLabel = new JLabel("HexaDecimal:"),
                            textLabel2 = new JLabel("Exponent");
	private final JButton clearButton = new JButton("Clear Screen"),
						 markAllButton = new JButton("Send File"),
						 addButton = new JButton("Accept Number");
  	private final JPanel taskPanel = new JPanel();
	private final JScrollPane taskBox = new JScrollPane(taskPanel);
        private final IEEEConversion Iconvert = new IEEEConversion();
        private String answers = "", tempA = "";

	public MainFrame()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Archorg Converter");

		setSize(450,450);

		JPanel main = new JPanel();
		main.setLayout(new BorderLayout());
		main.setSize(100,100);
		add(main);

		//North
		JPanel north = new JPanel();
		north.setLayout(new BorderLayout());
		textField.setSize(25,25);
		
		JPanel northsouthPanel = new JPanel();
		north.add(northsouthPanel,BorderLayout.SOUTH);

		//Add to the north south frame of the mainframe
		northsouthPanel.add(addButton,BorderLayout.SOUTH);
		//northsouthPanel.add(markAllButton, BorderLayout.SOUTH);
                
                
		//Add to the north frame of the mainframe
		north.add(textLabel,BorderLayout.NORTH);
		north.add(textField,BorderLayout.CENTER);
//                
//                north.add(textField2,BorderLayout.SOUTH);
//                north.add(textLabel2,BorderLayout.SOUTH);
		//Add to the mainframe
		main.add(north,BorderLayout.NORTH);
		//End of north

		//Center
		taskBox.setBorder( BorderFactory.createLineBorder( Color.BLACK ) );
	  	main.add( taskBox, BorderLayout.CENTER );
		taskBox.setSize( 10, 25 );
		taskBox.setBorder(BorderFactory.createTitledBorder("AnswerLog:"));
		taskPanel.setSize( 10, 25 );
		taskPanel.setLayout(new BoxLayout( taskPanel, BoxLayout.Y_AXIS ) );
	  	
		//South
		JPanel south = new JPanel();
		south.add(clearButton);
		main.add(south,BorderLayout.SOUTH);

		main.setBorder(BorderFactory.createTitledBorder("UI"));


		//Actionlistener
		addButton.addActionListener(new clicks());
		clearButton.addActionListener(new clicks());
		markAllButton.addActionListener(new clicks());
		textField.addKeyListener(new keys());

		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
        }
        
        private class clicks implements ActionListener
	{
                @Override
		public void actionPerformed(ActionEvent ae)
		{
			if( ae.getActionCommand().equals("Accept Number"))
			{
				if(textField.getText().equals(""))
					JOptionPane.showMessageDialog(null,"TextField is Empty",
										"Error", JOptionPane.ERROR_MESSAGE);
				else
				{
                                    Iconvert.setMantissa((int) Iconvert.HextoDecimal(textField.getText()));
                                    if(Iconvert.disengage().equals("stop"))
                                        textField.setText("Infinity, Combi = 11110 Mantissa = 0...0");
                                    else{
                                    Iconvert.setSignBit((int) Iconvert.getDecimal());
                                    Iconvert.setExponent(0);
                                    Iconvert.checkCombi((int) Iconvert.getDecimal(),Iconvert.getExponent());
                                    textField.setText(Iconvert.finalAnswer(Iconvert.getSignBit(),Iconvert.getCombi(),
                                            Iconvert.getExponentForCOMBI(), Iconvert.getMantissa()));
                                    }
                                    //adds to the model	     
				    JLabel labels = new JLabel("Answer: " + textField.getText());
				    taskPanel.add(labels);
                                    
                                    //reset to 0
                                    Iconvert.setToNull();
                                        
                                        
                                    taskBox.revalidate();
				    taskBox.repaint();
				    textField.setText(null);
				}
			}
		
		}
	}

	private class keys implements KeyListener
	{
		public void keyPressed( KeyEvent ke )
	  {
	  	if ( ke.getKeyCode() == KeyEvent.VK_ENTER )
	  	{
		}

			
	     
	  }
	  
	  public void keyReleased( KeyEvent ke )
	  {
	    
	  }
	  
	  public void keyTyped( KeyEvent ke )
	  {
	     
	  }
	}
}
