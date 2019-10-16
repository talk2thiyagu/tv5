package in.tafel.tv5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tafel.tv5.bo.TV5ContactInfo;

@Repository
public interface TV5ContactInfoRepository extends JpaRepository<TV5ContactInfo, String>{

	
}
