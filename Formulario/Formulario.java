import javax.swing.JOptionPane;

public class Formulario {
    private String nome;
    private String dataNascimento;
    private String email;
    private String bairro;
    private static int pessoasCadastradas;

    public String getBairro() {
        return bairro;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public static int getPessoasCadastradas() {
        return pessoasCadastradas;
    }

public Formulario(String nome, String dataNascimento, String email, String bairro){
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.email = email;
    this.bairro = bairro;
    ++pessoasCadastradas;
    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!\nMatricula da pessoa:"+pessoasCadastradas);
}
}
