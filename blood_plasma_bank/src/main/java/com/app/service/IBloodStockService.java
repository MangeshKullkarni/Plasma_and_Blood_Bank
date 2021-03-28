package com.app.service;

import java.util.List;

import com.app.pojos.Stocks;

public interface IBloodStockService {

	String increseCounts(String type, String group, int quantity);

	List<Stocks> fetchStock();

	String decreaseCounts(String type, String group, int quantity);
}
