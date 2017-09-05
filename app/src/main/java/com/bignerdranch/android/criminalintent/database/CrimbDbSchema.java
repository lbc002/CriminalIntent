package com.bignerdranch.android.criminalintent.database;

/**
 * Created by root on 29/08/17.
 */

public class CrimbDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
