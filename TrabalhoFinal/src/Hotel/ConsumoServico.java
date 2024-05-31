package Hotel;

import java.util.Date;

public class ConsumoServico {
	private Servico servico;
	private Reserva reserva;
	private int quantidadeSolicitada;
	private Date dataServico;
	public Servico getServico() {
		return servico;
	}
	public Reserva getReserva() {
		return reserva;
	}
	public int getQuantidadeSolicitada() {
		return quantidadeSolicitada;
	}
	public Date getDataServico() {
		return dataServico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	public void setQuantidadeSolicitada(int quantidadeSolicitada) {
		this.quantidadeSolicitada = quantidadeSolicitada;
	}
	public void setDataServico(Date dataServico) {
		this.dataServico = dataServico;
	}
	
	
}
