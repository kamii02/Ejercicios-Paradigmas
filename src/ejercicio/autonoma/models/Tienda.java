package ejercicio.autonoma.models;

import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class Tienda {

    private ArrayList<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();;
    }

    /**
     * Agrega un nuevo producto a la lista de productos.
     *
     * Este método utiliza el método {@link ArrayList#add(Object)} para insertar
     * el producto en la colección interna.
     *
     * @param p el producto que se desea agregar.
     * @return true si el producto fue agregado exitosamente.
     */
    public boolean agregarProducto(Producto p) {
        return productos.add(p);
    }

    public void productoElectronicaConExistenciaMayor0() {
        for (Producto p : productos) {
            if (p.getCategoria().equalsIgnoreCase("Electronica") && p.getStock() > 0) {

            }
        }
    }

    /**
     * Aumenta el precio de todos los productos de la categoría "Hogar" en un
     * 10%, siempre y cuando su existencia (stock) sea menor a 5 unidades.
     *
     * El método recorre toda la lista de productos y, para cada producto,
     * verifica si pertenece a la categoría "Hogar" y si su stock es menor a 5.
     * En caso afirmativo, incrementa su precio en un 10%.
     */
    public void aumentarPrecioCategoriaHogar() {
        for (Producto p : productos) {
            if (p.getCategoria().equalsIgnoreCase("Electronica") && p.getStock() < 5) {
                double aumentoDiezPorciento = p.getPrecio() * 0.10;
                double nuevoPrecio = p.getPrecio() + aumentoDiezPorciento;
                p.setPrecio(nuevoPrecio);
            }
        }
    }

    /**
     * Calcula los ingresos totales de una categoría específica.
     *
     * Los ingresos se definen como el producto del precio por la cantidad de
     * unidades vendidas de todos los productos pertenecientes a la categoría
     * indicada.
     *
     * @param categoria la categoría de productos a evaluar.
     * @return el valor numérico de los ingresos totales de la categoría.
     */
    public double ingresosTotalesDeCadaCategoria(String categoria) {
        double ingresos = 0;
        for (Producto p : productos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                ingresos += p.getPrecio() * p.getUnidadesVendidas();
            }
        }
        return ingresos;
    }

    /**
     * Determina e imprime la categoría con los mayores ingresos totales.
     *
     * El método recorre todos los productos, calcula los ingresos de cada
     * categoría y guarda la categoría con el valor máximo de ingresos.
     *
     * @return el nombre de la categoría con los mayores ingresos.
     */
    public String imprimirCategoriaConMasIngresos() {
        double ingresosMax = 0;
        String categoriaMax = "";
        for (Producto p : productos) {
            String categoria = p.getCategoria();
            double ingresosCategoria = ingresosTotalesDeCadaCategoria(categoria);
            if (ingresosCategoria > ingresosMax) {
                ingresosMax = ingresosCategoria;
                categoriaMax = categoria;
            }
        }
        return categoriaMax;
    }

    /**
     * Ordena los productos por precio en orden descendente (de mayor a menor).
     * Si dos productos tienen el mismo precio, se ordenan por existencias
     * (stock) en orden ascendente (de menor a mayor).
     *
     * Este método genera una copia de la lista de productos original para no
     * modificarla directamente. Luego aplica el algoritmo burbuja, comparando
     * de a pares los productos y realizando los intercambios necesarios hasta
     * que la lista quede ordenada.
     *
     * El primer bucle (i) controla la cantidad de pasadas completas sobre la
     * lista. En cada pasada, el elemento más grande “sube” a su posición
     * correcta. El segundo bucle (j) recorre la lista comparando pares de
     * elementos consecutivos (posición j y j+1) y los intercambia si están en
     * el orden incorrecto.
     *
     * La comparación sigue este orden: - Primero se comparan los precios: el de
     * mayor precio queda antes. - Si los precios son iguales, se comparan las
     * existencias: el de menor stock queda antes.
     *
     * @return una nueva lista de {@link Producto} ordenada por precio
     * descendente y, en caso de empate, por existencias ascendente.
     */
    public ArrayList<Producto> nombresProductosOrdenadosPrecioDescendenteYPorexistenciasAscendente() {
        ArrayList<Producto> productosOrdenados = new ArrayList<>(productos);
        for (int i = 0; i < productosOrdenados.size() - 1; i++) {
            for (int j = 0; j < productosOrdenados.size() - 1; j++) {
                Producto actual = productosOrdenados.get(j);
                Producto current = productosOrdenados.get(j + 1);

                if (actual.getPrecio() < current.getPrecio()) {
                    Producto aux = actual;
                    productosOrdenados.set(j, current);
                    productosOrdenados.set(j + 1, aux);
                } else if (actual.getPrecio() == current.getPrecio() && actual.getStock() > current.getStock()) {
                    Producto aux = actual;
                    productosOrdenados.set(j, current);
                    productosOrdenados.set(j + 1, aux);

                }
            }
        }
        return productosOrdenados;
    }

}
