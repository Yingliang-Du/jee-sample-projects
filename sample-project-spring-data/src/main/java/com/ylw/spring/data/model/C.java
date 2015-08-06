package com.ylw.spring.data.model;

import javax.persistence.*;

/**
 * Created by yingliangdu on 7/31/15.
 */
@Entity
public class C {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String status;
    @ManyToOne
    @JoinColumn(name="b_id")
    private B b;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
