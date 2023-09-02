package pack3;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test34FrameAdapter extends WindowAdapter{
	private Frame frame;
	
	public Test34FrameAdapter() {  // 생성자
		frame = new Frame("Adapter 사용");
		
		frame.setSize(500, 300);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		
		frame.addWindowListener(this);
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		new Test34FrameAdapter();

	}

}
