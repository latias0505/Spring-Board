package controller.Board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import biz.Board.BoardDAO;
import biz.Board.BoardVO;
import controller.Controller;

public class BoardInfoController implements org.springframework.web.servlet.mvc.Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
    	ModelAndView mv = new ModelAndView();
	 	mv.setViewName("BoardInfo");
    	
        String postNumStr = request.getParameter("postNum");
        int postNum = Integer.parseInt(postNumStr);

        BoardDAO boardDAO = new BoardDAO();
        BoardVO board = boardDAO.getBoardByPostNum(postNum);

        request.setAttribute("board", board);

        return mv;
    }

}
