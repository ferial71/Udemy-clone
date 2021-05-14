package com.ustudy.ustudy.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "languages")
public class Language extends AbstractEntity<Long>{

    private String name;
}
