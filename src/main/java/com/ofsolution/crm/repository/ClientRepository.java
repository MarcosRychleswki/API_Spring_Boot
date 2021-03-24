package com.ofsolution.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ofsolution.crm.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
