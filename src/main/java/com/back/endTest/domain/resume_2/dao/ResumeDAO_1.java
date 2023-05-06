package com.back.endTest.domain.resume_2.dao;


import com.back.endTest.domain.entity.Resume_1;

import java.util.List;
import java.util.Optional;

public interface ResumeDAO_1 {

  //등록
  Long save(Resume_1 resume);

  //조회
  Optional<Resume_1> inquiry(Long resumeId);

  //수정
  int update(Long resumeId, Resume_1 resume);

  //삭제
  int delete(Long resumeId);

  //목록
  List<Resume_1> findAll();
}
