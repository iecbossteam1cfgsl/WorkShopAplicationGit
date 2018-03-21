
public class Product {
	private int codProd;
	private String prodDescription;
	private double prodprice;
	private int prodStock;

	public Product() {
	}

	public int getCodProd() {
		return codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	public double getProdprice() {
		return prodprice;
	}

	public void setProdprice(double prodprice) {
		this.prodprice = prodprice;
	}

	public int getProdStock() {
		return prodStock;
	}

	public void setProdStock(int prodStock) {
		this.prodStock = prodStock;
	}
}