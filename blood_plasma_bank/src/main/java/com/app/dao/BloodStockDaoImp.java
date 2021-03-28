package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Stocks;

@Repository
public class BloodStockDaoImp implements IBloodStockDao {

	@Autowired
	private EntityManager mgr;

	@Override
	public String increseCounts(String type, String group, int quantity) {
		String jpql = "select s from Stocks s where s.type=:type and s.group=:group";
		Stocks s = mgr.createQuery(jpql, Stocks.class).setParameter("type", type).setParameter("group", group)
				.getSingleResult();
		if (s != null) {
			int q= s.getAvailableQuantity();
			q+=quantity;
			s.setAvailableQuantity(q);
			return "blood Stock Is Updated ";
		}
		return "blood Stock IS not Updated ";
	}

	@Override
	public List<Stocks> fetchStock() {
		String jpql = "select s from Stocks s";
		return mgr.createQuery(jpql, Stocks.class).getResultList();
	}

	@Override
	public String decreaseCounts(String type, String group, int quantity) {
		String jpql = "select s from Stocks s where s.type=:type and s.group=:group";
		Stocks s = mgr.createQuery(jpql, Stocks.class).setParameter("type", type).setParameter("group", group)
				.getSingleResult();
		if (s != null) {
			int q= s.getAvailableQuantity();
			if(q >= quantity) {
			q-=quantity;
			s.setAvailableQuantity(q);
			return "blood Stock Is Updated ";
			}
			else
				return "Quantity is more then Available Quantity";
		}
		return "blood Stock IS not Updated ";
	}
}
