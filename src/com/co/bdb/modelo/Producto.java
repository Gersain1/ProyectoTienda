package com.co.bdb.modelo;

public class Producto {

	private String idProducto;
	private String nombreProduto;
	private String categoria;
	private float precio;
	private int cantidadDisponible;

	public Producto() {

	}

	public Producto(String idProducto, String nombreProduto, String categoria, float precio, int cantidadDisponible) {

		this.idProducto = idProducto;
		this.nombreProduto = nombreProduto;
		this.categoria = categoria;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProduto() {
		return nombreProduto;
	}

	public void setNombreProduto(String nombreProduto) {
		this.nombreProduto = nombreProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public String textoProducto() {
		return idProducto + "|" + nombreProduto + "|" + categoria
				+ "|" + precio + "|" + cantidadDisponible ;
	}

	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProduto=" + nombreProduto + ", categoria=" + categoria
				+ ", precio=" + precio + ", cantidadDisponible=" + cantidadDisponible + "]";
	}

}
