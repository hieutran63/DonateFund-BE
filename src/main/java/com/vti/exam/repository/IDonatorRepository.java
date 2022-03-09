package com.vti.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.vti.exam.entity.Donator;

public interface IDonatorRepository extends JpaRepository<Donator, Integer>, JpaSpecificationExecutor<Donator> {

	boolean existsByPhone(String phone);

	Donator findByPhone(String phone);

	Donator getByPhone(String phone);

	Donator findAllByPhone(String phone);

}
