package Atividade_4;

public class FuncionarioTI {

    protected String nome;
    protected String matricula;

    public FuncionarioTI(String nome, String matricula){
        this.nome = nome;
        this.matricula =  matricula;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }

    public void atualizarCadastro(String novoNome, String novaMatricula) {
        this.nome = nome;
        this.matricula = matricula;
        System.out.println("Cadastro atualizado com sucesso!!");
    }
}