package com.siqueira76.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siqueira76.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
