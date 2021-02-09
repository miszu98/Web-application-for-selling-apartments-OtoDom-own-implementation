package com.portal.otodom.Models;

import com.portal.otodom.Services.UserService;

import javax.persistence.*;
import java.text.NumberFormat;

@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String img;

    private int numberOfRooms;
    private int floor;
    private String kindOfBuilding;
    private String address;
    private String city;
    private int rent;
    private float surface;
    private String region;
    private int price;
    private String email;
    private int phoneNumber;
    private Long authorId;
    @Column(length = 5000)
    private String description;


    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getFormatPrice() {
        var numberFormat = NumberFormat.getCurrencyInstance();
        return numberFormat.format(price);
    }

    public String getFormatRent() {
        return NumberFormat.getCurrencyInstance().format(rent);
    }

    public String getFormatSurface() {
        return getSurface() + " m²";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLoc() {
        return " " + city + ", " + region + ", " + address;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public String getDesc() {
        return description.substring(0, 150) + "...";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getKindOfBuilding() {
        return kindOfBuilding;
    }

    public void setKindOfBuilding(String kindOfBuilding) {
        this.kindOfBuilding = kindOfBuilding;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", floor=" + floor +
                ", kindOfBuilding='" + kindOfBuilding + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", rent=" + rent +
                ", surface=" + surface +
                ", region='" + region + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public void setImg(String img) {
        this.img = img;
    }
}
