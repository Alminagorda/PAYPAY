package pe.edu.upc.demotf.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "moviment")
public class Moviment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovement;

    @Column(name = "dateMovement",nullable = false)
    private LocalDate dateMovement;
    @Column(name = "typeMovement",nullable = false,length = 50)
    private String typeMovement;
    @Column(name = "amount",nullable = false)
    private Float amount;

    public Moviment() {
    }

    public Moviment(int idMovement, LocalDate dateMovement, String typeMovement, Float amount) {
        this.idMovement = idMovement;
        this.dateMovement = dateMovement;
        this.typeMovement = typeMovement;
        this.amount = amount;
    }

    public int getIdMovement() {
        return idMovement;
    }

    public void setIdMovement(int idMovement) {
        this.idMovement = idMovement;
    }

    public LocalDate getDateMovement() {
        return dateMovement;
    }

    public void setDateMovement(LocalDate dateMovement) {
        this.dateMovement = dateMovement;
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
