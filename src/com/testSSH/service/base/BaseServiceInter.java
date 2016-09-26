package com.testSSH.service.base;

import java.util.List;

public interface BaseServiceInter {
	public List getResult(String hql,Object[] params);
	public void Save(Object obj);
	public void Delete(Object obj);
	public void Update(Object obj);
}
