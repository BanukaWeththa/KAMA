package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Interfaces generated by hbm2java
 */
public class Interfaces  implements java.io.Serializable {


     private Integer idinterfaces;
     private InterfacesStatus interfacesStatus;
     private String url;
     private String displayName;
     private Set<Privilages> privilageses = new HashSet<Privilages>(0);

    public Interfaces() {
    }

	
    public Interfaces(InterfacesStatus interfacesStatus) {
        this.interfacesStatus = interfacesStatus;
    }
    public Interfaces(InterfacesStatus interfacesStatus, String url, String displayName, Set<Privilages> privilageses) {
       this.interfacesStatus = interfacesStatus;
       this.url = url;
       this.displayName = displayName;
       this.privilageses = privilageses;
    }
   
    public Integer getIdinterfaces() {
        return this.idinterfaces;
    }
    
    public void setIdinterfaces(Integer idinterfaces) {
        this.idinterfaces = idinterfaces;
    }
    public InterfacesStatus getInterfacesStatus() {
        return this.interfacesStatus;
    }
    
    public void setInterfacesStatus(InterfacesStatus interfacesStatus) {
        this.interfacesStatus = interfacesStatus;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public Set<Privilages> getPrivilageses() {
        return this.privilageses;
    }
    
    public void setPrivilageses(Set<Privilages> privilageses) {
        this.privilageses = privilageses;
    }




}

