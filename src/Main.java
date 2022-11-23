import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	JFrame frame = new JFrame("포켓몬스터"); //프레임 생성
	
	int WIDTH=1200;
	int HEIGHT=800;
	
	JButton btn1 = new JButton("START");
	JButton btn2 = new JButton("QUIT");
	
	private Image ima = 
			new ImageIcon(Main.class.getResource("/image/poke.png")).getImage();//배경이미지
	
	
	public Main() {
		frame.setResizable(false);
		frame.setSize(WIDTH,HEIGHT); //프레임 크기 설정
		frame.setLocationRelativeTo(null); //프레임 화면 가운데 배치
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1.setBounds(800,500,200,50);
		btn2.setBounds(800,600,200,50);
		
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
	}
	public void paint(Graphics g) { //그리는 함수
		g.drawImage(ima, 300, 100, null); //image를 그려줌
	}

	public void go() {
		frame.setVisible(true);
	}

}