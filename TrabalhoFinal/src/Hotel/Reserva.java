package Hotel;

import java.util.Date;

public class Reserva {
	private int codigo;
	private Hospede hospede;
	private	Funcionario funcionarioReserva;
	private Funcionario funcionarioFechamento;
	private Date dataEntradaReserva;
	private Date dataSaidaReserva;
	private Date dataCheckin;
	private Date dataCheckout;
	private double valorReserva;
	private double valorPago;
	
	public int getCodigo() {
		return codigo;
	}
	public Hospede getHospede() {
		return hospede;
	}
	public Funcionario getFuncionarioReserva() {
		return funcionarioReserva;
	}
	public Funcionario getFuncionarioFechamento() {
		return funcionarioFechamento;
	}
	public Date getDataEntradaReserva() {
		return dataEntradaReserva;
	}
	public Date getDataSaidaReserva() {
		return dataSaidaReserva;
	}
	public Date getDataCheckin() {
		return dataCheckin;
	}
	public Date getDataCheckout() {
		return dataCheckout;
	}
	public double getValorReserva() {
		return valorReserva;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	public void setFuncionarioReserva(Funcionario funcionarioReserva) {
		this.funcionarioReserva = funcionarioReserva;
	}
	public void setFuncionarioFechamento(Funcionario funcionarioFechamento) {
		this.funcionarioFechamento = funcionarioFechamento;
	}
	public void setDataEntradaReserva(Date dataEntradaReserva) {
		this.dataEntradaReserva = dataEntradaReserva;
	}
	public void setDataSaidaReserva(Date dataSaidaReserva) {
		this.dataSaidaReserva = dataSaidaReserva;
	}
	public void setDataCheckin(Date dataCheckin) {
		this.dataCheckin = dataCheckin;
	}
	public void setDataCheckout(Date dataCheckout) {
		this.dataCheckout = dataCheckout;
	}
	public void setValorReserva(double valorReserva) {
		this.valorReserva = valorReserva;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public void cadastrarReserva(int codigo, Hospede hospede){
		
	}
}


