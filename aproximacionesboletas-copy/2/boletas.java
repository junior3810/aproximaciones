
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
        String identificacion, nombre,boletas
        double boletasuno, boletasdos, boletastres;
        double promedio = 0;
        while(opcionMenu != 3){
            System.out.println("2. calcular Promedio de boletas vendidas: ");
            System.out.println("3. Salir ");
            System.out.println("Escoja una opcion.... ");
            opcionMenu = sc.nextInt();
            if(opcionMenu== 1){
                System.out.println("Digite la identificacion del Cliente: ");
                identificacion = sc.next();
                System.out.println("Digite el nombre del Cliente:  ");
                nombre = sc.next();
                System.out.println("Digite la cantidad de boletas  vendidas al cliente: ");
                productouno = sc.nextDouble();
                System.out.println("Digite la cantidad de boletas  vendidas al cliente: ");
                productodos = sc.nextDouble();
                System.out.println("Digite la cantidad de boletas  vendidas al cliente: ");
                productotres = sc.nextDouble();
                Cliente unCliente = new Cliente(identificacion, nombre, boletas);
                losClientes[numeroClientes] = unCliente;
                numeroClientes++;
            }
            else if(opcionMenu==2){
                for(int i = 0; i < numeroClientes; i++){
                    promedio = promedio + losClientes[i].calcularpromedio() / numeroClientes;       
                }
                System.out.println("\n El Promedio de boletas  vendidas es: "+ promedio);
            }
        }
    
    }
}
