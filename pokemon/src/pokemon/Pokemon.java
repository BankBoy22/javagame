package pokemon;


import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Pokemon {
	JFrame frame = new JFrame("Pokemon"); 
	int WIDTH=1200;
	int HEIGHT=800;
	JButton btn1 = new JButton("시작");
	JButton btn2 = new JButton("종료");
	public Pokemon() {
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn1.setBounds(200,500,300,150);
		btn2.setBounds(700,500,300,150);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		//화면을 바꾸는 버튼
		btn1.addActionListener((ActionListener) new Battel());
		//프로그램을 종료하는 버튼
		btn2.addActionListener((ActionListener) new Battel());
		frame.setVisible(true);
	}
	
	public void go() {
		frame.setVisible(true);
	}
	

}
