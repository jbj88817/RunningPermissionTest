package us.bojie.permissiontest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bojiejiang on 12/30/16.
 */

public class ActivityCollector {

    private static List<Activity> sActivityList = new ArrayList<>();

    public static void addActivity(Activity activity) {
        sActivityList.add(activity);
    }

    public static void removeActivity(Activity activity) {
        sActivityList.remove(activity);
    }

    public static Activity getTopActivity() {
        if (sActivityList.isEmpty()) {
            return null;
        } else {
            return sActivityList.get(sActivityList.size() - 1);
        }
    }


}
