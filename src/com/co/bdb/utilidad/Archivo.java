package com.co.bdb.utilidad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.co.bdb.modelo.Producto;

public class Archivo {

	private String nombre = "D:\\ProyectoFinal\\Programa\\Tienda.txt";
	private String reporte = "D:\\ProyectoFinal\\Programa\\Tienda.txt";
	private BufferedReader reader;
	private BufferedWriter buffer;

	public void crearArchivo() {

		File archivo = new File(nombre);
		try {

			BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true));

			buffer.append("Probando el arcvhivo").append(".....");

			buffer.close();

		} catch (IOException e) {
			System.out.println(" No es posible acceder al archivo:" + e.getMessage());

		}
	}

	public Boolean agregarPorducto(Producto producto) {

		File archivo = new File(nombre);
		boolean exitoso = true;
		try {

			buffer = new BufferedWriter(new FileWriter(archivo, true));
			if (!tieneTitulo()) {
				buffer.write("Id|  NombreProducto|  Categoria|  Precio|  CantidadDisponible");
				buffer.newLine();
			}

			buffer.write(producto.textoProducto());
			buffer.newLine();

			buffer.close();

		} catch (IOException e) {
			System.out.println("No es posible acceder al archivo:" + e.getMessage());
			exitoso = false;

		}

		return exitoso;
	}

	public List<Producto> buscarProductoPorCampo(Producto producto, int opcion) {

		File archivo = new File(nombre);
		Producto productos;
		List<Producto> listProducto = new ArrayList<>();
		List<Producto> productoEncontradoList = new ArrayList<>();

		String id;
		String nombreProducto;
		String categoria;
		float precio;
		int cantidadDisponible;

		try {
			reader = new BufferedReader(new FileReader(archivo));

			String linea;

			while ((linea = reader.readLine()) != null) {

				if (tieneEncabezado(linea)) {
					continue;
				}

				String[] columnas = linea.split("\\|");
				if (columnas.length != 5) {
					continue;
				}

				id = columnas[0];
				nombreProducto = columnas[1];
				categoria = columnas[2];
				precio = Float.parseFloat(columnas[3]);
				cantidadDisponible = Integer.parseInt(columnas[4]);

				// se adiciona el producto en la lista

				productos = new Producto(id, nombreProducto, categoria, precio, cantidadDisponible);
				listProducto.add(productos);

			}

			for (Producto objProducto : listProducto) {

				switch (opcion) {
					case 1:
						if (producto.getIdProducto().equalsIgnoreCase(objProducto.getIdProducto())) {
							productoEncontradoList.add(objProducto);
						}
						break;
					case 2:
						if (producto.getNombreProduto().equalsIgnoreCase(objProducto.getNombreProduto())) {
							productoEncontradoList.add(objProducto);
						}
						break;
					case 3:
						if (producto.getCategoria().equalsIgnoreCase(objProducto.getCategoria())) {
							productoEncontradoList.add(objProducto);
						}
						break;
					case 4:
						productoEncontradoList.add(objProducto);
						break;

				}

			}

			reader.close();

		} catch (IOException e) {
			System.err.println("Error al leer el archivo".concat(e.getMessage()));
		}

		return productoEncontradoList;
	}

	public Boolean eliminarProducto(Producto producto) {

		File archivo = new File(nombre);
		Producto objProducto;
		List<Producto> listProducto = new ArrayList<>();
		List<Producto> listObjProdFinal = new ArrayList<>();
		String id;
		String nombreProducto;
		String categoria;
		boolean eliminado = false;
		float precio;
		int cantidadDisponible;

		try {
			reader = new BufferedReader(new FileReader(archivo));

			String linea;
			while ((linea = reader.readLine()) != null) {
				if (tieneEncabezado(linea)) {
					continue;
				}

				String[] columnas = linea.split("\\|");
				if (columnas.length != 5) {
					continue;
				}

				id = columnas[0];
				nombreProducto = columnas[1];
				categoria = columnas[2];
				precio = Float.parseFloat(columnas[3]);
				cantidadDisponible = Integer.parseInt(columnas[4]);

				objProducto = new Producto(id, nombreProducto, categoria, precio, cantidadDisponible);
				listProducto.add(objProducto);

			}

			for (Producto oProducto : listProducto) {
				if (!oProducto.getIdProducto().equalsIgnoreCase(producto.getIdProducto())) {

					listObjProdFinal.add(oProducto);
				} else {
					eliminado = true;
				}
			}

			for (Producto producto2 : listObjProdFinal) {
				System.out.println(producto2);
			}

			crearNuevoListadoProducto(listObjProdFinal, false);

		} catch (IOException e) {
			System.out.println("No es posible acceder al archivo:" + e.getMessage());
		}

		return eliminado;
	}

	public Boolean actualizarProducto(Producto productoAnterior, Producto nuevoPructo) {

		File archivo = new File(nombre);
		Producto objProducto;
		List<Producto> listProducto = new ArrayList<>();
		List<Producto> listObjProdFinal = new ArrayList<>();
		String id;
		String nombreProducto;
		String categoria;
		boolean actualizado = false;
		float precio;
		int cantidadDisponible;

		// lee el archivo
		try {
			reader = new BufferedReader(new FileReader(archivo));

			String linea;
			while ((linea = reader.readLine()) != null) {
				if (tieneEncabezado(linea)) {
					continue;
				}

				// Se separa la linea por columnas
				String[] columnas = linea.split("\\|");
				if (columnas.length != 5) {
					continue;
				}

				// se llena el valor con lo datos del archivo
				id = columnas[0];
				nombreProducto = columnas[1];
				categoria = columnas[2];
				precio = Float.parseFloat(columnas[3]);
				cantidadDisponible = Integer.parseInt(columnas[4]);

				objProducto = new Producto(id, nombreProducto, categoria, precio, cantidadDisponible);
				listProducto.add(objProducto);

			}

			for (Producto oProducto : listProducto) {
				if (!oProducto.getIdProducto().equalsIgnoreCase(productoAnterior.getIdProducto())) {

					listObjProdFinal.add(oProducto);

					actualizado = true;

				} else {
					continue;
				}
			}
			listObjProdFinal.add(nuevoPructo);


			crearNuevoListadoProducto(listObjProdFinal, false);

		} catch (IOException e) {
			System.out.println("No es posible acceder al archivo:" + e.getMessage());
		}

		return actualizado;
	}

	public boolean tieneTitulo() {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		boolean titulo = false;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(archivo));
			String linea;
			while ((linea = reader.readLine()) != null) {

				sb.append(linea);
				if (sb.toString().toUpperCase().contains("ID")) {
					titulo = true;
				}
			}

			reader.close();

		} catch (IOException e) {

			System.out.println("No es posible acceder al archivo:" + e.getMessage());
		}
		return titulo;

	}

	private static boolean tieneEncabezado(String linea) {

		String[] columnas = linea.split("\\|");

		for (String col : columnas) {
			if (col.toUpperCase().contains("ID")) {
				return true;
			}
		}

		return false;
	}

	private void crearNuevoListadoProducto(List<Producto> listProducto, Boolean actualizar) {

		File archivo = new File(nombre);
		try {
			buffer = new BufferedWriter(new FileWriter(archivo, actualizar));
			if (!tieneTitulo()) {
				buffer.write("Id-NombreProducto - Categoria - Precio - CantidadDisponible");
				buffer.newLine();
			}
			for (Producto producto : listProducto) {
				buffer.write(producto.textoProducto());
				buffer.newLine();
			}
			buffer.close();
		} catch (IOException e) {
			System.out.println("No es posible acceder al archivo:" + e.getMessage());
		}

	}

	public Producto calcularPrecioProducto() {

		File archivo = new File(nombre);
		Producto objProducto;
		List<Producto> listProducto = new ArrayList<>();
		//Inicializa variables para buscar el producto más caro
		Producto productoMayorPrecio = null;
		float precioMaximo = Float.MIN_VALUE;

		try {
			reader = new BufferedReader(new FileReader(archivo));
			String linea;

			while ((linea = reader.readLine()) != null) {

				if (tieneEncabezado(linea)) {
					continue;
				}

				String[] columnas = linea.split("\\|");
				if (columnas.length != 5) {
					continue;
				}

				objProducto = new Producto(columnas[0], columnas[1], columnas[2], Float.parseFloat(columnas[3]),
						Integer.parseInt(columnas[4]));

				listProducto.add(objProducto);

			}
			for (Producto prod : listProducto) {
				if (prod.getPrecio() > precioMaximo) {
					precioMaximo = prod.getPrecio();
					productoMayorPrecio = prod;
				}

			}

		} catch (IOException e) {
			System.out.println("no es posible acceder al archivo:" + e.getMessage());
		}

		return productoMayorPrecio;
	}

	public List<String> calcularProductoPorCategoria() {

		File archivo = new File(nombre);
		Producto objProducto;
		List<Producto> listProducto = new ArrayList<>();
		List<String> salida = new ArrayList<>();

		try {
			reader = new BufferedReader(new FileReader(archivo));
			String linea;

			while ((linea = reader.readLine()) != null) {

				if (tieneEncabezado(linea)) {
					continue;
				}

				String[] columnas = linea.split("\\|");
				if (columnas.length != 5) {
					continue;
				}

				objProducto = new Producto(columnas[0], columnas[1], columnas[2], Float.parseFloat(columnas[3]),
						Integer.parseInt(columnas[4]));


				listProducto.add(objProducto);

			}

			String[][] conteoPorCategoria = new String[listProducto.size()][2];
			int categoriasRegistradas = 0;

			for (Producto prod : listProducto) {

				String categoria = prod.getCategoria();
				int canCategoria = prod.getCantidadDisponible();

				boolean encontrada = false;

				for (int i = 0; i < categoriasRegistradas; i++) {

					if (conteoPorCategoria[i][0].equals(categoria)) {

						int cantidadActual = Integer.parseInt(conteoPorCategoria[i][1]);
						conteoPorCategoria[i][1] = String.valueOf(cantidadActual + canCategoria);
						encontrada = true;
						break;

					}
				}

				if (!encontrada) {
					conteoPorCategoria[categoriasRegistradas][0] = categoria;
					conteoPorCategoria[categoriasRegistradas][1] = String.valueOf(canCategoria);
					categoriasRegistradas++;
				}

			}

			for (int i = 0; i < categoriasRegistradas; i++) {

				String textSalida = "Categoria: " + conteoPorCategoria[i][0] + " - Cantidad: "
						+ conteoPorCategoria[i][1];
				salida.add(textSalida);
			}

		} catch (IOException e) {

			System.out.println("no es posible acceder al archivo:" + e.getMessage());
		}

		return salida;
	}

	public boolean generarReporte(List<String> linea) {

		File archivo = new File(reporte);
		boolean exitoso = true;
		try {

			buffer = new BufferedWriter(new FileWriter(archivo, false));
			buffer.write("Id|NombreProducto|Categoria|Precio|Cantidad|Total");
			buffer.newLine();

			for (String texto : linea) {
				buffer.write(texto);
				buffer.newLine();
			}

			buffer.close();

		} catch (IOException e) {

			System.out.println("no es posible acceder al archivo:" + e.getMessage());
			exitoso = false;
		}

		return exitoso;

	}

}
