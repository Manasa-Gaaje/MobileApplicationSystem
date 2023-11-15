package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Mobile;

public interface MobileJpaRepository extends JpaRepository<Mobile,Integer>
{

}
