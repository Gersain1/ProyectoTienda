package com.co.bdb.servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.co.bdb.modelo.Producto;
import com.co.bdb.utilidad.Archivo;
import com.co.bdb.utilidad.Leer;

public class Inventario {

	private Producto miProducto;
	private Leer entrada;
	private Archivo miArchivo;

	public void agregarProducto() {

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

	}

	public void buscarProductoPorCampo() {
		
		entrada = new Leer();
		List<Producto> listProducto = new ArrayList<Producto>(); 
		miProducto = new Producto();
		miArchivo = new Archivo();
		int opcion;
		
		System.out.println("Buscar por ");
		System.out.println("1. Id Producto ");
		System.out.println("2. Nombre ");
		System.out.println("3. Categoria ");
		
		opcion = entrada.pedirInt("Ingrese una opcion: ");
		
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
			if(!listProducto.isEmpty()) {
				for (Producto producto : listProducto) {
					System.out.println(producto);
				}
			}else {
				System.out.println("****Producto no encontrado!****");
			}
			
			
			
		} catch (NullPointerException e) {
			System.out.println("Producto no encontrado");
		}
		
		
		

	}

	public void actualizarProducto() {
		miArchivo = new Archivo();
		miArchivo.crearArchivo();

	}

	public void eliminarProducto() {
		miArchivo = new Archivo();
		
	}

	public void calcularPrecioProducto() {

	}

	public void cantidadProductos() {

	}

	public void reporteInventario() {

	}

}
