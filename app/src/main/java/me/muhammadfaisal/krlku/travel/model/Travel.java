package me.muhammadfaisal.krlku.travel.model;

public class Travel {
    String title, subtitle, other;
    int price, otherPrice, image;

    public Travel(String title, String subtitle, String other, int price, int otherPrice, int image){
        this.title = title;
        this.subtitle = subtitle;
        this.other = other;
        this.price = price;
        this.otherPrice = otherPrice;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOtherPrice() {
        return otherPrice;
    }

    public void setOtherPrice(int otherPrice) {
        this.otherPrice = otherPrice;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
