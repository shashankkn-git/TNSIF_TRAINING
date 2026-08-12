package org.tnsif.acc.c2tc.multipleinterface;

class Smartphone implements Camera,Musicplayer{

	@Override
	public void Playmusic() {
		System.out.println("Listen to music");
		
	}

	@Override
	public void takephoto() {
		System.out.println("take a photo");
		
	}
	
}
public class MultipleInterface {
	public static void main(String[] args) {
		Smartphone s=new Smartphone();
		s.Playmusic();
		s.takephoto();
	}

}
