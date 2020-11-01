package com.univesp.jaba;

import java.util.ArrayList;

/**
 *
 * @author helton
 */
public class ProdutoFinal {
    private int codigo;
    private String nome;
    private String unidade;
    private int quantidade;
    private double custo;
    private double preco;
    private ArrayList<Insumo>listaInsumo;
    private ArrayList<ProdutoIntermediario>listaProdInterm;

    public ProdutoFinal(){
        listaInsumo = new ArrayList();
        listaProdInterm = new ArrayList();
    }
    
    public ProdutoFinal(int codigo, String nome, String unidade, int quantidade, double custo, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.custo = custo;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.preco = preco;
        listaInsumo = new ArrayList();
        listaProdInterm = new ArrayList();
        }
            
    
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the unidade
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the custo
     */
    public double getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * @return the listaInsumo
     */
    public ArrayList<Insumo> getListaInsumo() {
        return listaInsumo;
    }

    /**
     * @param listaInsumo the listaInsumo to set
     */
    public void setListaInsumo(ArrayList<Insumo> listaInsumo) {
        this.listaInsumo = listaInsumo;
    }

    /**
     * @return the ListaProdInterm
     */
    public ArrayList<ProdutoIntermediario> getListaProdInterm() {
        return listaProdInterm;
    }

    /**
     * @param ListaProdInterm the ListaProdInterm to set
     */
    public void setListaProdInterm(ArrayList<ProdutoIntermediario> ListaProdInterm) {
        this.listaProdInterm = ListaProdInterm;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void addInsumo(Insumo F){
        F.setpi(this);
        listaInsumo.add(F);
    }
    
    public void addProdInterm(ProdutoIntermediario F){
        F.setPf(this);
        listaProdInterm.add(F);
    }
    
}
