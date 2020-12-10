package com.isckon.irkutsk.data;

import java.util.Date;

public class News {
    private int image;
    private String header;
    private String text;
    private Date date;

    public News(int image, String header, String text, Date date) {
        this.image = image;
        this.header = header;
        this.text = text;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
