package com.devroberta.workshopjavafxjdbc.model.dao;

import com.devroberta.workshopjavafxjdbc.db.DB;
import com.devroberta.workshopjavafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import com.devroberta.workshopjavafxjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return (SellerDao) new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
