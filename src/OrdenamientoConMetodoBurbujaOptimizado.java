public class OrdenamientoConMetodoBurbujaOptimizado
{
    public static void main(String[] args)
    {
        //Declaramos el arreglo de forma simplificada -Declaración, instantiation e inicialización con las {}
        String Productos[] = {"Mouse Inalámbrico Guia","Teclado Samsung","Monitor Explorer","Imac 2015","Laptop Asus",
                "Laptop Huawei","Asus Gamer Notebook"};

        //Le asignamos a una variable la longitud del arreglo para que no cambie cuando lo usemos en el ciclo for
        int total = Productos.length;

        //Implementamos el método de la burbuja donde comparamos cada elemento con el siguiente para darle un nivel de ordenamiento
        //Recorremos el arreglo
        int contador=0;
        for(int i=0;i<total-1;i++)
        {
            //Recorremos y comparamos los elementos que se contienen en el arreglo productos para asignarle un valor de ordenamiento
            for(int j=0;j<total-1-i ;j++)
            {
                if(Productos[j+1].compareTo(Productos[j]) < 0)
                {
                    String auxiliar = Productos[j];
                    Productos[j]=Productos[j+1];
                    Productos[j+1]=auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
        //Imprimimos el arreglo ya ordenado en el proceso anterior.
        for (int i=0;i<total;i++)
        {
            System.out.println("Para indice " + i + " Producto " + Productos[i]);
        }
    }
}
