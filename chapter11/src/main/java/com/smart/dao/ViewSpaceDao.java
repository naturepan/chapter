package com.smart.dao;

import com.smart.demo.ViewSpace;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2015/4/17.
 */
@Repository
public class ViewSpaceDao extends BaseDao<ViewSpace>{
    public List<ViewSpace> findByName(String spaceName){
       String hql = "from ViewSpace vs where vs.spaceName like ?" ;
       String name = "%"+spaceName+"%";
       return this.find(hql,name);
    }

    public List<ViewSpace> findByUserId(int userId){
       String hql = "select vs from ViewSpace vs  where vs.user.userId=?";
       int id = userId;
        System.out.println("userId="+id);
        return this.find(hql,id);
    }

}
