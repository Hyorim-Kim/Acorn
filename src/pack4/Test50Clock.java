package pack4;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.LocalTime;

// 스레드를 사용하여 디저털 시계 작성
public class Test50Clock extends Frame implements ActionListener, Runnable{
	Label lblMessage;
	Boolean b = false;
	Thread thread;
	
	public Test50Clock() {
		lblMessage = new Label("show time", Label.CENTER);
		add("Center", lblMessage);
		
		Button btnClick = new Button("click");
		add("South", btnClick);
		btnClick.addActionListener(this);
		
		setTitle("스레드 시계");
		setBounds(500, 200, 300, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				b = true;
				System.exit(0);
			}
		});
		
		thread = new Thread(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Button을 클릭하면 수행되는 메소드
		// System.out.println("와우");	
		// displayDate();
		
		if(thread.isAlive()) return;
		thread.start();   // run을 호출
		
	}
	
	@Override
	public void run() {
		// Runnable 인터페이스의 추상 메소드를 오버라이딩
		while(true) {
			if(b == true) break;
			displayDate();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	
	private void displayDate() {
		LocalDate date = LocalDate.now();
		int y = date.getYear();
		int m = date.getMonthValue();
		int d = date.getDayOfMonth();
		
		LocalTime time = LocalTime.now();
		int h = time.getHour();
		int mi = time.getMinute();
		int s = time.getSecond();
		
		lblMessage.setText(y + "-" + m + "-" + d + " " + h + ":" + mi + ":" + s);
		lblMessage.setFont(new Font("돋움", Font.BOLD, 20));
	}
	
	
	public static void main(String[] args) {
		new Test50Clock();

	}

}
