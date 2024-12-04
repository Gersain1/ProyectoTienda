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
	private String nombre = "D:\\archivo\\file.txt";

	public void crearArchivo() {

		File archivo = new File(nombre);
		try {

			BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true));

			buffer.append("Probando el arcvhivo").append(".....");

			buffer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Boolean agregarPorducto(Producto producto) {

		File archivo = new File(nombre);
		boolean exitoso = true;
		try {

			int contador = 1;

			BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true));
			if (!tieneTitulo()) {
				buffer.write("_Id-NombreProducto-Categoria-Precio-CantidadDisponible");
				buffer.newLine();
			}

			buffer.write(producto.textoProducto());
			buffer.newLine();

			buffer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			exitoso = false;
		}

		return exitoso;
	}

	public List<Producto> buscarProductoPorCampo(Producto producto, int opcion) {

		StringBuilder sb = new StringBuilder();
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
			BufferedReader reader = new BufferedReader(new FileReader(archivo));
			// String primeraLinea = reader.readLine();
			String linea;

			while ((linea = reader.readLine()) != null) {

				if (tieneEncabezado(linea)) {
					continue;
				}

				String[] columnas = linea.split("-");
				if (columnas.length != 5) {
					continue;
				}

				id = columnas[0];
				nombreProducto = columnas[1];
				categoria = columnas[2];
				precio = Float.parseFloat(columnas[3]);
				cantidadDisponible = Integer.parseInt(columnas[4]);
				
				//Adicionamos el producto a la lista
				
				productos = new Producto(id, nombreProducto, categoria, precio, cantidadDisponible);
				listProducto.add(productos);
				
			}
			
			for (Producto objProducto : listProducto) {
				
				switch (opcion) {
				case 1: //IdProducto
					if(producto.getIdProducto().equalsIgnoreCase(objProducto.getIdProducto())) {
						productoEncontradoList.add(objProducto);
					}
					break;
				case 2:
					if(producto.getNombreProduto().equalsIgnoreCase(objProducto.getNombreProduto())) {
						productoEncontradoList.add(objProducto);
					}
					break;
				case 3:
					if(producto.getCategoria().equalsIgnoreCase(objProducto.getCategoria())) {
						productoEncontradoList.add(objProducto);
					}
					break;

				
				}
				
				
			}

			reader.close();

		} catch (IOException e) {
			System.err.println("Error al leer el archivo".concat(e.getMessage()));
		}

		return productoEncontradoList;
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
				if (sb.toString().toUpperCase().contains("_ID")) {
					titulo = true;
				}
			}

			reader.close();

			// System.out.println(sb.toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return titulo;

	}

	private static boolean tieneEncabezado(String linea) {

		String[] columnas = linea.split("-");

		for (String col : columnas) {
			if (col.toUpperCase().contains("_ID")) {
				return true;
			}
		}

		return false;
	}

}
