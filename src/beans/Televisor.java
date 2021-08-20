package beans;

public class Televisor {
	private int canal;
	private int volume;
	private boolean ligado;
	
	public int getCanal() 
	{
		return canal;
	}
	
	private void setCanal(int canal)
	{
		this.canal = canal;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	private void setVolume(int volume)
	{
		this.volume = volume;
	}
	
	public boolean isLigado() 
	{
		return ligado;
	}
	
	private void setLigado(boolean ligado)
	{
		this.ligado = ligado;
	}
	
	// Métodos
	
	public void subirCanal() 
	{
		if(canal < 16) 
		{
			setCanal(this.canal+1);
		}
	}
	
	public void descerCanal() 
	{
		if(canal > 1) 
		{
			setCanal(this.canal-1);
		}
	}
	
	public void aumentarVolume()
	{	
		if(volume < 10) 
		{
			setVolume(this.volume+1);
		}
	}
	
	public void dimunirVolume()
	{
		setVolume(this.volume-1);
	}
	
	public void ligarTv() 
	{
		setLigado(this.ligado = true);
	}
	
	public void desligarTv() 
	{
		setLigado(this.ligado = false);
	}
	
	public String mostraStatus()
	{
		return "Canal: " + canal + "\nVolume: " + volume + "\nligado? " + ligado;
	}
}