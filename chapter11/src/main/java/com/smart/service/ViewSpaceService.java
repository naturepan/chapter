package com.smart.service;

import com.smart.dao.ViewPointDao;
import com.smart.dao.ViewSpaceDao;
import com.smart.demo.ViewPoint;
import com.smart.demo.ViewSpace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/4/20.
 */
@Service
public class ViewSpaceService {
 @Autowired
 private ViewSpaceDao viewSpaceDao;

    public void doSave(ViewSpace viewSpace){
        viewSpaceDao.save(viewSpace);
    }

    public void doDelete(ViewSpace viewSpace){
        viewSpaceDao.remove(viewSpace);
    }

    public void doUpdate(ViewSpace viewSpace){
        viewSpaceDao.update(viewSpace);
    }

    public List<ViewSpace> findByUserId(int userId){
        return  viewSpaceDao.findByUserId(userId);
    }
}
