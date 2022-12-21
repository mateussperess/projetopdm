package com.example.peres;

public class Propertie {
    private String title;
    private float price;
    private String image;
    private String description;
    private float idCategory;
    private String message;

    public Propertie(String title, float price, String image, String description, float idCategory, String message) {
        this.title = title;
        this.price = price;
        this.image = image;
        this.description = description;
        this.idCategory = idCategory;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(float idCategory) {
        this.idCategory = idCategory;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
