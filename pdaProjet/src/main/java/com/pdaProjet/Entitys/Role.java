package com.pdaProjet.Entitys;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_role")
    private int id_role;
    @Column(name="role")
    private String role;


    @OneToMany(cascade=CascadeType.ALL)
    private List<User> users;

    public Role() {
        super();
    }


    public Role(int id_role, String role, List<User> users) {
        super();
        this.id_role = id_role;
        this.role = role;
        this.users = users;
    }


    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role [id_role=" + id_role + ", role=" + role + ", users=" + users + "]";
    }








}
