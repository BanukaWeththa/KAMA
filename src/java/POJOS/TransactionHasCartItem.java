package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0



/**
 * TransactionHasCartItem generated by hbm2java
 */
public class TransactionHasCartItem  implements java.io.Serializable {


     private Integer idtransactionHasCartItem;
     private Transaction transaction;
     private int cartItemIdorder;

    public TransactionHasCartItem() {
    }

    public TransactionHasCartItem(Transaction transaction, int cartItemIdorder) {
       this.transaction = transaction;
       this.cartItemIdorder = cartItemIdorder;
    }
   
    public Integer getIdtransactionHasCartItem() {
        return this.idtransactionHasCartItem;
    }
    
    public void setIdtransactionHasCartItem(Integer idtransactionHasCartItem) {
        this.idtransactionHasCartItem = idtransactionHasCartItem;
    }
    public Transaction getTransaction() {
        return this.transaction;
    }
    
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
    public int getCartItemIdorder() {
        return this.cartItemIdorder;
    }
    
    public void setCartItemIdorder(int cartItemIdorder) {
        this.cartItemIdorder = cartItemIdorder;
    }




}


