/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;




public class room {
    private int room_id;
    private String description;
    //Buscar como guardar la imagen
    private int maximun_adults;
    private int maximun_kids;
    private double price_per_day_adults;
    private double price_per_day_kids;
    private boolean room_status;
    private boolean reserved;

    public room() {
    }

    public room(int room_id, String description, int maximun_adults, int maximun_kids, double price_per_day_adults, double price_per_day_kids, boolean room_status, boolean reserved) {
        this.room_id = room_id;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "room{" + "room_id=" + room_id + ", description=" + description + ", maximun_adults=" + maximun_adults + ", maximun_kids=" + maximun_kids + ", price_per_day_adults=" + price_per_day_adults + ", price_per_day_kids=" + price_per_day_kids + ", room_status=" + room_status + ", reserved=" + reserved + '}';
    }
    
    
    
    
}
