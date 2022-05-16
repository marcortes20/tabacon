/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;


public class invoices {
   
   private int invoice_id;
   private int reservation_id;
   private Date date;

    public invoices() {
    }

    public invoices(int invoice_id, int reservation_id, Date date) {
        this.invoice_id = invoice_id;
        this.reservation_id = reservation_id;
        this.date = date;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "invoices{" + "invoice_id=" + invoice_id + ", reservation_id=" + reservation_id + ", date=" + date + '}';
    }
   
   
   
}
