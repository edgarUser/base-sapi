package com.mx.base.repository;

import java.util.ArrayList;
import java.util.List;

import com.mx.base.model.Data;

public class DataRepository {

	private List<Data> listData;

	public DataRepository() {
		listData = new ArrayList<>();
		listData.add(new Data(Long.valueOf(1), "Hello Weorld!", "2021-02-06*06:45:37"));
	}

	public Data findOne() {
		return listData.get(0);
	}

}
