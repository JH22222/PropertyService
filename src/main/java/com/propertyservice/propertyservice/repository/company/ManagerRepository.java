package com.propertyservice.propertyservice.repository.company;

import com.propertyservice.propertyservice.domain.company.Manager;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {
    Optional<Manager> findByManagerId(Long managerId);

    Optional<Manager> findByManagerEmail(String managerEmail);
}
