package classes;

import java.util.Objects;

/**
 * @author mengyuantan
 * @date 2022/9/18 22:25
 */
public class AssetUtil {

    public static void asset(boolean b) {
        if (!b) {
            throw new RuntimeException("asset fail");
        }
    }

    public static void assertEqual(Object obj1, Object obj2) {
        if (!Objects.equals(obj1, obj2)) {
            throw new RuntimeException(String.format("except: %s, but find: %s", obj2, obj1));
        }
    }
}
