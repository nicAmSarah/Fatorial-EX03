package fatorialEx3;

import javax.swing.JOptionPane;

public class FatorialController {
	public static void main(String[] args) {
		int fat = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor ate 12 para calcular o fatorial"));
		
		if ( fat <= 0 || fat > 12) {
			JOptionPane.showConfirmDialog(null, "valor invalido, Digite um valor ate 12");
		}
		else {
			FatorialView fatorial = new FatorialView();
			
			int resultFat = fatorial.fatCalculo(fat);
			
			JOptionPane.showMessageDialog(null, resultFat);
		}
		
	}
}
