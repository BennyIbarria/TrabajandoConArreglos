import java.util.Scanner;

public class CambiarPosicionElementoConsola
{
    public static void main(String[] args)
    {
         //Crear un arreglo de 5 números enteros
         int numeros[] = new int[5];

         //Declaramos dos variables para "Guardar" la posición y el elemento del arreglo a ser cambiado
         int posicion, elemento;

         //Crear una nueva instancia de la clase Scanner para solicitarle al usuario que capture los números en el arreglo
         Scanner sc = new Scanner(System.in);

         //Pedimos al usuario la posición y el elemento a ser cambiado

         System.out.print("Capture la posición donde quiera insertar el nuevo elemento: ");
         posicion = sc.nextInt();
         System.out.print("Capture el elemento que será insertado: ");
         elemento= sc.nextInt();

         //Pedirle al usuario que capture 5 números, se guardan en el arreglo
         System.out.println("Capture 5 números enteros");
         System.out.println();

         //LLenamos el arreglo con los números dados por el usuario
         for(int i=1; i<numeros.length;i++)
         {
             System.out.print("Capture un número entero: ");
             numeros[i] = sc.nextInt();
         }

         //Recorremos el arreglo desde el último índice hacia el primero
         for(int i=numeros.length-2; i>=posicion; i--)
         {
             numeros[i+1] = numeros[i];
         }
         numeros[posicion]=elemento;

         System.out.println("\r\nNuevo arreglo");
         System.out.println();
         for(int i=0; i<numeros.length;i++)
         {
             System.out.println("Indice: " + i + " Número: " + numeros[i]);
         }
    }
}
