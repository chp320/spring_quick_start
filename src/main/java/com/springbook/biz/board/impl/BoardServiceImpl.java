package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.Log4jAdvice;
import com.springbook.biz.common.LogAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// BoardService 인터페이스를 구현한 구현 클래스
// 객체 생성을 위한 @Service 선언
@Service("boardService")
public class BoardServiceImpl implements BoardService {

    // DB CRUD 기능 처리 DAO 클래스 멤버, 의존성 주입을 위해 @Autowired 사용
    @Autowired
    private BoardDAO boardDAO;
//    private LogAdvice log;
    private Log4jAdvice log;

    public BoardServiceImpl() {
//        log = new LogAdvice();
        log = new Log4jAdvice();
    }

    @Override
    public void insertBoard(BoardVO vo) {
//        log.printLog();
        log.printLogging();
        boardDAO.insertBoard(vo);
    }

    @Override
    public void updateBoard(BoardVO vo) {
//        log.printLog();
        log.printLogging();
        boardDAO.updateBoard(vo);
    }

    @Override
    public void deleteBoard(BoardVO vo) {
//        log.printLog();
        log.printLogging();
        boardDAO.deleteBoard(vo);
    }

    @Override
    public BoardVO getBoard(BoardVO vo) {
//        log.printLog();
        log.printLogging();
        return boardDAO.getBoard(vo);
    }

    @Override
    public List<BoardVO> getBoardList(BoardVO vo) {
//        log.printLog();
        log.printLogging();
        return boardDAO.getBoardList(vo);
    }
}
