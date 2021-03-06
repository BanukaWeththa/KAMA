package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * UserLogin generated by hbm2java
 */
public class UserLogin  implements java.io.Serializable {


     private Integer iduserLogin;
     private UserType userType;
     private UserStatus userStatus;
     private String userEmail;
     private String password;
     private String userFirstName;
     private String userLastName;
     private String userTelephoneMob;
     private Set<ComplaintSubject> complaintSubjects = new HashSet<ComplaintSubject>(0);
     private Set<Delivery> deliveries = new HashSet<Delivery>(0);
     private Set<Printer> printers = new HashSet<Printer>(0);
     private Set<PrinterHasProduct> printerHasProducts = new HashSet<PrinterHasProduct>(0);
     private Set<UserBackup> userBackups = new HashSet<UserBackup>(0);
     private Set<LoginSessions> loginSessionses = new HashSet<LoginSessions>(0);
     private Set<CartItem> cartItems = new HashSet<CartItem>(0);
     private Set<Cart> carts = new HashSet<Cart>(0);
     private Set<FrameType> frameTypes = new HashSet<FrameType>(0);
     private Set<UserTypeHasUserSpecification> userTypeHasUserSpecifications = new HashSet<UserTypeHasUserSpecification>(0);

    public UserLogin() {
    }

	
    public UserLogin(UserType userType, UserStatus userStatus, String userEmail, String userFirstName, String userLastName, String userTelephoneMob) {
        this.userType = userType;
        this.userStatus = userStatus;
        this.userEmail = userEmail;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userTelephoneMob = userTelephoneMob;
    }
    public UserLogin(UserType userType, UserStatus userStatus, String userEmail, String password, String userFirstName, String userLastName, String userTelephoneMob, Set<ComplaintSubject> complaintSubjects, Set<Delivery> deliveries, Set<Printer> printers, Set<PrinterHasProduct> printerHasProducts, Set<UserBackup> userBackups, Set<LoginSessions> loginSessionses, Set<CartItem> cartItems, Set<Cart> carts, Set<FrameType> frameTypes, Set<UserTypeHasUserSpecification> userTypeHasUserSpecifications) {
       this.userType = userType;
       this.userStatus = userStatus;
       this.userEmail = userEmail;
       this.password = password;
       this.userFirstName = userFirstName;
       this.userLastName = userLastName;
       this.userTelephoneMob = userTelephoneMob;
       this.complaintSubjects = complaintSubjects;
       this.deliveries = deliveries;
       this.printers = printers;
       this.printerHasProducts = printerHasProducts;
       this.userBackups = userBackups;
       this.loginSessionses = loginSessionses;
       this.cartItems = cartItems;
       this.carts = carts;
       this.frameTypes = frameTypes;
       this.userTypeHasUserSpecifications = userTypeHasUserSpecifications;
    }
   
    public Integer getIduserLogin() {
        return this.iduserLogin;
    }
    
    public void setIduserLogin(Integer iduserLogin) {
        this.iduserLogin = iduserLogin;
    }
    public UserType getUserType() {
        return this.userType;
    }
    
    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    public UserStatus getUserStatus() {
        return this.userStatus;
    }
    
    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }
    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserFirstName() {
        return this.userFirstName;
    }
    
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }
    public String getUserLastName() {
        return this.userLastName;
    }
    
    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
    public String getUserTelephoneMob() {
        return this.userTelephoneMob;
    }
    
    public void setUserTelephoneMob(String userTelephoneMob) {
        this.userTelephoneMob = userTelephoneMob;
    }
    public Set<ComplaintSubject> getComplaintSubjects() {
        return this.complaintSubjects;
    }
    
    public void setComplaintSubjects(Set<ComplaintSubject> complaintSubjects) {
        this.complaintSubjects = complaintSubjects;
    }
    public Set<Delivery> getDeliveries() {
        return this.deliveries;
    }
    
    public void setDeliveries(Set<Delivery> deliveries) {
        this.deliveries = deliveries;
    }
    public Set<Printer> getPrinters() {
        return this.printers;
    }
    
    public void setPrinters(Set<Printer> printers) {
        this.printers = printers;
    }
    public Set<PrinterHasProduct> getPrinterHasProducts() {
        return this.printerHasProducts;
    }
    
    public void setPrinterHasProducts(Set<PrinterHasProduct> printerHasProducts) {
        this.printerHasProducts = printerHasProducts;
    }
    public Set<UserBackup> getUserBackups() {
        return this.userBackups;
    }
    
    public void setUserBackups(Set<UserBackup> userBackups) {
        this.userBackups = userBackups;
    }
    public Set<LoginSessions> getLoginSessionses() {
        return this.loginSessionses;
    }
    
    public void setLoginSessionses(Set<LoginSessions> loginSessionses) {
        this.loginSessionses = loginSessionses;
    }
    public Set<CartItem> getCartItems() {
        return this.cartItems;
    }
    
    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
    public Set<Cart> getCarts() {
        return this.carts;
    }
    
    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }
    public Set<FrameType> getFrameTypes() {
        return this.frameTypes;
    }
    
    public void setFrameTypes(Set<FrameType> frameTypes) {
        this.frameTypes = frameTypes;
    }
    public Set<UserTypeHasUserSpecification> getUserTypeHasUserSpecifications() {
        return this.userTypeHasUserSpecifications;
    }
    
    public void setUserTypeHasUserSpecifications(Set<UserTypeHasUserSpecification> userTypeHasUserSpecifications) {
        this.userTypeHasUserSpecifications = userTypeHasUserSpecifications;
    }




}


