package team.xiangxiao.xiangxiao.pojo;

//雇主对雇者的评价
public class EmployeeComment {
    private int commentatorID;
    private int reviewerID;
    private int mid;
    private String comment_time;
    private String content;

    @Override
    public String toString() {
        return "EmployeeComment{" +
                "commentatorID=" + commentatorID +
                ", reviewerID=" + reviewerID +
                ", mid=" + mid +
                ", comment_time='" + comment_time + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public int getCommentatorID() {
        return commentatorID;
    }

    public void setCommentatorID(int commentatorID) {
        this.commentatorID = commentatorID;
    }

    public int getReviewerID() {
        return reviewerID;
    }

    public void setReviewerID(int reviewerID) {
        this.reviewerID = reviewerID;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
