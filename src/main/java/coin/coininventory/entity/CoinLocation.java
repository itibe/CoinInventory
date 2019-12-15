package coin.coininventory.entity;

import javax.persistence.*;

@Entity
@Table(name = "coinlocation")
public class CoinLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long coinlocationid;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "userfk")
    private User user;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "locationfk")
    private Location location;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "sublocationfk")
    private SubLocation subLocation;

    public CoinLocation() {
    }

    public long getCoinlocationid() {
        return coinlocationid;
    }

    public void setCoinlocationid(long coinlocationid) {
        this.coinlocationid = coinlocationid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public SubLocation getSubLocation() {
        return subLocation;
    }

    public void setSubLocation(SubLocation subLocation) {
        this.subLocation = subLocation;
    }
}
