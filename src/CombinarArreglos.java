public class CombinarArreglos
{
    public static void main(String[] args)
    {
        //Creamos el arreglo a
        int a[] = new int[12];

        //Creamos el arreglo b
        int b[] = new int[12];

        //Creamos el arreglo "c" que será la suma del arreglo a + arreglo b
        int c[] = new int[24];

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
        //LLenamos el arreglo c con los datos del arreglo a y el arreglo b imprimimos tres elementos de a por cada iteración
        for (int i=0; i<a.length; i+=3)
        {
            for(int j=0 ;j<3; j++)
            {
                c[auxiliar++]= a[i+j];
            }
            for(int j=0; j<3; j++)
            {
                c[auxiliar++]= b[i+j];
            }
        }
        //Imprimimos el arreglo c que contiene los valores del arreglo a & el arreglo b
        for (int i=0; i<c.length;i++)
        {
            System.out.println("indice " + i +  " valor " + c[i]);
        }
    }
}
