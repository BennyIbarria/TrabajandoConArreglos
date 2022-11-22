public class OrdenandoArregloNumerosConBurbuja
{
    public  static void sortBurbuja(Object[] arreglo)
    {
        int total= arreglo.length;
        int contador=0;
        for(int i=0;i<total-1;i++)
        {
            //Recorremos y comparamos los elementos que se contienen en el arreglo productos para asignarle un valor de ordenamiento
            //Se le tiene que restar -1 y -i para que no se desborde el arreglo
            for(int j=0;j<total-1-i ;j++)
            {
                //Ordenamos de menor a mayor, si queremos de mayor a menor cambiamos el "<" por un ">"
                if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0)
                {
                    Object auxiliar = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=auxiliar;
                }
                contador++;
            }
        }
        System.out.println("Iteraciones para ordenar = " + contador);
    }
    public static void main(String[] args)
    {
        //Creamos un arreglo de números
    Integer numeros[] = new Integer[4];
        numeros[0]=10;
        numeros[1]=-1;
        numeros[2]=3;
        numeros[3]=Integer.valueOf("15");

        //Aquí invocamos el método para ordenar los números
        sortBurbuja(numeros);
        //Imprimimos los números ya ordenados con el método burbuja
        for(int i=0; i<numeros.length; i++)
        {
            System.out.println("En el indice " + i + " numero " + numeros[i]);
        }
    }
}
