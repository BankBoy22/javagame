package pokemon;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NickName extends JFrame{
	
	int WIDTH=1200;
	int HEIGHT=800;
	
	JPanel p = new JPanel();
	Font font = new Font("HY�߸���",Font.BOLD,30);
	
	public void go() {
		setTitle("Pokemon");
		setSize(WIDTH,HEIGHT);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel l1 = new JLabel("���� �̸� : ", JLabel.CENTER);
		JLabel l2 = new JLabel("������ �̸� : ", JLabel.RIGHT);
		
		l1.setFont(font);
		l2.setFont(font);
		
		
		JTextField tf1 = new JTextField(8);
		JTextField tf2 = new JTextField(8);
		
		tf1.setBounds(50,70,700,700);
		tf1.setFont(font);
		
		tf2.setBounds(50,70,700,700);
		tf2.setFont(font);
		
		
		add(p);
		p.add(l1);
		p.add(tf1);
		
		p.add(l2);
		p.add(tf2);
		
		l1.setLayout(new GridLayout(3,1));
		
		
		
		
		
		
		setVisible(true);
	}
}