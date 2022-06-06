/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mcortes19
 */
public class invoice_detail extends invoices{
    
    private int invoice_detail_id;
    private double subtotal;
    private double total;
      private int discount;

    public invoice_detail() {
    }

    public invoice_detail(int invoice_detail_id, double subtotal, double total, int discount, int invoice_id, int reservation_id) {
        super(invoice_id, reservation_id);
        this.invoice_detail_id = invoice_detail_id;
        this.subtotal = subtotal;
        this.total = total;
        this.discount = discount;
    }

    public int getInvoice_detail_id() {
        return invoice_detail_id;
    }

    public void setInvoice_detail_id(int invoice_detail_id) {
        this.invoice_detail_id = invoice_detail_id;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "invoice_detail{" + "invoice_detail_id=" + invoice_detail_id + ", subtotal=" + subtotal + ", total=" + total + ", discount=" + discount + '}';
    }

   
    
    
}
