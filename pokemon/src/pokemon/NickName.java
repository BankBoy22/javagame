package pokemon;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NickName extends JFrame{
	
	int WIDTH=1200;
	int HEIGHT=800;
	String player;
	String rival;
	
	JPanel frame = new JPanel();
	Font font = new Font("HY견명조",Font.BOLD,30);

	static JPanel page1=new JPanel(){
		Image background=new ImageIcon(Main.class.getResource("./image/nickname.png")).getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0, null); //image�� �׷���
		}
	};
	
	public void go() {
		setTitle("Pokemon");
		setSize(WIDTH,HEIGHT);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel l1 = new JLabel("플레이어 : ", JLabel.CENTER);
		JLabel l2 = new JLabel("라이벌 : ", JLabel.RIGHT);
		
		l1.setFont(font);
		l2.setFont(font);
		
		JTextField tf1 = new JTextField(8);
		JTextField tf2 = new JTextField(8);
		
		tf1.setBounds(50,70,700,700);
		tf1.setFont(font);
		
		tf2.setBounds(50,70,700,700);
		tf2.setFont(font);
		
		add(frame);
		frame.add(l1);
		frame.add(tf1);
		
		frame.add(l2);
		frame.add(tf2);
		
		l1.setLayout(new GridLayout(3,1));
		l2.setLayout(new GridLayout(3,1));

		JButton btn1 = new JButton("입력완료");
        btn1.setBounds(700,500,150,150);
        btn1.setBackground(java.awt.Color.RED);
		btn1.setFont(font);
		frame.add(btn1);

		page1.setLayout(null);
		page1.setBounds(0,0,1200,800);
		frame.add(page1);

		//버튼 1을 누르면 Battel 클래스로 넘어감 만약 입력하지 않았다면 경고창 띄움
		btn1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(tf1.getText().equals("") || tf2.getText().equals("")) {
					// 만약 플레이어 이름을 입력받지 못했다면 이름을 입력해주세요 라는 경고창을 띄우고 라이벌 이름을 입력받지 못했다면 라이벌 이름을 입력해주세요 라는 경고창을 띄움 둘다 입력하지 않았다면 입력해주세요 경고창을 띄움
					if(tf1.getText().equals("") && tf2.getText().equals("")) {
						javax.swing.JOptionPane.showMessageDialog(null, "플레이어의 이름과 라이벌의 이름을 입력해주세요!");
					}else if(tf1.getText().equals("")) {
						javax.swing.JOptionPane.showMessageDialog(null, "플레이어 이름을 입력해주세요");
					}else {
						javax.swing.JOptionPane.showMessageDialog(null, "라이벌 이름을 입력해주세요");
					}
				}
				else {
					player = tf1.getText();
					rival = tf2.getText();
					Battel battle = new Battel(player, rival);
					battle.setVisible(true);
					setVisible(false);
				}
			}
		});


		
		

		
		
		
		
		setVisible(true);
	}
}