package filosofo;

public class Hashi {
	
	private int idHashi;
	private boolean estadoHashi;
	private int dono;
	
	public Hashi(int id){
		idHashi = id;
		estadoHashi = false;		
		dono = -1;
	}
	
	public int getIdHashi(){
		return idHashi;
	}
	
	public void setIdHashi(int idHashi){
		this.idHashi = idHashi;
	}
	
	public int getDono(){
		return dono;
	}
	
	public void setDono(int dono){
		this.dono = dono;	
	}
	
	public boolean getEstadoHashi(){
		return estadoHashi;
	}
	
	public void setEstadoHashi(boolean estadoHashi){
		this.estadoHashi = estadoHashi;
	}
	
}
