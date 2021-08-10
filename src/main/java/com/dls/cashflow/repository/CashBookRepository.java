package com.dls.cashflow.repository;

import model.CashBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("cashBookRepository")
public interface CashBookRepository extends JpaRepository<CashBook, Long> {
}
