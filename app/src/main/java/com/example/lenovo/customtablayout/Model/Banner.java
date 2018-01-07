
package com.example.lenovo.customtablayout.Model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Banner {

    @SerializedName("category")
    private String mCategory;
    @SerializedName("date")
    private String mDate;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("image")
    private String mImage;
    @SerializedName("t_id")
    private String mTId;
    @SerializedName("title")
    private String mTitle;

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getTId() {
        return mTId;
    }

    public void setTId(String tId) {
        mTId = tId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
