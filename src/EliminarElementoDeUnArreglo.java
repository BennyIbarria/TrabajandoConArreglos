import java.util.Scanner;

public class EliminarElementoDeUnArreglo
{
    public static void main(String[] args)
    {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        int posicion;

        for (int i=0;i<numeros.length;i++)
        {
            System.out.print("Capture un número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Ingrese una posición a eliminar entre 0-9: ");
        posicion = sc.nextInt();

        for(int i = posicion; i < numeros.length-1; i++)
        {
            //En la posición actual insertamos la siguiente posición
           numeros[i] = numeros[i+1];
        }
        /*for(int i=0; i<numeros.length; i++)
        {
            System.out.println(i + "=>" + numeros[i]);
        }*/
        //Copiar un arreglo
        //Creamos un nuevo arreglo, en él copiaremos el arreglo números pero con un elemento menos.
        int nvoArreglo[] = new int[numeros.length-1];

        //Utilizamos el método arrayCopy para copiar el arreglo números
        System.arraycopy(numeros, 0, nvoArreglo, 0, 9);

        for(int i=0; i<nvoArreglo.length; i++)
        {
            System.out.println("Indice => " + i + " : " + nvoArreglo[i]);
        }
    }
}
