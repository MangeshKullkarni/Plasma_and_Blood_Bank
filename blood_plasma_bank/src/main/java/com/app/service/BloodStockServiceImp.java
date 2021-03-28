package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IBloodStockDao;
import com.app.pojos.Stocks;

@Service
@Transactional
public class BloodStockServiceImp implements IBloodStockService{

	@Autowired
	private IBloodStockDao bloodStockDao;

	@Override
	public String increseCounts(String type, String group, int quantity) {
		
		return bloodStockDao.increseCounts(type, group, quantity);
	}

	@Override
	public List<Stocks> fetchStock() {
		
		return bloodStockDao.fetchStock();
	}

	@Override
	public String decreaseCounts(String type, String group, int quantity) {
		return bloodStockDao.decreaseCounts(type, group, quantity);
	}
}
