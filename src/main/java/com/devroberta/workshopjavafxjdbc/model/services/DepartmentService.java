package com.devroberta.workshopjavafxjdbc.model.services;

import com.devroberta.workshopjavafxjdbc.model.dao.DaoFactory;
import com.devroberta.workshopjavafxjdbc.model.dao.DepartmentDao;
import com.devroberta.workshopjavafxjdbc.model.entities.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
