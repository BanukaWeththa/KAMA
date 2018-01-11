package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Printer generated by hbm2java
 */
public class Printer  implements java.io.Serializable {


     private int idprinter;
     private UserLogin userLogin;
     private Set<Product> products = new HashSet<Product>(0);

    public Printer() {
    }

	
    public Printer(int idprinter) {
        this.idprinter = idprinter;
    }
    public Printer(int idprinter, UserLogin userLogin, Set<Product> products) {
       this.idprinter = idprinter;
       this.userLogin = userLogin;
       this.products = products;
    }
   
    public int getIdprinter() {
        return this.idprinter;
    }
    
    public void setIdprinter(int idprinter) {
        this.idprinter = idprinter;
    }
    public UserLogin getUserLogin() {
        return this.userLogin;
    }
    
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }




}

