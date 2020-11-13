package com.sprint2.controller;


import java.util.List;

import com.sprint2.model.Admin;




public interface IAdminController {  // By default all the methods present in a interface are public abstract.
	public Admin getAdminById(Integer id);
	
	public Admin insertAdmin(Admin admin);
	
	public Admin updateAdmin(Admin admin);
	
	public boolean deleteAdmin(Integer id);
	
	public List<Admin> getAllAdmin();
	
}
