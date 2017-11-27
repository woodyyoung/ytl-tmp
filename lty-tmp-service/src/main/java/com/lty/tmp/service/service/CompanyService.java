package com.lty.tmp.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.tmp.service.bean.entity.autocreate.Company;
import com.lty.tmp.service.bean.entity.autocreate.CompanyExample;
import com.lty.tmp.service.cache.KeyGenerator;
import com.lty.tmp.service.cache.RedisUtils;
import com.lty.tmp.service.mapper.CompanyMapper;

@Service
public class CompanyService {
	@Autowired
	private CompanyMapper companyMapper;

	@Autowired
	private RedisUtils redis;

	public List<Company> listAll() {
		CompanyExample example = new CompanyExample();
		List<Company> list = companyMapper.selectByExample(example);
		return list;
	}

	/**
	 * 
	 * @功能：根据公司ID获取公司信息
	 * 
	 *
	 * @返回：Company
	 */
	public Company getCompany(String companyID) {
		Company company = redis.getObject(KeyGenerator.company_key(companyID),
				Company.class);
		return company;
	}
}
