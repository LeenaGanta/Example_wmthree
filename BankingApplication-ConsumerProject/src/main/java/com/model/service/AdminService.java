package com.model.service;



import com.beans.Admin;
import com.beans.EmployeeList;
import com.beans.UserList;

public interface AdminService {
	
	UserList getAllUsers();
	EmployeeList getAllEmployees();
	Admin validateAdmin(String mailId,String password);

}
