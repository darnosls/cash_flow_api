package com.dls.cashflow.controllerTest;

import com.dls.cashflow.service.CashBookService;
import model.CashBook;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@ExtendWith(MockitoExtension.class)
@WebMvcTest
public class CashBookControllerTest {
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	private CashBookService cashBookService;
	
	@Test
	void getCashBook() throws Exception {


		List<CashBook> cashBookList = new ArrayList<CashBook>();
		cashBookList.add(new CashBook(null, 1l, 250000l, 200000l, 1l, 2021l));
		cashBookList.add(new CashBook(null, 1l, 200000l, 200000l, 2l, 2021l));
		cashBookList.add(new CashBook(null, 1l, 250000l, 200000l, 3l, 2021l));
		cashBookList.add(new CashBook(null, 1l, 250000l, 200000l, 4l, 2021l));
		when(cashBookService.findAll()).thenReturn(cashBookList);

		mockMvc.perform(MockMvcRequestBuilders.get("/cashbook")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(4)))
				.andDo(print());

		assert true;
	
	}
}
