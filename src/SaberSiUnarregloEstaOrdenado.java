import java.util.Scanner;

public class SaberSiUnarregloEstaOrdenado
{
    public static void main(String[] args)
    {
        // Creamos un arreglo de 7 elementos numericos
        int numeros[] = new int[7];

        //Utilizamos la clase Scanner para que el usuario capture elementos en pantalla
        Scanner sc = new Scanner(System.in);

        //Solicitamos los elementos del arreglo al usuario desde la consola
        System.out.println("Capture 7 elementos para formar el arreglo: ");

        //Creamos un for que va a ir almacenando los elementos del arreglo que el usuario captura por consola
        for(int i= 0; i<numeros.length;i++)
        {
            //Al arreglo números le guardamos los elementos del arreglo que el usuario ha capturado desde la consola
            numeros[i]= sc.nextInt();
        }
        //Creamos un par de variables auxiliares booleanas que nos permitirán realizar la comparación de elementos.
        boolean ascendente= false;
        boolean descendente=false;

        //Inicializamos el arreglo y guardamos los 7 elementos que el usuario ha de capturar
        for(int i=0; i<numeros.length-1; i++)
        {
            //comenzamos a comparar el elemento anterior del arreglo con el siguiente en el mismo si el número es menor se espera que el arreglo sea ascendente
            if (numeros[i] < numeros[i+1])
            {
               ascendente = true;
            }
            //comenzamos a comparar el elemento anterior del arreglo con el siguiente en el mismo si el número es mayor se espera que el arreglo sea descendente
            if(numeros[i] > numeros[i+1])
            {
                descendente = true;
            }
        }

        //Comparamos con las variables auxiliares para determinar en que rango cae el arreglo
        if (ascendente == true && descendente == true)
        {
            System.out.println("El arreglo está desordenado");
        }
        if (ascendente == true && descendente == false)
        {
            System.out.println("El arreglo está ordenado de manera ascendente");
        }
        if(ascendente == false && descendente== true)
        {
            System.out.println("El arreglo está ordenado de manera descendente");
        }
        if (ascendente == false && descendente == false)
        {
            System.out.println("Hay elementos en el arreglo que tienen el mismo valor númerico");
        }
    }
}
