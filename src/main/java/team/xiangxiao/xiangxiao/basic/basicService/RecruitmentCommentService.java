package team.xiangxiao.xiangxiao.basic.basicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xiangxiao.xiangxiao.basic.basicMapper.RecruitmentCommentMapper;
import team.xiangxiao.xiangxiao.pojo.RecruitmentComment;

import java.util.List;

@Service
public class RecruitmentCommentService {

    @Autowired
    RecruitmentCommentMapper recruitmentCommentMapper;



    public List<RecruitmentComment> selectByEmploymentId(int employmentID){
        return recruitmentCommentMapper.selectByEmploymentId(employmentID);
    }

    public List<RecruitmentComment> selectByCommentatorId(int commentatorID){
        return recruitmentCommentMapper.selectByCommentatorId(commentatorID);
    }

    public List<RecruitmentComment> selectByEmploymentIdAndStarNum(int employmentID,int starNum){
        return recruitmentCommentMapper.selectByEmploymentIdAndStarNum(employmentID, starNum);
    }
    //int employmentID,int commentatorID,String content,int starNum
    public int insertOne(RecruitmentComment recruitmentComment){
        return recruitmentCommentMapper.insertOne(recruitmentComment.getEmploymentID(),recruitmentComment.getCommentatorID(),recruitmentComment.getContent(),recruitmentComment.getStarNum());
    }

    public int deleteOneByEmploymentIdAndCommentatorId(int employmentID,int commentatorID){
        return recruitmentCommentMapper.deleteOneByEmploymentIdAndCommentatorId(employmentID, commentatorID);
    }
}
