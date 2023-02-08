
package a3mardarek.electronics;

import java.sql.Statement;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

//CETTE CLASS CONTIENT LES FONCTION DE AJOUTER ET SUPPRIMER ET MODIFFER DANS UN BDD POUR LES PROUDUITS ET CLIENT ET ADMINS.
public class fonctions extends javax.swing.JFrame {
      Connection Con= null;
      Statement St =null;
      ResultSet Rs =null;
      PreparedStatement stat;
      
/*********************************************AJOUTER UN CLIENT*******************************************/
      public void ajouter_client(CLASSClient c) {
        try {
             Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
             stat =Con.prepareStatement("insert into CLIENT values(?,?,?,?)");
            /*initialisation des parametres sql*/
            stat.setInt(1,c.getID_client());
            stat.setString(2, c.getnom_Clien());
            stat.setString(3, c.getclient_pass());
            stat.setString(4, c.getclient_Adress());
             int row =stat.executeUpdate();
             JOptionPane.showMessageDialog(null, "Le client a été ajouté!!");
        } catch (Exception e) {
                 e.printStackTrace();
        }
    }
 /******************************* SUPPRIMER UN CLIENT************************************************/
     
    public void suprimer_Client(CLASSClient c){
              try{
                   Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
                  
                   String Query ="Delete from USER1.CLIENT where IDCLIENT="+c.getID_client();
                   Statement Ajouter=Con.createStatement();
                   Ajouter.executeUpdate(Query);
                   JOptionPane.showMessageDialog(this,"Le client a été supprimé!!");
              }catch(Exception e){
                   e.printStackTrace();
              }
        
    }                                 
    ///****************************** MODICIER UN CLIENT********************************************************
    public void modifier_Client(CLASSClient c){
                 try{
            Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
            String Query="Update USER1.CLIENT set NOM_CLIENT='"+c.getnom_Clien()+"'"+",CLIENTPASS='"+c.getclient_pass()+"'"+",ADRESSCLIENT='"+c.getclient_Adress()+"'"+"where IDCLIENT="+c.getID_client();
            Statement Ajouter=Con.createStatement();
            Ajouter.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Le client a été modifé!!");
            }catch(SQLException e){
                e.printStackTrace();
            }
    }                    
//************************************************AJOUTER PRODUITS ***************************************************
  public void ajouter_produit(CLASSProduit p) {
        try {
             Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
             stat =Con.prepareStatement("insert into PRODUITS values(?,?,?,?,?)");
            /*initialisation des parametres sql*/
            stat.setInt(1,p.getId_prod());
            stat.setString(2, p.getNom_prod());
            stat.setInt(3,p.getQuantite_prod());
            stat.setFloat(4, p.getPrix_prod());
            stat.setString(5, p.getCategorie_prod());
             int row =stat.executeUpdate();
             JOptionPane.showMessageDialog(null, "Le produit a été ajouté!!");
        } catch (Exception e) {
                 e.printStackTrace();
        }
    }
  //*******************************************SUPPRIME PRODUITS *************************************
   public void suprimer_produit(CLASSProduit p){
              try{
                   Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
                  
                   String Query ="Delete from USER1.PRODUITS where PRODUIT_ID="+p.getId_prod();
                   Statement Ajouter=Con.createStatement();
                   Ajouter.executeUpdate(Query);
                   JOptionPane.showMessageDialog(this,"Le produit a été supprimé!!");
              }catch(Exception e){
                   e.printStackTrace();
              }
        
    }
   
   //****************************** MODIFER UN PRODUITS ***************************************************************
   public void modifier_produit(CLASSProduit p){
                 try{
            Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
            String Query="Update USER1.PRODUITS set PRODUIT_NOMM='"+p.getNom_prod()+"'" +",PRODUIT_Q="+p.getQuantite_prod()+"" +",PRODUIT_PRIX="+p.getPrix_prod()+""+",PRODUIT_CATEGORE='"+p.getCategorie_prod()+"'"+ "where PRODUIT_ID ="+ p.getId_prod();
            Statement Ajouter=Con.createStatement();
            Ajouter.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Le produit a été modifé!! ");
            }catch(SQLException e){
                e.printStackTrace();
            }
    }     
   
 //************************************************AJOUTER ADMIN ***************************************************
  public void ajouter_admin(CLASSAdmin ad) {
        try {
             Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
             stat =Con.prepareStatement("insert into ADMIN values(?,?,?)");
            /*initialisation des parametres sql*/
            stat.setInt(1,ad.getAdmin_ID());
            stat.setString(2, ad.getAdmin_NOM());
            stat.setString(3, ad.getAdmin_PASS());
             int row =stat.executeUpdate();
             JOptionPane.showMessageDialog(null, "Admin a été ajouté!!");
        } catch (Exception e) {
                 e.printStackTrace();
        }
    }
  //*******************************************SUPPRIME ADMIN *************************************
   public void suprimer_admin(CLASSAdmin ad){
              try{
                   Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
                  
                   String Query ="Delete from USER1.ADMIN where ID_ADMIN="+ad.getAdmin_ID();
                   Statement Ajouter=Con.createStatement();
                   Ajouter.executeUpdate(Query);
                   JOptionPane.showMessageDialog(this,"Admin a été supprimé!!");
              }catch(Exception e){
                   e.printStackTrace();
              }
    } 
 //**************************************** MODIFER ADMIN **********************************************************************
   public void modifier_admin(CLASSAdmin ad ){
                 try{
            Con=DriverManager.getConnection("jdbc:derby://localhost:1527/a3mardarek.electronics","user1","safia");
            String Query="Update USER1.ADMIN set NOM_ADMIN='"+ad.getAdmin_NOM()+"'" +",PASS_ADMIN='"+ad.getAdmin_PASS()+"'"+"where ID_ADMIN ="+ ad.getAdmin_ID() ;
            Statement Ajouter=Con.createStatement();
            Ajouter.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Admin a été modifé!!");
            }catch(SQLException e){
                e.printStackTrace();
            }
    }     
}
