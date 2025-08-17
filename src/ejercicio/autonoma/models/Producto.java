package ejercicio.autonoma.models;

/**
 *
 * @author camil
 */
public class Producto {

    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private int unidadesVendidas;

    public Producto(String nombre, String categoria, double precio, int stock, int unidadesVendidas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.unidadesVendidas = unidadesVendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + ", Categoría: " + categoria
                + ", Precio: " + precio
                + ", Stock: " + stock
                + ", Vendidos: " + unidadesVendidas;
    }

}
