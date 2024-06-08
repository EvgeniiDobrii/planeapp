package org.example.planeapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="univercity_groups")
@Getter
@Setter
public class UnivercityGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="group_number")
    private String groupNumber;

    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH, CascadeType.PERSIST},
            fetch = FetchType.LAZY, mappedBy = "univercityGroup")
    private List<UnivercityStudent> students;

    public UnivercityGroup() {
    }

    public UnivercityGroup(int id, String groupNumber, List<UnivercityStudent> students) {
        this.id = id;
        this.groupNumber = groupNumber;
        this.students = students;
    }

    @Override
    public String toString() {
        return "UniversityGroup{" +
                "id=" + id +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }

}
