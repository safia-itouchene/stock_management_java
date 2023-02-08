
package a3mardarek.electronics;

import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


 
public class clients extends javax.swing.JFrame {

  
    public clients() {
        initComponents();
         afficherClient();
    }
      Connection Con= null;
      Statement St =null;
      ResultSet Rs =null;
      fonctions f=new fonctions();
      /********************Fonction pour afficher la liste des CLIENT de la BDD dans un tableux**************************************************************/
      public void afficherClient(){
          try{
              Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
               St=Con.createStatement();
               Rs=St.executeQuery("select * from USER1.CLIENT");
               CLIENTTab.setModel(DbUtils.resultSetToTableModel(Rs));
          }catch(Exception e){
              e.printStackTrace();
          }
      } 
/******************************************Fonction afficher client**************************************************************/
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clientId = new javax.swing.JTextField();
        clientNom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        clientpass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        modifierBt = new java.awt.Button();
        effacerBt = new java.awt.Button();
        ajouterBt = new java.awt.Button();
        suprimer = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        CLIENTTab = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        Adress = new javax.swing.JTextField();
        X = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setAutoscrolls(true);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("GESTION DES CLIENTS");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("CLIENT ID ");

        clientId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clientId.setForeground(new java.awt.Color(0, 0, 51));
        clientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientIdActionPerformed(evt);
            }
        });

        clientNom.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clientNom.setForeground(new java.awt.Color(0, 0, 51));
        clientNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNomActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("NOM");

        clientpass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clientpass.setForeground(new java.awt.Color(0, 0, 51));
        clientpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientpassActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("ADRESS");

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("MOT DE PASSE");

        modifierBt.setBackground(new java.awt.Color(204, 204, 255));
        modifierBt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        modifierBt.setForeground(new java.awt.Color(0, 0, 51));
        modifierBt.setLabel("Modifier");
        modifierBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifierBtMouseClicked(evt);
            }
        });
        modifierBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierBtActionPerformed(evt);
            }
        });

        effacerBt.setActionCommand("Effacer");
        effacerBt.setBackground(new java.awt.Color(204, 204, 255));
        effacerBt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        effacerBt.setForeground(new java.awt.Color(0, 0, 51));
        effacerBt.setLabel("Effacer");
        effacerBt.setName("Effacer"); // NOI18N
        effacerBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                effacerBtMouseClicked(evt);
            }
        });
        effacerBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effacerBtActionPerformed(evt);
            }
        });

        ajouterBt.setBackground(new java.awt.Color(204, 204, 255));
        ajouterBt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ajouterBt.setForeground(new java.awt.Color(0, 0, 51));
        ajouterBt.setLabel("Ajouter");
        ajouterBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterBtMouseClicked(evt);
            }
        });
        ajouterBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBtActionPerformed(evt);
            }
        });

        suprimer.setBackground(new java.awt.Color(204, 204, 255));
        suprimer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        suprimer.setForeground(new java.awt.Color(0, 0, 51));
        suprimer.setLabel("Supprimer");
        suprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suprimerMouseClicked(evt);
            }
        });
        suprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suprimerActionPerformed(evt);
            }
        });

        CLIENTTab.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CLIENTTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOM", "MOTE DE PASS", "GENDRE"
            }
        ));
        CLIENTTab.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CLIENTTab.setRowHeight(25);
        CLIENTTab.setSelectionBackground(new java.awt.Color(0, 0, 51));
        CLIENTTab.setSelectionForeground(new java.awt.Color(240, 240, 240));
        CLIENTTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLIENTTabMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(CLIENTTab);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("LISTE CLIENTS");

        Adress.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Adress.setForeground(new java.awt.Color(0, 0, 51));
        Adress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(ajouterBt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clientId, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clientNom, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(clientpass, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(modifierBt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(effacerBt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGap(62, 62, 62))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(suprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajouterBt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effacerBt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifierBt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        effacerBt.getAccessibleContext().setAccessibleDescription("Effacer");

        X.setBackground(new java.awt.Color(204, 204, 204));
        X.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        X.setForeground(new java.awt.Color(240, 240, 240));
        X.setText("x");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRODUIS");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
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

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ADMINS");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)))
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(X)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientIdActionPerformed

    private void clientNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientNomActionPerformed

    private void clientpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientpassActionPerformed

    private void modifierBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifierBtActionPerformed

    private void effacerBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacerBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_effacerBtActionPerformed

    private void ajouterBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouterBtActionPerformed

    private void suprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suprimerActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_suprimerActionPerformed
//**********************************BOUTON AJOUTER*****************************************************************************************************************
    private void ajouterBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterBtMouseClicked
        
            if(clientId.getText().isEmpty() || clientNom.getText().isEmpty() || clientpass.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(this,"Information manquante");
            }else{ 
              CLASSClient c =new CLASSClient();
     // mettre les information qui donner par ADMIN dans les seteur de la class 'CLASSProduit'
              c.setID_client(Integer.parseInt(clientId.getText()));
              c.setnom_Clien(clientNom.getText());
              c.setclient_pass(clientpass.getText());
              c.setclient_Adress(Adress.getText());
     // Appler la fonction ajouter_client qui dans la class fonctions pour ajouter un CLINET dans la BDD
              f.ajouter_client(c); 
              afficherClient();
       }
    }//GEN-LAST:event_ajouterBtMouseClicked
  /****************************SELECT************************************************/
    private void CLIENTTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLIENTTabMouseClicked

        DefaultTableModel model=(DefaultTableModel)CLIENTTab.getModel();
        int Myindex=CLIENTTab.getSelectedRow();
        clientId.setText(model.getValueAt(Myindex,0).toString());
        clientNom.setText(model.getValueAt(Myindex,1).toString());
        clientpass.setText(model.getValueAt(Myindex,2).toString());
        Adress.setText(model.getValueAt(Myindex,3).toString());
    }//GEN-LAST:event_CLIENTTabMouseClicked

    private void effacerBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_effacerBtMouseClicked
        
//***************************************** BOUTON EFFACER*****************************************************
        clientId.setText("");
        clientNom.setText("");
        clientpass.setText("");
        Adress.setText("");
    }//GEN-LAST:event_effacerBtMouseClicked
//**************************************BOUTON SUPPRIMER ***********************************************************************
    private void suprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suprimerMouseClicked
          CLASSClient c =new CLASSClient();
        if(clientId.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Enter un client pour supprimer");
        }else{
                    c.setID_client(Integer.parseInt(clientId.getText()));
         // Appler la fonction suprimer_Client qui dans la class fonctions POUR SUPPRIMER un CLINET dans la BDD  
                    f.suprimer_Client(c);
                    afficherClient(); // POUR AFFICHER LA LISTE DES CLIENT APRÈS LA SUPPRESSION.
        }
    }//GEN-LAST:event_suprimerMouseClicked
//*********************************BOUTON MODIFIER*******************************************************************
    private void modifierBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierBtMouseClicked
        
           CLASSClient c =new CLASSClient();
         if(clientId.getText().isEmpty() || clientNom.getText().isEmpty() || clientpass.getText().isEmpty() ){
              JOptionPane.showMessageDialog(this,"Missing information");
        }else{
      // mettre les information qui donner par ADMIN dans les seteur de la class 'CLASSProduit'
             c.setID_client(Integer.parseInt(clientId.getText()));
             c.setnom_Clien(clientNom.getText());
             c.setclient_pass(clientpass.getText());
             c.setclient_Adress(Adress.getText());
      // Appler la fonction suprimer_Client POUR MODIFIER un CLINET dans la BDD 
             f.modifier_Client(c);
             afficherClient(); // POUR AFFICHER LA LISTE DES CLIENT APRÈS LA MODIFICATION.
        }
    }//GEN-LAST:event_modifierBtMouseClicked

    private void AdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdressActionPerformed

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
           System.exit(0);  
    }//GEN-LAST:event_XMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    //pour  afficher  l'interface GESTION DES PROUDUIT SI ADMIN click sur PROUDUITS
        new pruduits().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        //pour  afficher  l'interface LOGIN SI ADMIN click sur  LOGOUT
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
     //pour  afficher  l'interface GESTION DES ADMINS SI ADMIN click sur ADMINS
        new ADMIN().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked
//***********************************************************************************************************************
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adress;
    private javax.swing.JTable CLIENTTab;
    private javax.swing.JLabel X;
    private java.awt.Button ajouterBt;
    private javax.swing.JTextField clientId;
    private javax.swing.JTextField clientNom;
    private javax.swing.JTextField clientpass;
    private java.awt.Button effacerBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Button modifierBt;
    private java.awt.Button suprimer;
    // End of variables declaration//GEN-END:variables

   
}
