package com.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContacttRepository extends JpaRepository<Contact,Integer>{

}
