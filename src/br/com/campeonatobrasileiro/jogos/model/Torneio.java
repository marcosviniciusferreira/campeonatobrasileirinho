package br.com.campeonatobrasileiro.jogos.model;

import java.util.ArrayList;

public class Torneio {
    public static ArrayList<Time> listaEquipes;
    public static int totalEquipes;
 
public static void atualizaClassificação(){
    for (Time time : listaEquipes) {
        time.AtualizaPontos(time);
    }
}
    
public static String nomesTimes() {
    StringBuilder listaNomes = new StringBuilder(); // Usando StringBuilder para eficiência na concatenação
    for (Time time : listaEquipes) {
        listaNomes.append("\"").append(time.getNome()).append("\", ");
    }
    // Remove a última vírgula e espaço, se houver itens na lista
    if (listaNomes.length() > 0) {
        listaNomes.setLength(listaNomes.length() - 2); // Remove ", "
    }
    return listaNomes.toString(); // Retorna a string formatada
}
    
    public int getTotalEquipes() {
        return totalEquipes;
    }

    public void setTotalEquipes(int totalEquipes) {
        this.totalEquipes = totalEquipes;
    }

    public ArrayList<Time> getlistaEquipes() {
        return listaEquipes;
    }

    public void setlistaEquipes(ArrayList<Time> cadastroEquipes) {
        this.listaEquipes = cadastroEquipes;
    }
}