package com.pdaProjet.Entitys;

import jakarta.persistence.*;

@Entity
@Table(name="user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_user")
    private long id_user;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="telephone")
    private double telephone;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_role")
    private Role role ;



    public User() {
        super();
    }


    public User(String name, String email, String password, double telephone) {
        super();

        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;

    }


    public long getId_user() {
        return id_user;
    }


    public void setId_user(long id_user) {
        this.id_user = id_user;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
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


    public double getTelephone() {
        return telephone;
    }


    public void setTelephone(double telephone) {
        this.telephone = telephone;
    }


    public Role getRole() {
        return role;
    }


    public void setRole(Role role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "User [id_user=" + id_user + ", name=" + name + ", email=" + email + ", password=" + password
                + ", telephone=" + telephone + ", role=" + role + "]";
    }

}
