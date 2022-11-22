import java.util.Arrays;

public class ArregloDeEnteros
{
    public static void main(String[] args)
    {
        //Declaramos un arreglo de cadena como una instancia (Se puede declarar en la variable el arreglo)
        String Productos[] = new String[7];
        int total = Productos.length;
        //Asignamos valores a cada indice del arreglo
        Productos[0]="Mouse Inalambrico Guia";
        Productos[1]="Teclado Samsumg";
        Productos[2]="Monitor Explorer";
        Productos[3]="Imac 2015";
        Productos[4]="Laptop Assus";
        Productos[5]="Laptop Huawei";
        Productos[6]="Assus Gamer Notebook";

        //Ordenamos el arreglo por letra del abecedario
        Arrays.sort(Productos);

        //Recorremos e imprimimos todos los productos contenidos en el arreglo productos usando for.
        System.out.println("=====Recorriendo el arreglo Usando for=====");

        for (int i=0;i<total;i++)
        {
            System.out.println("Para indice " + i + " Producto: " + Productos[i]);
        }
        System.out.println("=====Recorriendo el arreglo Usando Foreach=====");
        for (String prod:Productos)
        {
            System.out.println("Producto: " + prod);
        }
        System.out.println("=====Recorriendo el arreglo Usando While=====");
        int i=0;
        while (i<total)
        {
            System.out.println("Para indice " + i + " Producto: " + Productos[i]);
            i++;
        }
        System.out.println("=====Recorriendo el arreglo Usando Do While=====");
        int j=0;
        do
        {
            System.out.println("Para indice " + j + " Producto: " + Productos[j]);
            j++;
        }while (j<total);


        //Declaramos un arreglo de enteros como instancia
        int[] numeros = new int[4];
        int totalNumeros = numeros.length;
        
        for (int k=0;k<totalNumeros;k++)
        {
            numeros[k]=k*3;
        }
        for (int k=0;k<totalNumeros;k++)
        {
            System.out.println("numeros[k] = " + numeros[k]);
        }

        //Asignamos valores a cada indice del arreglo
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("5");
        numeros[2] = 15;
        numeros[3] = 2;

        //Ordenamos el arreglo por número de menor a mayor
        Arrays.sort(numeros);


        //Asignamos a una variable el valor de cada índice del arreglo

        /*
        * Resultado esperado:
        *   i vale: 10
            j vale: 5
            k vale: 15
            l vale: 2
        * */




    }
}
