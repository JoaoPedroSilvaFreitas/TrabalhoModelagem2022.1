/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.view;

/**
 *
 * @author joaop
 */

import dcc117.deliciasdaana.model.*;
import javax.swing.*;
import java.awt.*;
import dcc117.deliciasdaana.controller.*;

public class Tela extends JFrame
{
    private JPanel painelPrincipal;
    private JPanel painelLogin;
    private JPanel painelUsuario;
    private JPanel painelRegistraEncomenda;
    private JPanel painelRegistraCliente;
    
    private ImageIcon imagemLogo = new ImageIcon("images/logo.jpg");
    private ImageIcon imagemSetaLogin = new ImageIcon("images/seta.jpg");
    private ImageIcon imagemSetaSair = new ImageIcon("images/sair.jpg");
    private ImageIcon imagemRegistraEncomenda = new ImageIcon("images/botaoEncomenda.jpg");
    private ImageIcon imagemRegistraCliente = new ImageIcon("images/botaoCliente.jpg");
    private ImageIcon imagemRegistraIngrediente = new ImageIcon("images/botaoIngrediente.jpg");
    private ImageIcon imagemGastoLucro = new ImageIcon("images/botaoGastoLucro.jpg");
    private ImageIcon imagemCalendario = new ImageIcon("images/botaoCalendario.jpg");
    private ImageIcon imagemRelatorio = new ImageIcon("images/botaoRelatorio.jpg");
    
    private JLabel vazio = new JLabel();
    
    private JPasswordField senha;
    
    Tela()
    {
        
    }
    
    public void telaPrincipal()
    {
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelPrincipal = new JPanel();
        this.painelPrincipal.setLayout(new BorderLayout());
        
        telaLogin();
        
        this.add(this.painelPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.repaint();
    }
    
    private void telaLogin()
    {
        JLabel null0 = new JLabel();
        JLabel null1 = new JLabel();
        JLabel null2 = new JLabel();
        JLabel null3 = new JLabel();
        JLabel null4 = new JLabel();
        JLabel null5 = new JLabel();
        JLabel null6 = new JLabel();
        JLabel null7 = new JLabel();
        JLabel null8 = new JLabel();
        JLabel null9 = new JLabel();
        
        
        
        this.painelLogin = new JPanel();
        this.painelLogin.setBackground(new Color(239,186,237));
        this.painelLogin.setLayout(new GridLayout(0, 3));
        this.painelLogin.setPreferredSize(new Dimension(1280, 720));
        
        
        JLabel logo = new JLabel(imagemLogo);
        
        
        this.painelLogin.add(null0);
        this.painelLogin.add(logo);
        this.painelLogin.add(null1);

        
        senha = new JPasswordField(100);
        senha.setFont(new Font("Arial", Font.PLAIN, 95));   
        this.painelLogin.add(null2);
        this.painelLogin.add(senha);
        this.painelLogin.add(null3);
        
        this.painelLogin.add(null4);
        
        JButton loginBtn = new JButton();
        loginBtn.setFont(new Font("Arial", Font.PLAIN, 70));
        loginBtn.setBorderPainted(false);
        loginBtn.setIcon(imagemSetaLogin);
        loginBtn.setBackground(new Color(239,186,237));
        
        loginBtn.addActionListener(new Login(this));
        this.painelLogin.add(loginBtn);
        this.painelLogin.add(null5);
        this.painelLogin.add(null6);
        
        this.painelPrincipal.add(painelLogin, BorderLayout.CENTER);
    }
    
    public void telaUsuario(Usuario usuario)
    {
        painelPrincipal.setVisible(false);
        //this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelUsuario = new JPanel();
        this.painelUsuario.setLayout(new BorderLayout());
        this.painelUsuario.setBackground(new Color(239,186,237));
        
        telaUsuarioAux();
        
        this.add(this.painelUsuario);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaUsuarioAux()
    {
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,1));
        this.painelUsuario.add(sairBtn,BorderLayout.WEST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
        JButton registrarClienteBtn;
        registrarClienteBtn = new JButton();
        registrarClienteBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        registrarClienteBtn.setBackground(new Color(239,186,237));
        registrarClienteBtn.setBorderPainted(false);
        registrarClienteBtn.setIcon(imagemRegistraCliente);
        registrarClienteBtn.addActionListener(new registrarEncomenda(this));
        painelFuncoes.add(registrarClienteBtn);
        
        JButton registrarEncomendaBtn;
        registrarEncomendaBtn = new JButton();
        registrarEncomendaBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        registrarEncomendaBtn.setBackground(new Color(239,186,237));
        registrarEncomendaBtn.setBorderPainted(false);
        registrarEncomendaBtn.setIcon(imagemRegistraEncomenda);
        registrarEncomendaBtn.addActionListener(new registrarCliente(this));
        painelFuncoes.add(registrarEncomendaBtn);
        
        JButton registrarIngredienteBtn;
        registrarIngredienteBtn = new JButton();
        registrarIngredienteBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        registrarIngredienteBtn.setBackground(new Color(239,186,237));
        registrarIngredienteBtn.setBorderPainted(false);
        registrarIngredienteBtn.setIcon(imagemRegistraIngrediente);
        //registrarIngredienteBtn.addActionListener(new registrarIngrediente(this));
        painelFuncoes.add(registrarIngredienteBtn);
        
        JButton consultarGastoLucroBtn;
        consultarGastoLucroBtn = new JButton();
        consultarGastoLucroBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        consultarGastoLucroBtn.setBackground(new Color(239,186,237));
        consultarGastoLucroBtn.setBorderPainted(false);
        consultarGastoLucroBtn.setIcon(imagemGastoLucro);
        //consultarGastoLucroBtn.addActionListener(new consultarGastoLucro(this));
        painelFuncoes.add(consultarGastoLucroBtn);
        
        JButton relatorioEncomendaBtn;
        relatorioEncomendaBtn = new JButton();
        relatorioEncomendaBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        relatorioEncomendaBtn.setBackground(new Color(239,186,237));
        relatorioEncomendaBtn.setBorderPainted(false);
        relatorioEncomendaBtn.setIcon(imagemRelatorio);
        //relatorioEncomendaBtn.addActionListener(new relatorioEncomendas(this));
        painelFuncoes.add(relatorioEncomendaBtn);
        
        JButton calendarioBtn;
        calendarioBtn = new JButton();
        calendarioBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        calendarioBtn.setBackground(new Color(239,186,237));
        calendarioBtn.setBorderPainted(false);
        calendarioBtn.setIcon(imagemCalendario);
        //calendarioBtn.addActionListener(new calendario(this));
        painelFuncoes.add(calendarioBtn);
        
        
        this.painelUsuario.add(painelFuncoes, BorderLayout.CENTER);
    }
    
    public void telaRegistraEncomenda()
    {
        
    }
    
    private void telaRegistraEncomendaAux()
    {
        
    }
    
    public void telaRegistraCliente()
    {
        
    }
    
    private void telaRegistraClienteAux()
    {
        
    }
    
    public static void main(String[] args) 
    {
        Tela tela = new Tela();
        tela.telaPrincipal();
        tela.pack();
    }
    
    
    //get
    public JPasswordField getSenha()
    {
        return this.senha;
    }
    
    //set
    public void setSenha(JPasswordField senha)
    {
        this.senha = senha;
    }
    
    //visibilidade
    public void visibilidadeTelaUsuario()
    {
        this.painelUsuario.setVisible(false);
    }
    
    public void visibilidadeTelaRegistraEncomenda()
    {
        this.painelRegistraEncomenda.setVisible(false);
    }
    
    public void visibilidadeTelaRegistraCliente()
    {
        this.painelRegistraCliente.setVisible(false);
    }
}
