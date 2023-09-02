package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Test37FrameAnonymouse  extends Frame{
	public Test37FrameAnonymouse(String title) {   // Anonymous
		super(title);
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter()  // 내부 무명 클래스 사용, 추상클래스를 new로 만든다(예외)
		{ // WindowAdapter가 가지고 있는 메소드를 오버라이딩 한다
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.BLUE);
			}
		});
	}
		
		public static void main(String[] args) {
			new Test37FrameAnonymouse("내부 무명 클래스");
			
	}

}
