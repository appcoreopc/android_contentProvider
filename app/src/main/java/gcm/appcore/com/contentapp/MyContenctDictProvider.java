package gcm.appcore.com.contentapp;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.widget.SimpleCursorAdapter;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jeremyw on 23/03/2016.
 */

public class MyContenctDictProvider extends ContentProvider {

    private Map<String, String> kb;

    @Override
    public boolean onCreate() {

        kb = new HashMap<String, String>();
        kb.put("A", "AAAA");
        kb.put("B", "BBBB");
        kb.put("C", "CCCC");

        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        String[] columns = new String[] { "_id", "item"};
        MatrixCursor matrixCursor = new MatrixCursor(columns);
        matrixCursor.addRow(new Object[] {"1", "SqlDataReader"});
        matrixCursor.addRow(new Object[] {"2", "DataTable"});
        return matrixCursor;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return "MyContentDictProvider";
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return ContentProviderConstant.CONTENT_URI;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}

