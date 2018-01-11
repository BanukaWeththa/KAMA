package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Integer idproduct;
     private Cateogry cateogry;
     private Printer printer;
     private String productname;
     private String productcode;
     private String productstatus;
     private String productImage;
     private int frameStatusIdFrameStatus;
     private Set<ProductDeactivate> productDeactivates = new HashSet<ProductDeactivate>(0);
     private Set<ProductHasAddOn> productHasAddOns = new HashSet<ProductHasAddOn>(0);
     private Set<PrinterHasProduct> printerHasProducts = new HashSet<PrinterHasProduct>(0);
     private Set<ProductHasSubcategory> productHasSubcategories = new HashSet<ProductHasSubcategory>(0);

    public Product() {
    }

	
    public Product(Cateogry cateogry, Printer printer, String productImage, int frameStatusIdFrameStatus) {
        this.cateogry = cateogry;
        this.printer = printer;
        this.productImage = productImage;
        this.frameStatusIdFrameStatus = frameStatusIdFrameStatus;
    }
    public Product(Cateogry cateogry, Printer printer, String productname, String productcode, String productstatus, String productImage, int frameStatusIdFrameStatus, Set<ProductDeactivate> productDeactivates, Set<ProductHasAddOn> productHasAddOns, Set<PrinterHasProduct> printerHasProducts, Set<ProductHasSubcategory> productHasSubcategories) {
       this.cateogry = cateogry;
       this.printer = printer;
       this.productname = productname;
       this.productcode = productcode;
       this.productstatus = productstatus;
       this.productImage = productImage;
       this.frameStatusIdFrameStatus = frameStatusIdFrameStatus;
       this.productDeactivates = productDeactivates;
       this.productHasAddOns = productHasAddOns;
       this.printerHasProducts = printerHasProducts;
       this.productHasSubcategories = productHasSubcategories;
    }
   
    public Integer getIdproduct() {
        return this.idproduct;
    }
    
    public void setIdproduct(Integer idproduct) {
        this.idproduct = idproduct;
    }
    public Cateogry getCateogry() {
        return this.cateogry;
    }
    
    public void setCateogry(Cateogry cateogry) {
        this.cateogry = cateogry;
    }
    public Printer getPrinter() {
        return this.printer;
    }
    
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
    public String getProductname() {
        return this.productname;
    }
    
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public String getProductcode() {
        return this.productcode;
    }
    
    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }
    public String getProductstatus() {
        return this.productstatus;
    }
    
    public void setProductstatus(String productstatus) {
        this.productstatus = productstatus;
    }
    public String getProductImage() {
        return this.productImage;
    }
    
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
    public int getFrameStatusIdFrameStatus() {
        return this.frameStatusIdFrameStatus;
    }
    
    public void setFrameStatusIdFrameStatus(int frameStatusIdFrameStatus) {
        this.frameStatusIdFrameStatus = frameStatusIdFrameStatus;
    }
    public Set<ProductDeactivate> getProductDeactivates() {
        return this.productDeactivates;
    }
    
    public void setProductDeactivates(Set<ProductDeactivate> productDeactivates) {
        this.productDeactivates = productDeactivates;
    }
    public Set<ProductHasAddOn> getProductHasAddOns() {
        return this.productHasAddOns;
    }
    
    public void setProductHasAddOns(Set<ProductHasAddOn> productHasAddOns) {
        this.productHasAddOns = productHasAddOns;
    }
    public Set<PrinterHasProduct> getPrinterHasProducts() {
        return this.printerHasProducts;
    }
    
    public void setPrinterHasProducts(Set<PrinterHasProduct> printerHasProducts) {
        this.printerHasProducts = printerHasProducts;
    }
    public Set<ProductHasSubcategory> getProductHasSubcategories() {
        return this.productHasSubcategories;
    }
    
    public void setProductHasSubcategories(Set<ProductHasSubcategory> productHasSubcategories) {
        this.productHasSubcategories = productHasSubcategories;
    }




}

