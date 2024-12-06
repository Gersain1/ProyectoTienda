package com.co.bdb.menu;
import com.co.bdb.servicio.Inventario;
import com.co.bdb.utilidad.Leer;

public class Menu {

	public void generarMenu() {

		Leer entradaTexto = new Leer();
		Inventario miInventario = new Inventario();

		int opcion = 0;
		//System.out.print("\n\n\n");
		do {
			System.out.print("**************  Menu princial  *************\n");
			System.out.print("***Seleccione una opcion***\n");
			System.out.print("1. Agregar producto\n" + "2. Actualizar producto\n" + "3. Eliminar producto\n"
					+ "4. Buscar por categoría\n" + "5. Generar reporte\n"
					+ "6. Cantidad de productos por categoría\n" + "7. Producto más caro\n" + "8. Salir\n");

			opcion = entradaTexto.pedirInt("Ingrese una opcion");

			switch (opcion) {

				case 1:
					miInventario.agregarProducto();
					break;
				case 2:
					miInventario.actualizarProducto();
					break;
				case 3:
					miInventario.eliminarProducto();
					break;
				case 4:
					miInventario.buscarProductoPorCampo();
					break;
				case 5:
					miInventario.reporteInventario();
					break;
				case 6:
					miInventario.cantidadProductos();
					break;
				case 7:
					miInventario.calcularPrecioProducto();
					break;
				case 8:
					System.out.println("Fin del probrama");
					System.exit(-1);
					break;

			}

		} while (opcion != 8);

	}
}
