package operaciones;

import javax.swing.JOptionPane;

public class Operaciones {

    public static void main(String[] args) {
        double numero1, numero2;
        
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));

	JOptionPane.showMessageDialog(null, "\nLa suma es: " + (numero1+numero2)
        + "\nLa resta es: " + (numero1+numero2)
        + "\nLa multiplicación es: " + (numero1*numero2)
        + "\nLa división es: " + (numero1/numero2));  
    }
    
}
