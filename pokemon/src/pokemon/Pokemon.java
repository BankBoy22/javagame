package pokemon;


import java.awt.Image;
import java.awt.Graphics;
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

	static JPanel page1=new JPanel(){
		Image background=new ImageIcon(Main.class.getResource("./image/poke.png")).getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0, null); //image�� �׷���
		}
	};
	public Pokemon() {
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
		//버튼 1을 누르면 Battel 클래스 프레임 켜기
		btn1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Battel battle = new Battel();
				battle.setVisible(true);
				frame.setVisible(false);
			}
		});
	}
	
	public void go() {
		frame.setVisible(true);
	}
	

}
