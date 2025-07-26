package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;



@Component
public class TurkisChef implements Chef {

    public TurkisChef( ){
        System.out.println("In constructor"+ getClass().getSimpleName() );

        }
    @Override
    public String getDailyRecipe() {
         return " Prepare  kebab.";
    }
}
