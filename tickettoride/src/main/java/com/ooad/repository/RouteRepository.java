package com.ooad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ooad.entity.Route;
/**
 * 
 * @author smathew
 *
 */
@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {

}
