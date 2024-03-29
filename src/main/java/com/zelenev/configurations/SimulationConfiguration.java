package com.zelenev.configurations;


import com.zelenev.bpp.InjectRandomCarDirectionAnnotationBeanPostProcessor;
import com.zelenev.bpp.InjectRandomIntAnnotationBeanPostProcessor;
import com.zelenev.data.entities.Car;
import com.zelenev.data.entities.Crossroad;
import com.zelenev.data.entities.Road;
import com.zelenev.data.entities.TrafficLight;
import com.zelenev.data.states.CarDirection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import java.util.Arrays;
import java.util.List;


@Configuration
public class SimulationConfiguration {

    @Bean("car")
    @Scope("prototype")
    public Car car() {
        //TODO: complete car bean creation
        return new Car();
    }

    @Bean("trafficLight")
    @Scope("prototype")
    public TrafficLight trafficLight() {
        //TODO: complete traffic light bean creation
        return new TrafficLight();
    }

    @Bean("crossroad")
    @Scope("prototype")
    public Crossroad crossroad() {
        //TODO: complete crossroad bean creating
        return new Crossroad();
    }

    @Bean("road")
    @Scope("prototype")
    public Road road() {
        //TODO: complete road bean creating
        return new Road();
    }


    @Bean
    public List<CarDirection> directions() {
        return Arrays.asList(
                CarDirection.FORWARD,
                CarDirection.LEFT,
                CarDirection.RIGHT
        );
    }

    @Bean
    public InjectRandomIntAnnotationBeanPostProcessor injectRandomIntAnnotationBeanPostProcessor() {
        return new InjectRandomIntAnnotationBeanPostProcessor();
    }

    @Bean
    public InjectRandomCarDirectionAnnotationBeanPostProcessor injectRandomDirectionAnnotationBeanPostProcessor() {
        return new InjectRandomCarDirectionAnnotationBeanPostProcessor();
    }

}
