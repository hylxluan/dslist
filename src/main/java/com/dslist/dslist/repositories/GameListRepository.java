package com.dslist.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dslist.dslist.entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long>{

}
