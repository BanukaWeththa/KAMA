package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * TransactionStatus generated by hbm2java
 */
public class TransactionStatus  implements java.io.Serializable {


     private Integer idtransactionStatus;
     private String transactionStatusName;
     private Set<Transaction> transactions = new HashSet<Transaction>(0);

    public TransactionStatus() {
    }

    public TransactionStatus(String transactionStatusName, Set<Transaction> transactions) {
       this.transactionStatusName = transactionStatusName;
       this.transactions = transactions;
    }
   
    public Integer getIdtransactionStatus() {
        return this.idtransactionStatus;
    }
    
    public void setIdtransactionStatus(Integer idtransactionStatus) {
        this.idtransactionStatus = idtransactionStatus;
    }
    public String getTransactionStatusName() {
        return this.transactionStatusName;
    }
    
    public void setTransactionStatusName(String transactionStatusName) {
        this.transactionStatusName = transactionStatusName;
    }
    public Set<Transaction> getTransactions() {
        return this.transactions;
    }
    
    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }




}


