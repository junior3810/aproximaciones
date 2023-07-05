
/**
 * Write a description of class Productos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Productos
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numClientes;
        Almacen miAlmacen  = new Boleteria ("Boleteria futbol","San Fernando");
        String identificacion, nombre, Boleteria, temporada;
        double producto1, producto2, producto3;
        double promedio = 0;
        
        System.out.println("Digite la cantidad de clientes: ");
        numClientes = sc.nextInt();
        
        for(int i = 0; i < numClientes; i++){
            System.out.println("Digite la identificacion del cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite boletas del cliente: ");
            talla = sc.next();
            System.out.println("Digite las boletas compradas por el cliente: ");
            temporada = sc.next();
            System.out.println("Digite la primera cantidad del producto vendido al cliente: ");
            producto1 = sc.nextDouble();
            System.out.println("Digite la segunda cantidad del producto vendido al cliente: ");
            producto2 = sc.nextDouble();            
            System.out.println("Digite la tercera cantidad del producto vendido al cliente: ");
            producto3 = sc.nextDouble();
            miAlmacen .adicionarCliente(identificacion, nombre, boletas, producto1, producto2, producto3);
        }
        
        promedio = miAlmacen .calcularpromediogeneral();        
        System.out.println("\n El promedio de boletas vendida es: " + promedio); 
    }
}
