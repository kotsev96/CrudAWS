package ru.kotsev.crud.model;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "films")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;
    @Column(name = "Director")
    private String director;
    @Column(name = "Budget")
    private int budget;
    @Column(name = "Genre")
    private String genre;
    @Column(name = "Rating")
    private String rating;
}
