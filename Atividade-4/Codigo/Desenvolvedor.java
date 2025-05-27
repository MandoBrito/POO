package Atividade_4;

public class Desenvolvedor extends FuncionarioTI {
    private String linguagemPrincipal;
    private String nivel;

    public Desenvolvedor (String nome, String matricula, String linguagemPrincial, String nivel){

        super(nome,matricula);
        this.linguagemPrincipal = linguagemPrincial;
        this.nivel = nivel;

    }

    public void desenvolverProjeto(){
        System.out.println("Desenvolvendo projeto em " + linguagemPrincipal);
    }

    public void atualizarProjeto(){
        System.out.println("Projeto atualizando");
    }

    public void exibirTecnologiasUsadas(){
        System.out.println("Teclogia principal:" + linguagemPrincipal);
    }

    public void revisarCodigo(){
        System.out.println("Codigo revisado pelo desenvolvedor " +nivel);
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("linguagemPrincipal: " + linguagemPrincipal);
        System.out.println("nivel: " + nivel);
    }
}