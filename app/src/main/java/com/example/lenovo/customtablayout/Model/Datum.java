
package com.example.lenovo.customtablayout.Model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Datum {

    @SerializedName("game_banner")
    private String mGameBanner;
    @SerializedName("game_category")
    private String mGameCategory;
    @SerializedName("game_description")
    private String mGameDescription;
    @SerializedName("game_icon")
    private String mGameIcon;
    @SerializedName("game_link")
    private String mGameLink;
    @SerializedName("game_name")
    private String mGameName;
    @SerializedName("game_tags")
    private String mGameTags;
    @SerializedName("id")
    private String mId;
    @SerializedName("rating")
    private Double mRating;

    public String getGameBanner() {
        return mGameBanner;
    }

    public void setGameBanner(String gameBanner) {
        mGameBanner = gameBanner;
    }

    public String getGameCategory() {
        return mGameCategory;
    }

    public void setGameCategory(String gameCategory) {
        mGameCategory = gameCategory;
    }

    public String getGameDescription() {
        return mGameDescription;
    }

    public void setGameDescription(String gameDescription) {
        mGameDescription = gameDescription;
    }

    public String getGameIcon() {
        return mGameIcon;
    }

    public void setGameIcon(String gameIcon) {
        mGameIcon = gameIcon;
    }

    public String getGameLink() {
        return mGameLink;
    }

    public void setGameLink(String gameLink) {
        mGameLink = gameLink;
    }

    public String getGameName() {
        return mGameName;
    }

    public void setGameName(String gameName) {
        mGameName = gameName;
    }

    public String getGameTags() {
        return mGameTags;
    }

    public void setGameTags(String gameTags) {
        mGameTags = gameTags;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Double getRating() {
        return mRating;
    }

    public void setRating(Double rating) {
        mRating = rating;
    }

}
