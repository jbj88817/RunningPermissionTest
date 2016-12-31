package us.bojie.permissiontest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCollector.addActivity(this);
        // visit inner storage for the package
//        File file = getExternalFilesDir("abc");
    }

    @Override
    protected void onDestroy() {
        ActivityCollector.removeActivity(this);
        super.onDestroy();
    }

    public void buttonClick(View view) {

        Util.test();

//        requestRuntimePermission(new String[]{Manifest.permission.CALL_PHONE,
//                Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.CAMERA}, new PermissionListener() {
//            @Override
//            public void onGranted() {
//                doSomething();
//            }
//
//            @Override
//            public void onDenied(List<String> deniedPermission) {
//                for (String permission : deniedPermission) {
//                    Toast.makeText(MainActivity.this, "Denied permission: " + permission, Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
    }

    private void doSomething() {
        Toast.makeText(this, "All permissions has been granted.", Toast.LENGTH_SHORT).show();
    }

    private void makeCall() {
        try {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel://1234567890"));
            startActivity(intent);
        } catch (SecurityException e) {
            e.printStackTrace();
        }

    }

}
