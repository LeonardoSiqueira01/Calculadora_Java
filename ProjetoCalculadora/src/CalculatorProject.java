import javax.swing.JOptionPane;

public class CalculatorProject {

	public static void main(String[] args) {

			System.out.println("CALCULADORA");
			System.out.println("QUAL OPE��O M�TEMATICA VOC� QUER REALIZAR:");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTRA��O");
			System.out.println("3 - DIVIS�O");
			System.out.println("4 - MULTIPLICA��O");
			String opcao = JOptionPane.showInputDialog(null,"Escolha a op��o desejada:");
			double opc = Double.parseDouble(opcao);
			if (opc>=5) {
				JOptionPane.showMessageDialog(null, "Op��o �nvalida");
			} else {
			String numero1 = JOptionPane.showInputDialog(null,"Valor do primeiro numero:");
			double num1 = Double.parseDouble(numero1);
			String numero2 = JOptionPane.showInputDialog(null,"Valor do segundo numero:");
			double num2 = Double.parseDouble(numero2);
			if (opc==1) {
				double soma = num1+ num2;
				System.out.println("A soma de "+ num1+ " + "+num2+" = " +soma);	
				JOptionPane.showMessageDialog(null, " soma de "+num1+ " *+ "+num2+ " = "+soma);
			}if (opc==2){
				double sub = num1 -num2;
				System.out.println("A divis�o de "+num1+ " - "+num2+ " = "+sub );
				JOptionPane.showMessageDialog(null, "A subtra��o de "+num1+ " - "+num2+ " = "+sub);
			}if (opc==3){
				double div = num1/ num2;
				JOptionPane.showMessageDialog(null, "A divis�o de "+num1+ " / "+num2+ " = "+div);
				System.out.println("A divis�o de "+num1+ " / "+num2+ " = "+div );
			}
			if (opc==4){
				double mult = num1 * num2;
				JOptionPane.showMessageDialog(null, "A multiplica��o de "+num1+ " * "+num2+ " = "+mult);
				System.out.println("A multiplica��o de "+num1+ " * "+num2+ " = "+mult );	
		} }

	}

}
