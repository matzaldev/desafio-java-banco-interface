import javax.swing.JOptionPane;

public class ContaBancoInterface {
    public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o nome: ");

		String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome: ");

        int agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua Agência: "));

        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da sua conta: "));
        
        int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua senha: "));

        double saldoAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu saldo Atual:" ));

        JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " Conta: " + numeroConta + ". E seu  saldo de: " + saldoAtual + " já está disponível para saque.");
 
    }
}

