package pokemon;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Pokemon {
	JFrame frame = new JFrame("포켓몬스터"); //프레임 생성
	int WIDTH=1200;
	int HEIGHT=800;
	private Image background = new ImageIcon(Pokemon.class.getResource(null));
	JButton btn1 = new JButton("시작");
	JButton btn2 = new JButton("종료");
	public Pokemon() {
		frame.setSize(WIDTH,HEIGHT);//프레임 크기 설정
		frame.setLocationRelativeTo(null);//프레임 화면 가운데 배치
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn1.setBounds(200,500,300,150);
		btn2.setBounds(700,500,300,150);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
	}
	
	public void go() {
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.drawImage();
	}
}
