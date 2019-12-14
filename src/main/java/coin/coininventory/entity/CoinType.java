package coin.coininventory.entity;

import javax.persistence.*;

public class CoinType {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "typeid")
        private long typeid;

        @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
        @JoinColumn(name = "userfk")
        private User user;

        @Column(name = "cointype")
        private String cointype;

    public CoinType(long typeid, User user, String cointype) {
        this.typeid = typeid;
        this.user = user;
        this.cointype = cointype;
    }

    public CoinType() {
    }

    public long getTypeid() {
        return typeid;
    }

    public void setTypeid(long typeid) {
        this.typeid = typeid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCointype() {
        return cointype;
    }

    public void setCointype(String cointype) {
        this.cointype = cointype;
    }
}
