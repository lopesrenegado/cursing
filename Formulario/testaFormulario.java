import javax.swing.JOptionPane;
import java.util.ArrayList;
public class testaFormulario {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Bem vindo ao nosso formulario!!");
        int op = 99;
        while(op != 0){
            controleFormulario cc = new controleFormulario();
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de opcoes:\n"+ "1 - Cadastrar formulario\n" + "2 - Imprimir cadastrados\n" + "0 - Sair"));
            switch(op){
                case 1:
                String nome = JOptionPane.showInputDialog(null, "Informe o seu nome completo: ");
                String dataNascimento = JOptionPane.showInputDialog(null, "Informe sua data de nascimento: ");
                String email = JOptionPane.showInputDialog(null, "Informe o seu e-mail");
                String bairro = JOptionPane.showInputDialog(null, "Informe agora o seu bairro: ");
                cc.pessoaCadastrada(nome, dataNascimento, email, bairro);
                JOptionPane.showMessageDialog(null, "Cadastros realizados:\n" + cc.imprimirCadastrados());
                break;
                case 0:
                break;
            }
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de opcoes:\n"+ "1 - Cadastrar formulario\n" + "0 - Sair"));
        }
    }
}
