package Frame;

import javax.swing.JFrame;

public class ExendsJFrame extends JFrame {
	public ExendsJFrame(){
		super("Ȯ���� �����̳�");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);//JFrame�� SWING�� Thread ����
	}
	public static void main(String[] args) {
		ExendsJFrame frame = new ExendsJFrame();//JFrame�ڽ�Ŭ����
		
	}
}
