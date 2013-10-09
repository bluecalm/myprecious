package Event;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class WindowEventFrame extends JFrame {
	WindowEventHandler weh;
	public WindowEventFrame(){
		weh = new WindowEventHandler();
		this.addWindowListener(weh);
		setSize(300,400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new WindowEventFrame();
	}
	
}
