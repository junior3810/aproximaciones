
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String identificacion;
    private String nombre;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
        public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String id){
        if(id != null)this.identificacion = identificacion;
        else this.identificacion = "";
    }
    }
  
    public double getProductouno(){
        return productouno;
    }
    public void setboletasuno(double productouno){
        if(productouno >= 0) this.productouno = productouno;
        else this.boletasuno = 0; 
    }
    
    public double getboletasdos(){
        return boletasdos;
    } 
    
    public double getboletastres (){
        return productotres ;
    }
    public void setboletastres(double boletastres){
        if(productotres>= 0) this.boletastres = boletastres;
        else this.boletastres = 0;
    }
    
    Cliente(String identificacion, String nombre, , 
    
   
    }
    
        return (boletasuno + boletasdos) / 2;

}
