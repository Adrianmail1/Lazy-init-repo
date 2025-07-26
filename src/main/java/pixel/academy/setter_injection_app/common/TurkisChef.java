package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;



@Component
public class TurkisChef implements Chef {

    @Override
    public String getDailyRecipe() {
         return " Prepare  kebab.";
    }
}
