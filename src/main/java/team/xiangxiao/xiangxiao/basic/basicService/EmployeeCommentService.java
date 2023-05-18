package team.xiangxiao.xiangxiao.basic.basicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xiangxiao.xiangxiao.basic.basicMapper.EmployeeCommentMapper;
import team.xiangxiao.xiangxiao.pojo.EmployeeComment;

import java.util.List;

@Service
public class EmployeeCommentService {

    @Autowired
    EmployeeCommentMapper employeeCommentMapper;

    public List<EmployeeComment> selectByCommentatorId(int commentatorId){
        return employeeCommentMapper.selectByCommentatorId(commentatorId);
    }

    public List<EmployeeComment> selectByReviewerId(int reviewerId){
        return employeeCommentMapper.selectByReviewerId(reviewerId);
    }

    public List<EmployeeComment> selectByMId(int mid){
        return employeeCommentMapper.selectByMId(mid);
    }

    //int insertOne(int commentatorID,int reviewerID,int mid,String content)
    public int insertOne(EmployeeComment employeeComment){
        return employeeCommentMapper.insertOne(employeeComment.getCommentatorID(),employeeComment.getReviewerID(),employeeComment.getMid(),employeeComment.getContent());
    }

    public int deleteOneByCommentatorId(int commentatorID){
        return employeeCommentMapper.deleteOneByCommentatorId(commentatorID);
    }

    public int deleteOneByReviewerId(int reviewerID){
        return employeeCommentMapper.deleteOneByReviewerId(reviewerID);
    }

    public int deleteOneByMId(int mid){
        return employeeCommentMapper.deleteOneByMId(mid);
    }
}
