/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */
@Entity   //Esta sirve para indicar que una clase representa una tabla en BD.
@Table(name = "client") //    Especifica la tabla

public class Client {
    @Id // PK -----  @Embededld compuestas
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //values automatique  for the Keys
    
    private Integer idClient;
    private String email;
    private String password;
    private String name;
    private String age;
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy="client")
    @JsonIgnoreProperties("client")
    private List<Message> messages;
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy="client")
    @JsonIgnoreProperties("client")
    private List<Reservation> Reservations;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return Reservations;
    }

    public void setReservations(List<Reservation> Reservations) {
        this.Reservations = Reservations;
    }
    
    

   
    
    
    
    
}
