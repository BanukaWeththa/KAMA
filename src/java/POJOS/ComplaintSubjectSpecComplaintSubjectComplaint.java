package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0



/**
 * ComplaintSubjectSpecComplaintSubjectComplaint generated by hbm2java
 */
public class ComplaintSubjectSpecComplaintSubjectComplaint  implements java.io.Serializable {


     private Integer idcomplaintSubjectSpecComplaintSubjectComplaint;
     private Complaint complaint;
     private int complaintSubjectSpecHasComplaintSubject;
     private String value;

    public ComplaintSubjectSpecComplaintSubjectComplaint() {
    }

	
    public ComplaintSubjectSpecComplaintSubjectComplaint(Complaint complaint, int complaintSubjectSpecHasComplaintSubject) {
        this.complaint = complaint;
        this.complaintSubjectSpecHasComplaintSubject = complaintSubjectSpecHasComplaintSubject;
    }
    public ComplaintSubjectSpecComplaintSubjectComplaint(Complaint complaint, int complaintSubjectSpecHasComplaintSubject, String value) {
       this.complaint = complaint;
       this.complaintSubjectSpecHasComplaintSubject = complaintSubjectSpecHasComplaintSubject;
       this.value = value;
    }
   
    public Integer getIdcomplaintSubjectSpecComplaintSubjectComplaint() {
        return this.idcomplaintSubjectSpecComplaintSubjectComplaint;
    }
    
    public void setIdcomplaintSubjectSpecComplaintSubjectComplaint(Integer idcomplaintSubjectSpecComplaintSubjectComplaint) {
        this.idcomplaintSubjectSpecComplaintSubjectComplaint = idcomplaintSubjectSpecComplaintSubjectComplaint;
    }
    public Complaint getComplaint() {
        return this.complaint;
    }
    
    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }
    public int getComplaintSubjectSpecHasComplaintSubject() {
        return this.complaintSubjectSpecHasComplaintSubject;
    }
    
    public void setComplaintSubjectSpecHasComplaintSubject(int complaintSubjectSpecHasComplaintSubject) {
        this.complaintSubjectSpecHasComplaintSubject = complaintSubjectSpecHasComplaintSubject;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }




}


