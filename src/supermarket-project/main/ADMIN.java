
package a3mardarek.electronics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ADMIN extends javax.swing.JFrame {

    public ADMIN() {
        initComponents();
        afficherAdmins();
    }
      Connection Con= null;
      Statement St =null;
      ResultSet Rs =null;
      fonctions f=new fonctions();
/******************************Fonction pour afficher la liste des ADMINS de la BDD dans un tableux ************************/
  public void afficherAdmins(){
          try{
              Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
               St=Con.createStatement();
               Rs=St.executeQuery("select * from USER1.ADMIN");
               ADMINtab.setModel(DbUtils.resultSetToTableModel(Rs));
          }catch(Exception e){
              e.printStackTrace();
          }
      } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ADMINId = new javax.swing.JTextField();
        ADMINNom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ADMINpass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        modifierBt = new java.awt.Button();
        effacerBt = new java.awt.Button();
        ajouterBt = new java.awt.Button();
        suprimer = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        ADMINtab = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTextField3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 51));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setAutoscrolls(true);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("GESTION DES ADMINS");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("ADMIN ID ");

        ADMINId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ADMINId.setForeground(new java.awt.Color(0, 0, 51));
        ADMINId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINIdActionPerformed(evt);
            }
        });

        ADMINNom.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ADMINNom.setForeground(new java.awt.Color(0, 0, 51));
        ADMINNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINNomActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("NOM");

        ADMINpass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ADMINpass.setForeground(new java.awt.Color(0, 0, 51));
        ADMINpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINpassActionPerformed(evt);
            }
        });

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

        ADMINtab.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ADMINtab.setModel(new javax.swing.table.DefaultTableModel(
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
        ADMINtab.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ADMINtab.setRowHeight(25);
        ADMINtab.setSelectionBackground(new java.awt.Color(0, 0, 51));
        ADMINtab.setSelectionForeground(new java.awt.Color(240, 240, 240));
        ADMINtab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMINtabMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ADMINtab);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("LISTE CLIENTS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ADMINNom, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(ajouterBt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(effacerBt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ADMINId, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(203, 203, 203)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(ADMINpass, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(modifierBt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(240, 240, 240)))
                                .addGap(1, 1, 1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(suprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADMINId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADMINpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADMINNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CLIENT");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
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
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
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

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void ADMINIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADMINIdActionPerformed

    private void ADMINNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADMINNomActionPerformed

    private void ADMINpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADMINpassActionPerformed
//******************** BOUTON MODIFIER *****************************************
    private void modifierBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierBtMouseClicked

        CLASSAdmin ad =new CLASSAdmin();
        if(ADMINId.getText().isEmpty() || ADMINNom.getText().isEmpty() || ADMINpass.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this,"Information manquante");
        }else{
            ad.setAdmin_ID(Integer.parseInt(ADMINId.getText()));
            ad.setAdmin_NOM(ADMINNom.getText());
            ad.setAdmin_PASS(ADMINpass.getText());
   // Appler la fonction modifier_admin qui dans la class fonctions pour MODIFIER les information d'un ADMIN dans la BDD
            f.modifier_admin(ad);
            afficherAdmins();
        }
    }//GEN-LAST:event_modifierBtMouseClicked

    private void modifierBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifierBtActionPerformed

    private void effacerBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_effacerBtMouseClicked

 //***************************************** BOUTON EFFACER*****************************************************
        ADMINId.setText("");
        ADMINNom.setText("");
        ADMINpass.setText("");
    }//GEN-LAST:event_effacerBtMouseClicked

    private void effacerBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacerBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_effacerBtActionPerformed
//***************************** BOUTON AJOUTER *******************************************
    private void ajouterBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterBtMouseClicked

        if(ADMINId.getText().isEmpty() || ADMINNom.getText().isEmpty() || ADMINpass.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(this,"Information manquante");
        }else{
            CLASSAdmin ad =new CLASSAdmin();
            ad.setAdmin_ID(Integer.parseInt(ADMINId.getText()));
            ad.setAdmin_NOM(ADMINNom.getText());
            ad.setAdmin_PASS(ADMINpass.getText());
// Appler la fonction ajouter_admin qui dans la class fonctions pour AJOUTER un ADMIN dans la BDD
            f.ajouter_admin(ad);
            afficherAdmins();// POUR AFFICHER LA LISTE DES ADMIN APRÈS L'ajoute.
        }
    }//GEN-LAST:event_ajouterBtMouseClicked

    private void ajouterBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouterBtActionPerformed
//***************************** BOUTON SUPPRIMER *******************************************
    private void suprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suprimerMouseClicked
     
        CLASSAdmin ad =new CLASSAdmin();
        if(ADMINId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Information manquante");
        }else{
            ad.setAdmin_ID(Integer.parseInt(ADMINId.getText()));
  // Appler la fonction suprimer_admin qui dans la class fonctions pour SUPPRIMER un ADMIN dans la BDD          
            f.suprimer_admin(ad);
            afficherAdmins();// POUR AFFICHER LA LISTE DES ADMIN APRÈS LA SUPPRESSION.
        }
    }//GEN-LAST:event_suprimerMouseClicked

    private void suprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suprimerActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_suprimerActionPerformed

    private void ADMINtabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINtabMouseClicked

        DefaultTableModel model=(DefaultTableModel)ADMINtab.getModel();
        int Myindex=ADMINtab.getSelectedRow();
        ADMINId.setText(model.getValueAt(Myindex,0).toString());
        ADMINNom.setText(model.getValueAt(Myindex,1).toString());
        ADMINpass.setText(model.getValueAt(Myindex,2).toString());
       
    }//GEN-LAST:event_ADMINtabMouseClicked

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    //pour  afficher  l'interface GESTION DES PROUDUIT si ADMIN click sur PROUDUITS
        new pruduits().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
    //pour  afficher  l'interface LOGIN  si ADMIN click sur LOGOUT   
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
     //pour  afficher  l'interface GESTION DES CLIENT si ADMIN click sur CLIENTS  
        new clients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADMINId;
    private javax.swing.JTextField ADMINNom;
    private javax.swing.JTextField ADMINpass;
    private javax.swing.JTable ADMINtab;
    private javax.swing.JLabel X;
    private java.awt.Button ajouterBt;
    private java.awt.Button effacerBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTextField3;
    private java.awt.Button modifierBt;
    private java.awt.Button suprimer;
    // End of variables declaration//GEN-END:variables
}
