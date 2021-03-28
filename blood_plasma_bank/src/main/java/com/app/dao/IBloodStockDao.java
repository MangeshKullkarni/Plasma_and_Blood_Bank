package com.app.dao;

import java.util.List;

import com.app.pojos.Stocks;

public interface IBloodStockDao {

	String increseCounts(String type, String group, int quantity);

	List<Stocks> fetchStock();

	String decreaseCounts(String type, String group, int quantity);
}
