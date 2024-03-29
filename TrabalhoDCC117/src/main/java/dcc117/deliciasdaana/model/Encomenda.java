/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.model;

import java.util.*;

/**
 *
 * @author joaop
 */
public class Encomenda 
{
    private Cliente cliente;
    private Data dataDoPedido;
    private Data dataDeEntrega;
    private double valorTotal;
    private double gastoTotal;
    private String info;
    //private List<Produto> produtos;
    
    private List<Bolo> bolos;
    private List<Doce> doces;
    
    public Encomenda(Cliente cliente, Data dataDoPedido, Data dataDeEntrega, String info)
    {
        this.cliente = cliente;
        this.dataDeEntrega = dataDeEntrega;
        this.dataDoPedido = dataDoPedido;
        this.valorTotal = 0;
        this.gastoTotal = 0;
        this.info = info;
        //produtos = new ArrayList<Produto>();
        
        bolos = new ArrayList<Bolo>();
        doces = new ArrayList<Doce>();
    }
    
    private void calculaValorGasto()
    {
        this.valorTotal = 0;
        this.gastoTotal = 0;
        /*
        for(Produto produto : produtos)
        {
            this.valorTotal += produto.getValor();
            this.gastoTotal += produto.getCusto();
        }
        */
        
        for(Doce doce : doces)
        {
            this.valorTotal += doce.getValor();
            this.gastoTotal += doce.getCusto();
        }
        for(Bolo bolo : bolos)
        {
            this.valorTotal += bolo.getValor();
            this.gastoTotal += bolo.getCusto();
        }
        
    }
    
    /*
    public void addProduto(Produto produto)
    {
        produtos.add(produto);
    }
    */
    
    public void addDoce(Doce doce)
    {
        doces.add(doce);
    }
    
    public void addBolo(Bolo bolo)
    {
        bolos.add(bolo);
    }
    
    public Cliente getCliente()
    {
        return this.cliente;
    }
    
    public Data getDataDoPedido()
    {
        return this.dataDoPedido;
    }
    
    public Data getDataDeEntrega()
    {
        return this.dataDeEntrega;
    }
    
    public double getValorTotal()
    {
        calculaValorGasto();
        return this.valorTotal;
    }
    
    public double getGastoTotal()
    {
        calculaValorGasto();
        return this.gastoTotal;
    }
    
    public String getInfo()
    {
        return this.info;
    }

    /*
    public List<Produto> getProdutos() 
    {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) 
    {
        this.produtos = produtos;
    }
    */
    
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    
    public void setDataDoPedido(Data dataDoPedido)
    {
        this.dataDoPedido = dataDoPedido;
    }
    
    public void setDataDeEntrega(Data dataDeEntrega)
    {
        this.dataDeEntrega = dataDeEntrega;
    }
    
    public void setValorTotal(double valorTotal)
    {
        this.valorTotal = valorTotal;
    }
    
    public void setGastoTotal(double gastoTotal)
    {
        this.gastoTotal = gastoTotal;
    }
    
    public void setInfo(String info)
    {
        this.info = info;
    }
    
    //toString
    @Override
    public String toString()
    {
        return this.cliente.getNome() + ":  " + this.dataDoPedido + "  " + "   " + this.dataDeEntrega;
    }
}
