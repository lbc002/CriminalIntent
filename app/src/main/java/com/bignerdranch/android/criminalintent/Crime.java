package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by root on 16/08/17.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();

    }
}
