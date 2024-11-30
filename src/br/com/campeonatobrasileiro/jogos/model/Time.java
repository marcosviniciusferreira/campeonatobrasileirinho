package br.com.campeonatobrasileiro.jogos.model;

import static br.com.campeonatobrasileiro.jogos.model.Torneio.atualizaClassificação;
import java.util.ArrayList;

public final class Time {

    //Atributos
    private String nome;
    private String cidade;
    private int ano_fundacao;
    private int pontos;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int qtd_jogadores;
    

    // Construtor
    public Time(String nome, String cidade, String uf, int ano_fundacao, int vitorias, int derrotas, int empates, int qtd_jogdadores) {
        this.nome = nome;
        this.cidade = cidade;
        this.ano_fundacao = ano_fundacao;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.qtd_jogadores = qtd_jogadores;

        // Adiciona o Time à lista de equipes
        if (Torneio.listaEquipes == null) {
            Torneio.listaEquipes = new ArrayList<>();
        }
        Torneio.listaEquipes.add(this);

        // Atualiza o número total de equipes
        Torneio.totalEquipes = Torneio.listaEquipes.size();

        // Atualiza os pontos do time
        AtualizaPontos(this);
    }

    public Time() {
        this.nome = nome;
        this.cidade = cidade;
        this.ano_fundacao = ano_fundacao;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.qtd_jogadores = qtd_jogadores;
        
        // Adiciona o Time à lista de equipes
        if (Torneio.listaEquipes == null) {
            Torneio.listaEquipes = new ArrayList<>();
        }
        Torneio.listaEquipes.add(this);

        // Atualiza o número total de equipes
        Torneio.totalEquipes = Torneio.listaEquipes.size();

        // Atualiza os pontos do time
        AtualizaPontos(this);
    }
    
    @Override
    public String toString() {
        return nome; // Exibirá o nome no JComboBox
    }
    
    private static void AtualizaCampeonato(){
        atualizaClassificação();
        
    }
    
    public void AtualizaPontos(Time time){
        time.JogoVencido(time, time.getVitorias());
        time.JogoEmpatado(time, time.getEmpates());
    }
    
    public int getJogos(){
     int jogos = this.getDerrotas()+this.getEmpates()+this.getVitorias();
     return jogos;
    }
    
    public void JogoVencido(Time time, int vitorias){
        time.setPontos(time.getPontos() + (3 * vitorias));
    }
    
    public void JogoEmpatado(Time time, int empates){
        time.setPontos(time.getPontos() + (1*empates));
    }
    

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAno_fundacao() {
        return ano_fundacao;
    }

    public void setAno_fundacao(int ano_fundacao) {
        this.ano_fundacao = ano_fundacao;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getQtd_jogadores() {
        return qtd_jogadores;
    }

    public void setQtd_jogadores(int qtd_jogadores) {
        this.qtd_jogadores = qtd_jogadores;
    }

//    // Sobrescrevendo toString()
//    @Override
//    public String toString() {
//        return "Time{"
//                + "nome='" + nome + '\''
//                + ", cidade='" + cidade + '\''
//                + ", ano_fundacao=" + ano_fundacao
//                + ", vitorias=" + vitorias
//                + ", derrotas=" + derrotas
//                + ", empates=" + empates
//                + ", qtd_jogadores=" + qtd_jogadores
//                + '}';
//    }
}
