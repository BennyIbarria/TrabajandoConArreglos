import java.util.Scanner;

public class MoverElementoDeUnIndice
{
    public static void main(String[] args)
    {
     //Crear un arreglo de 10 números enteros
     int numeros[] = new int[5];

     //Declaramos una variable auxiliar para "Guardar" el último valor del arreglo
     int auxiliar;

     //Crear una nueva instancia de la clase Scanner para solicitarle al usuario que capture los números en el arreglo
     Scanner sc = new Scanner(System.in);

     //Pedirle al usuario que capture 5 números, se guardan en el arreglo
     System.out.println("Capture 5 números enteros: ");

     //LLenamos el arreglo con los números dados por el usuario
     for(int i=1; i<numeros.length;i++)
     {
         System.out.print("Capture un número entero: ");
         numeros[i] = sc.nextInt();
     }
     //Copiamos el último valor del arreglo para después incrustarlo
     auxiliar=numeros.length-1;

     //Recorremos el arreglo desde el último índice hacia el primero

        for(int i=numeros.length-2; i>=0; i--)
        {
            numeros[i+1] = numeros[i];
        }
        numeros[0]=auxiliar;

        System.out.println("\r\nNuevo arreglo");
        System.out.println();
        for(int i=0; i<numeros.length;i++)
        {
            System.out.println("Indice: " + i + " Número: " + numeros[i]);
        }
    }
}
