package com.project.remainder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.remainder.entity.RemainderData;

@Repository
public interface RemainderRepository extends JpaRepository<RemainderData, Integer> 
{

}
