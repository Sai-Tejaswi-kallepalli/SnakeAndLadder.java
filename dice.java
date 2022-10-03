
import java.util.*;
public class dice {
    public int diceNumber;
    public dice{
        diceNumber=0;
    }
    public int roll(){
        diceNumber=(new Random().nextInt(5))+1;
        return diceNumber;
    }
    
}
