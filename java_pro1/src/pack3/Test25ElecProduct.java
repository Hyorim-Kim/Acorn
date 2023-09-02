package pack3;

public class Test25ElecProduct {
	// 전자제품(Radio, Tv)의 부모(super, 조상, parameter, 상위) 클래스
	private int volume = 0;
	
	public void volumeControl() {
		// 내용은 적지 않는다. - 자식 클래스에서 특성에 맞게 각각 적어 주면 된다.
		// 현재 메소드를 자식 클래스에서 오버라이딩 하길 기대! (다형성 구사를 위해)
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
