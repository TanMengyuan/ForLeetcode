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

    public static void assertEqual(Object actualResult, Object exceptResult) {
        if (Objects.equals(actualResult, exceptResult)) {
            System.out.println("asset success");
            return;
        }

        throw new RuntimeException(String.format("except: %s, but find: %s", exceptResult, actualResult));
    }
}
