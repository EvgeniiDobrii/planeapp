package org.example.planeapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "students")
public class UnivercityStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "surname")
    private String surname;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "univercity_groups_id")
    private UnivercityGroup univercityGroup;


    public UnivercityStudent() {
    }

    public UnivercityStudent(int id, String surname, UnivercityGroup univercityGroup) {
        this.id = id;
        this.surname = surname;
        this.univercityGroup = univercityGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                '}';
    }
}
