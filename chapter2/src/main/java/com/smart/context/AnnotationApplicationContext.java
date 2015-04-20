package com.smart.context;

import com.smart.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2015/4/2.
 */
public class AnnotationApplicationContext {
  public  static void main(String[] args){
      ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
      Car car = ctx.getBean("car",Car.class);
      System.out.println(car.getBrand());
  }
}
