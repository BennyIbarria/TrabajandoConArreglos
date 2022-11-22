import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArregloDeEnterosMutableConApiJava
{
    public static void main(String[] args)
    {
        //Declaramos el arreglo de forma simplificada -Declaración, instanc iación, inicialización con las {}
        String Productos[] = {"Mouse Inalámbrico Guia","Teclado Samsung","Monitor Explorer","Imac 2015","Laptop Assus",
                "Laptop Huawei","Assus Gamer Notebook"};
        int total = Productos.length;

        //Ordenamos el arreglo por letra del abecedario
        Arrays.sort(Productos);

        //Recorremos el arreglo y lo imprimimos ordenado de forma normal - Desde el índice 0 hasta el índice final -
        for(int i=0;i<total;i++)
        {
            System.out.println("Para indice " + i + " Producto: " + Productos[i]);
        }

        //Utilizamos la API Collections.reverse para "voltear el arreglo" productos - Desde el índice final hasta el índice inicial -
        Collections.reverse(Arrays.asList(Productos));

        //Recorremos e imprimimos todos los productos contenidos en el arreglo productos usando for de forma inversa.
        System.out.println("=====Recorriendo el arreglo desde el indice 0 hasta el último indice=====");
        for (int i=0;i<total;i++)
        {
            System.out.println("Para indice " + i + " Producto: " + Productos[i]);
        }
    }
}
