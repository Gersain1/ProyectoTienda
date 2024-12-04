package com.co.bdb.menu;

import com.co.bdb.servicio.Inventario;
import com.co.bdb.utilidad.Leer;

public class Menu {

	public void generarMenu() {

		Leer entradaTexto = new Leer();
		Inventario miInventario = new Inventario();

		int opcion = 0;

		do {
			System.out.print("Menu princial....\n");
			System.out.print("Seleccione una opcion....\n");
			System.out.print("1. Agregar producto\r\n" + "2. Actualizar producto\r\n" + "3. Eliminar producto\r\n"
					+ "4. Buscar por categoría\r\n" + "5. Generar reporte\r\n"
					+ "6. Cantidad de productos por categoría\r\n" + "7. Producto más caro\r\n" + "8. Salir\n");

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
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.exit(-1);
				break;
			default:
				break;
			}

		} while (opcion != 8);

	}
}
