/*
Nombre: German Adonay Rivera Delcid
Cuenta: 201310060117
Clase: Programación orientada a Objetos
Catedratico: Master Arnol Rafael Gutierrez
 */
package calculadora;

/**
 *
 * @author Tec. German
 */
public class Calculadora 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        CalculadoraCanon cc = new CalculadoraCanon ();
        System.out.println(cc.getCientifica());
    
        CalculadoraCasio cn = new CalculadoraCasio ();
        System.out.println(cn.getCientifica());
    
        CalculadoraHp ch = new CalculadoraHp ();
        System.out.println(ch.getCientifica());
        // TODO code application logic here
    }
    public static abstract class Computadora 
    {
        abstract String getCientifica();
    }
    public static class CalculadoraCanon extends Computadora
    {
        public String getCientifica()
        {
            return "Fabricante: CANON / "
                    + "Modelo: F715SG / "
                    + "Tamaño: 168X86.3X17.8mm / "
                    + "Color: Negro";            
        }
    }
        public static class CalculadoraCasio extends Computadora
    {
        public String getCientifica()
        {
            return "Fabricante: CASIO / "
                    + "Modelo: FX-85GTPLUS / "
                    + "Tamaño: 80X162X11mm / "
                    + "Color: Azul";
        }
    }
            public static class CalculadoraHp extends Computadora
    {
        public String getCientifica()
        {
            return "Fabricante: HEWLETT PACKARD / "
                    + "Modelo: F2215A / "
                    + "Tamaño: 82X158X182mm / "
                    + "Color: Blanco";
        }
    }
}
