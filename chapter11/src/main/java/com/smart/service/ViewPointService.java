package com.smart.service;

import com.smart.dao.ViewPointDao;
import com.smart.demo.ViewPoint;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2015/4/20.
 */
public class ViewPointService {
 @Autowired
 private ViewPointDao viewPointDao;

    public void doSave(ViewPoint viewPoint){
     viewPointDao.save(viewPoint);
    }

    public void doDelete(ViewPoint viewPoint){
        viewPointDao.remove(viewPoint);
    }

    public void doUpdate(ViewPoint viewPoint){
        viewPointDao.update(viewPoint);
    }
}
