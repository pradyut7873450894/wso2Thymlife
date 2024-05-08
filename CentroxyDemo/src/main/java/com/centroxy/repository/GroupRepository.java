package com.centroxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroxy.model.Group;

public interface GroupRepository extends JpaRepository<Group, Integer> {

}
