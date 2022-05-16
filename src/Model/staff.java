
package Model;


public class staff {
    private int id;
    private String name;
    private String last_name;
    private String userName;
    private String email;
    private String password;
    private String address;
    private String company;
    private String workstation;
    private int phone_number;
  

    public staff() {
    }

    public staff(int id, String name, String last_name, String userName, String email, String password, String address, String company, String workstation, int phone_number) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.company = company;
        this.workstation = workstation;
        this.phone_number = phone_number;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation;
    }

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", name=" + name + ", last_name=" + last_name + ", userName=" + userName + ", email=" + email + ", password=" + password + ", address=" + address + ", company=" + company + ", workstation=" + workstation + ", phone_number=" + phone_number + '}';
    }

   




   
    
    

 
    
    

   
    

  
    
    
    
}
