package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0



/**
 * ProductHasSubcategory generated by hbm2java
 */
public class ProductHasSubcategory  implements java.io.Serializable {


     private Integer idproductHasSubcategory;
     private Subcategory subcategory;
     private Product product;

    public ProductHasSubcategory() {
    }

    public ProductHasSubcategory(Subcategory subcategory, Product product) {
       this.subcategory = subcategory;
       this.product = product;
    }
   
    public Integer getIdproductHasSubcategory() {
        return this.idproductHasSubcategory;
    }
    
    public void setIdproductHasSubcategory(Integer idproductHasSubcategory) {
        this.idproductHasSubcategory = idproductHasSubcategory;
    }
    public Subcategory getSubcategory() {
        return this.subcategory;
    }
    
    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }




}


