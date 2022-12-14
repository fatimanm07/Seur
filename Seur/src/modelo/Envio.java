package modelo;

public class Envio 
{
 
	private String CiudadOrigen;
	
	private boolean OrigenNacional;
	private String CiudadDestino;
	private boolean DestinoNacional;
	private String TipoEnvio;
	private int Peso;
	private int importe;
	
	public Envio() {
		super();
	}





	public Envio(String ciudadOrigen, boolean origenNacional, String ciudadDestino, boolean destinoNacional,
			String tipoEnvio, int peso) 
	{
		super();
		this.CiudadOrigen = ciudadOrigen;
		this.OrigenNacional = origenNacional;
		this.CiudadDestino = ciudadDestino;
		this.DestinoNacional = destinoNacional;
		this.TipoEnvio = tipoEnvio;
		this.Peso = peso;
	}


	public double calculaImporte(boolean OrigenNacional, boolean DestinoNacional, int Peso, String CiudadDestino, String TipoEnvio)
	{
		double precio = 0;
		double precioPeso = 0;
		
		if ((OrigenNacional == true) && (DestinoNacional == true))
		{
			precio = 4;
		}
		
		else
		{
			precio = 7;
		}
		
		
		if (TipoEnvio.equals ("Paq 10 - Antes de las 10 h"))
		{
			precio = precio + 5;
		}
		
		precioPeso = Peso * 0.1;
		
		precio = precio + precioPeso;
		
		return precio;
	}
	


	@Override
	public String toString() {
		return "Envio [CiudadOrigen=" + CiudadOrigen + ", OrigenNacional=" + OrigenNacional + ", CiudadDestino="
				+ CiudadDestino + ", DestinoNacional=" + DestinoNacional + ", TipoEnvio=" + TipoEnvio + ", Peso=" + Peso
				+ "]";
	}
	
	
	
	
	
	public String getCiudadOrigen() {
		return CiudadOrigen;
	}
	public void setCiudadOrigen(String ciudadOrigen) {
		CiudadOrigen = ciudadOrigen;
	}
	public boolean isOrigenNacional() {
		return OrigenNacional;
	}
	public void setOrigenNacional(boolean origenNacional) {
		OrigenNacional = origenNacional;
	}
	public String getCiudadDestino() {
		return CiudadDestino;
	}
	public void setCiudadDestino(String ciudadDestino) {
		CiudadDestino = ciudadDestino;
	}
	public boolean isDestinoNacional() {
		return DestinoNacional;
	}
	public void setDestinoNacional(boolean destinoNacional) {
		DestinoNacional = destinoNacional;
	}
	public String getTipoEnvio() {
		return TipoEnvio;
	}
	public void setTipoEnvio(String tipoEnvio) {
		TipoEnvio = tipoEnvio;
	}
	public int getPeso() {
		return Peso;
	}
	public void setPeso(int peso) {
		Peso = peso;
	}
	
	

}
