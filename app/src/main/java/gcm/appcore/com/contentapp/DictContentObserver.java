package gcm.appcore.com.contentapp;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/**
 * Created by Jeremy on 23/3/2016.
 */
public class DictContentObserver extends ContentObserver {
    /**
     * Creates a content observer.
     *
     * @param handler The handler to run {@link #onChange} on, or null if none.
     */
    public DictContentObserver(Handler handler) {
        super(handler);
    }

    @Override
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);
    }

    @Override
    public void onChange(boolean selfChange, Uri uri) {
        super.onChange(selfChange, uri);
    }
}
