package com.sda.hibernate.entity;

import javax.persistence.*;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 45)
    private String type;
    @Column(length = 45)
    private String company;
    @Column(length = 45)
    private String logo;
    @Column(length = 45)
    private String url;
    @Column(length = 45)
    private String position;
    @Column(length = 45)
    private String description;
    @Column(length = 45)
    private String how_to_aply;
    @Column(length = 45)
    private String token;
    @Column(length = 45)
    private String is_public;
    @Column(length = 45)
    private String is_validated;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String expires_at;
    @Column(length = 45)
    private String created_at;
    @Column(length = 45)
    private String updated_at;

//    public Job(String type, String company, String logo, String url, String position, String description, String how_to_aply, String token, String is_public, String is_validated, String email, String expires_at, String created_at, String updated_at) {
//        this.type = type;
//        this.company = company;
//        this.logo = logo;
//        this.url = url;
//        this.position = position;
//        this.description = description;
//        this.how_to_aply = how_to_aply;
//        this.token = token;
//        this.is_public = is_public;
//        this.is_validated = is_validated;
//        this.email = email;
//        this.expires_at = expires_at;
//        this.created_at = created_at;
//        this.updated_at = updated_at;
//    }
//
//    public Job() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }
//
//    public String getLogo() {
//        return logo;
//    }
//
//    public void setLogo(String logo) {
//        this.logo = logo;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getHow_to_aply() {
//        return how_to_aply;
//    }
//
//    public void setHow_to_aply(String how_to_aply) {
//        this.how_to_aply = how_to_aply;
//    }
//
//    public String getToken() {
//        return token;
//    }
//
//    public void setToken(String token) {
//        this.token = token;
//    }
//
//    public String getIs_public() {
//        return is_public;
//    }
//
//    public void setIs_public(String is_public) {
//        this.is_public = is_public;
//    }
//
//    public String getIs_validated() {
//        return is_validated;
//    }
//
//    public void setIs_validated(String is_validated) {
//        this.is_validated = is_validated;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getExpires_at() {
//        return expires_at;
//    }
//
//    public void setExpires_at(String expires_at) {
//        this.expires_at = expires_at;
//    }
//
//    public String getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(String created_at) {
//        this.created_at = created_at;
//    }
//
//    public String getUpdated_at() {
//        return updated_at;
//    }
//
//    public void setUpdated_at(String updated_at) {
//        this.updated_at = updated_at;
//    }
}
