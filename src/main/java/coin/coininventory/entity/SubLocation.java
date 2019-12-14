package coin.coininventory.entity;

import javax.persistence.*;

public class SubLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sublocationid")
    private long sublocationid;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "userfk")
    private User user;

    @Column(name = "sublocation")
    private String sublocation;

    public SubLocation() {
    }

    public SubLocation(long sublocationid, User user, String sublocation) {
        this.sublocationid = sublocationid;
        this.user = user;
        this.sublocation = sublocation;
    }

    public long getSublocationid() {
        return sublocationid;
    }

    public void setSublocationid(long sublocationid) {
        this.sublocationid = sublocationid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSublocation() {
        return sublocation;
    }

    public void setSublocation(String sublocation) {
        this.sublocation = sublocation;
    }
}
