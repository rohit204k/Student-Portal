package com.info204k.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info204k.demo.model.TestsTaken;

public interface RegistrationsRepo extends JpaRepository<TestsTaken, String> {

}
