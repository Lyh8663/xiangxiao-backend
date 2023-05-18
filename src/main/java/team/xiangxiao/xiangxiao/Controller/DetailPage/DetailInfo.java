package team.xiangxiao.xiangxiao.Controller.DetailPage;

import team.xiangxiao.xiangxiao.pojo.RecruitmentMSG;
import team.xiangxiao.xiangxiao.pojo.User;

public class DetailInfo {
    private User employer;//这是招工发布者的信息
    private int isStar;//表示是否收藏
    private RecruitmentMSG recruitmentMSG;//返回整个recruitmentMSG
    private int numberForSign;

    @Override
    public String toString() {
        return "DetailInfo{" +
                "employer=" + employer +
                ", isStar=" + isStar +
                ", recruitmentMSG=" + recruitmentMSG +
                ", numberForSign=" + numberForSign +
                '}';
    }

    public User getEmployer() {
        return employer;
    }

    public void setEmployer(User employer) {
        this.employer = employer;
    }

    public int getIsStar() {
        return isStar;
    }

    public void setIsStar(int isStar) {
        this.isStar = isStar;
    }

    public RecruitmentMSG getRecruitmentMSG() {
        return recruitmentMSG;
    }

    public void setRecruitmentMSG(RecruitmentMSG recruitmentMSG) {
        this.recruitmentMSG = recruitmentMSG;
    }

    public int getNumberForSign() {
        return numberForSign;
    }

    public void setNumberForSign(int numberForSign) {
        this.numberForSign = numberForSign;
    }
}
