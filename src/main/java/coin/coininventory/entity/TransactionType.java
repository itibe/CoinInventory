package coin.coininventory.entity;

import javax.persistence.*;

@Entity
@Table(name="trantype")
public class TransactionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trantypeid")
    private long trantypeid;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "userfk")
    private User user;

    @Column(name ="transaction")
    private String transaction;

    /**
     * Default Constructor
     */
    public TransactionType(){

    }

    /**
     * @param trantypeid table primary key
     * @param user User
     * @param transaction transaction description
     */
    public TransactionType(long trantypeid, User user, String transaction) {
        this.trantypeid = trantypeid;
        this.user = user;
        this.transaction = transaction;
    }

    //Getters and Setters
    public long getTrantypeid() {
        return trantypeid;
    }

    public void setTrantypeid(long trantypeid) {
        this.trantypeid = trantypeid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }
}
