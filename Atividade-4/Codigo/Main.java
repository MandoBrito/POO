package Atividade_4;

public class Main {
    public static void main(String[] args) {


        Desenvolvedor Mando = new Desenvolvedor("M@ndo**", "TI202440601018", "Java", "Junior");
        AdministradorRede OSLxD = new AdministradorRede("OSLxD", "TI031115161020", "CCNA", "WINDOWS");

        System.out.println("###### Desenvolvedor ######");
        Mando.exibirDados();
        Mando.desenvolverProjeto();
        Mando.atualizarProjeto();
        Mando.exibirTecnologiasUsadas();
        Mando.revisarCodigo();

        System.out.println();

        System.out.println("###### Administrador ######");
        OSLxD.exibirDados();
        OSLxD.realizarBackcup();
        OSLxD.monitorarRede();

    }
}