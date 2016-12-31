package us.bojie.permissiontest;

import java.util.List;

/**
 * Created by bojiejiang on 12/30/16.
 */

public interface PermissionListener {

    void onGranted();

    void onDenied(List<String> deniedPermission);
}
