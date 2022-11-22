import java.util.Arrays;

public class ArregloDeEnterosInversa
{
    public static void main(String[] args)
    {
        //Declaramos un arreglo de cadena como una instancia (Se puede declarar como arreglo después del nombre de la variable)
        //String Productos = new String[7];
        //Declaramos el arreglo de forma simplificada -Declaración, instanc iación, inicialización con las {}
        String Productos[] = {"Mouse Inalámbrico Guia","Teclado Samsung","Monitor Explorer","Imac 2015","Laptop Assus",
                "Laptop Huawei","Assus Gamer Notebook"};
        int total = Productos.length;
        //Asignamos valores a cada indice del arreglo
        /*Productos[0]="Mouse Inalámbrico Guia";
        Productos[1]="Teclado Samsung";
        Productos[2]="Monitor Explorer";
        Productos[3]="Imac 2015";
        Productos[4]="Laptop Assus";
        Productos[5]="Laptop Huawei";
        Productos[6]="Assus Gamer Notebook";*/

        //Ordenamos el arreglo por letra del abecedario
        Arrays.sort(Productos);

        //Recorremos e imprimimos todos los productos contenidos en el arreglo productos usando for.
        System.out.println("=====Recorriendo el arreglo desde el indice 0 hasta el último indice=====");
        for (int i=0;i<total;i++)
        {
            System.out.println("Para indice " + i + " Producto: " + Productos[i]);
        }
        System.out.println("=====Recorriendo el arreglo desde el ultimo indice hasta el primero modo 1=====");
        for (int i=0;i<total;i++)
        {
            //Total = 7 => -1 = 6 - i(0)=> imprime lo que está en el índice 6 ordenados de forma descendente es decir imprime "Teclado Samsung"
            System.out.println("Para indice " + (total-1-i) + " Producto: " + Productos[total-1-i]);
        }
        System.out.println("=====Recorriendo el arreglo desde el ultimo indice hasta el primero modo 2=====");
        //La iteración comienza desde el valor de total(7)-1, es decir 6 que, después de ordenar el arreglo queda "Teclado Samsung"
        for (int i = total-1; i>=0; i--)
        {
            System.out.println("Para indice " + i + " Producto: " + Productos[i]);
        }
    }
}
