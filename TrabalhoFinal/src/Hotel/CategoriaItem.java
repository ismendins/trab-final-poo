package Hotel;

public class CategoriaItem {
	private Item item;
	private Categoria categoria;
	private int quantidade;
	public Item getItem() {
		return item;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
}
