
package com.airtel.currencyconverter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airtel.currencyconverter.model.Conversion;

@Repository
public interface ConversionRepository extends JpaRepository<Conversion, Long> {

}
