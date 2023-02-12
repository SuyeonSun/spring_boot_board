package com.spring_boot_crud_practice.board.repository;

import com.spring_boot_crud_practice.board.controller.BoardController;
import com.spring_boot_crud_practice.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
}
