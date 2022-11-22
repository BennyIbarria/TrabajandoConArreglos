import java.util.Scanner;

public class ObtenerElNumeroMayorArreglo
{
    public static void main(String[] args)
    {
    int numeros[] = new int[5];

    //Creamos una nueva instancia para pedir datos por consola al usuario
    Scanner sc = new Scanner(System.in);

    //Pedimos al usuario 5 números para llenar el arreglo
        System.out.println("Digite cinco números enteros: ");
        //LLenamos el arreglo con la pidiendole datos al usuario
        for(int i=0; i<numeros.length; i++)
        {
            numeros[i] = sc.nextInt();
        }
        //Creamos una variable auxiliar que va almacenando el número mayor
        int auxiliar = 0;
        //Recorremos el arreglo y vamos comparando los números con un operador ternario
        for(int i=1; i<numeros.length; i++)
        {
            //Creamos el operador ternario - Compara el número anterior con el siguiente -
            auxiliar = (numeros[auxiliar] > numeros[i])? auxiliar:i;
        }
        System.out.println("numero mayor: " + numeros[auxiliar]);
    }
}
