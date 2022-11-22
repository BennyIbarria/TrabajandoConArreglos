import java.util.Scanner;

public class InsertarNvoElementoYOrdenarlo
{
    public static void main(String[] args)
    {
         //Crear un arreglo de 10 números enteros
         int numeros[] = new int[7];

         //Declaramos variables auxiliares para "Guardar" elemento y posición
         int elemento, posicion;

         //Crear una nueva instancia de la clase Scanner para solicitarle al usuario que capture los números en el arreglo
         Scanner sc = new Scanner(System.in);

         //LLenamos el arreglo con los números dados por el usuario
         for(int i=1; i<numeros.length;i++)
         {
             System.out.print("Capture un número entero: ");
             numeros[i] = sc.nextInt();
         }
            System.out.print("Capture el nuevo elemento a insertar: ");
            elemento = sc.nextInt();

         posicion=0;
         while(posicion < 6 && elemento> numeros[posicion])
         {
             posicion++;
         }
         for (int i=numeros.length-2; i>=posicion; i--)
         {
            numeros[i+1]=numeros[i];
         }
         numeros[posicion]=elemento;
        System.out.println("Impresión del nuevo arreglo");
        for (int i= 0; i<numeros.length;i++)
        {
            System.out.println("Indice => " + i + " " + numeros[i]);
        }
    }
}
