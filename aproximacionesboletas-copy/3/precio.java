
/**
 * Write a description of class RopaNiños here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class precio
{
   private final String identificacion; 
   private String nombre;
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    
    public void setProductouno(double productouno){
        if(precio >= 0) this.preciouno = preciouno;
        else this.preciouno = 0;
    }
    
    public double getpreciodos(){
        return preciotodos;
    }
    public void setpreciodos(double preciodos){
        if(preciodos >= 0) this.preciodos = preciodos;
        else this.preciodos = 0;
    }
    
   precio(String identificacion, String nombre, String precio, double preciouno, double preciodos){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setPreciouno(precioouno);
        setPreciodos(preciodos);
    }
    
    double calcularpromedio(){
        return (preciouno + preciodos) / 2;
    }
}


