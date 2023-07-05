
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Producto
{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int numClientes;
            Cliente[] losClientes = new Cliente[50];
            String  nombre, identificacion, boletas;
            double producto1, producto2, producto3;
            double promedio = 0;
            System.out.println("Ingrese la cantidad de clientes: ");
            numClientes = sc.nextInt();
            
            for(int i = 0; i < numClientes; i++){
                System.out.println("Digite la identificacion del cliente: ");
                identificacion = sc.next();
                System.out.println("Digite el nombre del cliente:  ");
                nombre = sc.next();
                System.out.println("Digite boletas del  cliente: ");
                talla= sc.next();
                System.out.println("Digite boletas compradas por el cliente");
                temporada = sc.next();
                System.out.println("Digite la cantidad 1 del producto vendido al cliente: ");
                producto1 = sc.nextDouble();
                System.out.println("Digite la cantidad 2 del producto vendido al cliente: ");
                producto2 = sc.nextDouble();
                System.out.println("Digite la cantidad 3 del producto vendido al cliente: ");
                producto3 = sc.nextDouble();
                Cliente unCliente = new Cliente();
                unCliente.identificacion = identificacion;
                unCliente.nombre = nombre;
                unCliente.boletas=boletas;
                unCliente.productouno = producto1;
                unCliente.productodos = producto2;
                unCliente.productotres = producto3;
                losClientes[i] = unCliente;
            }
            for(int i = 0; i < numClientes; i++){
                double suma =(losClientes[i].productouno +losClientes[i].productodos +losClientes[i].productotres)/3;
                promedio = promedio + suma / numClientes;
            }
            System.out.println("El promedio de boletas vendida es "+ promedio);
    }

}
