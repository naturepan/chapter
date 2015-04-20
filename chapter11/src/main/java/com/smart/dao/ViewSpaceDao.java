package com.smart.dao;

import com.smart.demo.ViewSpace;

import java.util.List;

/**
 * Created by Administrator on 2015/4/17.
 */
public class ViewSpaceDao extends BaseDao<ViewSpace>{
    public List<ViewSpace> findByName(String spaceName){
       String hql = "from ViewSpace vs where vs.spaceName like ?" ;
       String name = "%"+spaceName+"%";
       return this.find(hql,name);
    }

    public List<ViewSpace> findByUserId(int userId){
       String hql = "from ViewSpace vs left join vs.user user where user.userId=?";
       int id = userId;
        return this.find(hql,id);
    }
}
