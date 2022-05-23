/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;


public class reservation {
    
    private int reservation_id;
    private int room_id;
    private int staff_id;
    private int customer_id;
    private int discount_id;
    private String way_to_pay;
    private int adults_number;
    private int kids_number;
    private String current_date;
    private String entry_date;
    private String departure_date;
    private int reserved_days;

    public reservation() {
    }

    public reservation(int reservation_id, int room_id, int staff_id, int customer_id, int discount_id, String way_to_pay, int adults_number, int kids_number, String current_date, String entry_date, String departure_date, int reserved_days) {
        this.reservation_id = reservation_id;
        this.room_id = room_id;
        this.staff_id = staff_id;
        this.customer_id = customer_id;
        this.discount_id = discount_id;
        this.way_to_pay = way_to_pay;
        this.adults_number = adults_number;
        this.kids_number = kids_number;
        this.current_date = current_date;
        this.entry_date = entry_date;
        this.departure_date = departure_date;
        this.reserved_days = reserved_days;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }

    public String getWay_to_pay() {
        return way_to_pay;
    }

    public void setWay_to_pay(String way_to_pay) {
        this.way_to_pay = way_to_pay;
    }

    public int getAdults_number() {
        return adults_number;
    }

    public void setAdults_number(int adults_number) {
        this.adults_number = adults_number;
    }

    public int getKids_number() {
        return kids_number;
    }

    public void setKids_number(int kids_number) {
        this.kids_number = kids_number;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(String current_date) {
        this.current_date = current_date;
    }

    public String getEntry_date() {
        return entry_date;
    }

    public void setEntry_date(String entry_date) {
        this.entry_date = entry_date;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public int getReserved_days() {
        return reserved_days;
    }

    public void setReserved_days(int reserved_days) {
        this.reserved_days = reserved_days;
    }

    @Override
    public String toString() {
        return "reservation{" + "reservation_id=" + reservation_id + ", room_id=" + room_id + ", staff_id=" + staff_id + ", customer_id=" + customer_id + ", discount_id=" + discount_id + ", way_to_pay=" + way_to_pay + ", adults_number=" + adults_number + ", kids_number=" + kids_number + ", current_date=" + current_date + ", entry_date=" + entry_date + ", departure_date=" + departure_date + ", reserved_days=" + reserved_days + '}';
    }

}