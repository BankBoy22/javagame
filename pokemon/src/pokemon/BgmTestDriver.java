import javax.swing.JButton;
import javax.swing.JFrame;

public class BgmTestDriver {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		new BgmTest("src/bgm/test.wav", true);
		
	}


}

