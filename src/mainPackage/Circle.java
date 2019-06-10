package mainPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;




@Component
public class Circle implements Shape {




    private Point center;

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


    @Resource(name = "pointA")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {

        System.out.println("Circle : Point is : " + center.getY()+ ", " +center.getX() + " ,  " + getClass() );

    }


    @PostConstruct
    public void initializeCircle(){


        System.out.println("Circle Initialize ");


    }

    @PreDestroy
    public void idistroyCircle(){


        System.out.println("Circle Distroyed ");


    }
}
