package pokemon;


import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.awt.Graphics;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pokemon {
	JFrame frame = new JFrame("Pokemon"); 
	int WIDTH=1200;
	int HEIGHT=800;
	JButton btn1 = new JButton("START");
	JButton btn2 = new JButton("QUIT");
	

	public void playSound(String pathName, boolean isRoop) {
		try {
			File audioFile = new File(pathName);
			AudioInputStream audiostream = AudioSystem.getAudioInputStream(audioFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audiostream);
			clip.start();
			if(isRoop) {
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static JPanel page1=new JPanel(){
		Image background=new ImageIcon(Main.class.getResource("./image/poke.png")).getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0, null); //image�� �׷���
		}
	};
	public Pokemon() {

		

		playSound("./sound/intro.mp3", true);

		frame.setSize(WIDTH,HEIGHT);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn1.setBounds(800,500,200,50);
		btn2.setBounds(800,600,200,50);
		frame.getContentPane().setLayout(null);
		page1.setLayout(null);
		page1.setBounds(0,0,1200,800);
		frame.add(page1);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		//버튼 1을 누르면 플레이어 이름과 라이벌 이름을 입력받는 NickName 클래스로 넘어감
		btn1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				NickName nick = new NickName();
				nick.go();
				frame.setVisible(false);
			}
		});
		//버튼 2를 누르면 프로그램이 종료됨
		btn2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.exit(0);
			}
		});
	}
	
	public void go() {
		frame.setVisible(true);
	}
	

}
