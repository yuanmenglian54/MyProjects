package cn.mjy.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mjy.service.AccountService;
import cn.mjy.service.IService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("queryAccounts")
	public String queryAll(Model model) throws Exception{
		List<Map<String, Object>> list = (List<Map<String, Object>>) accountService.queryObject(null);
		model.addAttribute("accountList", list);
		return "index";
	}
	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}
	@Autowired
	@Qualifier("accountService")
	private IService service;
}
