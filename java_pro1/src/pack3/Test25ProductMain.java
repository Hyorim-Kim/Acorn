package pack3;

public class Test25ProductMain {

	public static void main(String[] args) {
		// 다형성
		Test25ElecProduct product = null;  // 추상
		
		Test25Radio radio = new Test25Radio();
		radio.setVolume(5);
		System.out.println(radio.getVolume());  // 출력
		radio.volumeControl();
		
		System.out.println();
		Test25Tv tv = new Test25Tv();
		tv.setVolume(7);
		tv.volumeControl();
		tv.tvShow();
		
		System.out.println("----------------");
		product = radio;
		product.volumeControl();
		System.out.println();
		product= tv;
		product.volumeControl();
		//product.tvShow();
	}

}
