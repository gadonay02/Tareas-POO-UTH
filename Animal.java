/*
Nombre: German Adonay Rivera Delcid
Cuenta: 201310060117
Clase: Programación orientada a Objetos
Catedratico: Master Arnol Rafael Gutierrez
 */
package animal;

/**
 *
 * @author Adonay
 */
//SUPERCLASE ANIMAL
public class Animal 
{
    public String nombre;
    public String clase;
    public String alimento;
    
    public Animal(String nombreInicial, String claseInicial, String alimentoInicial)
    {
        nombre = nombreInicial;
        clase = claseInicial;
        alimento = alimentoInicial;
    }
    
    //ESTABLECIMIENTO DE VALORES
    //METODO #1 SUPERCLASE ANIMAL
    public void establecerNombre(String nuevoValor)
    {
        nombre = nuevoValor;
    }
    //METODO #2 SUPERCLASE ANIMAL
    public void establecerAlimento(String nuevoValor)
    {
        alimento = nuevoValor;
    }
    //METODO #3 SUPERCLASE ANIMAL
    public void establecerClase(String nuevoValor)
    {
        clase = nuevoValor;
    }

    //SUBCLASE #1 ANIMALTORTUGA
public class animalTortuga extends Animal
{
    public int peso;
    public int longevidad;
    
    public animalTortuga (int pesoInicial,
                          int longevidadInicial,
                          String nombreInicial,
                          String alimentoInicial,
                          String claseInicial)
    {
        super(nombreInicial, alimentoInicial, claseInicial);
        peso = pesoInicial;
        longevidad = longevidadInicial;
    }
    //METODO #1 SUBCLASE ANIMALTORTUGA
    public void establecerPeso(int nuevoValor)
    {
        peso = nuevoValor;
    }
    //METODO #2 SUBCLASE ANIMALTORTUGA
    public void establecerLongevidad(int nuevoValor)
    {
        longevidad = nuevoValor;
    }
}

//SUBCLASE #2 ANIMALAGUILA
public class animalAguila extends Animal
{
    public int peso;
    public int longevidad;
    
    public animalAguila (int pesoInicial,
                          int longevidadInicial,
                          String nombreInicial,
                          String alimentoInicial,
                          String claseInicial)
    {
        super(nombreInicial, alimentoInicial, claseInicial);
        peso = pesoInicial;
        longevidad = longevidadInicial;
    }
    //METODO #1 SUBCLASE ANIMALAGUILA
    public void establecerPeso(int nuevoValor)
    {
        peso = nuevoValor;
    }
    //METODO #2 SUBCLASE ANIMALAGUILA
    public void establecerLongevidad(int nuevoValor)
    {
        longevidad = nuevoValor;
    }
}

//SUBCLASE #3 ANIMALCONEJO
public class animalConejo extends Animal
{
    public int peso;
    public int longevidad;
    
    public animalConejo (int pesoInicial,
                          int longevidadInicial,
                          String nombreInicial,
                          String alimentoInicial,
                          String claseInicial)
    {
        super(nombreInicial, alimentoInicial, claseInicial);
        peso = pesoInicial;
        longevidad = longevidadInicial;
    }
    //METODO #1 SUBCLASE ANIMALCONEJO
    public void establecerPeso(int nuevoValor)
    {
        peso = nuevoValor;
    }
    //METODO #2 SUBCLASE ANIMALCONEJO
    public void establecerLongevidad(int nuevoValor)
    {
        longevidad = nuevoValor;
    }  
}
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.println("***********************************************");
    }//FIN DEL MAIN    
}//FIN DE LA SUPERCLASE ANIMAL

/*
Buen dia Ing. le envio el ejercicio incompleto ya que tengo problemas
para hacer el llamado para impresion de resultados.
*/
