
package a3mardarek.electronics;

public class CLASSAdmin {
    private int admin_ID;
    private String admin_NOM;
    private String admin_PASS;
    
    public CLASSAdmin() {
        admin_ID=0;
        admin_NOM="";
        admin_PASS="";
    }
    
    public CLASSAdmin(int admin_ID,String admin_NOM) {
        this.admin_ID=admin_ID;
        this.admin_NOM=admin_NOM;
        this.admin_PASS=admin_PASS;
    }
    
    public int getAdmin_ID(){
        return this.admin_ID;
    }
    public  void setAdmin_ID(int admin_ID){
            this.admin_ID=admin_ID;
    }
    
    public String getAdmin_NOM(){
        return this.admin_NOM;
    }
    public  void setAdmin_NOM(String admin_NOM){
            this.admin_NOM=admin_NOM;
    }
    
    public String getAdmin_PASS(){
        return this.admin_PASS;
    }
    public  void setAdmin_PASS(String admin_PASS){
            this.admin_PASS=admin_PASS;
    }
}
