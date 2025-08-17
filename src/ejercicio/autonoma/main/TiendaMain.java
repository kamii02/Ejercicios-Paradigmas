package ejercicio.autonoma.main;

import java.util.Scanner;
import ejercicio.autonoma.models.*;

/**
 *
 * @author camil
 */
public class TiendaMain {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        Tienda tienda = new Tienda();
        int opc;
        do {
            System.out.println("=== BIENVENIDO ===");
            System.out.println("");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Mostrar Productos ELectronicos");
            System.out.println("3. Aumentar precio categoria Hogar");
            System.out.println("4. Mostrar Categoria con mas Ingresos totales");
            System.out.println("5. Mostrar Lista de productos por precio (en orden descendente) y por exitencias (en orden ascendente) si los precios son iguales.");
            System.out.println("6. salir");
            System.out.print("Elige una opción: ");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("ingrese el nombre");
                    String Nombre = leer.next();
                    System.out.println("ingrese la categoria (1 para Hogar, 2 para Elecctronica)");
                    int res = leer.nextInt();
                    String categoria;
                    if (res == 1) {
                        categoria = "Hogar";
                    } else {
                        categoria = "Electronica";
                    }
                    System.out.println("ingrese el precio");
                    double precio = leer.nextDouble();
                    System.out.println("ingrese el stock");
                    int stock = leer.nextInt();
                    System.out.println("ingrese las unidades vendidas ");
                    int UnidadesVendidas = leer.nextInt();
                    Producto p = new Producto(Nombre, categoria, precio, stock, UnidadesVendidas);
                    tienda.agregarProducto(p);
                    System.out.println("Producto agregado exitosamente!!");
                    break;
                case 2:
                    System.out.println("Los productos de categoria electronica ");

                    break;
                case 3:
                    System.out.println("El precio de los productos de la categoria hogar ");
                    tienda.aumentarPrecioCategoriaHogar();
                    System.out.println("Precios actualizados exitosamente!!");
                    System.out.println("----------------------------------------");
                    break;
                case 4:
                    System.out.println("Categoría con los mayores ingresos totales es "+tienda.imprimirCategoriaConMasIngresos());
                    
                    System.out.println("----------------------------------------");
                    break;
                case 5:
                    System.out.println("Lista de nombres de prodictosmordenados por precio y por existencias si los precios son iguales!!");
                    for(Producto pr: tienda.nombresProductosOrdenadosPrecioDescendenteYPorexistenciasAscendente()){
                        System.out.println(pr);
                    }
                    
                    System.out.println("----------------------------------------");
                    break;
                case 6:
                    System.out.println("un placer, hasta la proxima");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
            System.out.println();
        } while (opc != 6);
    }
}

