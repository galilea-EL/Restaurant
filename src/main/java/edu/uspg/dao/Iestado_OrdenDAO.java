package edu.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.estado_Orden;

public interface Iestado_OrdenDAO extends JpaRepository<estado_Orden, Integer> {

}