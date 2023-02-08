
package a3mardarek.electronics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class commandes extends javax.swing.JFrame {
     DefaultTableModel d=new DefaultTableModel();
     int s;
      float x=0; 
      float total;
   
    public commandes() {
        initComponents();
        afficherProduit();
        d=(DefaultTableModel) commandTAB.getModel();
       
    }
      Double p , prodTotal;
      Connection Con= null;
      Statement St =null;
      ResultSet Rs =null;
      fonctions f=new fonctions();
    
/*****************Fonction pour afficher la liste des produit de la BDD dans un tableux************************/
  public void afficherProduit(){
          try{
              Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
               St=Con.createStatement();
               Rs=St.executeQuery("select * from USER1.PRODUITS");
               prodTAB.setModel(DbUtils.resultSetToTableModel(Rs));
          }catch(Exception e){
              e.printStackTrace();
          }
      } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        prodPRIX = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        prodNOM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prodQ = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Ajouter = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        commandTAB = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        prodTAB = new javax.swing.JTable();
        Supprimer = new java.awt.Button();
        Modifier = new java.awt.Button();
        jLabel15 = new javax.swing.JLabel();
        getRemise = new java.awt.Button();
        effacerBt2 = new java.awt.Button();
        NOM = new javax.swing.JTextField();
        ID_CAR = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        effacerBt3 = new java.awt.Button();
        REMISE = new javax.swing.JLabel();
        prodCAT = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        REMISE1 = new javax.swing.JLabel();
        REMISE2 = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setAutoscrolls(true);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("GESTION DES COMMANDES");

        prodPRIX.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodPRIX.setForeground(new java.awt.Color(0, 0, 51));
        prodPRIX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodPRIXActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("PRIX");

        prodNOM.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodNOM.setForeground(new java.awt.Color(0, 0, 51));
        prodNOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNOMActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("NOM");

        prodQ.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodQ.setForeground(new java.awt.Color(0, 0, 51));
        prodQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodQActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("QUNTITY");

        Ajouter.setBackground(new java.awt.Color(204, 204, 255));
        Ajouter.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Ajouter.setForeground(new java.awt.Color(0, 0, 51));
        Ajouter.setLabel("Ajouter ");
        Ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjouterMouseClicked(evt);
            }
        });
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
            }
        });

        commandTAB.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        commandTAB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM ", "PRIX", "QNTITER", "CATEGOER", "TOTAL"
            }
        ));
        commandTAB.setIntercellSpacing(new java.awt.Dimension(0, 0));
        commandTAB.setOpaque(false);
        commandTAB.setRowHeight(25);
        commandTAB.setSelectionBackground(new java.awt.Color(0, 0, 51));
        commandTAB.setSelectionForeground(new java.awt.Color(240, 240, 240));
        commandTAB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commandTABMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(commandTAB);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("LISTE DES PRODUITS");

        TOTAL.setBackground(new java.awt.Color(204, 204, 204));
        TOTAL.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        TOTAL.setForeground(new java.awt.Color(0, 0, 51));
        TOTAL.setText("0.0 DA");
        TOTAL.setAutoscrolls(true);

        prodTAB.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        prodTAB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOM", "PRIX", "QUNTITY", "CATEGORE"
            }
        ));
        prodTAB.setIntercellSpacing(new java.awt.Dimension(0, 0));
        prodTAB.setRowHeight(25);
        prodTAB.setSelectionBackground(new java.awt.Color(0, 0, 51));
        prodTAB.setSelectionForeground(new java.awt.Color(240, 240, 240));
        prodTAB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodTABMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(prodTAB);

        Supprimer.setBackground(new java.awt.Color(204, 204, 255));
        Supprimer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Supprimer.setForeground(new java.awt.Color(0, 0, 51));
        Supprimer.setLabel("Supprimer");
        Supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupprimerMouseClicked(evt);
            }
        });
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });

        Modifier.setBackground(new java.awt.Color(204, 204, 255));
        Modifier.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Modifier.setForeground(new java.awt.Color(0, 0, 51));
        Modifier.setLabel("Modifier");
        Modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifierMouseClicked(evt);
            }
        });
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("LISTE DES COMMANDES");

        getRemise.setActionCommand("Effacer");
        getRemise.setBackground(new java.awt.Color(204, 204, 255));
        getRemise.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        getRemise.setForeground(new java.awt.Color(0, 0, 51));
        getRemise.setLabel("Get remise");
        getRemise.setName("Effacer"); // NOI18N
        getRemise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getRemiseMouseClicked(evt);
            }
        });
        getRemise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRemiseActionPerformed(evt);
            }
        });

        effacerBt2.setActionCommand("Effacer");
        effacerBt2.setBackground(new java.awt.Color(204, 204, 255));
        effacerBt2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        effacerBt2.setForeground(new java.awt.Color(0, 0, 51));
        effacerBt2.setLabel("Effacer");
        effacerBt2.setName("Effacer"); // NOI18N
        effacerBt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                effacerBt2MouseClicked(evt);
            }
        });
        effacerBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effacerBt2ActionPerformed(evt);
            }
        });

        NOM.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NOM.setForeground(new java.awt.Color(0, 0, 51));
        NOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMActionPerformed(evt);
            }
        });

        ID_CAR.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ID_CAR.setForeground(new java.awt.Color(0, 0, 51));
        ID_CAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_CARActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("NOM CLIENT");

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("ID CARTE FIDELE");

        effacerBt3.setActionCommand("Effacer");
        effacerBt3.setBackground(new java.awt.Color(204, 204, 255));
        effacerBt3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        effacerBt3.setForeground(new java.awt.Color(0, 0, 51));
        effacerBt3.setLabel("Effacer");
        effacerBt3.setName("Effacer"); // NOI18N
        effacerBt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                effacerBt3MouseClicked(evt);
            }
        });
        effacerBt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effacerBt3ActionPerformed(evt);
            }
        });

        REMISE.setBackground(new java.awt.Color(204, 204, 204));
        REMISE.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        REMISE.setForeground(new java.awt.Color(0, 0, 51));
        REMISE.setText("0.0 DA");
        REMISE.setAutoscrolls(true);

        prodCAT.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodCAT.setForeground(new java.awt.Color(0, 0, 51));
        prodCAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodCATActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setText("CATEGOER");

        REMISE1.setBackground(new java.awt.Color(204, 204, 204));
        REMISE1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        REMISE1.setForeground(new java.awt.Color(0, 0, 51));
        REMISE1.setText("Prix sans remise");
        REMISE1.setAutoscrolls(true);

        REMISE2.setBackground(new java.awt.Color(204, 204, 204));
        REMISE2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        REMISE2.setForeground(new java.awt.Color(0, 0, 51));
        REMISE2.setText("Prix avec remise");
        REMISE2.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(getRemise, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(ID_CAR, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(REMISE2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(effacerBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(REMISE)
                                .addGap(15, 15, 15))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prodCAT, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prodPRIX, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prodNOM, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(REMISE1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(TOTAL)
                                .addGap(15, 15, 15))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(effacerBt3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(39, 39, 39)
                                    .addComponent(prodQ, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prodNOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prodPRIX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prodCAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prodQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(effacerBt3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID_CAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(REMISE1)
                        .addGap(18, 18, 18)
                        .addComponent(TOTAL)
                        .addGap(64, 64, 64)
                        .addComponent(REMISE2)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getRemise, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(effacerBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(REMISE)
                        .addGap(32, 32, 32))))
        );

        X.setBackground(new java.awt.Color(204, 204, 204));
        X.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        X.setForeground(new java.awt.Color(240, 240, 240));
        X.setText("x");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LOGOUT");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(X)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prodNOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodNOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNOMActionPerformed

    private void prodQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodQActionPerformed
// ***************************************AJOUTE UN COMMANDE  ************************************
    
    private void AjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseClicked
    // AJOUTER un COMMANDE dans la table des commandes     
        String nom;
        String prix;
        String q ,cont;
    //mettre les information qui index par le client dans les variable nom ,prix,q et cont.
        cont=prodCAT.getText();
         nom=prodNOM.getText();
         prix=prodPRIX.getText();
         q=prodQ.getText();
         // Clalculer prix total deproduit  =prix *Quantité
         total=(Integer.parseInt(prodQ.getText())* Float.parseFloat(prodPRIX.getText()));
         String t=String.valueOf(total);
         x=x+total;// x == somme des prix total de chaque produit
         String[]ligne=new String[]{nom,prix,q,cont,t};// metter les variables  dans la table des commandes 
         d.addRow(ligne);
         // AFFICHE PRIX FINAL
         TOTAL.setText(x+" DA");   
    }//GEN-LAST:event_AjouterMouseClicked

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AjouterActionPerformed

    private void commandTABMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commandTABMouseClicked
       CLASSProduit p=new CLASSProduit();
        DefaultTableModel model=(DefaultTableModel)commandTAB.getModel();
        int Myindex=commandTAB.getSelectedRow();
          prodNOM.setText(model.getValueAt(Myindex,0).toString());
          prodPRIX.setText(model.getValueAt(Myindex,1).toString()); 
          prodQ.setText(model.getValueAt(Myindex,2).toString());
          prodCAT.setText(model.getValueAt(Myindex,3).toString());
          s=commandTAB.getSelectedRow();
       
    }//GEN-LAST:event_commandTABMouseClicked

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XMouseClicked

    private void prodPRIXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodPRIXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodPRIXActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void prodTABMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodTABMouseClicked
        
        CLASSProduit p=new CLASSProduit();
        DefaultTableModel model=(DefaultTableModel)prodTAB.getModel();
        int Myindex=prodTAB.getSelectedRow();
          prodNOM.setText(model.getValueAt(Myindex,1).toString());
          prodPRIX.setText(model.getValueAt(Myindex,3).toString());
          prodCAT.setText(model.getValueAt(Myindex,4).toString());
    }//GEN-LAST:event_prodTABMouseClicked
//************************************ SUPPRIME UN COMMAND **************************************
    private void SupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupprimerMouseClicked
       //SUPPRIMER UN COMMANDE    
        d.removeRow(s);
     // PRIX FINAL=PRIX FINAL - le prix du produit que nous avons supprimer.
          x=x-total;
          TOTAL.setText(x+" DA");  // AFFICHE PRIX FINAL 
    }//GEN-LAST:event_SupprimerMouseClicked

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed

    }//GEN-LAST:event_SupprimerActionPerformed
////********************************** MODIFIER UN COMMANDE **************************************************
    private void ModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierMouseClicked
         d.removeRow(s);
         x=x-total;
         TOTAL.setText(x+" DA"); 
         String nom;
         String prix;
         String q ,cont;
         cont=prodCAT.getText();
         nom=prodNOM.getText();
         prix=prodPRIX.getText();
         q=prodQ.getText();
         total=(Integer.parseInt(prodQ.getText())* Float.parseFloat(prodPRIX.getText()));
         String t=String.valueOf(total);
         x=x+total;
         String[]ligne=new String[]{nom,prix,q,cont,t};
         d.addRow(ligne);
         // AFFICHE PRIX FINAL
         TOTAL.setText(x+" DA");  
    }//GEN-LAST:event_ModifierMouseClicked

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifierActionPerformed
   
//*************************GET REMISE **********************************************
    private void getRemiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getRemiseMouseClicked
        float r=0; //r pour  prix total Après remis 
  //Recherche le  nom de client dans la base de données 'dans le tableux qui contien la liste des compte de fidaléter.
        String Query="select * from USER1.COMPTE_FIDL where NOM_CL='"+NOM.getText()+"' and ID_CARTE="+Integer.parseInt(ID_CAR.getText());
        try{
            Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
            St=Con.createStatement(); 
            Rs=St.executeQuery(Query);
            if(Rs.next()){ // si le COMPTE existe on calcule la remise!!
              for(int i=0;i<d.getRowCount();i++){
                   if(d.getValueAt(i, 3).equals("produits mobiles")){ 
                  float y=Float.parseFloat((String) d.getValueAt(i, 1))*Integer.parseInt((String) d.getValueAt(i, 2));
                   r=(float) (r+y *0.25);// remis =25% pour les produits mobiles
              }
                if(d.getValueAt(i, 3).equals("produits informatiques")){ 
                   float y=Float.parseFloat((String) d.getValueAt(i, 1))*Integer.parseInt((String) d.getValueAt(i, 2));
                   r=(float) (r+y *0.25);//remis =25% pour les produits informatiques
              }
                if(d.getValueAt(i, 3).equals("produits électroniques")){ 
                  float y=Float.parseFloat((String) d.getValueAt(i, 1))*Integer.parseInt((String) d.getValueAt(i, 2));
                   r=(float) (r+y *0.1);// remis =10% pour les produits électroniques
              }
              if(d.getValueAt(i, 3).equals("produits électroménager")){ 
                   float y=Float.parseFloat((String) d.getValueAt(i, 1))*Integer.parseInt((String) d.getValueAt(i, 2));
                   r=(float) (r+y *0.1);//remis =10% pour les produits électroménager
              }
               
               if(d.getValueAt(i, 3).equals("kits solaires")){ 
                   float y=Float.parseFloat((String) d.getValueAt(i, 1))*Integer.parseInt((String) d.getValueAt(i, 2));
                   r=(float) (r+y *0.15);// remis =15% pour les kits solaires
              }
             // AFFICHE PRIX FINAL Après LE REMIS  
               REMISE.setText(r+" DA");
                }
                  
            }else{
                JOptionPane.showMessageDialog(this,"Le compte n'exist pas!!");
            }
        }catch(SQLException ex ){
            ex.printStackTrace();
        }            
              
    }//GEN-LAST:event_getRemiseMouseClicked

    private void getRemiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRemiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getRemiseActionPerformed

    private void effacerBt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_effacerBt2MouseClicked
           NOM.setText("");
          ID_CAR.setText(""); 
    }//GEN-LAST:event_effacerBt2MouseClicked

    private void effacerBt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacerBt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_effacerBt2ActionPerformed

    private void NOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMActionPerformed

    private void ID_CARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_CARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_CARActionPerformed

    private void effacerBt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_effacerBt3MouseClicked
          prodNOM.setText("");
          prodPRIX.setText(""); 
          prodQ.setText("");
          prodCAT.setText("");
    }//GEN-LAST:event_effacerBt3MouseClicked

    private void effacerBt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacerBt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_effacerBt3ActionPerformed

    private void prodCATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodCATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodCATActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new commandes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Ajouter;
    private javax.swing.JTextField ID_CAR;
    private java.awt.Button Modifier;
    private javax.swing.JTextField NOM;
    private javax.swing.JLabel REMISE;
    private javax.swing.JLabel REMISE1;
    private javax.swing.JLabel REMISE2;
    private java.awt.Button Supprimer;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JLabel X;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable commandTAB;
    private java.awt.Button effacerBt2;
    private java.awt.Button effacerBt3;
    private java.awt.Button getRemise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField prodCAT;
    private javax.swing.JTextField prodNOM;
    private javax.swing.JTextField prodPRIX;
    private javax.swing.JTextField prodQ;
    private javax.swing.JTable prodTAB;
    // End of variables declaration//GEN-END:variables
}
