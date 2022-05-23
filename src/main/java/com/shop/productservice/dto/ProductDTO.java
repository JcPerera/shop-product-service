package com.shop.productservice.dto;

import java.util.Arrays;

public class ProductDTO {
    private String id;
    private String title;
    private String desc;
    private String img;
    private String[] categories;
    private String[] size;
    private String[] color;
    private double price;
    private boolean inStock;

    public ProductDTO(String id, String title, String desc, String img, String[] categories, String[] size, String[] color, double price, boolean inStock) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.img = img;
        this.categories = categories;
        this.size = size;
        this.color = color;
        this.price = price;
        this.inStock = inStock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", img='" + img + '\'' +
                ", categories=" + Arrays.toString(categories) +
                ", size=" + Arrays.toString(size) +
                ", color=" + Arrays.toString(color) +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }
}
