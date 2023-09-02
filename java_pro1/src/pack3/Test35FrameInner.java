package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 내부 클래스 적용 샘플
public class Test35FrameInner extends Frame{
	private MyInner myInner;
	
	public Test35FrameInner() {
		//super("내부 클래스 사용");  constructor 이용해서 생성
		setTitle("내부 클래스 사용");
		
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
		
		myInner = new MyInner();
		addWindowListener(myInner);
		addMouseListener(new YourInner());
	}
	
	class MyInner extends WindowAdapter{     // 어댑터; 스스로가 추상이 됨
		@Override
		public void windowClosing(WindowEvent e) {    // 원하는 것만 고르기
			System.exit(0);
		}
	}
	
	class YourInner extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			setBackground(Color.RED);
		}
	}
	

	public static void main(String[] args) {
		new Test35FrameInner();

	}

}
