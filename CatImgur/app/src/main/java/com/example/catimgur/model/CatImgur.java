package com.example.catimgur.model;

import java.util.ArrayList;

public class CatImgur {
    Data DataObject;
    private boolean success;
    private float status;


    // Getter Methods

    public Data getData() {
        return DataObject;
    }

    public boolean getSuccess() {
        return success;
    }

    public float getStatus() {
        return status;
    }

    // Setter Methods

    public void setData(Data dataObject) {
        this.DataObject = dataObject;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setStatus(float status) {
        this.status = status;
    }

    public class Data {
        private String id;
        private String title;
        private String description = null;
        private float datetime;
        private String cover;
        private String account_url;
        private float account_id;
        private String privacy;
        private String layout;
        private float views;
        private String link;
        private float ups;
        private float downs;
        private float points;
        private float score;
        private boolean is_album;
        private String vote = null;
        private float comment_count;
        private float images_count;
        ArrayList<CatImgur> images = new ArrayList<>();

        public ArrayList<CatImgur> getImages() {
            return images;
        }

        public void setImages(ArrayList<CatImgur> images) {
            this.images = images;
        }
// Getter Methods

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public float getDatetime() {
            return datetime;
        }

        public String getCover() {
            return cover;
        }

        public String getAccount_url() {
            return account_url;
        }

        public float getAccount_id() {
            return account_id;
        }

        public String getPrivacy() {
            return privacy;
        }

        public String getLayout() {
            return layout;
        }

        public float getViews() {
            return views;
        }

        public String getLink() {
            return link;
        }

        public float getUps() {
            return ups;
        }

        public float getDowns() {
            return downs;
        }

        public float getPoints() {
            return points;
        }

        public float getScore() {
            return score;
        }

        public boolean getIs_album() {
            return is_album;
        }

        public String getVote() {
            return vote;
        }

        public float getComment_count() {
            return comment_count;
        }

        public float getImages_count() {
            return images_count;
        }

        // Setter Methods

        public void setId(String id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setDatetime(float datetime) {
            this.datetime = datetime;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public void setAccount_url(String account_url) {
            this.account_url = account_url;
        }

        public void setAccount_id(float account_id) {
            this.account_id = account_id;
        }

        public void setPrivacy(String privacy) {
            this.privacy = privacy;
        }

        public void setLayout(String layout) {
            this.layout = layout;
        }

        public void setViews(float views) {
            this.views = views;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public void setUps(float ups) {
            this.ups = ups;
        }

        public void setDowns(float downs) {
            this.downs = downs;
        }

        public void setPoints(float points) {
            this.points = points;
        }

        public void setScore(float score) {
            this.score = score;
        }

        public void setIs_album(boolean is_album) {
            this.is_album = is_album;
        }

        public void setVote(String vote) {
            this.vote = vote;
        }

        public void setComment_count(float comment_count) {
            this.comment_count = comment_count;
        }

        public void setImages_count(float images_count) {
            this.images_count = images_count;
        }
    }
}