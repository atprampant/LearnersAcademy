package org.simplilearn.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    private String subid;
    private String subname;


    @ManyToMany(mappedBy = "subjects")
    private List<EClass> classes=new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tid")
    private Teacher teacher;
    public String getSubid() {
        return subid;
    }
    public void setSubid(String subid) {
        this.subid = subid;
    }
    public String getSubname() {
        return subname;
    }
    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<EClass> getClasses() {
        return classes;
    }

    public void setClasses(List<EClass> classes) {
        this.classes = classes;
    }


}
