/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.obj;

/**
 *
 * @author joaop
 */
public class Data 
{
    private int dia;
    private int mes;
    private int ano;
    
    
    Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia()
    {
        return this.dia;
    }
    
    public int getMes()
    {
        return this.mes;
    }
    
    public int getAno()
    {
        return this.ano;
    }
    
    public void setDia(int dia)
    {
        this.dia = dia;
    }
    
    public void setMes(int mes)
    {
        this.mes = mes;
    }
    
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    
}
