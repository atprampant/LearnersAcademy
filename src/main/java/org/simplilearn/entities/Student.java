package org.simplilearn.entities;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    private int rollno;
    private String sname;
    @ManyToOne
    @JoinColumn(name = "cid")
    private EClass eclass;

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public EClass getEclass() {
        return eclass;
    }
    public void setEclass(EClass eclass) {
        this.eclass = eclass;
    }



}
