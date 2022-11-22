public class SumarArreglos
{
    public static void main(String[] args)
    {
        //Creamos el arreglo a
        int a[] = new int[10];

        //Creamos el arreglo b
        int b[] = new int[10];

        //Creamos el arreglo "c" que será la suma del arreglo a + arreglo b
        int c[] = new int[20];

        //Recorremos el primer arreglo
            for (int i = 0; i< a.length; i++)
            {
                a[i] = i+1;
            }
        //Recorremos el segundo arreglo
        for (int i=0;i<b.length;i++)
        {
            b[i] = (i+1)*5;
        }
        //Creamos una variable auxiliar que nos lleve el control de las iteraciones
        int auxiliar=0;
        //LLenamos el arreglo c con los datos del arreglo a y el arreglo b
        for (int i=0; i<10;i++)
        {
            c[auxiliar++]= a[i];
            c[auxiliar++]= b[i];
        }
        //Imprimimos el arreglo c que contiene los valores del arreglo a & el arreglo b
        for (int i=0; i<c.length;i++)
        {
            System.out.println("indice " + i +  " valor " + c[i]);
        }

    }
}
