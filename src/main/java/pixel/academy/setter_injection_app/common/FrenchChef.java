package pixel.academy.setter_injection_app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FrenchChef implements Chef {

    public FrenchChef(){
        System.out.println("In constructor"+ getClass().getSimpleName());
        System.out.println("Empty"+ getClass().getSimpleName());
    }
    @Override
    public String getDailyRecipe() {
        return " Prepare boeuf ";
    }
}
