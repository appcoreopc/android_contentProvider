package gcm.appcore.com.contentapp;

import android.net.Uri;

public class ContentProviderConstant {

    public static String Authorities = "gcm.appcore.com.contentapp";
    public static String FakeAuthorities = "gcm.appcore.com.contentapp";

    public static String Content = "content://";

    public static Uri CONTENT_URI = Uri.parse(Content + Authorities + "/todo");
    public static Uri FAKE_CONTENT_URI = Uri.parse(Content + FakeAuthorities + "/todo");
}
