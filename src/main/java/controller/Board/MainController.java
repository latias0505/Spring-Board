package controller.Board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import biz.Board.BoardDAO;
import biz.Board.BoardVO;
import controller.Controller;

import java.util.List;

public class MainController implements org.springframework.web.servlet.mvc.Controller{
		// BoardDAO 인스턴스 생성

	 @Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		 	ModelAndView mv = new ModelAndView();
		 	mv.setViewName("Board");
		 	
			BoardDAO boardDAO = new BoardDAO();
			
			// 게시물 정보를 가져오기 위해 BoardDAO의 메서드 호출
			List<BoardVO> boardList = boardDAO.getBoardList();
			
			// content를 제외한 정보를 저장하기 위해 새로운 List 생성
			List<BoardVO> trimmedBoardList = boardDAO.getTrimmedBoardList(boardList);
			
			// JSP로 전달하기 위해 속성으로 저장
			request.setAttribute("boardList", trimmedBoardList);
			
			// JSP 페이지로 이동
			return mv;
	}

}
