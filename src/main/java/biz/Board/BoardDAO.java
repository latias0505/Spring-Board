package biz.Board;

import biz.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardDAO {
	
	public BoardVO getBoardByPostNum(int postNum) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        BoardVO board = null;

        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM BOARD WHERE POST_NUM = ?");
            stmt.setInt(1, postNum);
            rs = stmt.executeQuery();

            if (rs.next()) {
                String id = rs.getString("ID");
                String title = rs.getString("TITLE");
                String content = rs.getString("CONTENT");
                Date postDate = rs.getDate("POST_DATE");

                board = new BoardVO(postNum, id, title, content, postDate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return board;
    }
	
    public List<BoardVO> getBoardList() {
        List<BoardVO> boardList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM BOARD");
            rs = stmt.executeQuery();

            while (rs.next()) {
                int postNum = rs.getInt("POST_NUM");
                String id = rs.getString("ID");
                String title = rs.getString("TITLE");
                String content = rs.getString("CONTENT");
                Date postDate = rs.getDate("POST_DATE");

                BoardVO board = new BoardVO(postNum, id, title, content, postDate);
                boardList.add(board);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return boardList;
    }

    public List<BoardVO> getTrimmedBoardList(List<BoardVO> boardList) {
        List<BoardVO> trimmedList = new ArrayList<>();

        for (BoardVO board : boardList) {
            int postNum = board.getPostNum();
            String id = board.getId();
            String title = board.getTitle();
            Date postDate = board.getPostDate();

            BoardVO trimmedBoard = new BoardVO(postNum, id, title, null, postDate);
            trimmedList.add(trimmedBoard);
        }

        return trimmedList;
    }
}
