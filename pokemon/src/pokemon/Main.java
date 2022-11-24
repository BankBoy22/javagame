package pokemon;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	JFrame frame = new JFrame("Pokemon"); //������ ����
	
	int WIDTH=1200;
	int HEIGHT=800;
	
	JButton btn1 = new JButton("START");
	JButton btn2 = new JButton("QUIT");
	
	static JPanel page1=new JPanel() {
		private Image ima = 
			new ImageIcon(Main.class.getResource("../image/poke.png")).getImage();//����̹���
			public void paint(Graphics g) { //�׸��� �Լ�
				g.drawImage(ima, 300, 100, null); //image�� �׷���
			}
	};
	
	
	public Main() {
		frame.setResizable(false); //창의 크기를 변경하지 않음
		frame.setSize(WIDTH,HEIGHT); //프레임의 크기를 설정
		frame.setLocationRelativeTo(null); //창이 가운데 나오게
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1.setBounds(800,500,200,50);
		btn2.setBounds(800,600,200,50);
		
		frame.getContentPane().setLayout(null);
		page1.setLayout(null);
		page1.setBounds(
				0, 0, WIDTH, HEIGHT);
		frame.getContentPane().add(page1);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
	}
	

	public void go() {
		frame.setVisible(true);
	}

}