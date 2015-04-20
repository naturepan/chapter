package com.smart.demo;

import javax.persistence.*;

/**
 * Created by Administrator on 2015/4/17.
 */
@Entity
@Table(name="t_view_point")
public class ViewPoint extends BaseDemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="view_id")
    protected int viewId;

    @Column(name="view_name")
    protected  String viewName;

    @ManyToOne
    @JoinColumn(name="space_id")
    protected ViewSpace viewSpace;

    public int getViewId() {
        return viewId;
    }

    public void setViewId(int viewId) {
        this.viewId = viewId;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public ViewSpace getViewSpace() {
        return viewSpace;
    }

    public void setViewSpace(ViewSpace viewSpace) {
        this.viewSpace = viewSpace;
    }
}
