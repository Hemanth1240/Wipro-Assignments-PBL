package milestone1.abstractionAndPackages.interfaces.music.live;
import milestone1.abstractionAndPackages.interfaces.music.Playable;
import milestone1.abstractionAndPackages.interfaces.music.string.Veena;
import milestone1.abstractionAndPackages.interfaces.music.wind.Saxophone;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena veena = new Veena();
		Saxophone saxophone = new Saxophone();
		veena.play();
		saxophone.play();
		
		
		Playable saxophoneObj = new Saxophone();
		veena.play();
		saxophoneObj.play();
	}

}
