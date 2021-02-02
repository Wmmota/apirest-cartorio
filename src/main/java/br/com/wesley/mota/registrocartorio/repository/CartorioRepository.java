package br.com.wesley.mota.registrocartorio.repository;

import br.com.wesley.mota.registrocartorio.model.Cartorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartorioRepository extends JpaRepository<Cartorio, Long> {
}
