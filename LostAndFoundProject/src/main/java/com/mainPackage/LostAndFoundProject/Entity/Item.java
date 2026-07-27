package com.mainPackage.LostAndFoundProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
@Entity
public class Item {
    @Id
    Integer id;
    String title;
    String description;
    LocalDateTime findAt;


}
