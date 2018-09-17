package com.sda.hibernate.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Affiliate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int affiliate_id;
    @Column(length = 45)
    private String url;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String token;
    @Column(length = 45)
    private String is_active;
    @Column(length = 45)
    private String created_at;

    @ManyToMany(mappedBy = "affiliateSet")
    private Set<Category> categorySet;


    public Affiliate(String url, String email, String token, String is_active, String created_at) {
        this.url = url;
        this.email = email;
        this.token = token;
        this.is_active = is_active;
        this.created_at = created_at;
    }

    public Affiliate() {
    }

    public int getAffiliate_id() {
        return affiliate_id;
    }

    public void setAffiliate_id(int id) {
        this.affiliate_id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }


}
