package com.co.bdb.servicio;
import java.util.ArrayList;
import java.util.List;
import com.co.bdb.modelo.Producto;
import com.co.bdb.utilidad.Archivo;
import com.co.bdb.utilidad.Leer;


public class Inventario {

	private Producto miProducto;
	private Leer entrada;
	private Archivo miArchivo;

	public void agregarProducto() {

		System.out.println("*****************\n");
		entrada = new Leer();
		miProducto = new Producto();
		miArchivo = new Archivo();

		System.out.println("Nuevo producto \n");

		miProducto.setIdProducto(entrada.pedirString("Codigo Producto:"));
		miProducto.setNombreProduto(entrada.pedirString("Nombre Producto:"));
		miProducto.setCategoria(entrada.pedirString("Categoria Producto:"));
		miProducto.setPrecio(entrada.pedirFloat("Precio Producto:"));
		miProducto.setCantidadDisponible(entrada.pedirInt("Cantidad de produtos:"));

		if (miArchivo.agregarPorducto(miProducto)) {
			System.out.println("producto agregado");
		} else {
			System.out.println("error agregado producto");
		}
		System.out.println("*****************\n ");
	}

	public void buscarProductoPorCampo() {
		System.out.println("*****************\n");
		entrada = new Leer();
		List<Producto> listProducto = new ArrayList<Producto>();
		miProducto = new Producto();
		miArchivo = new Archivo();
		int opcion;

		System.out.println("Buscar por");
		System.out.println("1. Id Producto");
		System.out.println("2. Nombre");
		System.out.println("3. Categoria");

		opcion = entrada.pedirInt("Ingrese una opcion:");

		switch (opcion) {
			case 1:
				miProducto.setIdProducto(entrada.pedirString("Codigo Producto:"));
				break;
			case 2:
				miProducto.setNombreProduto(entrada.pedirString("Nombre Producto:"));
				break;
			case 3:
				miProducto.setCategoria(entrada.pedirString("Categoria Producto:"));
				break;

		}

		try {

			listProducto = miArchivo.buscarProductoPorCampo(miProducto, opcion);
			if (!listProducto.isEmpty()) {
				for (Producto producto : listProducto) {
					System.out.println(producto);
				}
			} else {
				System.out.println("Producto no encontrado");
			}

		} catch (NullPointerException e) {
			System.out.println("Producto no encontrado");
		}
		System.out.println("*****************\n");
	}

	public void actualizarProducto() {
		System.out.println("*****************\n");
		miArchivo = new Archivo();
		miProducto = new Producto();
		entrada = new Leer();
		List<Producto> listProducto = new ArrayList<Producto>();

		int opcion = 1;
		miProducto.setIdProducto(entrada.pedirString("Codigo Producto:"));
		listProducto = miArchivo.buscarProductoPorCampo(miProducto, opcion);

		System.out.println(listProducto.get(0) + "\n");
		System.out.println("Ingrese los nuevos datos:");
		miProducto.setIdProducto(entrada.pedirString("Codigo Producto:"));
		miProducto.setNombreProduto(entrada.pedirString("Nombre Producto:"));
		miProducto.setCategoria(entrada.pedirString("Categoria Producto:"));
		miProducto.setPrecio(entrada.pedirFloat("Precio Producto:"));
		miProducto.setCantidadDisponible(entrada.pedirInt("Cantidad de produtos:"));

		miArchivo.actualizarProducto(listProducto.get(0), miProducto);

		System.out.println("Producto actualizado");

		System.out.println("*****************\n ");

	}

	public void eliminarProducto() {
		System.out.println("*****************\n");
		miArchivo = new Archivo();
		miProducto = new Producto();
		entrada = new Leer();

		System.out.println("Eliminar producto");
		System.out.println("Buscar por Id Producto");
		System.out.println("");

		miProducto.setIdProducto(entrada.pedirString("Codigo Producto:"));

		if (miArchivo.eliminarProducto(miProducto)) {
			System.out.println("Producto eliminado");
		} else {
			System.out.println("Producto no eliminado");
		}
		System.out.println("*****************\n");
	}

	public void calcularPrecioProducto() {
		System.out.println("*****************\n");
		miArchivo = new Archivo();
		miProducto = new Producto();
		entrada = new Leer();
		if (miArchivo.calcularPrecioProducto() != null) {
			System.out.println("El producto con mayor precio es:" + miArchivo.calcularPrecioProducto());
		} else {
			System.out.println("Producto no encontrado");
		}

		System.out.println("*****************\n");

	}

	public void cantidadProductos() {
		System.out.println("*****************\n");
		miArchivo = new Archivo();
		miProducto = new Producto();
		entrada = new Leer();

		List<String> salida = new ArrayList<>();

		salida = miArchivo.calcularProductoPorCategoria();

		System.out.println("****Cantidad por categoria****");
		for (String linea : salida) {
			System.out.println(linea);
		}

		System.out.println("*****************\n ");
	}

	public void reporteInventario() {
		System.out.println("*****************\n");
		miArchivo = new Archivo();
		List<Producto> listProducto = new ArrayList<Producto>();

		// obtiene el listado de todos los productos
		listProducto = miArchivo.buscarProductoPorCampo(null, 4);
		List<String> linea = new ArrayList<>();
		float valorTotal = 0F;

		if (listProducto != null) {
			for (Producto producto : listProducto) {

				valorTotal = producto.getPrecio() * producto.getCantidadDisponible();
				linea.add(producto.getIdProducto().concat("|").concat(producto.getNombreProduto()).concat("|")
						.concat(producto.getCategoria()).concat("|").concat(String.valueOf(producto.getPrecio()))
						.concat("|").concat(String.valueOf(producto.getCantidadDisponible())).concat("|")
						.concat(String.valueOf(valorTotal)));

			}
		}
		if (miArchivo.generarReporte(linea)) {
			System.out.println("Archivo generado");
		} else {
			System.out.println("Error generado archivo");
		}

		System.out.println("*****************\n ");

	}

}
