
package codigo;
//bibliotecas usadas no projeto
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Form_Main extends javax.swing.JFrame {
    ArrayList <Person> passangerList = new ArrayList();//lista do tipo pessoa
    ArrayList<Seat> seatList = new ArrayList();//lista do tipo assento
    String passHolder;//variavel auxiliar para ajudar na validacao de Log-in do usuario e segurar seu passporte para usos diversos
    int positionHolder;//variavel auxiliar que segura a posicao do usuario na lista de pessoas
    int ageHolder;//variavel auxiliar que segura a idade da pessoa logada para validacoes
    Transport transport = new Transport();//variavel para manipular a classe transporte
  
       
    public Form_Main() {
        initComponents();
        //esse for instancia os assentos da classe Seat e atribui posicao a eles na lista de assento
         for(int i = 0;i<12;i++){
            Seat seat = new Seat(true); 
            seatList.add(i, seat);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Group_Seats = new javax.swing.ButtonGroup();
        Panel_Main = new javax.swing.JPanel();
        Panel_Welcome = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Btn_Welcome_Entrar = new javax.swing.JButton();
        Btn_Welcome_Cadastrar = new javax.swing.JButton();
        Panel_Login = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Text_Login_User = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Btn_Login_Voltar = new javax.swing.JButton();
        Btn_Login_Entrar = new javax.swing.JButton();
        Password_Login_Password = new javax.swing.JPasswordField();
        Panel_Register = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Btn_Register_Confirmar = new javax.swing.JButton();
        Btn_Register_Voltar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Text_Register_Name = new javax.swing.JTextField();
        Text_Register_Age = new javax.swing.JTextField();
        Password_Register_Password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Text_Register_Passport = new javax.swing.JTextField();
        Panel_User_Interface = new javax.swing.JPanel();
        Btn_A_11 = new javax.swing.JButton();
        Btn_B_11 = new javax.swing.JButton();
        Btn_C_11 = new javax.swing.JButton();
        Btn_D_11 = new javax.swing.JButton();
        Btn_E_11 = new javax.swing.JButton();
        Btn_F_11 = new javax.swing.JButton();
        Btn_A_10 = new javax.swing.JButton();
        Btn_B_10 = new javax.swing.JButton();
        Btn_C_10 = new javax.swing.JButton();
        Btn_D_10 = new javax.swing.JButton();
        Btn_E_10 = new javax.swing.JButton();
        Btn_F_10 = new javax.swing.JButton();
        Btn_User_Interface_Voltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Btn_User_Info = new javax.swing.JButton();
        Panel_Info = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Text_Info_Normal = new javax.swing.JTextField();
        Text_Info_Total = new javax.swing.JTextField();
        Text_Info_Prio = new javax.swing.JTextField();
        Text_Info_Adults = new javax.swing.JTextField();
        Text_Info_Elder = new javax.swing.JTextField();
        Text_Info_Underage = new javax.swing.JTextField();
        Text_Info_TotalPassanger = new javax.swing.JTextField();
        Btn_Info_voltar = new javax.swing.JButton();
        Btn_Info_Load = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(634, 351));

        Panel_Main.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Main.setLayout(new java.awt.CardLayout());

        Panel_Welcome.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/logo.PNG"))); // NOI18N

        Btn_Welcome_Entrar.setText("Entrar");
        Btn_Welcome_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Welcome_EntrarActionPerformed(evt);
            }
        });

        Btn_Welcome_Cadastrar.setText("Cadastrar");
        Btn_Welcome_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Welcome_CadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_WelcomeLayout = new javax.swing.GroupLayout(Panel_Welcome);
        Panel_Welcome.setLayout(Panel_WelcomeLayout);
        Panel_WelcomeLayout.setHorizontalGroup(
            Panel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_WelcomeLayout.createSequentialGroup()
                .addGroup(Panel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_WelcomeLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(Panel_WelcomeLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(Panel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Welcome_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Welcome_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        Panel_WelcomeLayout.setVerticalGroup(
            Panel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_WelcomeLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Btn_Welcome_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Btn_Welcome_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        Panel_Main.add(Panel_Welcome, "Welcome");

        Panel_Login.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        jLabel2.setText("Passaporte:");

        jLabel3.setText("Password:");

        Btn_Login_Voltar.setText("Voltar");
        Btn_Login_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Login_VoltarActionPerformed(evt);
            }
        });

        Btn_Login_Entrar.setText("Entrar");
        Btn_Login_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Login_EntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_LoginLayout = new javax.swing.GroupLayout(Panel_Login);
        Panel_Login.setLayout(Panel_LoginLayout);
        Panel_LoginLayout.setHorizontalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(72, 72, 72)
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Login_User, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password_Login_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btn_Login_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Login_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        Panel_LoginLayout.setVerticalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Login_User, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Login_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(Btn_Login_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Login_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        Panel_Main.add(Panel_Login, "Login");

        Panel_Register.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        jLabel4.setText("Password:");

        jLabel5.setText("Idade:");

        Btn_Register_Confirmar.setText("Confirmar");
        Btn_Register_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Register_ConfirmarActionPerformed(evt);
            }
        });

        Btn_Register_Voltar.setText("Voltar");
        Btn_Register_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Register_VoltarActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome:");

        Text_Register_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Register_NameActionPerformed(evt);
            }
        });

        jLabel7.setText("anos");

        jLabel9.setText("Passaporte:");

        javax.swing.GroupLayout Panel_RegisterLayout = new javax.swing.GroupLayout(Panel_Register);
        Panel_Register.setLayout(Panel_RegisterLayout);
        Panel_RegisterLayout.setHorizontalGroup(
            Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_RegisterLayout.createSequentialGroup()
                .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_RegisterLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(62, 62, 62)
                        .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Register_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_RegisterLayout.createSequentialGroup()
                                .addComponent(Text_Register_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel7))
                            .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Text_Register_Passport, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Password_Register_Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))))
                    .addGroup(Panel_RegisterLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_Register_Confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(Btn_Register_Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        Panel_RegisterLayout.setVerticalGroup(
            Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegisterLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Register_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Register_Age, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegisterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Text_Register_Passport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(65, 65, 65))
                    .addGroup(Panel_RegisterLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(Panel_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Password_Register_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Btn_Register_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Btn_Register_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        Panel_Main.add(Panel_Register, "Register");

        Panel_User_Interface.setBackground(new java.awt.Color(255, 255, 255));
        Panel_User_Interface.setLayout(null);

        Btn_A_11.setBackground(new java.awt.Color(255, 255, 255));
        Btn_A_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png"))); // NOI18N
        Btn_A_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_A_11MouseClicked(evt);
            }
        });
        Btn_A_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A_11ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_A_11);
        Btn_A_11.setBounds(412, 227, 16, 16);

        Btn_B_11.setBackground(new java.awt.Color(255, 255, 255));
        Btn_B_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png"))); // NOI18N
        Btn_B_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_B_11MouseClicked(evt);
            }
        });
        Btn_B_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B_11ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_B_11);
        Btn_B_11.setBounds(412, 212, 16, 16);

        Btn_C_11.setBackground(new java.awt.Color(255, 255, 255));
        Btn_C_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png"))); // NOI18N
        Btn_C_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_C_11MouseClicked(evt);
            }
        });
        Btn_C_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C_11ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_C_11);
        Btn_C_11.setBounds(412, 198, 16, 16);

        Btn_D_11.setBackground(new java.awt.Color(255, 255, 255));
        Btn_D_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png"))); // NOI18N
        Btn_D_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_D_11MouseClicked(evt);
            }
        });
        Btn_D_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D_11ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_D_11);
        Btn_D_11.setBounds(412, 161, 16, 16);

        Btn_E_11.setBackground(new java.awt.Color(255, 255, 255));
        Btn_E_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png"))); // NOI18N
        Btn_E_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_E_11MouseClicked(evt);
            }
        });
        Btn_E_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E_11ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_E_11);
        Btn_E_11.setBounds(412, 146, 16, 16);

        Btn_F_11.setBackground(new java.awt.Color(255, 255, 255));
        Btn_F_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png"))); // NOI18N
        Btn_F_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_F_11MouseClicked(evt);
            }
        });
        Btn_F_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_F_11ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_F_11);
        Btn_F_11.setBounds(412, 131, 16, 16);

        Btn_A_10.setBackground(new java.awt.Color(255, 255, 255));
        Btn_A_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_A.png"))); // NOI18N
        Btn_A_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_A_10MouseClicked(evt);
            }
        });
        Btn_A_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_A_10ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_A_10);
        Btn_A_10.setBounds(388, 227, 16, 16);

        Btn_B_10.setBackground(new java.awt.Color(255, 255, 255));
        Btn_B_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_B.png"))); // NOI18N
        Btn_B_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_B_10MouseClicked(evt);
            }
        });
        Btn_B_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_B_10ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_B_10);
        Btn_B_10.setBounds(388, 212, 16, 15);

        Btn_C_10.setBackground(new java.awt.Color(255, 255, 255));
        Btn_C_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_C.png"))); // NOI18N
        Btn_C_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_C_10MouseClicked(evt);
            }
        });
        Btn_C_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_C_10ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_C_10);
        Btn_C_10.setBounds(388, 196, 16, 16);

        Btn_D_10.setBackground(new java.awt.Color(255, 255, 255));
        Btn_D_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_D.png"))); // NOI18N
        Btn_D_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_D_10MouseClicked(evt);
            }
        });
        Btn_D_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_D_10ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_D_10);
        Btn_D_10.setBounds(388, 161, 16, 16);

        Btn_E_10.setBackground(new java.awt.Color(255, 255, 255));
        Btn_E_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_E.png"))); // NOI18N
        Btn_E_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_E_10MouseClicked(evt);
            }
        });
        Btn_E_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_E_10ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_E_10);
        Btn_E_10.setBounds(388, 145, 16, 15);

        Btn_F_10.setBackground(new java.awt.Color(255, 255, 255));
        Btn_F_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_F.png"))); // NOI18N
        Btn_F_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_F_10MouseClicked(evt);
            }
        });
        Btn_F_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_F_10ActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_F_10);
        Btn_F_10.setBounds(388, 130, 16, 16);

        Btn_User_Interface_Voltar.setText("Voltar");
        Btn_User_Interface_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_User_Interface_VoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_User_Interface_VoltarMouseEntered(evt);
            }
        });
        Btn_User_Interface_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_User_Interface_VoltarActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_User_Interface_Voltar);
        Btn_User_Interface_Voltar.setBounds(270, 570, 100, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/editado.jpg"))); // NOI18N
        Panel_User_Interface.add(jLabel8);
        jLabel8.setBounds(0, 37, 634, 351);
        jLabel8.getAccessibleContext().setAccessibleDescription("");

        Btn_User_Info.setText("Info");
        Btn_User_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_User_InfoActionPerformed(evt);
            }
        });
        Panel_User_Interface.add(Btn_User_Info);
        Btn_User_Info.setBounds(270, 523, 100, 30);

        Panel_Main.add(Panel_User_Interface, "User_Interface");

        Panel_Info.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        Text_Info_Normal.setEditable(false);
        Text_Info_Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Info_NormalActionPerformed(evt);
            }
        });

        Text_Info_Total.setEditable(false);
        Text_Info_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Info_TotalActionPerformed(evt);
            }
        });

        Text_Info_Prio.setEditable(false);
        Text_Info_Prio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Info_PrioActionPerformed(evt);
            }
        });

        Text_Info_Adults.setEditable(false);
        Text_Info_Adults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Info_AdultsActionPerformed(evt);
            }
        });

        Text_Info_Elder.setEditable(false);
        Text_Info_Elder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Info_ElderActionPerformed(evt);
            }
        });

        Text_Info_Underage.setEditable(false);
        Text_Info_Underage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Info_UnderageActionPerformed(evt);
            }
        });

        Text_Info_TotalPassanger.setEditable(false);
        Text_Info_TotalPassanger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Info_TotalPassangerActionPerformed(evt);
            }
        });

        Btn_Info_voltar.setText("Voltar");
        Btn_Info_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Info_voltarActionPerformed(evt);
            }
        });

        Btn_Info_Load.setText("Load");
        Btn_Info_Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Info_LoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_InfoLayout = new javax.swing.GroupLayout(Panel_Info);
        Panel_Info.setLayout(Panel_InfoLayout);
        Panel_InfoLayout.setHorizontalGroup(
            Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_InfoLayout.createSequentialGroup()
                .addGroup(Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_InfoLayout.createSequentialGroup()
                                .addComponent(Text_Info_Prio, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Text_Info_Adults, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_InfoLayout.createSequentialGroup()
                                .addComponent(Text_Info_Normal, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Text_Info_Underage, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_InfoLayout.createSequentialGroup()
                                .addComponent(Text_Info_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Text_Info_Elder, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Panel_InfoLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(Text_Info_TotalPassanger, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Panel_InfoLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(Btn_Info_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_InfoLayout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(Btn_Info_Load, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE)))
        );
        Panel_InfoLayout.setVerticalGroup(
            Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InfoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Info_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Info_Elder, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Info_Prio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Info_Adults, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Info_Underage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Info_Normal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(Text_Info_TotalPassanger, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(Btn_Info_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InfoLayout.createSequentialGroup()
                    .addContainerGap(533, Short.MAX_VALUE)
                    .addComponent(Btn_Info_Load, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(102, 102, 102)))
        );

        Panel_Main.add(Panel_Info, "Panel_Info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Welcome_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Welcome_EntrarActionPerformed
        //chama a tela de login quando o botao eh clicado
        CardLayout cl = (CardLayout) Panel_Main.getLayout();
        cl.show(Panel_Main, "Login");
    }//GEN-LAST:event_Btn_Welcome_EntrarActionPerformed

    private void Btn_Login_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Login_VoltarActionPerformed
        //chama a tela inicial do programa quando o botao eh clicado
        CardLayout cl = (CardLayout) Panel_Main.getLayout();
        cl.show(Panel_Main, "Welcome");
    }//GEN-LAST:event_Btn_Login_VoltarActionPerformed

    private void Btn_Welcome_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Welcome_CadastrarActionPerformed
        //chama a tela de registro do usuario quando o botao eh clicado
        CardLayout cl = (CardLayout) Panel_Main.getLayout();
        cl.show(Panel_Main, "Register");
    }//GEN-LAST:event_Btn_Welcome_CadastrarActionPerformed

    private void Btn_Register_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Register_VoltarActionPerformed
         //chama a tela inicial do programa quando o botao eh clicado
        CardLayout cl = (CardLayout) Panel_Main.getLayout();
        cl.show(Panel_Main, "Welcome");
    }//GEN-LAST:event_Btn_Register_VoltarActionPerformed

    private void Btn_Register_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Register_ConfirmarActionPerformed
    boolean exist = false;//variavel usada para verificar se um passageiro ja existe na lista ou nao
        //esse if serve para ver se o usuario preencheu todos os campos do registro
        if(!Text_Register_Name.getText().equals("") && !Text_Register_Age.getText().equals("")&& !Password_Register_Password.getText().equals("") && !Text_Register_Passport.getText().equals("")){
        int aux = Integer.parseInt(Text_Register_Age.getText()); //transforma o texto(String) recebido em int para pode ser manipulado
        if(aux >= 65){//caso seja idoso
            //cria um passageiro do tipo Elder(idoso) que recebe os parametros
            Person passanger = new Elder(true,Text_Register_Name.getText(), Text_Register_Age.getText(), Password_Register_Password.getText(), true, Text_Register_Passport.getText());
            for(int j = 0; j<passangerList.size(); j++){//checa se o passageiro criado existe na lista
                if(passangerList.get(j).getPassport().equals(passanger.getPassport()))
                    exist = true;
            }
            if(!exist){//caso nao exista, cria um novo passageiro na lista
                passangerList.add(passanger);
                JOptionPane.showMessageDialog(this, "Conta criada com sucesso!");
                //limpa os campos preenchidos e volta para a tela inicial do programa
                CardLayout cl = (CardLayout) Panel_Main.getLayout();
                cl.show(Panel_Main, "Welcome");
                Text_Register_Name.setText("");
                Text_Register_Age.setText("");
                Password_Register_Password.setText("");
                Text_Register_Passport.setText("");
            }            
            else{//caso o passageiro ja exista, manda erro
                JOptionPane.showMessageDialog(this, "Passaporte já registrado");
                Text_Register_Name.setText("");
                Text_Register_Age.setText("");
                Password_Register_Password.setText("");
                Text_Register_Passport.setText("");
            }          
        }
        else if(aux < 18){//caso seja menor de idade
            int answer = JOptionPane.showConfirmDialog(this, "Possui autorização de seu responsável?");//pede autorizacao de um responsavel
            if(answer == JOptionPane.YES_OPTION){//caso tenha a autorizacao, cria o passageiro do tipo Underage(menor de idade)
                Person passanger = new Underage(true,Text_Register_Name.getText(), Text_Register_Age.getText(), Password_Register_Password.getText(),true,Text_Register_Passport.getText());
                for(int j = 0; j<passangerList.size(); j++){
                    if(passangerList.get(j).getPassport().equals(passanger.getPassport()))
                        exist = true;
                }
                if(!exist){
                    passangerList.add(passanger);
                    JOptionPane.showMessageDialog(this, "Conta criada com sucesso!");
                    CardLayout cl = (CardLayout) Panel_Main.getLayout();
                    cl.show(Panel_Main, "Welcome");
                    Text_Register_Name.setText("");
                    Text_Register_Age.setText("");
                    Password_Register_Password.setText("");
                    Text_Register_Passport.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Passaporte já registrado");
                    Text_Register_Name.setText("");
                    Text_Register_Age.setText("");
                    Password_Register_Password.setText("");
                    Text_Register_Passport.setText("");
                }    
            }
            else{//caso nao tenha autorizacao, mensagem de erro pedindo a autorizacao
                JOptionPane.showMessageDialog(this, "Menores de idade necessitam de autorização de um responsável");
                Text_Register_Name.setText("");
                Text_Register_Age.setText("");
                Password_Register_Password.setText("");
                Text_Register_Passport.setText("");
            }
        }
        else{//caso seja adulto, cria um passageiro do tipo adulto e o adiciona na lista
            if(!Text_Register_Name.getText().equals("") && !Text_Register_Age.getText().equals("") && !Password_Register_Password.getText().equals("") && !Text_Register_Passport.getText().equals("")){
                Person passanger = new Adult(Text_Register_Name.getText(), Text_Register_Age.getText(), Password_Register_Password.getText(), true,Text_Register_Passport.getText());
                for(int j = 0; j<passangerList.size(); j++){
                    if(passangerList.get(j).getPassport().equals(passanger.getPassport()))
                        exist = true;
                }
                if(!exist){
                    passangerList.add(passanger);      
                    JOptionPane.showMessageDialog(this, "Conta criada com sucesso!");
                    CardLayout cl = (CardLayout) Panel_Main.getLayout();
                    cl.show(Panel_Main, "Welcome");
                    Text_Register_Name.setText("");
                    Text_Register_Age.setText("");
                    Password_Register_Password.setText("");
                    Text_Register_Passport.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Passaporte já registrado");
                    Text_Register_Name.setText("");
                    Text_Register_Age.setText("");
                    Password_Register_Password.setText("");
                    Text_Register_Passport.setText("");
            }    
            }
        }       
    }    
    else{//caso algum campo nao seja preenchido, mensagem de erro
        JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
    }
    }//GEN-LAST:event_Btn_Register_ConfirmarActionPerformed

    private void Btn_Login_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Login_EntrarActionPerformed
    //botao da tela de Log-in para entrar na tela do usuario com passaporte e senha    
        for(int i = 0; i < passangerList.size();i++){//percorre a lista
            if(Text_Login_User.getText().equals(passangerList.get(i).getPassport())){//confere se o passaporte esta certo
                if(Password_Login_Password.getText().equals(passangerList.get(i).getPassword())){//confere se a senha esta certa
                    passHolder = Text_Login_User.getText();//segura o passaporte do usuario logado
                    positionHolder=i;//segura a posicao na lista do usuario logado
                    int auxAge = Integer.parseInt(passangerList.get(i).getAge());//converte a String para int
                    ageHolder = auxAge;//segura a idade do passageiro logado
                    JOptionPane.showMessageDialog(this, passangerList.get(i).getName()+" bem-vindo!");
                    CardLayout cl = (CardLayout) Panel_Main.getLayout();
                    cl.show(Panel_Main, "User_Interface");
                    Text_Login_User.setText("");
                    Password_Login_Password.setText("");
                    break;//esse break faz com que o for pare de checar outras contas caso ache a correta
                }
                else{//quando as infos nao estao corretas manda a mensagem de erro e reseta os campos preenchidos
                                JOptionPane.showMessageDialog(this, "Password ou Passaporte inválidos!");
                                Text_Login_User.setText("");
                                Password_Login_Password.setText("");

                }
                
            }                
        }    
    }//GEN-LAST:event_Btn_Login_EntrarActionPerformed

    private void Text_Register_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Register_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Register_NameActionPerformed

    private void Btn_User_Interface_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_User_Interface_VoltarActionPerformed
        //botao "voltar" da pagina do usuario
        CardLayout cl = (CardLayout) Panel_Main.getLayout();
        cl.show(Panel_Main, "Welcome");
    }//GEN-LAST:event_Btn_User_Interface_VoltarActionPerformed

    private void Btn_User_Interface_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_User_Interface_VoltarMouseClicked
    }//GEN-LAST:event_Btn_User_Interface_VoltarMouseClicked

    private void Btn_User_Interface_VoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_User_Interface_VoltarMouseEntered

    }//GEN-LAST:event_Btn_User_Interface_VoltarMouseEntered

    private void Btn_A_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A_11ActionPerformed

    }//GEN-LAST:event_Btn_A_11ActionPerformed

    private void Btn_A_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_A_11MouseClicked
    //assento na posicao A 11        
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(1).isFree ){//checa se o passageiro ja esta sentado e se o assento clicado esta disponivel
                Btn_A_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));//muda a imagem do botao
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){//caso confirme que quer reservar tal assento
                    Btn_A_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    //cria um assento do tipo Seat na lista de assentos e passa o passageiro como parametro usando a vatiavel auxilar previamente declarada
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(1, seat);//muda atributos da lista
                    passangerList.get(positionHolder).setCanSit(false);//passageiro nao mais pode sentar
                    transport.setSeatTotal(transport.getSeatTotal()-1);//diminui o total de assentos
                    transport.setSeatNormal(transport.getSeatNormal()-1);//diminui o total de assentos comuns
                    
                }
                else{
                    Btn_A_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png")));
                }
            }
            else{                
                if(seatList.get(1).isFree == false){//erro ao tentar reservar um assento nao disponivel. Mostra quem esta la
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(1).person.getName()+"\nIdade:"+seatList.get(1).person.getAge());
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){//erro ao tentar reservar mais do que um assento
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }
    }//GEN-LAST:event_Btn_A_11MouseClicked

    private void Btn_B_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_B_11MouseClicked
        //botao do assento B_11, segue como o anterior
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(3).isFree ){
                Btn_B_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_B_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(3, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatNormal(transport.getSeatNormal()-1);
                }
                else{
                    Btn_B_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png")));
                }
            }
            else{                
                if(seatList.get(3).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(3).person.getName()+"\nIdade:"+seatList.get(3).person.getAge());
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }        
    }//GEN-LAST:event_Btn_B_11MouseClicked

    private void Btn_B_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_B_11ActionPerformed

    private void Btn_C_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_C_11MouseClicked
    //botao do assento C_11, segue como o anterior
            if(passangerList.get(positionHolder).getCanSit() && seatList.get(5).isFree ){
                Btn_C_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_C_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(5, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatNormal(transport.getSeatNormal()-1);
                }
                else{
                    Btn_C_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png")));
                }
            }
            else{                
                if(seatList.get(5).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(5).person.getName()+"\nIdade:"+seatList.get(5).person.getAge());
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }   
    }//GEN-LAST:event_Btn_C_11MouseClicked

    private void Btn_C_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_C_11ActionPerformed

    private void Btn_D_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_D_11MouseClicked
    //botao do assento D_11, segue como o anterior    
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(7).isFree ){
                Btn_D_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_D_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(7, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatNormal(transport.getSeatNormal()-1);                   
                }
                else{
                    Btn_D_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png")));
                }
            }
            else{                
                if(seatList.get(7).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(7).person.getName()+"\nIdade:"+seatList.get(7).person.getAge());
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }   
    }//GEN-LAST:event_Btn_D_11MouseClicked

    private void Btn_D_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_D_11ActionPerformed

    private void Btn_E_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_E_11MouseClicked
    //botao do assento E_11, segue como o anterior    
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(9).isFree ){
                Btn_E_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_E_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(9, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatNormal(transport.getSeatNormal()-1);                    
                }
                else{
                    Btn_E_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png")));
                }
            }
            else{                
                if(seatList.get(9).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(9).person.getName()+"\nIdade:"+seatList.get(9).person.getAge());
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }   
    }//GEN-LAST:event_Btn_E_11MouseClicked

    private void Btn_E_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_E_11ActionPerformed

    private void Btn_F_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_F_11MouseClicked
    //botao do assento F_11, segue como o anterior    
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(11).isFree ){
                Btn_F_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_F_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(11, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatNormal(transport.getSeatNormal()-1);                    
                }
                else{
                    Btn_F_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/freeseat.png")));
                }
            }
            else{                
                if(seatList.get(11).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(11).person.getName()+"\nIdade:"+seatList.get(11).person.getAge());
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }   
    }//GEN-LAST:event_Btn_F_11MouseClicked

    private void Btn_F_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_F_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_F_11ActionPerformed

    private void Btn_A_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_A_10MouseClicked
    //botao do assento A_10, segue como o anterior, mas checa se o passageiro eh idoso, por ser um assento prioritario           
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(0).isFree && ageHolder >= 65){//usa ageHolder para fazer a checagem da idade de quem esta logado
                Btn_A_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_A_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(0, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatPrio(transport.getSeatPrio()-1);//diminui o total de assentos prioritarios
                }
                else{
                    Btn_A_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_A.png")));
                }
            }
            else{                
                if(seatList.get(0).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(0).person.getName()+"\nIdade:"+seatList.get(0).person.getAge());
                }
                else if(ageHolder<65){
                    JOptionPane.showMessageDialog(this, "Esse assento é prioritário!"); 
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }
    }//GEN-LAST:event_Btn_A_10MouseClicked

    private void Btn_A_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_A_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_A_10ActionPerformed

    private void Btn_B_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_B_10MouseClicked
    //botao do assento B_10, segue como o anterior, eh prioritario tambem            
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(2).isFree && ageHolder >= 65){
                Btn_B_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_B_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(2, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatPrio(transport.getSeatPrio()-1);
                }
                else{
                    Btn_B_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_B.png")));
                }
            }
            else{                
                if(seatList.get(2).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(2).person.getName()+"\nIdade:"+seatList.get(2).person.getAge());
                }
                else if(ageHolder<65){
                    JOptionPane.showMessageDialog(this, "Esse assento é prioritário!"); 
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }
    }//GEN-LAST:event_Btn_B_10MouseClicked

    private void Btn_B_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_B_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_B_10ActionPerformed

    private void Btn_C_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_C_10MouseClicked
    //botao do assento C_10, segue como o anterior, eh prioritario tambem              
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(4).isFree && ageHolder >= 65){
                Btn_C_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_C_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(4, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatPrio(transport.getSeatPrio()-1);
                }
                else{
                    Btn_C_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_C.png")));
                }
            }
            else{                
                if(seatList.get(4).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(4).person.getName()+"\nIdade:"+seatList.get(4).person.getAge());
                }
                else if(ageHolder<65){
                    JOptionPane.showMessageDialog(this, "Esse assento é prioritário!"); 
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }
    }//GEN-LAST:event_Btn_C_10MouseClicked

    private void Btn_C_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_C_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_C_10ActionPerformed

    private void Btn_D_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_D_10MouseClicked
    //botao do assento D_10, segue como o anterior, eh prioritario tambem              
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(6).isFree && ageHolder >= 65){
                Btn_D_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_D_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(6, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatPrio(transport.getSeatPrio()-1);
                }
                else{
                    Btn_D_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_D.png")));
                }
            }
            else{                
                if(seatList.get(6).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(6).person.getName()+"\nIdade:"+seatList.get(6).person.getAge());
                }
                else if(ageHolder<65){
                    JOptionPane.showMessageDialog(this, "Esse assento é prioritário!"); 
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }
    }//GEN-LAST:event_Btn_D_10MouseClicked

    private void Btn_D_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_D_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_D_10ActionPerformed

    private void Btn_E_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_E_10MouseClicked
    //botao do assento E_10, segue como o anterior, eh prioritario tambem              
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(8).isFree && ageHolder >= 65){
                Btn_E_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_E_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(8, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatPrio(transport.getSeatNormal()-1);
                }
                else{
                    Btn_E_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_E.png")));
                }
            }
            else{                
                if(seatList.get(8).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(8).person.getName()+"\nIdade:"+seatList.get(8).person.getAge());
                }
                else if(ageHolder<65){
                    JOptionPane.showMessageDialog(this, "Esse assento é prioritário!"); 
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }
    }//GEN-LAST:event_Btn_E_10MouseClicked

    private void Btn_E_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_E_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_E_10ActionPerformed

    private void Btn_F_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_F_10MouseClicked
    //botao do assento F_10, segue como o anterior, eh prioritario tambem              
        if(passangerList.get(positionHolder).getCanSit() && seatList.get(10).isFree && ageHolder >= 65){
                Btn_F_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/selecionado.png")));
                int answer = JOptionPane.showConfirmDialog(this, "Deseja reservar esse assento?");
                if(answer == JOptionPane.YES_OPTION){
                    Btn_F_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/ocupado.png")));
                    Seat seat = new Seat(passangerList.get(positionHolder));
                    seatList.set(10, seat);
                    passangerList.get(positionHolder).setCanSit(false);
                    transport.setSeatTotal(transport.getSeatTotal()-1);
                    transport.setSeatPrio(transport.getSeatNormal()-1);
                }
                else{
                    Btn_F_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aviao_projeto/images/prefer_F.png")));
                }
            }
            else{                
                if(seatList.get(10).isFree == false){
                    JOptionPane.showMessageDialog(this, "Esse assento já foi reservado por:"+seatList.get(10).person.getName()+"\nIdade:"+seatList.get(10).person.getAge());
                }
                else if(ageHolder<65){
                    JOptionPane.showMessageDialog(this, "Esse assento é prioritário!"); 
                }
                else if(passangerList.get(positionHolder).getCanSit() == false){
                    JOptionPane.showMessageDialog(this, "Você já reservou seu assento!");
                }

            }
    }//GEN-LAST:event_Btn_F_10MouseClicked

    private void Btn_F_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_F_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_F_10ActionPerformed

    private void Text_Info_NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Info_NormalActionPerformed
      
    }//GEN-LAST:event_Text_Info_NormalActionPerformed

    private void Text_Info_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Info_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Info_TotalActionPerformed

    private void Text_Info_PrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Info_PrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Info_PrioActionPerformed

    private void Text_Info_AdultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Info_AdultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Info_AdultsActionPerformed

    private void Text_Info_ElderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Info_ElderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Info_ElderActionPerformed

    private void Text_Info_UnderageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Info_UnderageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Info_UnderageActionPerformed

    private void Btn_User_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_User_InfoActionPerformed
    //botao que leva para a tela Info   
        CardLayout cl = (CardLayout) Panel_Main.getLayout();
        cl.show(Panel_Main, "Panel_Info");
    }//GEN-LAST:event_Btn_User_InfoActionPerformed

    private void Text_Info_TotalPassangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Info_TotalPassangerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Info_TotalPassangerActionPerformed

    private void Btn_Info_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Info_voltarActionPerformed
    //botao da tela info que volta para Interface    
        CardLayout cl = (CardLayout) Panel_Main.getLayout();
        cl.show(Panel_Main, "User_Interface");
    }//GEN-LAST:event_Btn_Info_voltarActionPerformed

    private void Btn_Info_LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Info_LoadActionPerformed
    //botao que carrega as informacoes sobre assentos e passageiros
    int auxElder = 0;//contador de idosos
    int auxUnderage = 0;//contador de menores de idade
    int auxAdult = 0;//contado de adultos
    String num = Integer.toString(transport.getSeatTotal());//converte int para string para poder mostrar na tela
    Text_Info_Total.setText("Total de assentos disponíveis: "+num);//mostra o total de assentos escrito na tela
    num = Integer.toString(transport.getSeatPrio());
    Text_Info_Prio.setText("Assentos prioritários disponíveis: "+num);//mostra o total de assentos prioritarios escrito na tela
    num = Integer.toString(transport.getSeatNormal());
    Text_Info_Normal.setText("Assentos comuns disponíveis: "+num);//mostra o total de assentos comuns escrito na tela
    for(int i = 0; i<passangerList.size();i++){//percorre a lista contando o numero de idosos, de adultos e de menores de idade
        int ageCont = Integer.parseInt(passangerList.get(i).getAge());
        if(ageCont>=65){
            auxElder++;
        }
        else if(ageCont<18){
            auxUnderage++;
        }
        else{
            auxAdult++;
        }
    }
    Text_Info_Elder.setText("Passageiros idosos presentes: "+auxElder);//mostra na tela o total de idosos
    Text_Info_Underage.setText("Passageiros menores de idade presentes: "+auxUnderage);//mostra na tela o total de menores de idade
    Text_Info_Adults.setText("Passageiros adultos presentes: "+auxAdult);//mostra na tela o total de adultos
    Text_Info_TotalPassanger.setText("Total de passageiros: "+(auxElder+auxAdult+auxUnderage));//mostra na tela o total de passageiros
    
    }//GEN-LAST:event_Btn_Info_LoadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_A_10;
    private javax.swing.JButton Btn_A_11;
    private javax.swing.JButton Btn_B_10;
    private javax.swing.JButton Btn_B_11;
    private javax.swing.JButton Btn_C_10;
    private javax.swing.JButton Btn_C_11;
    private javax.swing.JButton Btn_D_10;
    private javax.swing.JButton Btn_D_11;
    private javax.swing.JButton Btn_E_10;
    private javax.swing.JButton Btn_E_11;
    private javax.swing.JButton Btn_F_10;
    private javax.swing.JButton Btn_F_11;
    private javax.swing.ButtonGroup Btn_Group_Seats;
    private javax.swing.JButton Btn_Info_Load;
    private javax.swing.JButton Btn_Info_voltar;
    private javax.swing.JButton Btn_Login_Entrar;
    private javax.swing.JButton Btn_Login_Voltar;
    private javax.swing.JButton Btn_Register_Confirmar;
    private javax.swing.JButton Btn_Register_Voltar;
    private javax.swing.JButton Btn_User_Info;
    private javax.swing.JButton Btn_User_Interface_Voltar;
    private javax.swing.JButton Btn_Welcome_Cadastrar;
    private javax.swing.JButton Btn_Welcome_Entrar;
    private javax.swing.JPanel Panel_Info;
    private javax.swing.JPanel Panel_Login;
    private javax.swing.JPanel Panel_Main;
    private javax.swing.JPanel Panel_Register;
    private javax.swing.JPanel Panel_User_Interface;
    private javax.swing.JPanel Panel_Welcome;
    private javax.swing.JPasswordField Password_Login_Password;
    private javax.swing.JPasswordField Password_Register_Password;
    private javax.swing.JTextField Text_Info_Adults;
    private javax.swing.JTextField Text_Info_Elder;
    private javax.swing.JTextField Text_Info_Normal;
    private javax.swing.JTextField Text_Info_Prio;
    private javax.swing.JTextField Text_Info_Total;
    private javax.swing.JTextField Text_Info_TotalPassanger;
    private javax.swing.JTextField Text_Info_Underage;
    private javax.swing.JTextField Text_Login_User;
    private javax.swing.JTextField Text_Register_Age;
    private javax.swing.JTextField Text_Register_Name;
    private javax.swing.JTextField Text_Register_Passport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
