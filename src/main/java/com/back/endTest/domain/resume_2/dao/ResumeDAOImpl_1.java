package com.back.endTest.domain.resume_2.dao;

import com.back.endTest.domain.entity.Resume_1;

import java.util.List;
import java.util.Optional;

public class ResumeDAOImpl_1 implements ResumeDAO_1 {

  @Override
  public Long save(Resume_1 resume) {

    StringBuffer sql = new StringBuffer();
    sql.append(" insert into job_board( Job_board_ID_pk, ");
    sql.append(" title_job, ");
    sql.append(" id_job, ");
    sql.append(" closing_date, ");
    sql.append(" number_of_persons, ");
    sql.append(" gender_job, ");
    sql.append(" academic_ability, ");
    sql.append(" salary_way, ");
    sql.append(" salary_amount, ");
    sql.append(" work_period, ");
    sql.append(" work_day, ");
    sql.append(" come_in_job, ");
    sql.append(" come_out_job, ");
    sql.append(" work_type_job, ");
    sql.append(" employ_form, ");
    sql.append(" benefit_job, ");
    sql.append(" place_name, ");
    sql.append(" place_address, ");
    sql.append(" detail_content, ");
    sql.append(" manager_name, ");
    sql.append(" manager_phone ");
    sql.append(" ) ");

    sql.append(" values( Job_board_Job_board_ID_pk_seq.nextval, ");
    sql.append(" :titleJob, ");
    sql.append(" :idJob, ");
    sql.append(" :closingDate, ");
    sql.append(" :numberOfPersons, ");
    sql.append(" :genderJob, ");
    sql.append(" :academicAbility, ");
    sql.append(" :salaryWay, ");
    sql.append(" :salaryAmount, ");
    sql.append(" :workPeriod, ");
    sql.append(" :workDay, ");
    sql.append(" :comeInJob, ");
    sql.append(" :comeOutJob, ");
    sql.append(" :workTypeJob, ");
    sql.append(" :employForm, ");
    sql.append(" :benefitJob, ");
    sql.append(" :placeName, ");
    sql.append(" :placeAddress, ");
    sql.append(" :detailContent, ");
    sql.append(" :managerName, ");
    sql.append(" :managerPhone ");
    sql.append(" ) ");
    return null;
  }

  @Override
  public Optional<Resume_1> inquiry(Long resumeId) {
    return Optional.empty();
  }

  @Override
  public int update(Long resumeId, Resume_1 resume) {
    return 0;
  }

  @Override
  public int delete(Long resumeId) {
    return 0;
  }

  @Override
  public List<Resume_1> findAll() {
    return null;
  }
}
