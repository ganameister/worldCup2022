package com.world_cup_2022.projectW.service;

import com.world_cup_2022.projectW.model.MemberVO;


public interface IMyPageService {

	public MemberVO detailViewMyPage(String memId);// 회원정보조회
	
	public void updateMyPage(MemberVO mem); // 회원정보수정

	/* public MemberVO detailViewMyPage(String memId); */// 상세 상품 조회

    public void memberDelete(MemberVO vo)throws Exception;
	


	

}