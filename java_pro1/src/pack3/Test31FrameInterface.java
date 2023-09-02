package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test31FrameInterface extends Frame implements WindowListener, MouseListener{    // implements 구현
	//public Test31FrameInterface("이벤트 처리") {
	public Test31FrameInterface() {
		//super.setTitle("이벤트 처리");  -> this.와 구분해야 할 때
		setTitle("이벤트 처리");

	}
	
	public void frameShow() {
		setSize(500, 300);    // 생성자에서 만들어도 됨
		setLocation(200, 200);
		setVisible(true);
		
		addWindowListener(this);   // 현재 클래스(Frame)에 WindowListener 장착, - 이제 사용자의 윈도우 이벤트를 수신
		addMouseListener(this);    // this: 현재 클래스에 존재하기 때문
	}
	
	@Override
	public void windowActivated(WindowEvent e) {    // https://docs.oracle.com/javase/8/docs/api/ 참고
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("종료하고 싶니?");
		System.exit(0);  // 종료
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("허걱 돌아오다니");
		
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("와우 작아졌네");
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
	}
	
	
	//-------------------------------
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("클릭");
		//setBackground(Color.BLUE);
		//setBackground(new Color(0, 0, 255));
		//System.out.println((int)(Math.random() * 255));   // casting
		int r = (int)(Math.random() * 255);
		int g = (int)(Math.random() * 255);
		int b = (int)(Math.random() * 255);
		setBackground(new Color(r, g, b));
		setTitle("r:" + r + ",g:" + g + ",b" + b);
				
	 }
	

	
	@Override
	public void mouseEntered(MouseEvent e) {		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {			
	}
	
	@Override
	public void mousePressed(MouseEvent e) {	
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Test31FrameInterface frameInterface = new Test31FrameInterface();   // 객체변수 없이 생성자만 소환도 가능
		frameInterface.frameShow();

	}

}
