import java.util.Scanner; 

public class Comparaciones { 

    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        int numero1; 

        int numero2; 

 

        System.out.print("Ingrese el primer entero: "); 

        numero1 = entrada.nextInt(); 

 

        System.out.print("Ingrese el segundo entero: "); 

        numero2 = entrada.nextInt(); 

 

        System.out.println(); 

 

        System.out.print("¿es menor? " + numero1 + " < " + numero2 + ": "); 

        System.out.println(numero1 < numero2); 

 

        System.out.print("¿es mayor? " + numero1 + " > " + numero2 + ": "); 

        System.out.println(numero1 > numero2); 

 

        System.out.print("¿es mayor o igual a? " + numero1 + " >= " + numero2 + ": "); 

        System.out.println(numero1 >= numero2); 

 

        System.out.print("¿es menor o igual a? " + numero1 + " <= " + numero2 + ": "); 

        System.out.println(numero1 <= numero2); 

 

        System.out.println(); 

 

        System.out.print("¿es igual a? " + numero1 + " == " + numero2 + ": "); 

        System.out.println(numero1 == numero2); 

 

        System.out.print("¿no es igual a? " + numero1 + " != " + numero2 + ": "); 

        System.out.println(numero1 != numero2); 

 

    } // Fin del método main 

} // Fin de la clase Comparaciones
