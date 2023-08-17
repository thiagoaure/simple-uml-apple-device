import Entities.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone ip = new IPhone();
        ip.adicionarNovaAba();
        ip.atender("1199999999");
        ip.atualizarPagina("www.apple.com");
        ip.ligar("3599999999");
        ip.selecionarMusica("survivor");
    }
}