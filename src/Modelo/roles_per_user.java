/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class roles_per_user {
    
    private int roles_per_user_id;
    private int user_id;
    private int user_role_id;

    public roles_per_user() {
    }

    public roles_per_user(int roles_per_user_id, int user_id, int user_role_id) {
        this.roles_per_user_id = roles_per_user_id;
        this.user_id = user_id;
        this.user_role_id = user_role_id;
    }

    public int getRoles_per_user_id() {
        return roles_per_user_id;
    }

    public void setRoles_per_user_id(int roles_per_user_id) {
        this.roles_per_user_id = roles_per_user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    @Override
    public String toString() {
        return "roles_per_user{" + "roles_per_user_id=" + roles_per_user_id + ", user_id=" + user_id + ", user_role_id=" + user_role_id + '}';
    }
    
    
}
