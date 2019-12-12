package coin.coininventory.entity;

import javax.persistence.*;

@Entity
@Table(name = "pic")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "picid")
    private Long picid;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "userfk")
    private User user;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "coinidfk")
    private Coin coin;

    @Lob
    @Column(name = "obverse")
    private byte[] obverse;

    @Lob
    @Column(name = "reverse")
    private byte[] reverse;

    public Image(){

    }

    public Image(User user, Coin coin, byte[] obverse, byte[] reverse) {
        this.user = user;
        this.coin = coin;
        this.obverse = obverse;
        this.reverse = reverse;
    }

    public Long getPicid() {
        return picid;
    }

    public void setPicid(Long picid) {
        this.picid = picid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public byte[] getObverse() {
        return obverse;
    }

    public void setObverse(byte[] obverse) {
        this.obverse = obverse;
    }

    public byte[] getReverse() {
        return reverse;
    }

    public void setReverse(byte[] reverse) {
        this.reverse = reverse;
    }
}
