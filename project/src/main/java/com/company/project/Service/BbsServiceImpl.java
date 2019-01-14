package com.company.project.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.Dao.BbsDao;
import com.company.project.Dto.BbsDto;

@Service
public class BbsServiceImpl implements BbsService {
	
	//@Resource(name="BbsDao")
	@Autowired
	private BbsDao bbsDao;
	
	@Override
	public List<BbsDto> selectlistService() {
		// TODO Auto-generated method stub
		return bbsDao.selectlist();
	}

}
