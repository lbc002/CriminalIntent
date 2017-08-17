package com.bignerdranch.android.criminalintent;

import android.text.format.DateFormat;
import java.util.Date;
import java.util.UUID;


/**
 * Created by root on 16/08/17.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private String mDate;
    private boolean mSolved;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();

        DateFormat df = new android.text.format.DateFormat();
        mDate = df.format("yyyy-MM-dd hh:mm:ss a", new Date()).toString();



    }
}
