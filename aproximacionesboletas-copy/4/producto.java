
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class producto
{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int numClientes;
            Cliente[] losClientes = new Cliente[50];
            String  nombre, identificacion,boletas, pago;
            double boletas1, boletas2, boletas3;
            double promedio = 0;
            System.out.println("Ingrese la cantidad de boleteria a vender: ");
            numClientes = sc.nextInt();
            
            for(int i = 0; i < numClientes; i++){
                System.out.println("Digite la identificacion del cliente: ");
                identificacion = sc.next();
                System.out.println("Digite el valor del cliente:  ");
                nombre = sc.next();
                System.out.println("Digite valor  del cliente: ");
                evento= sc.next();
                System.out.println("Digite boletas compradas por el cliente");
                puest = sc.next();
                System.out.println("Digite la cantidad 1 deboletas vendidas al cliente: ");
                producto1 = sc.nextDouble();
                System.out.println("Digite la cantidad 2 de boletas vendidas al cliente: ");
                producto2 = sc.nextDouble();
                System.out.println("Digite la cantidad 3 de boletas vendidas al cliente: ");
                producto3 = sc.nextDouble();
                Cliente unCliente = new Cliente();
                unCliente.identificacion = identificacion;
                unCliente.nombre = nombre;
                unCliente.boletas = boletas;
                unCliente.temporada = temporada;
                unCliente.boletasuno = boletas1;
                unCliente.boletasdos = boletas2;
                unCliente.boletastres = boletas3;
                losClientes[i] = unCliente;
            }
            for(int i = 0; i < numClientes; i++){
                double suma =(losClientes[i].productouno +losClientes[i].productodos +losClientes[i].productotres)/3;
                promedio = promedio + suma / numClientes;
            }
            System.out.println("El promedio de ropa vendida es "+ promedio);
    }

}
