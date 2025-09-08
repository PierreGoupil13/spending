package app.spending.spending.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.spending.spending.Entity.Spending;

public interface SpendingRepository extends JpaRepository<Spending, Long> {
}
