package Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.entities.concretes.SubTechnology;

@Repository
public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer> {
	SubTechnology getByName(String name);
}
