package a3mardarek.electronics;


public class CLASSProduit {
    
  private int id_prod;  
  private String nom_prod;
  private int quantite_prod;
  private String categorie_prod;
  private float prix_prod;
 

   public CLASSProduit(){
         id_prod=0;
         nom_prod="";
         quantite_prod=0;
         categorie_prod="";
         prix_prod=0;  
  }
  public CLASSProduit(int id_prod,String nom_prod,int quantite_prod ,String categorie_prod,float prix_prod,int cont ){
         this.id_prod=id_prod;
         this.nom_prod=nom_prod;
         this.quantite_prod=quantite_prod;
         this.categorie_prod=categorie_prod;
         this.prix_prod=prix_prod;
  }
  
  public int getId_prod(){
          return id_prod;
  }
  public void setId_prod(int id_prod){
      this.id_prod=id_prod;
  }
  public String getNom_prod(){
         return nom_prod;
  }
  public void setNom_prood(String nom_prod ){
          this.nom_prod=nom_prod;
  }
  public int getQuantite_prod(){
          return quantite_prod;
  }
  public void setQuantite_prod(int quantite_prod){
      this.quantite_prod=quantite_prod;
  }
  
  public String getCategorie_prod(){
         return categorie_prod;
  }
  public void setCategorie_prod(String categorie_prod ){
          this.categorie_prod=categorie_prod;
  }
  
  public float getPrix_prod(){
         return prix_prod;
  }
  public void setPrix_prod(float prix_prod){
          this.prix_prod=prix_prod;
  }
}
