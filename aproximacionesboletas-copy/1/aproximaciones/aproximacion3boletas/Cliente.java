
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private final String identificacion;
    private String nombre;
    private String Boletas;
    private double productouno;
    private double productodos;
    private double productotres;
    
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
    
    public String getBoleta(){
        return Boleteria;
    }
    public void setBoleta(String Boleta){
        if(talla != null) this.Boleta  = Boleta ;
        else this.Boleta  = "";
    }
    public String getBoleteria(){
        return Boleteria;
    }
    public void setBoleteria(String Boleteria){
        if(temporada != null) this.Boleteria = Boleteria;
        else this.Boleteria = "";
    }
    
    public double getProductouno(){
        return productouno;
    }
    public void setProductouno(double productouno){
        if(productouno >= 0) this.productouno= productouno;
        else this.productouno = 0;
    }
    
    public double getProductodos(){
        return productodos;
    }
    public void setProductodos(double productodos){
        if(productodos >= 0) this.productodos = productodos;
        else this.productodos= 0;
    }
    
    public double getProductotres(){
        return productotres;
    }
    public void setProductotres(double productotres){
        if(productotres >= 0) this.productotres = productotres;
        else this.productotres = 0;
    }
    
    Cliente(String identificacion, String nombre, String Boletas, double productouno , double productodos, double productotres){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setTalla(Boleteria);
        setProductouno(productouno);
        setProductodos(productodos);
        setProductotres(productotres);
    }
    
    double calcularpromedio(){
        return (productouno + productodos + productotres) / 3;
    }
}
