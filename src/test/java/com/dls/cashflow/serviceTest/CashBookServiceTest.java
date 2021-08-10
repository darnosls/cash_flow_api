package com.dls.cashflow.serviceTest;

import com.dls.cashflow.repository.CashBookRepository;
import com.dls.cashflow.service.CashBookService;
import model.CashBook;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

@SpringBootTest
public class CashBookServiceTest {

    @MockBean
    private CashBookRepository cashBookRepository;

    @Test
    void getAllCashBookRegister() {
        CashBook cashBookRegister = new CashBook(null, 1L, 25000L, 25000L, 1L, 2021L);
        cashBookRepository.save(cashBookRegister);
        CashBookService cashBookService = new CashBookService(cashBookRepository);

        List<CashBook> cashBookRegisters = cashBookRepository.findAll();
//        CashBook cashBookLastRegister =

    }
}
