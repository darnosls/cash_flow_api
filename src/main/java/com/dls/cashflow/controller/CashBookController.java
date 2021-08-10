package com.dls.cashflow.controller;

import com.dls.cashflow.service.CashBookService;
import model.CashBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CashBookController {

    @Autowired
    private CashBookService cashBookService;

    @GetMapping("/cashbook")
    ResponseEntity<List<CashBook>> getAllCashBook() {
        return new ResponseEntity<>(cashBookService.findAll(), HttpStatus.OK);
    }
}
