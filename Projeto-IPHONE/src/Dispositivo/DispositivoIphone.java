package Dispositivo;

public class DispositivoIphone {
    public static void main(String[] args) {
       iPhone meuiPhone = new iPhone();

        // Utilizando os métodos do reprodutor musical
        meuiPhone.selecionarMusica();
        meuiPhone.tocar();
        meuiPhone.pausar();

        // Utilizando os métodos do aparelho telefônico
        meuiPhone.ligar();
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        // Utilizando os métodos do navegador de internet
        meuiPhone.exibirPagina();
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
