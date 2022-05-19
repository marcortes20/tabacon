/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class discounts {
    
    private int discount_id;
    private int discount;
    private String description;

    public discounts() {
    }

    public discounts(int discount_id, int discount, String description) {
        this.discount_id = discount_id;
        this.discount = discount;
        this.description = description;
    }

    public int getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "discounts{" + "discount_id=" + discount_id + ", discount=" + discount + ", description=" + description + '}';
    }
    
    
}
