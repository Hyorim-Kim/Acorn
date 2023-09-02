package pack3;

public class Test25Tv extends Test25ElecProduct{
	@Override
	public void volumeControl() {
		System.out.println("Tv 사운드 변경 후에는 " + getVolume());
	}
	
	public void tvShow() {
		System.out.println("Tv 고유 메소드");
	}
}
