package Entities;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorNaInternet;
import Interfaces.ReprodutorMusical;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    @Override
    public void tocar(String nomeMusica) {
        System.out.println("Tocando " +  nomeMusica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Faixa: " + nomeMusica + " selecionada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " +  numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo " +  numero);
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " +  url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualizando página:  " +  url);
    }
}
