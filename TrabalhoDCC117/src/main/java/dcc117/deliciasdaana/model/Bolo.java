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
    private int tamanho; // 1 pequeno 2 medio 3 grande
    private float valor;
    private List<Ingrediente> ingredientes;
   
    Bolo(String saborMassa, String saborRecheio, int tamanho)
    {
        this.saborMassa = saborMassa;
        this.saborRecheio = saborRecheio;
        this.tamanho = tamanho;
        this.valor = 0;
    }
    
    public float calculaValor()
    {   
        for (Ingrediente ingrediente : ingredientes)
        {
            valor += ingrediente.getValor();
        }
        return valor;
    }
    
    public void setSaborMassa(String saborMassa)
    {
        this.saborMassa = saborMassa;
    }
    
    public void setTamanho(int tamanho)
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
    
    public int getTamanho()
    {
        return this.tamanho;
    }

}
