import java.util.ArrayList;
public class controleFormulario {
    private ArrayList<Formulario> pessoasCadastradas = new ArrayList<>();

    public void pessoaCadastrada(String nome, String dataNascimento, String email, String bairro){
        pessoasCadastradas.add(new Formulario(nome, dataNascimento, email, bairro));
    }

    public String imprimirCadastrados(){
        String res = "";
        for(int i = 0; i<pessoasCadastradas.size(); i++){
res += "Nome:" + pessoasCadastradas.get(i).getNome() + "\nBairro:" + pessoasCadastradas.get(i).getBairro() + "\nData de Nascimento:" + pessoasCadastradas.get(i).getDataNascimento() + "\nEmail para contato:" + pessoasCadastradas.get(i).getEmail();
        }
     return res;
    }    
}