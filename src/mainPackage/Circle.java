package mainPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;




@Component
public class Circle implements Shape, ApplicationEventPublisherAware{



    private ApplicationEventPublisher publisher;
    private Point center;



    @Autowired
    private MessageSource messageSource;



    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCenter() {
        return center;
    }



//     @Required
//    public void setCenter(Point center) {
//        this.center = center;
//    }


//    @Autowired
//    @Qualifier( value = "circleRelated" )
//    public void setCenter(Point center) {
//        this.center = center;
//    }

    @Required
    @Resource(name = "pointA")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {

        System.out.println("Circle : Point is : " + center.getY()+ ", " +center.getX() + " ,  " + getClass() );


//        System.out.println("Circle : Point is : " + this.messageSource.getMessage("drawing.circle", null, "Default drawing.circle", null));

  //      System.out.println("Message is : "+ this.messageSource.getMessage("greationmessage", null, "Default Greetings", null));

        DrawEvent drawEvent = new DrawEvent(this);

        publisher.publishEvent(drawEvent);

    }


    @PostConstruct
    public void initializeCircle(){


        System.out.println("Circle Initialize ");


    }

    @PreDestroy
    public void idistroyCircle(){


        System.out.println("Circle Distroyed ");


    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {




        this.publisher = publisher;

    }
}
