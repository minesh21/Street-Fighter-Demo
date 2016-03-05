package varu4300;


import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainMenu extends JPanel{
	
	private JLabel play = new JLabel ("Play");
	private JLabel  inst = new JLabel ("Instructions");
	private JLabel  options = new JLabel("Options");
	
	public MainMenu(){
		this.layoutView();
	
	}
	public void layoutView(){
		this.setLayout(new FlowLayout());
		this.add(play);
		this.add(inst);
		this.add(options);
	}
	/*
	private class ButtonListener extends JPanel implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	*/

}
