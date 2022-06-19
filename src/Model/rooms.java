/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;




public class rooms {
    private int room_id;
    private int category;
    private String image;
    private int maximun_adults;
    private int maximun_kids;
    private double price_per_day_adults;
    private double price_per_day_kids;
    private boolean room_status;
    private boolean reserved;

    public rooms() {
    }

    public rooms(int room_id, int category, String image, int maximun_adults, int maximun_kids, double price_per_day_adults, double price_per_day_kids, boolean room_status, boolean reserved) {
        this.room_id = room_id;
        this.category = category;
        this.image = image;
        this.maximun_adults = maximun_adults;
        this.maximun_kids = maximun_kids;
        this.price_per_day_adults = price_per_day_adults;
        this.price_per_day_kids = price_per_day_kids;
        this.room_status = room_status;
        this.reserved = reserved;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getMaximun_adults() {
        return maximun_adults;
    }

    public void setMaximun_adults(int maximun_adults) {
        this.maximun_adults = maximun_adults;
    }

    public int getMaximun_kids() {
        return maximun_kids;
    }

    public void setMaximun_kids(int maximun_kids) {
        this.maximun_kids = maximun_kids;
    }

    public double getPrice_per_day_adults() {
        return price_per_day_adults;
    }

    public void setPrice_per_day_adults(double price_per_day_adults) {
        this.price_per_day_adults = price_per_day_adults;
    }

    public double getPrice_per_day_kids() {
        return price_per_day_kids;
    }

    public void setPrice_per_day_kids(double price_per_day_kids) {
        this.price_per_day_kids = price_per_day_kids;
    }

    public boolean isRoom_status() {
        return room_status;
    }

    public void setRoom_status(boolean room_status) {
        this.room_status = room_status;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    
}