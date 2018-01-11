package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Complaint generated by hbm2java
 */
public class Complaint  implements java.io.Serializable {


     private int idcomplaint;
     private int complaintSubjectIdcomplaintSubject;
     private String complaintDescription;
     private Set<ComplaintSubjectSpecComplaintSubjectComplaint> complaintSubjectSpecComplaintSubjectComplaints = new HashSet<ComplaintSubjectSpecComplaintSubjectComplaint>(0);

    public Complaint() {
    }

	
    public Complaint(int idcomplaint, int complaintSubjectIdcomplaintSubject) {
        this.idcomplaint = idcomplaint;
        this.complaintSubjectIdcomplaintSubject = complaintSubjectIdcomplaintSubject;
    }
    public Complaint(int idcomplaint, int complaintSubjectIdcomplaintSubject, String complaintDescription, Set<ComplaintSubjectSpecComplaintSubjectComplaint> complaintSubjectSpecComplaintSubjectComplaints) {
       this.idcomplaint = idcomplaint;
       this.complaintSubjectIdcomplaintSubject = complaintSubjectIdcomplaintSubject;
       this.complaintDescription = complaintDescription;
       this.complaintSubjectSpecComplaintSubjectComplaints = complaintSubjectSpecComplaintSubjectComplaints;
    }
   
    public int getIdcomplaint() {
        return this.idcomplaint;
    }
    
    public void setIdcomplaint(int idcomplaint) {
        this.idcomplaint = idcomplaint;
    }
    public int getComplaintSubjectIdcomplaintSubject() {
        return this.complaintSubjectIdcomplaintSubject;
    }
    
    public void setComplaintSubjectIdcomplaintSubject(int complaintSubjectIdcomplaintSubject) {
        this.complaintSubjectIdcomplaintSubject = complaintSubjectIdcomplaintSubject;
    }
    public String getComplaintDescription() {
        return this.complaintDescription;
    }
    
    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }
    public Set<ComplaintSubjectSpecComplaintSubjectComplaint> getComplaintSubjectSpecComplaintSubjectComplaints() {
        return this.complaintSubjectSpecComplaintSubjectComplaints;
    }
    
    public void setComplaintSubjectSpecComplaintSubjectComplaints(Set<ComplaintSubjectSpecComplaintSubjectComplaint> complaintSubjectSpecComplaintSubjectComplaints) {
        this.complaintSubjectSpecComplaintSubjectComplaints = complaintSubjectSpecComplaintSubjectComplaints;
    }




}

