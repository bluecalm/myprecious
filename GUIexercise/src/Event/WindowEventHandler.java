package Event;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class WindowEventHandler implements WindowListener {
	public void windowActivated(WindowEvent e){
		System.out.println("windowActivated");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("windowCLosed");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("WindowClosing");
		System.exit(0);//윈도우 종료
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
