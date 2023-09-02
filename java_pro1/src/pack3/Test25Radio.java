package pack3;

public class Test25Radio extends Test25ElecProduct{
	@Override
	public void volumeControl() {
		System.out.println("라디오 소리 조절 후 " + getVolume());
	}
}
