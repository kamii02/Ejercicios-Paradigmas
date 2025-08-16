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
    
    public boolean agregarProducto(Producto p){
        return productos.add(p);
    } 
    
    public void productoElectronicaConExistenciaMayor0(){
        for(Producto p: productos){
            if(p.getCategoria().equalsIgnoreCase("Electronica") && p.getStock()>0){
                
            }
        }
    }
    
    public void aumentarPrecioCategoriaHogar(){
        for(Producto p: productos){
            if(p.getCategoria().equalsIgnoreCase("Electronica") && p.getStock()<5){
                double aumentoDiezPorciento = p.getPrecio()*0.10;
                double nuevoPrecio = p.getPrecio()+aumentoDiezPorciento;
                p.setPrecio(nuevoPrecio);
            }
        }
    }
    
    public double  ingresosTotalesDeCadaCategoria(String categoria){
        double ingresos = 0;
        for(Producto p: productos){
            if(p.getCategoria().equalsIgnoreCase(categoria)){
               ingresos += p.getPrecio() * p.getUnidadesVendidas();
            }
        }
        return ingresos;
    }
    
    public String imprimirCategoriaConMasIngresos(){
        double ingresosMax = 0;
        String categoriaMax = "";
        for(Producto p: productos){
            String categoria = p.getCategoria();
            double ingresosCategoria = ingresosTotalesDeCadaCategoria(categoria);
            if(ingresosCategoria > ingresosMax){
                ingresosMax = ingresosCategoria;
                categoriaMax = categoria;
            }
        }
        return categoriaMax;
    }
    
    public void nombresProductosOrdenadosPrecioDescendente(){
        ArrayList<Producto> productosOrdenadosPrecioDescendente;
    }
}
    