package com.dls.cashflow.service;

import model.CashBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CashBookService {
    public List<CashBook> findAll() {
        return new ArrayList<>();
    }
}
