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
            joinColumns = {@JoinColumn(name = "trantypefk", referencedColumnName = "trantypeid")},
            inverseJoinColumns = {@JoinColumn(name = "", referencedColumnName = "", unique = true)}
    )
    private List<Transaction> transactionList;
}
