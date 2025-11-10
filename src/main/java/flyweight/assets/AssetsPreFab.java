package flyweight.assets;

import java.util.HashMap;
import java.util.Map;

public class AssetsPreFab {

    private static Map<Integer,PreFab> preFabMap= new HashMap<>();

    public static PreFab getPreFabMap(PreFab preFab) {
        int id= preFab.getId();
        if(!preFabMap.containsKey(id))
            preFabMap.put(id,preFab);
        return preFabMap.get(id);
    }
}
