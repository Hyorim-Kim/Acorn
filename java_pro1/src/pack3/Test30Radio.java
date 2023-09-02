package pack3;

//public class Test30Radio implements Test30InterVol{ 
//public class Test30Radio implements Test30InterVol, Test30AdvanceVol{ 
public class Test30Radio implements Test30AdvanceVol{   // 4개의 추상메소드를 오버라이드하기
	private int v = 0;
	
	@Override
	public void volOn() {
		System.out.println("라디오 소리 켜기");
			
		}
	
	@Override
	public void volOff() {
		 System.out.println("라디오 소리 끄기");
			
		}
	
	@Override
	public void volUp(int v) {
		this.v += v;
		System.out.println("라디오 볼륨은 " + this.v);
			
		}
	
	@Override
	public void volDown(int v) {
		this.v -= v;
		System.out.println("라디오 볼륨은 " + this.v);
			
		}
	
	
	//------------------------메인
	public static void main(String[] args) {
		Test30Radio radio = new Test30Radio();
		radio.volOn();
		radio.volUp(5);
		radio.volDown(2);
		radio.volOff();
	}
	
	
}
