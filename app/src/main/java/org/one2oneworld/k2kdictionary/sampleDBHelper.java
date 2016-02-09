package org.one2oneworld.k2kdictionary;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Louis on 5/2/16.
 */
public class sampleDBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "K2K.db";
    public static final String TABLE_NAME = "k2k";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_VOCAB = "vocab";
    public static final String COLUMN_DEF = "def";

    private static final String SQL_CREATE_TABLE = "CREATE TABLE k2k(" + COLUMN_VOCAB +", def)";
    private static final String SQL_DROP_TABLE = "DROP TABLE IF EXIST k2k";

    public sampleDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_TABLE);
        onCreate(db);
    }
}
