package org.one2oneworld.k2kdictionary;

import android.provider.BaseColumns;

/**
 * Created by Louis on 5/2/16.
 */
public class sampleContract {
    public sampleContract() {

    }

    public static abstract class sampleBaseColumns implements BaseColumns {
        public static final String TABLE_NAME = "k2k";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_VOCAB = "vocab";
        public static final String COLUMN_DEF = "def";
    }
}
