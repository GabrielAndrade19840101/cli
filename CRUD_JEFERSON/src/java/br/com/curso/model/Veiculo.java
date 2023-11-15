/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.model;

/**
 *
 * @author Aluno
 */
public class Veiculo {
    private int idVeiculo;
    private String placaVeiculo;
    private String cor;
    private int ano;
    private String categoriaveiculo;
    private String nomemodelo;
    private String nomemarca;

    public Veiculo() {
    }

    public Veiculo(int idVeiculo, String placaVeiculo, String cor, int ano, String categoriaveiculo, String nomemodelo, String nomemarca) {
        this.idVeiculo = idVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.cor = cor;
        this.ano = ano;
        this.categoriaveiculo = categoriaveiculo;
        this.nomemodelo = nomemodelo;
        this.nomemarca = nomemarca;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCategoriaveiculo() {
        return categoriaveiculo;
    }

    public void setCategoriaveiculo(String categoriaveiculo) {
        this.categoriaveiculo = categoriaveiculo;
    }

    public String getNomemodelo() {
        return nomemodelo;
    }

    public void setNomemodelo(String nomemodelo) {
        this.nomemodelo = nomemodelo;
    }

    public String getNomemarca() {
        return nomemarca;
    }

    public void setNomemarca(String nomemarca) {
        this.nomemarca = nomemarca;
    }
    
    
}
