package varu4300;


import java.io.IOException;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Main extends JFrame {

	public static void main(String[] args) throws IOException {
		
		JFrame panel = new JFrame("Street Fighter");
		Ryu menu = new Ryu();
		panel.setContentPane(menu);
		panel.addKeyListener(menu);
		menu.start();
		panel.setSize(1000, 500);
		panel.setLocation(0,0);
		panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setVisible(true);
		panel.setFocusable(true);
	}

}
