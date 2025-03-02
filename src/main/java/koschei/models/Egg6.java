package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

 private Needle7 needle7;

 @Autowired
 @Qualifier ("needle")
    public void setNeedle(Needle7 needle7) {
     this.needle7 = needle7;

    }

    @Override
    public String toString() {
        return ", в яйце иголка " + this.needle7.toString();
    }
}
