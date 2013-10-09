package Frame;

import javax.swing.JFrame;

public class ExendsJFrame extends JFrame {
	public ExendsJFrame(){
		super("확장형 컨테이너");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);//JFrame의 SWING의 Thread 시작
	}
	public static void main(String[] args) {
		ExendsJFrame frame = new ExendsJFrame();//JFrame자식클래스
		
	}
}
