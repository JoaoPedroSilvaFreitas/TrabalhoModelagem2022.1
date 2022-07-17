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
public class Cliente 
{
    private int id;
    private String nome;
    private String telefone;
    private String endereco;
    private List<Encomenda> encomendas;
    
    public Cliente(String nome, String telefone, String endereco)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    
    public int getId()
    {
        return this.id;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getTelefone()
    {
        return this.telefone;
    }
    
    public String getEndereco()
    {
        return this.endereco;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
    
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    
    //toString
    @Override
    public String toString()
    {
        return this.nome + "  " + "   " + this.telefone + "   " + this.endereco;
    }
    
}
