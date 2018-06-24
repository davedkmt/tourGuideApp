package com.example.android.boraboratourguide;

public class Word {

    /** Name for the word */
    private String mName;

    /** Description for the word */
    private String mDescription;

    /** Image resource ID for the word */
    private int mImageResourceId;

    /**
     * Create a new Word object.
     */
    public Word( int imageResourceId, String name, String description) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
