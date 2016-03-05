package varu4300;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Ryu extends JComponent implements Runnable,  KeyListener, ActionListener{
	public Thread t;
	public Timer timer;
	public String pressed ="";

	public String [] ryuLeft = new String[14];
	public String [] ryuStance = new String[10];
	public String [] ryuRight = new String[11];
	public String [] ryuDown = new String[7];
	public String [] ryuJump = new String[18];
	public String [] ryuPunch = new String[4];
	public File  source;
	public BufferedImage r;
	public boolean start = true;
	public int x =0, y=0, moves = 0, temp = 0;
	
	public Ryu(){
		
		x = 790;
		y=  250;
		temp =y;
		
		ryuPunch[0] = "./Ryu/02944.png";
		ryuPunch[1] = "./Ryu/02946.png";
		ryuPunch[2] = "./Ryu/02947.png";
		ryuPunch[3] = "./Ryu/02948.png";

		
		ryuLeft[0] = "./Ryu/02605.png";
		ryuLeft[1] = "./Ryu/02606.png";
		ryuLeft[2] = "./Ryu/02607.png";
		ryuLeft[3] = "./Ryu/02608.png";
		ryuLeft[4] = "./Ryu/02609.png";
		ryuLeft[5] = "./Ryu/02610.png";
		ryuLeft[6] = "./Ryu/02611.png";
		ryuLeft[7] = "./Ryu/02612.png";
		ryuLeft[8] = "./Ryu/02613.png";
		ryuLeft[9] = "./Ryu/02614.png";
		ryuLeft[10] = "./Ryu/02615.png";
		ryuLeft[11] = "./Ryu/02616.png";
		ryuLeft[12] = "./Ryu/02617.png";
		
		
		ryuDown[0] = "./Ryu/02632.png";
		ryuDown[1] = "./Ryu/02633.png";
		ryuDown[2] = "./Ryu/02634.png";
		ryuDown[3] = "./Ryu/02635.png";
		ryuDown[4] = "./Ryu/02636.png";
		ryuDown[5] = "./Ryu/02637.png";
		ryuDown[6] = "./Ryu/02638.png";


		ryuJump[0] = "./Ryu/02650.png";
		ryuJump[1] = "./Ryu/026351.png";
		ryuJump[2] = "./Ryu/026352.png";
		ryuJump[3] = "./Ryu/026353.png";
		ryuJump[4] = "./Ryu/02654.png";
		ryuJump[5] = "./Ryu/02655.png";
		ryuJump[6] = "./Ryu/02656.png";
		ryuJump[7] = "./Ryu/02657.png";
		ryuJump[8] = "./Ryu/02658.png";
		ryuJump[9] = "./Ryu/02659.png";
		ryuJump[10] = "./Ryu/02660.png";
		ryuJump[11] = "./Ryu/02661.png";
		ryuJump[12] = "./Ryu/02662.png";
		ryuJump[13] = "./Ryu/02663.png";
		ryuJump[14] = "./Ryu/02664.png";
		ryuJump[15] = "./Ryu/02665.png";
		ryuJump[16] = "./Ryu/02666.png";
		ryuJump[17] = "./Ryu/02667.png";
		

		ryuRight[0] = "./Ryu/02620.png";
		ryuRight[1] = "./Ryu/02621.png";
		ryuRight[2] = "./Ryu/02622.png";
		ryuRight[3] = "./Ryu/02623.png";
		ryuRight[4] = "./Ryu/02624.png";
		ryuRight[5] = "./Ryu/02625.png";
		ryuRight[6] = "./Ryu/02626.png";
		ryuRight[7] = "./Ryu/02627.png";
		ryuRight[8] = "./Ryu/02628.png";
		ryuRight[9] = "./Ryu/02629.png";
		ryuRight[10] = "./Ryu/02630.png";
		
		ryuStance[0] = "./Ryu/02593.png";
		ryuStance[1] = "./Ryu/02594.png";
		ryuStance[2] = "./Ryu/02595.png";
		ryuStance[3] = "./Ryu/02596.png";
		ryuStance[4] = "./Ryu/02597.png";
		ryuStance[5] = "./Ryu/02598.png";
		ryuStance[6] = "./Ryu/02599.png";
		ryuStance[7] = "./Ryu/02600.png";
		ryuStance[8] = "./Ryu/02601.png";
		ryuStance[9] = "./Ryu/02602.png";

		this.setDoubleBuffered(true);
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(true);
		this.addKeyListener(this);
		repaint();
		
	}
	@Override
	public void update(Graphics g){
		paintComponent(g);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
			
		g2d.drawImage(r, x , y , null);
		g2d.dispose();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		switch(key){
		case KeyEvent.VK_UP :
			pressed = "up";
			break;
		case KeyEvent.VK_DOWN:
			pressed = "down";
			break;
		case KeyEvent.VK_LEFT:
			pressed = "left";
			x-=5;
			break;
		case KeyEvent.VK_RIGHT:
			pressed = "right";
			x+=5;
			break;
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key){
		case KeyEvent.VK_UP :
			pressed = "";
			moves = 0;
			System.out.println(pressed);
			break;
		case KeyEvent.VK_DOWN:
			pressed = "";
			moves = 0;
			System.out.println(pressed);
			break;
		case KeyEvent.VK_LEFT:
			pressed = "";
			moves = 0;
			System.out.println(pressed);
			break;
		case KeyEvent.VK_RIGHT:
			pressed = "";
			moves =0 ;
			System.out.println(pressed);
			break;
		case KeyEvent.VK_A:
			pressed = "a";
			break;

		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		
		while(start){
			
			if (pressed.equals("")){
				
				if (moves >= 9){
					moves = 0;
				}
				source = new File(ryuStance[moves]);
				moves+=1;
				try { 
					
					r = ImageIO.read(source);
					t.sleep(120);
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			else if(pressed.equals("left")){
				if (moves > 12){
					moves = 0;
				}
				source = new File(ryuLeft[moves]);
				moves += 1;
				try {
					r = ImageIO.read(source);
					
					t.sleep(120);
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					
				}
			}
			else if(pressed.equals("right")){
				System.out.print("hi");
				if (moves > 10){
					moves = 0;
				}
				source = new File(ryuRight[moves]);
				moves += 1;

				try {
					r = ImageIO.read(source);
					
					t.sleep(120);
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					
				}
			}
			else if (pressed.equals("up")){
				for(int i =0; i < ryuJump.length; i++){
					
					if(i > 8){
						y+=10;
					}
					else{
						y-=10;
					}
					if (pressed.equals("left")){
						x -= 10;
					}
					else if (pressed.equals("right")){
						x += 10;
					}
					source = new File(ryuJump[i]);
				
				try {
					r = ImageIO.read(source);
					
					t.sleep(60);
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					
				}
			}
			}
			else if (pressed.equals("down")){

				source = new File(ryuDown[5]);
				
				try {
					r = ImageIO.read(source);
					
					t.sleep(120);
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					
				}
			}
			else if(pressed.equals("a")){
				for (int i = 0; i<ryuPunch.length; i++){
					source = new File(ryuPunch[i]);
					try {
						r = ImageIO.read(source);
						
						t.sleep(20);
					} catch (IOException | InterruptedException e) {
						// TODO Auto-generated catch block
						
					}
				}
				pressed = "";
			}
			
		}
		
		
	}
	public void start(){
		t = new Thread(this);
		t.start();
		timer = new Timer(20,this);
		timer.start();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		this.repaint();
		
	}


}
