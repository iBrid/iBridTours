package com.example.android.ibridtours;

public class Content {

    private static final int NO_IMAGE = -1;
    private String mName;
    private String mDetails;
    private int mImages = NO_IMAGE;

    public Content(String Name, String Details, int Images) {
        mName = Name;
        mDetails = Details;
        mImages = Images;
    }

    public Content(String Name, String Details) {
        mName = Name;
        mDetails = Details;
    }

    /**
     * get the name of a place or hotel or events
     *
     * @return
     */
    public String getName() {
        return mName;
    }

    /**
     * get the details of a place or hotel or events
     *
     * @return
     */
    public String getDetails() {
        return mDetails;
    }

    /**
     * get the images for the app
     *
     * @return
     */
    public int getImages() {
        return mImages;
    }

    /**
     * if no image provided
     */
    public boolean imageAvailable() {
        return mImages != NO_IMAGE;
    }
}
