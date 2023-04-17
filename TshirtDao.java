package com.assignment.tshirtdetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assignment.tshirtdetails.entities.TshirtData;

public interface TshirtDao extends JpaRepository<TshirtData, Long> {

}
