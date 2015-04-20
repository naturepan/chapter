package com.smart.context;

import com.smart.Car;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
/**
 * Created by Administrator on 2015/4/2.
 */
@Configuration
public class Beans {

    @Bean(name="car")
    public Car BuildCar(){
        Car car  = new Car();
        car.setBrand("HONGDA");
        car.setColor("red");
        return car;
    }


}
