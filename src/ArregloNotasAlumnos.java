import java.util.Scanner;

public class ArregloNotasAlumnos
{
    public static void main(String[] args) {
        double[] claseMatematicas, claseFisica, claseQuimica;
        double sumaNotasMatematicas = 0, sumaNotasFisica = 0, sumaNotasQuimica = 0;

        claseMatematicas = new double[3];
        claseFisica = new double[3];
        claseQuimica = new double[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las 3 calificaciones de matemáticas del alumno: ");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = sc.nextDouble();
        }
        System.out.println("Ingrese las 3 calificaciones de física del alumno: ");

        for (int i = 0; i < claseFisica.length; i++) {
            claseFisica[i] = sc.nextDouble();
        }
        System.out.println("Ingrese las 3 calificaciones de química del alumno: ");

        for (int i=0; i<claseQuimica.length; i++)
        {
            claseQuimica[i] = sc.nextDouble();
        }

        for(int i=0; i<3; i++)
        {
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasFisica += claseFisica[i];
            sumaNotasQuimica += claseFisica[i];
        }
        double promedioMatematicas = sumaNotasMatematicas/claseMatematicas.length;
        double promedioFisica = sumaNotasFisica/claseFisica.length;
        double promedioQuimica = sumaNotasQuimica/claseQuimica.length;
        System.out.println("promedioMatematicas = " + promedioMatematicas);
        System.out.println("promedioFisica = " + promedioFisica);
        System.out.println("promedioQuimica = " + promedioQuimica);
        System.out.println("El promedio total del curso es de: " +(promedioMatematicas+promedioFisica+promedioQuimica)/3);

        System.out.println("Ingrese el Id del alumno del cuál quiera saber su promedio (0 - 2): ");
        int Id = sc.nextInt();
        double promedioAlumno=(claseMatematicas[Id]+claseFisica[Id]+claseQuimica[Id])/3;
        System.out.println("promedio del Alumno " + Id +" es "+ promedioAlumno);
    }
}
