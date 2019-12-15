package coin.coininventory.entity;

import javax.persistence.*;

@Entity
@Table(name = "locationdependency")
public class LocationDependency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long locationdependencyid;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "userfk")
    private User user;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "location")
    Location location;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "sublocation")
    SubLocation subLocation;

    public LocationDependency() {
    }

    public long getLocationdependencyid() {
        return locationdependencyid;
    }

    public void setLocationdependencyid(long locationdependencyid) {
        this.locationdependencyid = locationdependencyid;
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
