package com.spring_boot_crud_practice.board.service;

import com.spring_boot_crud_practice.board.entity.Board;
import com.spring_boot_crud_practice.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    // 게시글 작성
    @Autowired
    private BoardRepository boardRepository;
    public void write(Board board) {

        boardRepository.save(board);
    }

    // 게시글 리스트 처리
    public List<Board> boardList() {

        return boardRepository.findAll();
    }

    // 특정 게시글 불러오기
    public Board boardView(Integer id) {
        return boardRepository.findById(id).orElse(null);
    }

    // 특정 게시글 삭제
    public void boardDelete(Integer id) {
        boardRepository.deleteById(id);
    }
}
