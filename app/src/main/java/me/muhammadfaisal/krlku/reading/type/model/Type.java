package me.muhammadfaisal.krlku.reading.type.model;

public class Type {
    String title, description, madeBy;
    int image, flag;

    public Type(String title, String description, String madeBy, int image, int flag) {
        this.title = title;
        this.description = description;
        this.madeBy = madeBy;
        this.image = image;
        this.flag = flag;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
