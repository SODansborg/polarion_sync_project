
import java.util.*;

public class DigitalTwin {

    private Map<String,Object> state = new HashMap<>();

    public void apply(String event){
        state.put("lastEvent", event);
    }

    public Map<String,Object> simulate(List<String> events){
        events.forEach(this::apply);
        return state;
    }
}
