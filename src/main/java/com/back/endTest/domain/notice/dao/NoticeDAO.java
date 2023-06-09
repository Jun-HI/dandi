package com.back.endTest.domain.notice.dao;

import com.back.endTest.domain.entity.Notice;

import java.util.List;
import java.util.Optional;

public interface NoticeDAO {

  // 공지 등록
  Long save(Notice notice);

  // 공지 조회
//  Optional<Notice> findById(Long id);
  Optional<Notice> findById(Long id);

  // 공지 수정
  int update(Long id, Notice notice);

  // 공지 삭제
  int delete(Long id);

  // 공지 목록
  List<Notice> findAll();

  List<Notice> findAllPaging(int startRec, int endRec);

  // 조회수 증가
  int updateHit(Long id);

  // 전체건수
  int totalCount();

//  int totalCount(String tCategory);
//  int totalCount(NoticeFilter troubleFilter);

}
