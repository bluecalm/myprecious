package Frame;
import javax.swing.JFrame;

public class HasFrame {//extends JFrame {
	private JFrame frame;
	public HasFrame() {
		frame = new JFrame("������ �����̳�");
		frame.setSize(300,400);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new HasFrame();
	}
}
