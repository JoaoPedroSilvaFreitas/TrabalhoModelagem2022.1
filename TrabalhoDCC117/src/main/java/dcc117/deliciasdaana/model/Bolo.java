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
public class Bolo extends Produto
{
    private String saborMassa;
    private String saborRecheio;
    private String tamanho;
    private List<Ingrediente> ingredientes;
   
    public Bolo(String saborMassa, String saborRecheio, String tamanho, String info, double valor)
    {
        this.saborMassa = saborMassa;
        this.saborRecheio = saborRecheio;
        this.tamanho = tamanho;
        this.valor = valor;
        this.info = info;
    }
    
    public void setSaborMassa(String saborMassa)
    {
        this.saborMassa = saborMassa;
    }
    
    public void setTamanho(String tamanho)
    {
        this.tamanho = tamanho;
    }
    
    public void setSaborRecheio(String saborRecheio)
    {
        this.saborRecheio = saborRecheio;
    }
    
    public String getSaborMassa()
    {
        return this.saborMassa;
    }
    
    public String getSaborRecheio()
    {
        return this.saborRecheio;
    }
    
    public String getTamanho()
    {
        return this.tamanho;
    }


    
    
    

    //toString
    @Override
    public String toString()
    {
        return "Bolo " + this.tamanho + ":  " + this.saborMassa + "  " + "   " + this.saborRecheio + "   R$" + this.valor + "    " + this.info;
    }
    
}
