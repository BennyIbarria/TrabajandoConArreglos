import java.util.Scanner;

public class BuscarUnNumeroEnUnArreglo
{
    public static void main(String[] args)
    {
        //Creamos un arreglo de 5 elementos
        int numero[] = new int[5];

        Scanner sc = new Scanner(System.in);

        //Pedimos 5 elementos al usuario para poblar el arreglo
        System.out.println("--Capture 5 elementos numéricos enteros--");

        //Poblamos el arreglo mediante la iteración sobre él
        for(int i=0; i<numero.length; i++)
        {
            System.out.println("Ingrese el numero " + i + " del arreglo: ");
            //Guardamos los elementos capturados por el usuario en el arreglo números
            numero[i]=sc.nextInt();
        }
        //Hacemos que el usuario pida un número a buscar en el arreglo
        System.out.println("\r\nIngrese un número a buscar: ");
        int num = sc.nextInt();

        //Inicializamos i para el contador del while
        int i=0;

        //En el bucle while, Recorremos el total del arreglo(5) y si el índice es diferente al número
        // que capturó el usuario entonces el número no se encuentra en el arreglo y sigue iterando
        // si encuentra el número entonces la iteración termina.
        while(i<numero.length && numero[i] != num)
        {
            i++;
        }
        //Sí el índice es igual al largo del arreglo ha terminado de iterar y no ha encontrado ningún número
        if(i == numero.length)
        {
            System.out.println("Numero no encontrado");
        }
        //Si el índice en el arreglo es igual al número que ha capturado el usuario entonces ha encontrado el número en
        //el arreglo.
        else if (numero[i] == num)
        {
            System.out.println("Numero Encontrado en el indice: " + i);
        }
    }
}
