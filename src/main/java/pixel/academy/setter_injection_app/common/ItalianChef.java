package pixel.academy.setter_injection_app.common;


import ch.qos.logback.classic.spi.PlatformInfo;
import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef {

    public ItalianChef(){
        System.out.println("In constructor"+ getClass().getSimpleName());
        System.out.println("Plin");
        }
    @Override
    public String getDailyRecipe() {
        return " Prepare pasta al pomodoro with frsh tomatoees and basil.";
    }
}
