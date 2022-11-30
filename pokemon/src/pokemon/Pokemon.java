package pokemon;


import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.awt.Graphics;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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
	
	//mp3 음악 재생
	public void playMusic(URL url) {
		try {
			File musicPath = new File(url.toURI());
			if(musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			else {
				System.out.println("파일이 존재하지 않습니다.");
			}
		}
		catch(Exception e) {
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

		

		//프레임이 출력되는동안 음악 계속 나오게함
		

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
		//음악 실행
		playMusic(getClass().getResource("./sound/intro.wav"));
	}
	

}
