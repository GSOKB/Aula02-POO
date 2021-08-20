package implementacao;
import beans.Televisor;

public class ExecutarTelevisor {
	public static void main(String[] args) {
		Televisor tv = new Televisor();
		
		tv.ligarTv();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.subirCanal();
		tv.subirCanal();
		tv.subirCanal();
		
		System.out.println(tv.mostraStatus());
	}
}