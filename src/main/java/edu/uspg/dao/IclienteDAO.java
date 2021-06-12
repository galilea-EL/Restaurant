package edu.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.cliente;

public interface IclienteDAO extends JpaRepository<cliente, Integer> {

}