package com.tcs.log4j.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ReportDao {
	
	public static final Logger logger=LoggerFactory.getLogger(ReportDao.class);
	public String getName(Integer id) {
		logger.info("getMethod-staeted");
		String name=null;
		if(id==101) {
			 name="Ramesh";
		}
		else if(id==102) {
			name="Ramesh2";
		}
		else {
			return name="invalid";
		}
		logger.info("getMethod-Ended");
		return name;
	
		
	}

}
