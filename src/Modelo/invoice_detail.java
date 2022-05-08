/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author mcortes19
 */
public class invoice_detail extends invoices{
    
    private int invoice_detail_id;
    private int invoice_id;
    private double subtotal;
    private double total;

    public invoice_detail() {
    }

    public invoice_detail(int invoice_detail_id, int invoice_id, double subtotal, double total) {
        this.invoice_detail_id = invoice_detail_id;
        this.invoice_id = invoice_id;
        this.subtotal = subtotal;
        this.total = total;
    }

    public invoice_detail(int invoice_detail_id, double subtotal, double total, int invoice_id, int reservation_id, Date date) {
        super(invoice_id, reservation_id, date);
        this.invoice_detail_id = invoice_detail_id;
        this.invoice_id = invoice_id;
        this.subtotal = subtotal;
        this.total = total;
    }

    public int getInvoice_detail_id() {
        return invoice_detail_id;
    }

    public void setInvoice_detail_id(int invoice_detail_id) {
        this.invoice_detail_id = invoice_detail_id;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "invoice_detail{" + "invoice_detail_id=" + invoice_detail_id + ", invoice_id=" + invoice_id + ", subtotal=" + subtotal + ", total=" + total + '}';
    }

    

    
    
}
