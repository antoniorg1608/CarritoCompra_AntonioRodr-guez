package es.studium.Coleccion;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import es.studium.Enum.Tax;
import es.studium.Pojo.Product;

public class Shopping {
	
	static BigDecimal ivaCalculado = new BigDecimal(0);
	static BigDecimal total = new BigDecimal(0);
	
	
public static void main(String[] args) {



		List<Product> shoppingCart = List.of(
				
		new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
		new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
		new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
		new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
		new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
		new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));


		//implements
		shoppingCart.stream().forEach(pro -> {
			ivaCalculado = pro.getPrecio().multiply(pro.getTipoIva().getPrecio());
			total = total.add(pro.getPrecio().add(ivaCalculado));
		});
		System.out.println("========= Coste total de la compra incluyendo el iva ===========\n");
		System.out.println(total);
		
		
		System.out.println("\n========= Productos que comienzan por C ordenados por nombre =========\n");

		Stream<Product> productos = shoppingCart.stream().filter(producto -> producto.getName().startsWith("C"))
				.sorted();
		productos.forEach((p) -> {
			System.out.print(p.getName()+ ",");
		});}
}