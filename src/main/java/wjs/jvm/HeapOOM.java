package wjs.jvm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeapOOM {
    public Map makeLargeMap() {
        Map<Integer, List<Double>> container = new HashMap<>();
        int i =0;
        try {
            for (i = 0; i < Integer.MAX_VALUE; i++) {
                container.put(i, Arrays.asList(Math.random()));
            }
        } catch (OutOfMemoryError outOfMemoryError) {
            System.out.println("OutOfMemoryError, break");
        } catch (Throwable throwable) {
            System.out.println("OOM at " + i);
        }
        return container;
    }
}
