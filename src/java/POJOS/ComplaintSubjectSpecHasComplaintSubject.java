package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0



/**
 * ComplaintSubjectSpecHasComplaintSubject generated by hbm2java
 */
public class ComplaintSubjectSpecHasComplaintSubject  implements java.io.Serializable {


     private Integer idcomplaintSubjectSpecHasComplaintSubject;
     private int complaintSubjectSpecIdcomplaintSubjectSpec;
     private int complaintSubjectIdcomplaintSubject;

    public ComplaintSubjectSpecHasComplaintSubject() {
    }

    public ComplaintSubjectSpecHasComplaintSubject(int complaintSubjectSpecIdcomplaintSubjectSpec, int complaintSubjectIdcomplaintSubject) {
       this.complaintSubjectSpecIdcomplaintSubjectSpec = complaintSubjectSpecIdcomplaintSubjectSpec;
       this.complaintSubjectIdcomplaintSubject = complaintSubjectIdcomplaintSubject;
    }
   
    public Integer getIdcomplaintSubjectSpecHasComplaintSubject() {
        return this.idcomplaintSubjectSpecHasComplaintSubject;
    }
    
    public void setIdcomplaintSubjectSpecHasComplaintSubject(Integer idcomplaintSubjectSpecHasComplaintSubject) {
        this.idcomplaintSubjectSpecHasComplaintSubject = idcomplaintSubjectSpecHasComplaintSubject;
    }
    public int getComplaintSubjectSpecIdcomplaintSubjectSpec() {
        return this.complaintSubjectSpecIdcomplaintSubjectSpec;
    }
    
    public void setComplaintSubjectSpecIdcomplaintSubjectSpec(int complaintSubjectSpecIdcomplaintSubjectSpec) {
        this.complaintSubjectSpecIdcomplaintSubjectSpec = complaintSubjectSpecIdcomplaintSubjectSpec;
    }
    public int getComplaintSubjectIdcomplaintSubject() {
        return this.complaintSubjectIdcomplaintSubject;
    }
    
    public void setComplaintSubjectIdcomplaintSubject(int complaintSubjectIdcomplaintSubject) {
        this.complaintSubjectIdcomplaintSubject = complaintSubjectIdcomplaintSubject;
    }




}

