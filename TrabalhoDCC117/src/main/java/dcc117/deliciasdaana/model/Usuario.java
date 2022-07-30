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
public class Usuario 
{
    private String senha;
    private List<Encomenda> encomendas;
    private List<Cliente> clientes;
    private List<Produto> produtos;
    
    private List<Doce> doces;
    private List<Bolo> bolos;
    
    public Usuario()
    {
        clientes = new ArrayList<Cliente>();
        encomendas = new ArrayList<Encomenda>();
        produtos = new ArrayList<Produto>();
        
        doces =  new ArrayList<Doce>();
        bolos =  new ArrayList<Bolo>();
    }
    
    public void addCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }
    
    public void addEncomenda(Encomenda encomenda)
    {
        encomendas.add(encomenda);
    }
    
    public void addProduto(Produto produto)
    {
        produtos.add(produto);
    }
    
    
    public void addBolo(Bolo bolo)
    {
       bolos.add(bolo);
    }
    
    public void addDoce(Doce doce)
    {
        doces.add(doce);
    }
    
    //get
    public String getSenha()
    {
        return this.senha;
    }
    
    public List<Encomenda> getEncomendas() 
    {
        return encomendas;
    }

    public List<Cliente> getClientes() 
    {
        return clientes;
    }

    public List<Produto> getProdutos() 
    {
        return produtos;
    }

    public List<Doce> getDoces() 
    {
        return doces;
    }

    public List<Bolo> getBolos() 
    {
        return bolos;
    }
    
    //set
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
    public void setEncomendas(List<Encomenda> encomendas) 
    {
        this.encomendas = encomendas;
    }
    
    public void setClientes(List<Cliente> clientes) 
    {
        this.clientes = clientes;
    }

    public void setProdutos(List<Produto> produtos) 
    {
        this.produtos = produtos;
    }

    public void setDoces(List<Doce> doces) 
    {
        this.doces = doces;
    }

    public void setBolos(List<Bolo> bolos) 
    {
        this.bolos = bolos;
    }
     
}
