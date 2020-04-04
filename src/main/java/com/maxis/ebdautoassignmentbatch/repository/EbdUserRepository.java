package com.maxis.ebdautoassignmentbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.maxis.ebdautoassignmentbatch.entity.EbdUserEntity;


@Repository
public interface EbdUserRepository extends JpaRepository<EbdUserEntity, Integer> {
	
	@Query("select eue from EbdUserEntity eue where eue.userId= :userId")
	public EbdUserEntity findByUserId(@Param("userId")String userId);

}
