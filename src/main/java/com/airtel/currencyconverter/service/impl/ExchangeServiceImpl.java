package com.airtel.currencyconverter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airtel.currencyconverter.exception.ResourceNotFoundException;
import com.airtel.currencyconverter.model.Exchange;
import com.airtel.currencyconverter.repository.ExchangeRepository;
import com.airtel.currencyconverter.service.ExchangeService;

@Service
public class ExchangeServiceImpl implements ExchangeService {

	@Autowired
	private ExchangeRepository exchangeRepository;

	public Exchange create(Exchange exchange) {
		Exchange saved = exchangeRepository.save(exchange);
		return saved;
	}

	public List<Exchange> get() {
		return exchangeRepository.findAll();
	}

	public void delete(Long exchangeId) throws ResourceNotFoundException {
		Exchange signal =
			exchangeRepository.findById(exchangeId).orElseThrow(() -> new ResourceNotFoundException("Signal not found for this id :: " + exchangeId));
		exchangeRepository.delete(signal);
	}

	@Override
	public boolean save(List<Exchange> exchanges) {
		//TODO: Check if exchange exists in DB
		int noToSave = exchanges.size();
		int noSaved = 0;
		List<Exchange> saved = exchangeRepository.saveAll(exchanges);
		noSaved = saved.size();
		return noToSave == noSaved;
	}

}
