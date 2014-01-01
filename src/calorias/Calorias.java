
package calorias;

import javax.swing.JOptionPane;

public class Calorias {

    
    public static void main(String[] args) {
      String leer;
      double altura, edad,peso, calorias,RBM;
      leer= JOptionPane.showInputDialog(null, "Ingre la altura:");
      altura = Double.parseDouble(leer);
      leer = JOptionPane.showInputDialog(null, "Ingre la edad:");
      edad = Double.parseDouble (leer);
      leer = JOptionPane.showInputDialog(null, "Ingre el peso:");
      peso = Double.parseDouble (leer);
        
      RBM = 66+(13.7 * peso)+(5 * altura)-(6.8 * edad); 
      calorias = (1808.5*1.2); 
      JOptionPane.showMessageDialog(null,"La calorias que necesitas es : "+ calorias,"Calorias ",JOptionPane.INFORMATION_MESSAGE); 
    }
}
