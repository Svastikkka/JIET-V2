package com.svatikk.jietuniverse;

/**
 * Created by manshusharma on 22/10/17.
 */

public class Data {
    private String title, thumbnailUrl;

    public Data() {
    }

    public Data(String name, String thumbnailUrl) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }


}