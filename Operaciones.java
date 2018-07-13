/*
Nombre: German Adonay Rivera Delcid
Cuenta: 201310060117
Clase: programacion Orientada a Objetos
Catedratico: Master Arnol Rafael Gutierrez
*/
package operaciones;

/**
 *
 * @author Adonay
 */
// Declaracion clase Operaciones
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    //Metodo principal
    public static void main(String[] args) 
    {
        // Declaracion mensajes 
        Mensajes mensajes = new Mensajes();
        mensajes.Saludo();
        mensajes.ValorNota(93);
        mensajes.Suma(15, 30);
        mensajes.ListaNumeros(20);
        // TODO code application logic here
    }// Fin metodo principal
    public static class Mensajes 
    {
        public void Saludo()
        {
            System.out.println("Soy el mejor programador");         
        }// Fin Saludo
    public void ValorNota(int nota)
    {
        if (nota > 70)
        {
            System.out.println("Aprobado");
        }// Fin if
        else
        {
            System.out.println("Reprobado");
        }// Fin else
    }// Fin valorNota
    public void Suma(int num1, int num2)
    {
        int suma = 0;
       
        suma = num1 + num2;
        System.out.println("La suma es: " + suma);      
    }// Fin operacion Suma
    
// Incompleto no pude realizar la impresion del listado
    public void ListaNumeros(int X) 
    {
        int listado = 1;
        
        X--;
        System.out.println(" " + X);
    }// Fin ListaNumeros
    }// Fin clase Mensajes    
}// Fin clase Operaciones
