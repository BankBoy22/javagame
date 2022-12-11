package pokemon;

import java.awt.Font;
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
	Font font = new Font("HY견명조",Font.BOLD,20);
	JButton btn1 = new JButton("START");
	JButton btn2 = new JButton("QUIT");
	BgmTest bgm = new BgmTest(Pokemon.class.getResource("./sound/intro.wav").getPath(), true);
	BgmTest button = new BgmTest(Pokemon.class.getResource("./sound/button.wav").getPath(), false);
	
	static JPanel page1=new JPanel(){
		Image background=new ImageIcon(Pokemon.class.getResource("./image/poke.png")).getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0, null); //image�� �׷���
		}
	};
	public Pokemon(){
		//프레임이 출력되는동안 음악 계속 나오게함
		bgm.start();
		frame.setSize(WIDTH,HEIGHT);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼의 폰트 변경
		btn1.setFont(font);
		btn2.setFont(font);
		//버튼의 위치와 크기
		btn1.setBounds(800,500,200,50);
		btn2.setBounds(800,600,200,50);
		//버튼의 배경색 변경 버튼1은 그린 버튼2는 레드
		btn1.setBackground(new java.awt.Color(0, 255, 100));
		btn2.setBackground(new java.awt.Color(255, 100, 0));
		frame.getContentPane().setLayout(null);
		page1.setLayout(null);
		page1.setBounds(0,0,1200,800);
		frame.add(page1);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		//버튼 1을 누르면 플레이어 이름과 라이벌 이름을 입력받는 NickName 클래스로 넘어감
		btn1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bgm.stop();
				button.start();
				NickName nick = new NickName();
				nick.go();
				frame.setVisible(false);
			
			}
		});
		//버튼 2를 누르면 프로그램이 종료됨
		btn2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button.start();
				System.exit(0);
			}
		});
	}
	
	public void go() {
		frame.setVisible(true);

	}
	

}
