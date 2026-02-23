package com.piyushcodes.airBnb.entity;

import com.piyushcodes.airBnb.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String name;

//    @CreationTimestamp
//    private LocalDateTime timeStamp;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private Gender gender;


    @ManyToMany(mappedBy = "guests")
    private Set<Booking> bookings;

}
