
package a3mardarek.electronics;



public class CLASSClient {

    private int ID_client;
    private String nom_Clien;
    private String client_pass;
    private String  client_Adress;
    
  public CLASSClient(){
    ID_client=0;
    nom_Clien="";
    client_pass=""; 
    client_Adress="";
}  
    public CLASSClient(int ID_client,String nom_client,String client_pass,String client_gondre){
    this.ID_client=ID_client;
    this.nom_Clien=nom_Clien;
    this.client_pass=client_pass; 
    this.client_Adress=client_gondre;
}  
    public int  getID_client(){
           return ID_client;
    }
    public void setID_client(int ID_client){
        this.ID_client=ID_client;
    }
    
    public String  getnom_Clien(){
           return nom_Clien;
    }
    public void setnom_Clien(String nom_Clien){
        this.nom_Clien=nom_Clien;
    }
    
    public String  getclient_pass(){
           return client_pass;
    }
    public void setclient_pass(String client_pass){
        this.client_pass=client_pass;
    }
    
    public String  getclient_Adress(){
           return client_Adress;
    }
    public void setclient_Adress(String client_Adress){
        this.client_Adress=client_Adress;
    }
    
      public String toString(){
  	    return getID_client()+": "+getnom_Clien()+" "+getclient_pass()+"" + getclient_Adress()+"" ;   
    }        
		 
}
