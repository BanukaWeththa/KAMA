package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0



/**
 * ComplaintSubjectSpec generated by hbm2java
 */
public class ComplaintSubjectSpec  implements java.io.Serializable {


     private int idcomplaintSubjectSpec;
     private String complaintSubjectSpecName;

    public ComplaintSubjectSpec() {
    }

	
    public ComplaintSubjectSpec(int idcomplaintSubjectSpec) {
        this.idcomplaintSubjectSpec = idcomplaintSubjectSpec;
    }
    public ComplaintSubjectSpec(int idcomplaintSubjectSpec, String complaintSubjectSpecName) {
       this.idcomplaintSubjectSpec = idcomplaintSubjectSpec;
       this.complaintSubjectSpecName = complaintSubjectSpecName;
    }
   
    public int getIdcomplaintSubjectSpec() {
        return this.idcomplaintSubjectSpec;
    }
    
    public void setIdcomplaintSubjectSpec(int idcomplaintSubjectSpec) {
        this.idcomplaintSubjectSpec = idcomplaintSubjectSpec;
    }
    public String getComplaintSubjectSpecName() {
        return this.complaintSubjectSpecName;
    }
    
    public void setComplaintSubjectSpecName(String complaintSubjectSpecName) {
        this.complaintSubjectSpecName = complaintSubjectSpecName;
    }




}

