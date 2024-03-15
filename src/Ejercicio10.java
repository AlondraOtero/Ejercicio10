//Crear un programa para calcular el sueldo del trabajador a partir de las horas trabajadas en la semana y la clases a la que pertenece:
//Trabajadores de clase "A" se les paga 250 pesos por hora
//Trabajadores de la clase "B" se paga 200 pesos por hora
//Trabajadores de la clase "C" se les paga 150 pesos por hora 
//Trabajadores de clase "D" 100 pesos por hora
 
import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas en la semana:"));
        char claseTrabajador = JOptionPane.showInputDialog("Ingrese la clase del trabajador (A, B, C o D):").charAt(0);

        
        double sueldo = calcularSueldo(horasTrabajadas, claseTrabajador);

       
        JOptionPane.showMessageDialog(null, "El sueldo del trabajador es: $" + sueldo);
    }

    public static double calcularSueldo(int horasTrabajadas, char claseTrabajador) {
        double tarifaPorHora;

        
        switch (Character.toUpperCase(claseTrabajador)) {
            case 'A':
                tarifaPorHora = 250;
                break;
            case 'B':
                tarifaPorHora = 200;
                break;
            case 'C':
                tarifaPorHora = 150;
                break;
            case 'D':
                tarifaPorHora = 100;
                break;
            default:
                tarifaPorHora = 0;
        }

        
        return horasTrabajadas * tarifaPorHora;
    }
}
