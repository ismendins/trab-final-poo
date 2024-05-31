package Hotel;

public class Quarto {
	private int codigo;
	private Categoria categoria;
	private String status;
	public int getCodigo() {
		return codigo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public String getStatus() {
		return status;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
