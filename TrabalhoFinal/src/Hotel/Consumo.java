package Hotel;

import java.util.Date;

public class Consumo {
	private Item item;
	private Reserva reserva;
	private int quantidadeSolicitada;
	private Date dataConsumo;
	
	public Item getItem() {
		return item;
	}
	public Reserva getReserva() {
		return reserva;
	}
	public int getQuantidadeSolicitada() {
		return quantidadeSolicitada;
	}
	public Date getDataConsumo() {
		return dataConsumo;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	public void setQuantidadeSolicitada(int quantidadeSolicitada) {
		this.quantidadeSolicitada = quantidadeSolicitada;
	}
	public void setDataConsumo(Date dataConsumo) {
		this.dataConsumo = dataConsumo;
	}
	
	
}
