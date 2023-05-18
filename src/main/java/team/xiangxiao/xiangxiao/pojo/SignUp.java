package team.xiangxiao.xiangxiao.pojo;

//用户报名信息
public class SignUp {
    private int uid;
    private int mid;
    private String signUp_time;
    private String state;
    private String failReason;
    private int failStarNum;

    @Override
    public String toString() {
        return "SignUp{" +
                "uid=" + uid +
                ", mid=" + mid +
                ", signUp_time='" + signUp_time + '\'' +
                ", state='" + state + '\'' +
                ", failReason='" + failReason + '\'' +
                ", failStarNum=" + failStarNum +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getSignUp_time() {
        return signUp_time;
    }

    public void setSignUp_time(String signUp_time) {
        this.signUp_time = signUp_time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public int getFailStarNum() {
        return failStarNum;
    }

    public void setFailStarNum(int failStarNum) {
        this.failStarNum = failStarNum;
    }
}
