package biz.Board;

import java.util.Date;

public class BoardVO {
    private int postNum;		// 게시물 번호
    private String id;			// 아이디
    private String title;		// 게시물 제목
    private String content;		// 게시물 내용
    private Date postDate;		// 작성 날짜

    // Constructors
    public BoardVO() {
    }

    public BoardVO(int postNum, String id, String title, String content, Date postDate) {
        this.postNum = postNum;
        this.id = id;
        this.title = title;
        this.content = content;
        this.postDate = postDate;
    }

    // Getters and Setters
    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    
    @Override
    public String toString() {
        return "BoardVO [postNum=" + postNum + ", id=" + id + ", title=" + title + ", content=" + content + ", postDate=" + postDate + "]";
    }
}
