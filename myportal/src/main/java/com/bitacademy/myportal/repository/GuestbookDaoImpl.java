package com.bitacademy.myportal.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bitacademy.myportal.vo.GuestbookVo;

@Repository	//이름 명시 안하면 클래스 이름을 기반으로 자동 명명
//-> guestbookDaoImpl 이름을 bean에 등록
//@Repository("guestbookDao")
public class GuestbookDaoImpl implements GuestbookDao {

	@Override
	public List<GuestbookVo> selectAll() {
//		가상 데이터
//		실제 DB와 연결 필요
		List<GuestbookVo> list = new ArrayList<>();
		list.add(new GuestbookVo(1L, "hong", "1234", "hello", new Date()));
		list.add(new GuestbookVo(2L, "jang", "pass", "me too", new Date()));
		list.add(new GuestbookVo(3L, "jeon", "test", "hihi", new Date()));
		
		return list;
	}

	@Override
	public int insert(GuestbookVo vo) {
		return 0;
	}

	@Override
	public int delete(GuestbookVo vo) {
		return 0;
	}

}
