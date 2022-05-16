
package Model;

public class customers {
    
    
    private int customer_id;
    private String name;
    private String last_name;
    private String address;
    private String company;
    private String email;
    private int phone_number;

    public customers(int customer_id, String name, String last_name, String address, String company, String email, int phone_number) {
        this.customer_id = customer_id;
        this.name = name;
        this.last_name = last_name;
        this.address = address;
        this.company = company;
        this.email = email;
        this.phone_number = phone_number;
    }

    
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "customers{" + "customer_id=" + customer_id + ", name=" + name + ", last_name=" + last_name + ", address=" + address + ", company=" + company + ", email=" + email + ", phone_number=" + phone_number + '}';
    }
    
}
