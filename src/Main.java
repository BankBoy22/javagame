import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	JFrame frame = new JFrame("���ϸ���"); //������ ����
	
	int WIDTH=1200;
	int HEIGHT=800;
	
	JButton btn1 = new JButton("START");
	JButton btn2 = new JButton("QUIT");
	
	private Image ima = 
			new ImageIcon(Main.class.getResource("/image/poke.png")).getImage();//����̹���
	
	
	public Main() {
		frame.setResizable(false);
		frame.setSize(WIDTH,HEIGHT); //������ ũ�� ����
		frame.setLocationRelativeTo(null); //������ ȭ�� ��� ��ġ
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1.setBounds(800,500,200,50);
		btn2.setBounds(800,600,200,50);
		
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
	}
	public void paint(Graphics g) { //�׸��� �Լ�
		g.drawImage(ima, 300, 100, null); //image�� �׷���
	}

	public void go() {
		frame.setVisible(true);
	}

}