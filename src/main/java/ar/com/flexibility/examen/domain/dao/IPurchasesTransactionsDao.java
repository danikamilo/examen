package ar.com.flexibility.examen.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.flexibility.examen.domain.model.PurchasesTransactions;

/**
 * 
 * @author Daniel Camilo 
 * Date 20-09-2020
 */
@Repository
public interface IPurchasesTransactionsDao  extends JpaRepository<PurchasesTransactions, Long> {

}
