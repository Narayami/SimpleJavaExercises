package finals;

import java.util.concurrent.TimeUnit;

public final class Wait {
    public static void seconds(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
