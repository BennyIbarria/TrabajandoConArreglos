import java.util.Scanner;

public class ExtraerElementosParesImpares
{
    public static void main(String[] args)
    {
    //Creamos 3 arreglos
    int[] elementos, pares, impares;

    //Creamos las variables que van a almacenar los elementos pares y los impares
    int totalPares = 0, totalImpares = 0;

    // Creamos un arreglo con 10 elementos que son ingresados por el usuario
    elementos = new int[10];

    Scanner sc = new Scanner(System.in);
    System.out.println("Capture 10 elementos numéricos para el arreglo: ");
    for(int i=0; i<elementos.length;i++)
    {
        elementos[i] = sc.nextInt();
    }
    for(int i=0; i<elementos.length; i++)
    {
        if(elementos[i]%2==0)
        {
            totalPares++;
        }
        else
        {
            totalImpares++;
        }
    }
    pares = new int[totalPares];
    impares = new int[totalImpares];

    int j = 0;
    int k = 0;

    for (int i=0; i<elementos.length; i++)
    {
        if(elementos[i]%2==0)
        {
            pares[j++] = elementos[i];
        }
        else
        {
          impares[k++] = elementos[i];
        }
    }
        System.out.println("Números pares");
        for(int i=0; i<pares.length; i++)
        {
            System.out.print(pares[i] + " ");
        }
        System.out.println("\r\nNúmeros impares");
        for(int i=0; i<impares.length;i++)
        {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
