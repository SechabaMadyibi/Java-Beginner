//1. Encapsulate this class.  Change access modifiers so that fields can
//     be read or changed on through public methods.  
//     The ssn field should be READ ONLY.
package ex09_1_exercise;


public class Customer {
    private String name;
    private String ssn;
   
    // Encapsulate this class.  Make ssn read only.
    public String getName ()
    {
    return name;
    }
    
    public void setName (String name)
    {
    this.name = name;
    }
    
    public String getSsn()
    {
        return ssn;
    }
    
 
}
