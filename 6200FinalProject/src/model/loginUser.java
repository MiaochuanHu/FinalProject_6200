/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miaoc
 */
//This is Person class in my program, I named it as loginUser
public class loginUser {
    private String username;
    private String password;
    private String logintype;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogintype() {
        return logintype;
    }

    public void setLogintype(String logintype) {
        this.logintype = logintype;
    }

    public loginUser(String username, String password, String logintype) {
        this.username = username;
        this.password = password;
        this.logintype = logintype;
    }
    
    public loginUser(){
        
    }
    
    @Override
    public String toString() {
        return "loginUser{" + "username=" + username + ", password=" + password + ", logintype=" + logintype + '}';
    }
    
    
}
