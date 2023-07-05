
/**
 * Write a description of class Productos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class boletas
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroClientes = 0, opcionMenu = 0;
        Cliente[] losClientes = new Cliente[50];
        String identificacion, nombre, boleta;
        double productouno, productodos, productotres;
        double promedio = 0;
        while(opcionMenu != 3){
            System.out.println("\nMenu de Opciones: ");
            System.out.println("1. Adicionar un Cliente: ");
            System.out.println("2. calcular Promedio de boletas vendidas: ");
            System.out.println("3. Salir ");
            System.out.println("Escoja una opcion.... ");
            opcionMenu = sc.nextInt();
            if(opcionMenu== 1){
                System.out.println("Digite la identificacion del Cliente: ");
                identificacion = sc.next();
                System.out.println("Digite el nombre del Cliente:  ");
                nombre = sc.next();
                System.out.println("Digite boletas a comprar el  Cliente: ");
                talla = sc.next();
                System.out.println("Digite la cantidad del primer producto vendido al cliente: ");
                productouno = sc.nextDouble();
                System.out.println("Digite la cantidad del segundo producto vendido al cliente: ");
                productodos = sc.nextDouble();
                System.out.println("Digite la cantidad del tercer producto vendido al cliente: ");
                productotres = sc.nextDouble();
                Cliente unCliente = new Cliente(identificacion, nombre,boletas, productouno, productodos,productotres);
                losClientes[numeroClientes] = unCliente;
                numeroClientes++;
            }
            else if(opcionMenu==2){
                for(int i = 0; i < numeroClientes; i++){
                    promedio = promedio + losClientes[i].calcularpromedio() / numeroClientes;       
                }
                System.out.println("\n El Promedio de boletas vendidos es: "+ promedio);
            }
        }
    
    }
}
