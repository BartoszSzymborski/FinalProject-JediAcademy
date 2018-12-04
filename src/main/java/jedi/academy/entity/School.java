package jedi.academy.entity;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SCHOOL")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String lightSaber;
    @NotBlank
    private String day;
    @Min(1)
    @Max(3)
    @NotNull
    private Double hour;
    @Transient
    private String fullInformation;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLightSaber() {
        return lightSaber;
    }

    public void setLightSaber(String lightSaber) {
        this.lightSaber = lightSaber;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Double getHour() {
        return hour;
    }

    public void setHour(Double hour) {
        this.hour = hour;
    }

    public String getFullInformation() {
        return fullInformation;
    }

    public void setFullInformation(String fullInformation) {
        this.fullInformation = fullInformation;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public School() {
    }

    public School(String lightSaber) {
        this.lightSaber = lightSaber;
    }

    @Override
    public String toString() {
        return  lightSaber;
    }
}
