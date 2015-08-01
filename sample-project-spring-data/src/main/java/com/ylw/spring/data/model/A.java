package com.ylw.spring.data.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yingliangdu on 7/31/15.
 */
@Entity
public class A {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable( name = "a_b",
            joinColumns = @JoinColumn(name = "a_id"),
            inverseJoinColumns = @JoinColumn(name = "b_id"))
    Set<B> bs = new HashSet<B>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<B> getBs() {
        return bs;
    }

    public void setBs(Set<B> bs) {
        this.bs = bs;
    }
}
