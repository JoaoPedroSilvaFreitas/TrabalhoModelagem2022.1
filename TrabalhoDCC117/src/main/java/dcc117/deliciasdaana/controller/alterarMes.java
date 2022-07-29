/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller;

/**
 *
 * @author joaop
 */

import dcc117.deliciasdaana.model.Encomenda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dcc117.deliciasdaana.view.*;


public class alterarMes implements ActionListener
{
    private Tela tela;
    private int telaId;
    
    public alterarMes(Tela tela, int telaId)
    {
        this.tela = tela;
        this.telaId = telaId;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(telaId == 2)
        {
            for(Encomenda encomenda: tela.getUsuario().getEncomendas())
            {
                if(encomenda.getDataDeEntrega().getAno() == Integer.parseInt(tela.getCalendarioAno().getText()))
                {
                    if(encomenda.getDataDeEntrega().getMes() == Integer.parseInt(tela.getCalendarioMes().getText()))
                    {
                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia1().getText()))
                        {
                            tela.getDia1().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia2().getText()))
                        {
                            tela.getDia2().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia3().getText()))
                        {
                            tela.getDia3().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia4().getText()))
                        {
                            tela.getDia4().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia5().getText()))
                        {
                            tela.getDia5().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia6().getText()))
                        {
                            tela.getDia6().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia7().getText()))
                        {
                            tela.getDia7().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia8().getText()))
                        {
                            tela.getDia8().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia9().getText()))
                        {
                            tela.getDia9().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia10().getText()))
                        {
                            tela.getDia10().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia11().getText()))
                        {
                            tela.getDia11().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia12().getText()))
                        {
                            tela.getDia12().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia13().getText()))
                        {
                            tela.getDia13().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia14().getText()))
                        {
                            tela.getDia14().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia15().getText()))
                        {
                            tela.getDia15().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia16().getText()))
                        {
                            tela.getDia16().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia17().getText()))
                        {
                            tela.getDia17().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia18().getText()))
                        {
                            tela.getDia18().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia19().getText()))
                        {
                            tela.getDia19().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia20().getText()))
                        {
                            tela.getDia20().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia21().getText()))
                        {
                            tela.getDia21().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia22().getText()))
                        {
                            tela.getDia22().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia23().getText()))
                        {
                            tela.getDia23().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia24().getText()))
                        {
                            tela.getDia24().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia25().getText()))
                        {
                            tela.getDia25().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia26().getText()))
                        {
                            tela.getDia26().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia27().getText()))
                        {
                            tela.getDia27().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia28().getText()))
                        {
                            tela.getDia28().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia29().getText()))
                        {
                            tela.getDia29().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia30().getText()))
                        {
                            tela.getDia30().setText("0");
                        }

                        if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia31().getText()))
                        {
                            tela.getDia31().setText("0");
                        }
                    }
                }
            }
        }
        if(telaId == 0)
        {
            int mes;
            mes = Integer.parseInt(tela.getCalendarioMes().getText()) - 1;
            if(mes < 1)
            {
                mes = 12;
                int ano;
                ano = Integer.parseInt(tela.getCalendarioAno().getText()) - 1;
                tela.getCalendarioAno().setText(Integer.toString(ano));
            }
            tela.getCalendarioMes().setText(Integer.toString(mes));
            
            
        }else
            {
                if(telaId == 1)
                {
                    int mes;
                    mes = Integer.parseInt(tela.getCalendarioMes().getText()) + 1;
                    if(mes > 12)
                    {
                        mes = 1;
                        int ano;
                        ano = Integer.parseInt(tela.getCalendarioAno().getText()) + 1;
                        tela.getCalendarioAno().setText(Integer.toString(ano));
                    }
                    tela.getCalendarioMes().setText(Integer.toString(mes));
                }
            }
        
        int mes = Integer.parseInt(tela.getCalendarioMes().getText());

        
        tela.getDia1().setText("1");
        tela.getDia2().setText("2");
        tela.getDia3().setText("3");
        tela.getDia4().setText("4");
        tela.getDia5().setText("5");
        tela.getDia6().setText("6");
        tela.getDia7().setText("7");
        tela.getDia8().setText("8");
        tela.getDia9().setText("9");
        tela.getDia10().setText("10");
        tela.getDia11().setText("11");
        tela.getDia12().setText("12");
        tela.getDia13().setText("13");
        tela.getDia14().setText("14");
        tela.getDia15().setText("15");
        tela.getDia16().setText("16");
        tela.getDia17().setText("17");
        tela.getDia18().setText("18");
        tela.getDia19().setText("19");
        tela.getDia20().setText("20");
        tela.getDia21().setText("21");
        tela.getDia22().setText("22");
        tela.getDia23().setText("23");
        tela.getDia24().setText("24");
        tela.getDia25().setText("25");
        tela.getDia26().setText("26");
        tela.getDia27().setText("27");
        tela.getDia28().setText("28");
        tela.getDia29().setText("29");
        tela.getDia30().setText("30");
        tela.getDia31().setText("31");
        
        if(mes == 2 || mes == 4 || mes == 6 || mes == 9|| mes == 11)
        {
            if(mes == 2)
            {
                tela.getDia30().setText("");
                tela.getDia29().setText("");
                if(Integer.parseInt(tela.getCalendarioAno().getText()) % 4 == 0)
                {
                    tela.getDia29().setText("29");
                }
            }else
                {
                    tela.getDia30().setText("30");
                    tela.getDia29().setText("29");
                }
            tela.getDia31().setText("");
        }
        
        for(Encomenda encomenda: tela.getUsuario().getEncomendas())
        {
            if(encomenda.getDataDeEntrega().getAno() == Integer.parseInt(tela.getCalendarioAno().getText()))
            {
                if(encomenda.getDataDeEntrega().getMes() == Integer.parseInt(tela.getCalendarioMes().getText()))
                {
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia1().getText()))
                    {
                        tela.getDia1().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia2().getText()))
                    {
                        tela.getDia2().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia3().getText()))
                    {
                        tela.getDia3().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia4().getText()))
                    {
                        tela.getDia4().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia5().getText()))
                    {
                        tela.getDia5().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia6().getText()))
                    {
                        tela.getDia6().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia7().getText()))
                    {
                        tela.getDia7().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia8().getText()))
                    {
                        tela.getDia8().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia9().getText()))
                    {
                        tela.getDia9().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia10().getText()))
                    {
                        tela.getDia10().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia11().getText()))
                    {
                        tela.getDia11().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia12().getText()))
                    {
                        tela.getDia12().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia13().getText()))
                    {
                        tela.getDia13().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia14().getText()))
                    {
                        tela.getDia14().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia15().getText()))
                    {
                        tela.getDia15().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia16().getText()))
                    {
                        tela.getDia16().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia17().getText()))
                    {
                        tela.getDia17().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia18().getText()))
                    {
                        tela.getDia18().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia19().getText()))
                    {
                        tela.getDia19().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia20().getText()))
                    {
                        tela.getDia20().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia21().getText()))
                    {
                        tela.getDia21().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia22().getText()))
                    {
                        tela.getDia22().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia23().getText()))
                    {
                        tela.getDia23().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia24().getText()))
                    {
                        tela.getDia24().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia25().getText()))
                    {
                        tela.getDia25().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia26().getText()))
                    {
                        tela.getDia26().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia27().getText()))
                    {
                        tela.getDia27().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia28().getText()))
                    {
                        tela.getDia28().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia29().getText()))
                    {
                        tela.getDia29().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia30().getText()))
                    {
                        tela.getDia30().setText("0");
                    }
                    
                    if(encomenda.getDataDeEntrega().getDia() == Integer.parseInt(tela.getDia31().getText()))
                    {
                        tela.getDia31().setText("0");
                    }
                }
            }
        }
    }
} 
    