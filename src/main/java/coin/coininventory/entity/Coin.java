package coin.coininventory.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "coindata")
public class Coin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coindataid")
    private long coindataid;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "userfk")
    private User user;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "typefk")
    private CoinType type;

    @Column(name = "year")
    private int year;

    @Column(name = "mintmark")
    private String mintmark;

    @Column(name = "serialnumber")
    private String serialnumber;

    @Column(name = "grade")
    private String grade;

    @Column(name = "notes")
    private String notes;

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(
            name = "transaction",
            joinColumns = {@JoinColumn(name = "coinidfk", referencedColumnName = "coindataid")}
    )
    private List<Transaction> transactionList;

    public Coin() {

    }

    public long getCoindataid() {
        return coindataid;
    }

    public void setCoindataid(long coindataid) {
        this.coindataid = coindataid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CoinType getType() {
        return type;
    }

    public void setType(CoinType type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMintmark() {
        return mintmark;
    }

    public void setMintmark(String mintmark) {
        this.mintmark = mintmark;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
