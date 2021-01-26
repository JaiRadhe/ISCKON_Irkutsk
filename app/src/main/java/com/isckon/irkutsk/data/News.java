package com.isckon.irkutsk.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class News implements Parcelable {
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

    protected News(Parcel in) {
        image = in.readInt();
        header = in.readString();
        text = in.readString();
        date = new Date(in.readLong());
    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel in) {
            return new News(in);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(header);
        dest.writeString(text);
        dest.writeLong(date.getTime());
    }
}
