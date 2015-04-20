package com.smart.beanFactory;

import com.smart.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;


/**
 * Created by Administrator on 2015/3/31.
 */
public class BeanFactoryTest   {
   public static void main(String[] args) throws Throwable{
      ResourcePatternResolver resourcePartternReslover = new PathMatchingResourcePatternResolver();
      Resource res =  resourcePartternReslover.getResource("classpath:com/smart/beanFactory/beans.xml");
       BeanFactory bf = new XmlBeanFactory(res);
       System.out.println("init");
      Car car = bf.getBean("car1",Car.class);
     System.out.println(car.getBrand());
     //  System.out.println("car start");
   }
}
