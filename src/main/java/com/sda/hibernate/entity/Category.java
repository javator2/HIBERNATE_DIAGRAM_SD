package com.sda.hibernate.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;
    @Column(length = 45)
    private String name;
    @OneToMany(mappedBy = "category")
    private Set<Job> jobSet;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Affiliate> affiliateSet;


    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int id) {
        this.category_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<Affiliate> getAffiliateSet() {
        return affiliateSet;
    }

    public void setAffiliateSet(Set<Affiliate> affiliateSet) {
        this.affiliateSet = affiliateSet;
    }

    public Set<Job> getJobSet() {
        return jobSet;
    }

    public void setJobSet(Set<Job> jobSet) {
        this.jobSet = jobSet;
    }
}
