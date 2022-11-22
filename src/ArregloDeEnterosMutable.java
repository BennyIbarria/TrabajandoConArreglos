import java.util.Arrays;

public class ArregloDeEnterosMutable
{
    //Creamos un método para modificar el arreglo (darlo vuelta), tanto indice como el contenido del mismo
    public static void arregloInverso(String[] arreglo)
    {
        //La variable total2 guarda el largo del arreglo(7 productos o elementos)
        int total2 = arreglo.length;
        //La variable arreglo
        int total = arreglo.length;
        for(int i = 0; i<total2;i++)
        {
            //Obtenemos el elemento actual del arreglo
            String actual = arreglo[i];
            //Obtenemos el inverso del elemento actual(último elemento)
            String inverso = arreglo[total-1-i];
            //Asignamos a la posición del índice actual el inverso
            arreglo[i]=inverso;
            //Asignamos al inverso la posición actual, se está cambiando de posición el elemento
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args)
    {
        //Declaramos el arreglo de forma simplificada -Declaración, instanc iación, inicialización con las {}
        String Productos[] = {"Mouse Inalámbrico Guia","Teclado Samsung","Monitor Explorer","Imac 2015","Laptop Assus",
                "Laptop Huawei","Assus Gamer Notebook"};
        int total = Productos.length;

        //Ordenamos el arreglo por letra del abecedario
        Arrays.sort(Productos);

        //Recorremos el arreglo y lo imprimimos ordenado de forma ascendente
        for(int i=0;i<total;i++)
        {
            System.out.println("Para indice " + i + " Producto: " + Productos[i]);
        }

        //Invocamos el método que invierte los elementos del arreglo Productos
        arregloInverso(Productos);
        //Recorremos e imprimimos todos los productos contenidos en el arreglo productos usando for de forma inversa.
        System.out.println("=====Recorriendo el arreglo desde el indice 0 hasta el último indice=====");
        for (int i=0;i<total;i++)
        {
            System.out.println("Para indice " + i + " Producto: " + Productos[i]);
        }


    }
}
