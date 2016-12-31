package us.bojie.permissiontest;

import android.Manifest;
import android.app.Activity;
import android.widget.Toast;

import java.util.List;

/**
 * Created by bojiejiang on 12/30/16.
 */

public class Util {

    public static void test() {
        final Activity topActivity = ActivityCollector.getTopActivity();
        BaseActivity.requestRuntimePermission(new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                new PermissionListener() {
                    @Override
                    public void onGranted() {
                        Toast.makeText(topActivity, "All permissions has been granted.", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onDenied(List<String> deniedPermission) {
                        for (String permission : deniedPermission) {
                            Toast.makeText(topActivity, "Denied permission: " + permission, Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
