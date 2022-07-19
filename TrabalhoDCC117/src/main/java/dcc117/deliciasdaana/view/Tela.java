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
    private Usuario usuario;
    private JPasswordField senha;
    
    private JPanel painelPrincipal;
    private JPanel painelLogin;
    private JPanel painelUsuario;
    private JPanel painelRegistraEncomenda;
    private JPanel painelRegistraCliente;
    private JPanel painelRegistraIngrediente;
    private JPanel painelConsultaGastoLucro;
    private JPanel painelRelatorio;
    private JPanel painelCalendario;
    
    private JTextField cadastrarNomeCliente;
    private JTextField cadastrarTelefoneCliente;
    private JTextField cadastrarEnderecoCliente;
    
    private JTextField cadastrarNomeIngrediente;
    private JTextField cadastrarValorIngrediente;
    private JTextField cadastrarQuantidadeIngrediente;
    
    private JTextField cadastrarDataPedidoDia;
    private JTextField cadastrarDataPedidoMes;
    private JTextField cadastrarDataPedidoAno;
    
    private JTextField cadastrarDataEntregaDia;
    private JTextField cadastrarDataEntregaMes;
    private JTextField cadastrarDataEntregaAno;
    
    private JList<Cliente> clientes;
    private JList<Ingrediente> ingredientes;
    private JList<Encomenda> encomendas;
    
    private ImageIcon imagemLogo = new ImageIcon("images/logo.jpg");
    private ImageIcon imagemSetaLogin = new ImageIcon("images/seta.jpg");
    private ImageIcon imagemSetaSair = new ImageIcon("images/sair.jpg");
    private ImageIcon imagemRegistraEncomenda = new ImageIcon("images/botaoEncomenda.jpg");
    private ImageIcon imagemRegistraCliente = new ImageIcon("images/botaoCliente.jpg");
    private ImageIcon imagemRegistraIngrediente = new ImageIcon("images/botaoIngrediente.jpg");
    private ImageIcon imagemGastoLucro = new ImageIcon("images/botaoGastoLucro.jpg");
    private ImageIcon imagemCalendario = new ImageIcon("images/botaoCalendario.jpg");
    private ImageIcon imagemRelatorio = new ImageIcon("images/botaoRelatorio.jpg");
    
    
    Tela()
    {
        DefaultListModel<Cliente> modelClientes = new DefaultListModel<>();
        clientes = new JList<>(modelClientes);
        
        DefaultListModel<Ingrediente> modelIngrediente = new DefaultListModel<>();
        ingredientes = new JList<>(modelIngrediente);
        
        
        DefaultListModel<Encomenda> modelEncomenda = new DefaultListModel<>();
        encomendas = new JList<>(modelEncomenda);
        
        this.addWindowListener(new atualizaDados(this));
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
        this.usuario = usuario;
        
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
        registrarClienteBtn.addActionListener(new registrarCliente(this));
        painelFuncoes.add(registrarClienteBtn);
        
        JButton registrarEncomendaBtn;
        registrarEncomendaBtn = new JButton();
        registrarEncomendaBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        registrarEncomendaBtn.setBackground(new Color(239,186,237));
        registrarEncomendaBtn.setBorderPainted(false);
        registrarEncomendaBtn.setIcon(imagemRegistraEncomenda);
        registrarEncomendaBtn.addActionListener(new registrarEncomenda(this));
        painelFuncoes.add(registrarEncomendaBtn);
        
       
        JButton registrarIngredienteBtn;
        registrarIngredienteBtn = new JButton();
        registrarIngredienteBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        registrarIngredienteBtn.setBackground(new Color(239,186,237));
        registrarIngredienteBtn.setBorderPainted(false);
        registrarIngredienteBtn.setIcon(imagemRegistraIngrediente);
        registrarIngredienteBtn.addActionListener(new registrarIngrediente(this));
        painelFuncoes.add(registrarIngredienteBtn);
        
        JButton consultarGastoLucroBtn;
        consultarGastoLucroBtn = new JButton();
        consultarGastoLucroBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        consultarGastoLucroBtn.setBackground(new Color(239,186,237));
        consultarGastoLucroBtn.setBorderPainted(false);
        consultarGastoLucroBtn.setIcon(imagemGastoLucro);
        consultarGastoLucroBtn.addActionListener(new consultarGastoLucro(this));
        painelFuncoes.add(consultarGastoLucroBtn);
        
        JButton relatorioEncomendaBtn;
        relatorioEncomendaBtn = new JButton();
        relatorioEncomendaBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        relatorioEncomendaBtn.setBackground(new Color(239,186,237));
        relatorioEncomendaBtn.setBorderPainted(false);
        relatorioEncomendaBtn.setIcon(imagemRelatorio);
        relatorioEncomendaBtn.addActionListener(new relatorio(this));
        painelFuncoes.add(relatorioEncomendaBtn);
        
        JButton calendarioBtn;
        calendarioBtn = new JButton();
        calendarioBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        calendarioBtn.setBackground(new Color(239,186,237));
        calendarioBtn.setBorderPainted(false);
        calendarioBtn.setIcon(imagemCalendario);
        calendarioBtn.addActionListener(new calendario(this));
        painelFuncoes.add(calendarioBtn);
        
        
        this.painelUsuario.add(painelFuncoes, BorderLayout.CENTER);
    }
    
    public void telaRegistraEncomenda()
    {
        visibilidadeTelaUsuario();
        //this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelRegistraEncomenda = new JPanel();
        this.painelRegistraEncomenda.setLayout(new BorderLayout());
        this.painelRegistraEncomenda.setBackground(new Color(239,186,237));
        
        telaRegistraEncomendaAux();
        
        this.add(this.painelRegistraEncomenda);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaRegistraEncomendaAux()
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
        JLabel null10 = new JLabel();
        JLabel null11 = new JLabel();
        JLabel null12 = new JLabel();
        
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,3));
        this.painelRegistraEncomenda.add(sairBtn,BorderLayout.WEST);
        
        JButton cadastrarBtn;
        cadastrarBtn = new JButton("",imagemSetaLogin);
        cadastrarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        cadastrarBtn.setBackground(new Color(106,64,24));
        cadastrarBtn.setBorderPainted(false);
        cadastrarBtn.addActionListener(new cadastrar(this,1));
        this.painelRegistraEncomenda.add(cadastrarBtn,BorderLayout.EAST);
        
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new BorderLayout());
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
        JPanel painelFuncoesEntrega;
        painelFuncoesEntrega = new JPanel();
        painelFuncoesEntrega.setBackground(new Color(239,186,237));
        painelFuncoesEntrega.setLayout(new GridLayout(0,2));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
        JPanel painelDataPedido;
        painelDataPedido = new JPanel();
        painelDataPedido.setBackground(new Color(239,186,237));
        painelDataPedido.setLayout(new GridLayout(0,4));
        
        JLabel DataPedido = new JLabel("Pedido:", SwingConstants.CENTER);
        DataPedido.setFont(new Font("Arial", Font.PLAIN, 20));
        painelDataPedido.add(DataPedido);
        cadastrarDataPedidoDia = new JTextField(2);
        cadastrarDataPedidoDia.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataPedido.add(cadastrarDataPedidoDia);
        
        cadastrarDataPedidoMes = new JTextField(2);
        cadastrarDataPedidoMes.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataPedido.add(cadastrarDataPedidoMes);
        
        cadastrarDataPedidoAno = new JTextField(4);
        cadastrarDataPedidoAno.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataPedido.add(cadastrarDataPedidoAno);
        
        painelFuncoesEntrega.add(painelDataPedido);
        
        clientes = new JList(usuario.getClientes().toArray());
        clientes.setVisible(true);
        clientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //clientes.addListSelectionListener(new InfoListaCliente(this, aluno, 1));
        
        painelFuncoesEntrega.add(new JScrollPane(clientes));
        
        JPanel painelDataEntrega;
        painelDataEntrega = new JPanel();
        painelDataEntrega.setBackground(new Color(239,186,237));
        painelDataEntrega.setLayout(new GridLayout(0,4));
        
        JLabel DataEntrega = new JLabel("Entrega:", SwingConstants.CENTER);
        DataEntrega.setFont(new Font("Arial", Font.PLAIN, 19));
        painelDataEntrega.add(DataEntrega);
        cadastrarDataEntregaDia = new JTextField(2);
        cadastrarDataEntregaDia.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataEntrega.add(cadastrarDataEntregaDia);
        
        cadastrarDataEntregaMes = new JTextField(2);
        cadastrarDataEntregaMes.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataEntrega.add(cadastrarDataEntregaMes);
        
        cadastrarDataEntregaAno = new JTextField(4);
        cadastrarDataEntregaAno.setFont(new Font("Arial", Font.PLAIN, 50));
        painelDataEntrega.add(cadastrarDataEntregaAno);
        
        painelFuncoesEntrega.add(painelDataEntrega);
        painelFuncoesEntrega.add(null1);
        
        
        JPanel painelFuncoesProduto;
        painelFuncoesProduto = new JPanel();
        painelFuncoesProduto.setBackground(new Color(239,186,237));
        painelFuncoesProduto.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
              
        painelFuncoes.add(painelFuncoesEntrega,BorderLayout.NORTH);
        painelFuncoes.add(painelFuncoesProduto,BorderLayout.SOUTH);
        this.painelRegistraEncomenda.add(painelFuncoes,BorderLayout.CENTER);
        
    }
    
    public void telaRegistraCliente()
    {
        visibilidadeTelaUsuario();
        //this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelRegistraCliente = new JPanel();
        this.painelRegistraCliente.setLayout(new BorderLayout());
        this.painelRegistraCliente.setBackground(new Color(239,186,237));
        
        telaRegistraClienteAux();
        
        this.add(this.painelRegistraCliente);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaRegistraClienteAux()
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
        JLabel null10 = new JLabel();
        JLabel null11 = new JLabel();
        JLabel null12 = new JLabel();
        
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,2));
        this.painelRegistraCliente.add(sairBtn,BorderLayout.WEST);
        
        JButton cadastrarBtn;
        cadastrarBtn = new JButton("",imagemSetaLogin);
        cadastrarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        cadastrarBtn.setBackground(new Color(106,64,24));
        cadastrarBtn.setBorderPainted(false);
        cadastrarBtn.addActionListener(new cadastrar(this,1));
        this.painelRegistraCliente.add(cadastrarBtn,BorderLayout.EAST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
        painelFuncoes.add(null3);
        painelFuncoes.add(null4);
        painelFuncoes.add(null5);
        
        JLabel Nome = new JLabel("Nome:", SwingConstants.CENTER);
        Nome.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(Nome);
        cadastrarNomeCliente = new JTextField(100);
        cadastrarNomeCliente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarNomeCliente);
        painelFuncoes.add(null0);
        
        painelFuncoes.add(null6);
        painelFuncoes.add(null7);
        painelFuncoes.add(null8);
        
        JLabel Telefone = new JLabel("Telefone:", SwingConstants.CENTER);
        Telefone.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(Telefone);
        cadastrarTelefoneCliente = new JTextField(100);
        cadastrarTelefoneCliente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarTelefoneCliente);
        painelFuncoes.add(null1);
        
        painelFuncoes.add(null9);
        painelFuncoes.add(null10);
        painelFuncoes.add(null11);
        
        JLabel Endereco = new JLabel("Endereço:", SwingConstants.CENTER);
        Endereco.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(Endereco);
        cadastrarEnderecoCliente = new JTextField(100);
        cadastrarEnderecoCliente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarEnderecoCliente);
        painelFuncoes.add(null2);
        
        painelFuncoes.add(null12);
        
        this.painelRegistraCliente.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public void telaRegistraIngrediente()
    {
        visibilidadeTelaUsuario();
        //this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelRegistraIngrediente = new JPanel();
        this.painelRegistraIngrediente.setLayout(new BorderLayout());
        this.painelRegistraIngrediente.setBackground(new Color(239,186,237));
        
        telaRegistraIngredienteAux();
        
        this.add(this.painelRegistraIngrediente);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaRegistraIngredienteAux()
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
        JLabel null10 = new JLabel();
        JLabel null11 = new JLabel();
        JLabel null12 = new JLabel();
        
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,4));
        this.painelRegistraIngrediente.add(sairBtn,BorderLayout.WEST);
        
        JButton cadastrarBtn;
        cadastrarBtn = new JButton("",imagemSetaLogin);
        cadastrarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        cadastrarBtn.setBackground(new Color(106,64,24));
        cadastrarBtn.setBorderPainted(false);
        cadastrarBtn.addActionListener(new cadastrar(this,3));
        this.painelRegistraIngrediente.add(cadastrarBtn,BorderLayout.EAST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        
        painelFuncoes.add(null3);
        painelFuncoes.add(null4);
        painelFuncoes.add(null5);
        
        JLabel Nome = new JLabel("Nome:", SwingConstants.CENTER);
        Nome.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(Nome);
        cadastrarNomeIngrediente = new JTextField(100);
        cadastrarNomeIngrediente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarNomeIngrediente);
        painelFuncoes.add(null0);
        
        painelFuncoes.add(null6);
        painelFuncoes.add(null7);
        painelFuncoes.add(null8);
        
        JLabel Telefone = new JLabel("Valor:", SwingConstants.CENTER);
        Telefone.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(Telefone);
        cadastrarValorIngrediente = new JTextField(100);
        cadastrarValorIngrediente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarValorIngrediente);
        painelFuncoes.add(null1);
        
        painelFuncoes.add(null9);
        painelFuncoes.add(null10);
        painelFuncoes.add(null11);
        
        JLabel Endereco = new JLabel("Quantidade:", SwingConstants.CENTER);
        Endereco.setFont(new Font("Arial", Font.PLAIN, 46));
        painelFuncoes.add(Endereco);
        cadastrarQuantidadeIngrediente = new JTextField(100);
        cadastrarQuantidadeIngrediente.setFont(new Font("Arial", Font.PLAIN, 50));
        painelFuncoes.add(cadastrarQuantidadeIngrediente);
        painelFuncoes.add(null2);
        
        painelFuncoes.add(null12);
        
        this.painelRegistraIngrediente.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public void telaConsultaGastoLucro()
    {
        visibilidadeTelaUsuario();
        //this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelConsultaGastoLucro = new JPanel();
        this.painelConsultaGastoLucro.setLayout(new BorderLayout());
        this.painelConsultaGastoLucro.setBackground(new Color(239,186,237));
        
        telaConsultaGastoLucroAux();
        
        this.add(this.painelConsultaGastoLucro);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaConsultaGastoLucroAux()
    {
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,5));
        this.painelConsultaGastoLucro.add(sairBtn,BorderLayout.WEST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        this.painelConsultaGastoLucro.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public void telaRelatorio()
    {
        visibilidadeTelaUsuario();
        //this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelRelatorio = new JPanel();
        this.painelRelatorio.setLayout(new BorderLayout());
        this.painelRelatorio.setBackground(new Color(239,186,237));
        
        telaRelatorioAux();
        
        this.add(this.painelRelatorio);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaRelatorioAux()
    {
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,6));
        this.painelRelatorio.add(sairBtn,BorderLayout.WEST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        this.painelRelatorio.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public void telaCalendario()
    {
        visibilidadeTelaUsuario();
        //this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelCalendario = new JPanel();
        this.painelCalendario.setLayout(new BorderLayout());
        this.painelCalendario.setBackground(new Color(239,186,237));
        
        telaCalendarioAux();
        
        this.add(this.painelCalendario);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void telaCalendarioAux()
    {
        JButton sairBtn;
        sairBtn = new JButton("",imagemSetaSair);
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        sairBtn.setBackground(new Color(106,64,24));
        sairBtn.setBorderPainted(false);
        sairBtn.addActionListener(new Sair(this,7));
        this.painelCalendario.add(sairBtn,BorderLayout.WEST);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setBackground(new Color(239,186,237));
        painelFuncoes.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        this.painelCalendario.add(painelFuncoes,BorderLayout.CENTER);
    }
    
    public static void main(String[] args) 
    {
        Tela tela = new Tela();
        tela.telaPrincipal();
        tela.pack();
    }

    
    //get
    public Usuario getUsuario()
    {
        return this.usuario;
    }
    
    public JPasswordField getSenha()
    {
        return this.senha;
    }
    
    public JTextField getCadastrarNomeCliente() 
    {
        return cadastrarNomeCliente;
    }
    
    public JTextField getCadastrarTelefoneCliente() 
    {
        return cadastrarTelefoneCliente;
    }

    public JTextField getCadastrarEnderecoCliente() 
    {
        return cadastrarEnderecoCliente;
    }
    
    public JTextField getCadastrarNomeIngrediente() 
    {
        return cadastrarNomeIngrediente;
    }
    
    public JTextField getCadastrarQuantidadeIngrediente() 
    {
        return cadastrarQuantidadeIngrediente;
    }
    
    public JTextField getCadastrarValorIngrediente() 
    {
        return cadastrarValorIngrediente;
    }

    public JTextField getCadastrarDataPedidoDia() 
    {
        return cadastrarDataPedidoDia;
    }

    public JTextField getCadastrarDataPedidoMes() 
    {
        return cadastrarDataPedidoMes;
    }

    public JTextField getCadastrarDataPedidoAno() 
    {
        return cadastrarDataPedidoAno;
    }

    public JList<Cliente> getClientes() 
    {
        return clientes;
    }

    public JList<Ingrediente> getIngredientes() 
    {
        return ingredientes;
    }

    public JList<Encomenda> getEncomendas() 
    {
        return encomendas;
    }
    
    
    
    
    //set
    public void setSenha(JPasswordField senha)
    {
        this.senha = senha;
    }
    
    public void setCadastrarNomeCliente(JTextField cadastrarNomeCliente) 
    {
        this.cadastrarNomeCliente = cadastrarNomeCliente;
    }
    
    public void setCadastrarTelefoneCliente(JTextField cadastrarTelefoneCliente) 
    {
        this.cadastrarTelefoneCliente = cadastrarTelefoneCliente;
    }
    
    public void setCadastrarEnderecoCliente(JTextField cadastrarEnderecoCliente) 
    {
        this.cadastrarEnderecoCliente = cadastrarEnderecoCliente;
    }

    public void setCadastrarNomeIngrediente(JTextField cadastrarNomeIngrediente) 
    {
        this.cadastrarNomeIngrediente = cadastrarNomeIngrediente;
    }

    public void setCadastrarValorIngrediente(JTextField cadastrarValorIngrediente) 
    {
        this.cadastrarValorIngrediente = cadastrarValorIngrediente;
    }

    public void setCadastrarQuantidadeIngrediente(JTextField cadastrarQuantidadeIngrediente) 
    {
        this.cadastrarQuantidadeIngrediente = cadastrarQuantidadeIngrediente;
    }

    public void setCadastrarDataPedidoDia(JTextField cadastrarDataPedidoDia) 
    {
        this.cadastrarDataPedidoDia = cadastrarDataPedidoDia;
    }

    public void setCadastrarDataPedidoMes(JTextField cadastrarDataPedidoMes) 
    {
        this.cadastrarDataPedidoMes = cadastrarDataPedidoMes;
    }

    public void setCadastrarDataPedidoAno(JTextField cadastrarDataPedidoAno) 
    {
        this.cadastrarDataPedidoAno = cadastrarDataPedidoAno;
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
    
    public void visibilidadeTelaRegistraIngrediente()
    {
        this.painelRegistraIngrediente.setVisible(false);
    }
    
    public void visibilidadeTelaConsultaGastoLucro()
    {
        this.painelConsultaGastoLucro.setVisible(false);
    }
    
    public void visibilidadeTelaRelatorio()
    {
        this.painelRelatorio.setVisible(false);
    }
    
    public void visibilidadeTelaCalendario()
    {
        this.painelCalendario.setVisible(false);
    }
}
