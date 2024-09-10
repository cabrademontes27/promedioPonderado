import java.util.*;
public class Materia
{
    

    public static void interaccion()
    {
        Materia materia = new Materia();
        Scanner entrada = new Scanner(System.in);
        int tamano;



        System.out.println("Hola, por favor, ingrese el numero de calificaciones de materia que ingresara");
        tamano = entrada.nextInt();
        materia.recibirValores(tamano);        
        entrada.close();
        
    }


    public void recibirValores(int tamano)
    {   
        System.out.println("Ahora ingrese las calificaciones");


        Scanner entrada = new Scanner(System.in);
        double[] calificaciones = new double[tamano];
        for(int i = 0; i < tamano; i++ )
        {
            calificaciones[i] = entrada.nextDouble();
        }


        System.out.println("ahora ingrese los creiditos de las materias ");

        int[] creditos = new int[tamano];
        for(int i = 0; i < tamano; i++)
        {
            creditos[i] = entrada.nextInt();
        }

        double promedio = calcularPromedio(calificaciones, creditos);
        System.out.printf("su promedio fue de: %.2f \n", promedio );

        entrada.close();
    }






    public static double calcularPromedio(double[] calificaciones, int[] creditos)
    {
        double sumavalores = 0;
        double sumaCreditos = 0;


        for(int i = 0; i < calificaciones.length; i++)
        {
            sumavalores += calificaciones[i] * creditos[i];
            sumaCreditos = sumaCreditos + creditos[i];
        }

        double resultado = sumavalores / sumaCreditos;
        return resultado;



    }
    


    
}

