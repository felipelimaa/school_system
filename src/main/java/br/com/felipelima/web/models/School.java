package br.com.felipelima.web.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import lombok.Data;

@Entity
@Table
@Data
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String school;

    Number cgc;
}