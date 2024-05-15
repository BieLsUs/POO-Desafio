package Dispositivo;

import java.util.List;

import Dispositivo.AparelhoTelefônico.AparelhoTelefonico;
import Dispositivo.NavegadorInternet.navegadorInternet;
import Dispositivo.ReprodutorMusical.reprodutorMusical;

class iPhone implements reprodutorMusical, AparelhoTelefonico, navegadorInternet {

    // ReprodutorMusical
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    // AparelhoTelefônico
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    
    // NavegadorDaInternet
    public void exibirPagina() {
        System.out.println("Exibindo página na internet...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }
}
