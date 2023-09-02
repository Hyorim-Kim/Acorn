package pack3;

import java.awt.Frame;

public class Test20FrameSangsok extends Frame{
	public Test20FrameSangsok() {
		super("클래스의 상속");
	}
	
	public void display() {
		//setTitle("클래스의 상속");
		//this.setTitle("클래스의 상속");
		//super.setTitle("클래스의 상속");
		setSize(500, 300);
		//this.setSize(500, 300);
		//super.setSize(500, 300);
		setLocation(200, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		//Test20FrameSangsok frameSangsok = new Test20FrameSangsok();
		//frameSangsok.display();
		new Test20FrameSangsok().display();
	}

}
