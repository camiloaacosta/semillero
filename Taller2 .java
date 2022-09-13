package taller2;

import javax.swing.JOptionPane;

public class Taller2 {

    public static void main(String[] args) {
        
        byte opcion=0;
        String nombre, identificacion, edad, sexo;
        int cont = 0;
        String matriz[][] = new String[4][4];
        
        do{
            opcion=Byte.parseByte(JOptionPane.showInputDialog(
            "*** MENU PRINCIPAL ***\n"
            + "\n1. Registrar cliente"
            + "\n2. Buscar cliente"
            + "\n3. Salir"
            + "\n\nOpcion: "));
            
            switch(opcion){
                case 1:
                    matriz[cont][0] = JOptionPane.showInputDialog("\nNombre del cliente: ");
                    matriz[cont][1] = identificacion = JOptionPane.showInputDialog("\nIdentificación: ");
                    matriz[cont][2] = JOptionPane.showInputDialog("\nEdad: ");
                    matriz[cont][3] = JOptionPane.showInputDialog("\nSexo (M - Masculino | F - Femenino): ");
                    
                    JOptionPane.showInternalMessageDialog(null, "\nDatos registrados correctamente!"
                            + "\n\nNombre: "+ matriz[cont][0]
                            + "\nID: "+ matriz[cont][1]
                            + "\nEdad: "+ matriz[cont][2]
                            + "\nSexo: "+ matriz[cont][3]);
                    cont++;
                    break;
                case 2:
                    break;
                case 3:
                    opcion=3;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion inválida, por favor ingrese una de las ofrecidas\n\n");
                    break;
            }

        }while(opcion != 3);
        
        System.exit(0);
    }
    
}
