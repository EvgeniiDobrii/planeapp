package org.example.planeapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="univercity_groups")
public class UniversityGroup {
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Setter
    @Getter
    @Column(name="group_number")
    private String groupNumber;

    @Setter
    @Getter
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH, CascadeType.PERSIST},
            fetch = FetchType.LAZY )
    @JoinColumn(name = "univercity_groups_id")
    private List<Student> students;

    public UniversityGroup() {
    }

    public void addStudentsToUniversityGroup(Student student) {
        if(students==null){
            students = new ArrayList<>();
        }
        students.add(student);
    }
    @Override
    public String toString() {
        return "UniversityGroup{" +
                "id=" + id +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }

}
