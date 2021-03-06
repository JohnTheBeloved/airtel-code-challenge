
package com.airtel.currencyconverter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airtel.currencyconverter.model.Exchange;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, Long> {

	public List<Exchange> findByExchangeDate(String date);
}
