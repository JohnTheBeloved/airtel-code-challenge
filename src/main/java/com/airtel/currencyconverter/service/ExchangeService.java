package com.airtel.currencyconverter.service;

import java.util.List;

import com.airtel.currencyconverter.exception.ResourceNotFoundException;
import com.airtel.currencyconverter.model.Currency;
import com.airtel.currencyconverter.model.Exchange;

public interface ExchangeService {

	Exchange create(Exchange exchange);

	List<Exchange> get();

	void delete(Long id) throws ResourceNotFoundException;

	boolean save(List<Exchange> exchanges);

	List<Exchange> getDateExchanges(String date);

	List<Exchange> getDateExchanges(String date, Float amount);

	Exchange getDateExchange(Currency currency, String date) throws ResourceNotFoundException;

}
