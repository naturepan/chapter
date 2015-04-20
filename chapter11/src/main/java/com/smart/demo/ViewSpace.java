package com.smart.demo;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015/4/17.
 */
@Entity
@Table(name="t_viewspace")
public class ViewSpace extends BaseDemo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="sapce_id")
    protected  int spaceId;

    @Column(name="space_name")
    protected  String spaceName;

    @Column(name="create_date")
    protected Date createDate;

    @Column(name="description")
    protected String description;

    @ManyToOne
    @JoinColumn(name="user_id")
    protected  User user;

    @OneToMany(mappedBy = "viewSpace" ,cascade = CascadeType.ALL)
    protected List<ViewPoint> viewPoints ;

    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ViewPoint> getViewPoints() {
        return viewPoints;
    }

    public void setViewPoints(List<ViewPoint> viewPoints) {
        this.viewPoints = viewPoints;
    }
}
