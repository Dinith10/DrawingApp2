package mainPackage;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListiner implements ApplicationListener {


    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        System.out.println("Event is publishing : "+ event.toString());


    }



}
