
/**
 * Write a description of class AlmacenPuntoModa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evento
{
    private final String nit;
    private String nombreEvento;
    private String direccion;
    private Cliente[] cliente;
    private int numClientes;
    
    public Evento(String nit,String nombreEvento,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreEvento(nombreEvento);
        setDireccion(direccion);        
        cliente = new Cliente[50];
        numClientes = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreEvento(){
        return nombreEvento;
    }
    public void setNombreEvento(String nombreEvento){
        if(nombreEvento != null){
            this.nombreEvento = nombreEvento;
        }else{
            this.nombreEvento = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumClientes(){
        return numClientes;
    }
    
    public double calcularpromediogeneral(){ 
        double promedio = 0;
        for(int i = 0; i < numClientes; i++){
            promedio = promedio + cliente[i].calcularpromedio() / numClientes;
        }
        return promedio;
    }
    
    public void adicionarCliente(String identificacion, String nombre, String boletas, double productouno, double productodos, double productotres){
        Cliente cl = new Cliente(identificacion, nombre, boletas, productouno, productodos, productotres);
        cliente[numClientes] = cl;
        numClientes++;
    }
}
