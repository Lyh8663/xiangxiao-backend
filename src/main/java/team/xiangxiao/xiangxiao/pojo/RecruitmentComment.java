package team.xiangxiao.xiangxiao.pojo;

//人们对招工活动的评价
public class RecruitmentComment {
    private int employmentID;
    private int commentatorID;
    private String content;
    private int starNum;
    private String comment_time;

    @Override
    public String toString() {
        return "RecruitmentComment{" +
                "employmentID=" + employmentID +
                ", commentatorID=" + commentatorID +
                ", content='" + content + '\'' +
                ", starNum=" + starNum +
                ", comment_time='" + comment_time + '\'' +
                '}';
    }

    public int getEmploymentID() {
        return employmentID;
    }

    public void setEmploymentID(int employmentID) {
        this.employmentID = employmentID;
    }

    public int getCommentatorID() {
        return commentatorID;
    }

    public void setCommentatorID(int commentatorID) {
        this.commentatorID = commentatorID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStarNum() {
        return starNum;
    }

    public void setStarNum(int starNum) {
        this.starNum = starNum;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }
}
