package filosofo;

import java.util.ArrayList;
import java.util.List;

public class Jantar {
	
	public static void main(String[] args) {
		List<Hashi>hashis = new ArrayList<Hashi>();
		for (int i = 0; i<=4; i++){
			Hashi hashi = new Hashi(i);
			hashis.add(i,hashi);
		}
		Filosofo r0 = new Filosofo(hashis, 0);
		Thread f0 = new Thread(r0);
		Filosofo r1 = new Filosofo(hashis, 1);
		Thread f1 = new Thread(r1);
		Filosofo r2 = new Filosofo(hashis, 2);
		Thread f2 = new Thread(r2);
		Filosofo r3 = new Filosofo(hashis, 3);
		Thread f3 = new Thread(r3);
		Filosofo r4 = new Filosofo(hashis, 4);
		Thread f4 = new Thread(r4);		
		
		f0.setName("Filosofo 1");
		f1.setName("Filosofo 2");
		f2.setName("Filosofo 3");
		f3.setName("Filosofo 4");
		f4.setName("Filosofo 5");
		
		f0.start();
		f1.start();
		f2.start();
		f3.start();
		f4.start();
	}

}
