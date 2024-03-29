package ssg.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ssg.com.a.dao.BbsDao;
import ssg.com.a.dto.BbsDto;
import ssg.com.a.dto.BbsParam;

@Service
@Transactional
public class BbsService {
	
	@Autowired
	BbsDao dao;
	
	public List<BbsDto> bbslist(BbsParam param){
		
		return dao.bbslist(param);
	}
	
	public int getallbbs(BbsParam param) {
		
		return dao.getallbbs(param);
	}
	
	public boolean bbswrite(BbsDto dto) {
		
		return dao.bbswrite(dto)>0?true:false;
	}
	
	public BbsDto bbsdetail(int seq) {
		
		return dao.bbsdetail(seq);
	}
	
	public void readcount(int seq) {
		dao.readcount(seq);
	}
	
	public boolean bbsupdate(BbsDto dto) {
		
		return dao.bbsupdate(dto)>0?true:false;
	}
	
	public boolean bbsdelete(int seq) {
		
		return dao.bbsdelete(seq)>0?true:false;
	}
	


}
