package app.spending.spending.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

import java.time.LocalDate;

@Entity
@Getter @Setter 
public class Spending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double amount;

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private Category category;

    public Spending() {}

    public Spending(String name, String description, Double amount, Category category) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.category = category;
    }
}
