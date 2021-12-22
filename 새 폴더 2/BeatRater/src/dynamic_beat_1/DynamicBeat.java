package dynamic_beat_1;

import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javazoom.jl.player.Player;

public class DynamicBeat extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/intro_background.jpg")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	
	public DynamicBeat() {
		
		setUndecorated(true);
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Music introMusic = new Music("intromusic_umbrella.mp3", true);
		introMusic.start();
		
	}
		
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage,0,0,null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(introBackground,0,0,null);
		paintComponents(g);
		this.repaint();
		
	}
	
}
