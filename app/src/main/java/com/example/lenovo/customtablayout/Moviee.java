
package com.example.lenovo.customtablayout;

import java.util.List;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Moviee {

    @SerializedName("data")
    private List<Datum> mData;
    @SerializedName("id")
    private Long mId;

    public List<Datum> getData() {
        return mData;
    }

    public void setData(List<Datum> data) {
        mData = data;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

}
