package filosofo;

import java.util.List;

public class Filosofo implements Runnable {
	final int N = 5;
	List<Hashi> hashis; 
	int filosofo;
	
	Filosofo (List gs, int fil){
		hashis = gs;
		filosofo = fil;
	}
	public void run() {
		for (int i=0; i<5; i++){
			pensaMuito(filosofo);
			pegaSushi(filosofo,filosofo);
			pegaSushi((filosofo+1)%N, filosofo);
			comeSushi(filosofo);
			largaSushi(filosofo,filosofo);
			largaSushi((filosofo+1)%N,filosofo);
		}
	}
	
	private void pensaMuito(int fil){
		switch (fil) {
			case 0:
				try{ 
					System.out.println("!!>"+Thread.currentThread().getName()+" PENSA");
					Thread.sleep(500);}
				catch (InterruptedException e){}
			case 1:
				try{ 
					System.out.println("!!>"+Thread.currentThread().getName()+" PENSA");
					Thread.sleep(1000);}
				catch (InterruptedException e){}
			case 2:
				try{ 
					System.out.println("!!>"+Thread.currentThread().getName()+" PENSA");
					Thread.sleep(1500);}
				catch (InterruptedException e){}
			case 3:
				try{
					System.out.println("!!>"+Thread.currentThread().getName()+" PENSA");
					Thread.sleep(2000);}
				catch (InterruptedException e){}
			case 4:
				try{
					System.out.println("!!>"+Thread.currentThread().getName()+" PENSA");
					Thread.sleep(2500);}
				catch (InterruptedException e){}
		}		
	}

	private void pegaSushi(int pos, int dono){
		if (((Hashi)hashis.get(pos)).getEstadoHashi()==false){ 
			System.out.println("++>"+Thread.currentThread().getName()+" PEGA SUSHI "+ pos);
			((Hashi)hashis.get(pos)).setEstadoHashi(true);
			((Hashi)hashis.get(pos)).setDono(dono);
		}
	}

	private void largaSushi(int pos, int dono){
		if (((Hashi)hashis.get(pos)).getEstadoHashi()==true &&
			((Hashi)hashis.get(pos)).getDono() == dono){
			System.out.println("-->"+Thread.currentThread().getName()+" LARGA SUSHI "+ pos);
			((Hashi)hashis.get(pos)).setEstadoHashi(false);
			((Hashi)hashis.get(pos)).setDono(-1);
		}
	}

	private void comeSushi(int fil){
		if (((Hashi)hashis.get(fil)).getEstadoHashi() &&
			((Hashi)hashis.get((fil+1)%N)).getEstadoHashi() &&
			((Hashi)hashis.get(fil)).getDono()==fil &&
			((Hashi)hashis.get((fil+1)%N)).getDono()==fil){
			System.out.println("@@>"+Thread.currentThread().getName()+" COME SUSHI");
			try{ Thread.sleep(5000);}
			catch (InterruptedException e){}
			}
	}
}
