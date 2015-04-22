package com.smart.demo;

import javax.persistence.*;

/**
 * Created by Administrator on 2015/4/17.
 */
@Entity
@Table(name="t_comment_log")
public class CommentLog extends BaseDemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="log_id")
    protected int logId;

    @Column(name="ip")
    protected  String ip;

    @Column(name="log_type")
    protected int logType;

    @ManyToOne
    @JoinColumn(name="point_id")
    protected  ViewPoint viewPoint;

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getLogType() {
        return logType;
    }

    public void setLogType(int logType) {
        this.logType = logType;
    }

    public ViewPoint getViewPoint() {
        return viewPoint;
    }

    public void setViewPoint(ViewPoint viewPoint) {
        this.viewPoint = viewPoint;
    }
}
