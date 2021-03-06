package com.ylw.spring.data.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yingliangdu on 7/31/15.
 */
@Entity
public class B {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "bs")
    private Set<A> as = new HashSet<A>();
    @OneToMany(cascade=CascadeType.ALL, mappedBy="b")
    private Set<C> cs = new HashSet<C>();

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

    public Set<A> getAs() {
        return as;
    }

    public void setAs(Set<A> as) {
        this.as = as;
    }

    public Set<C> getCs() {
        return cs;
    }

    public void setCs(Set<C> cs) {
        this.cs = cs;
    }
}
