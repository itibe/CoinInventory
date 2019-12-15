package coin.coininventory.entity;

import javax.persistence.*;
@Entity
@Table(name = "location")
public class Location {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "locationid")
        private long locationid;

        @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
        @JoinColumn(name = "userfk")
        private User user;

        @Column(name = "location")
        private String location;

    public Location() {
    }

    public Location(long locationid, User user, String location) {
        this.locationid = locationid;
        this.user = user;
        this.location = location;
    }

    public long getLocationid() {
        return locationid;
    }

    public void setLocationid(long locationid) {
        this.locationid = locationid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
