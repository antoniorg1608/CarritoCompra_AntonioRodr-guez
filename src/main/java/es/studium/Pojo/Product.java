package es.studium.Pojo;

import java.math.BigDecimal;

import es.studium.Enum.Tax;

public class Product implements Comparable<Product> {
	
	private String name;
	private BigDecimal precio;
	private Tax tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Tax getTipoIva() {
		return tax;
	}
	public void setTipoIva(Tax tipoIva) {
		this.tax = tipoIva;
	}
	public Product(String name, BigDecimal precio, Tax tipoIva) {
		super();
		this.name = name;
		this.precio = precio;
		this.tax = tipoIva;
	}
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
