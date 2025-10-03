package app.spending.spending.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.spending.spending.Entity.Spending;

import java.time.LocalDate;

public interface SpendingRepository extends JpaRepository<Spending, Long> {
    Object findByDateBetween(LocalDate dateAfter, LocalDate dateBefore);
}
