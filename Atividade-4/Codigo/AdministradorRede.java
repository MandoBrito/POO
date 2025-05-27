package Atividade_4;

public class AdministradorRede extends FuncionarioTI {
    private String certificacao;
    private String sistemaOperacionalResponsavel;

    public AdministradorRede(String nome, String matricula, String certificacao, String sistemaOperacialResponsavel){
        super(nome, matricula);
        this.certificacao = certificacao;
        this.sistemaOperacionalResponsavel = sistemaOperacialResponsavel;
    }

    public void monitorarRede(){
        System.out.print("Monitorando a rede ");
    }

    public void realizarBackcup(){
        System.out.println("Backup em andamento...");
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("certificacao: " + certificacao);
        System.out.println("sistema Operacional: " + sistemaOperacionalResponsavel);

    }
}