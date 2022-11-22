import java.util.Scanner;

public class BuscarUnStringEnUnArreglo
{
    public static void main(String[] args)
    {
        //Creamos un arreglo de 5 elementos de tipo String
        String nombre[] = new String[5];

        Scanner sc = new Scanner(System.in);

        //Pedimos 5 nombres al usuario para poblar el arreglo
        System.out.println("-Capture 5 nombres para buscarlos en el arreglo- ");

        //Poblamos el arreglo mediante la iteración sobre él
        for(int i=0; i<nombre.length; i++)
        {
            System.out.print("Capture un nombre: ");
            //Guardamos los elementos capturados por el usuario en el arreglo nombre
            nombre[i]=sc.nextLine();
        }

        //Hacemos que el usuario pida un nombre a buscar en el arreglo
        System.out.print("\r\nIngrese un nombre a buscar: ");
        //Lo almacenamos en la variable String busquedaNombre
        String busquedaNombre = sc.nextLine();

        //Inicializamos i para el contador del for
        int i=0;

        //En el bucle for, Recorremos el total del arreglo(5) y mientras el valor del índice sea menor al valor total del
        //arreglo(5) continúa la iteración del bucle.
        for (; i < nombre.length && !nombre[i].equalsIgnoreCase(busquedaNombre); i++){}

        //Sí el índice es igual al largo del arreglo ha terminado de iterar y no ha encontrado ningún número
        if(i == nombre.length)
        {
            System.out.println("Nombre no encontrado");
        }
        //Si el valor encontrado en el índice del arreglo nombre al compararlo con el nombre capturado en la variable
        //busquedaNombre es igual, entonces hay un match, con 0 significa que son iguales.
        else if (nombre[i].toLowerCase().compareTo(busquedaNombre.toLowerCase()) == 0)
        {
            System.out.println("Nombre Encontrado en el indice: " + i);
        }
    }
}
