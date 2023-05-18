package team.xiangxiao.xiangxiao.basic.basicMapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import team.xiangxiao.xiangxiao.pojo.EmployeeComment;

import java.util.List;

@Mapper
@Repository
public interface EmployeeCommentMapper {
    //使用评价者id获取评论信息
    final String selectByCommentatorId = "SELECT * FROM employeecomment WHERE commentatorID = #{commentatorID}";
    //使用被评价者id获取评论信息
    final String selectByReviewerId = "SELECT * FROM employeecomment WHERE reviewerID = #{reviewerID}";
    //使用招募信息编号获取评论信息
    final String selectByMId = "SELECT * FROM employeecomment WHERE mid = #{mid}";
    //插入评论信息
    final String insertOne = "INSERT INTO employeecomment(commentatorID,reviewerID,mid,content) " +
            "VALUES(#{commentatorID},#{reviewerID},#{mid},#{content})";
    //通过评价者id删除评论信息
    final String deleteOneByCommentatorId = "DELETE FROM employeecomment WHERE commentatorID = #{commentatorID}";
    //通过被评价者id删除评论信息
    final String deleteOneByReviewerId = "DELETE FROM employeecomment WHERE reviewerID = #{reviewerID}";
    //通过招募信息编号删除评论信息
    final String deleteOneByMId = "DELETE FROM employeecomment WHERE mid = #{mid}";

    @Select(selectByCommentatorId)
    List<EmployeeComment> selectByCommentatorId(int commentatorId);

    @Select(selectByReviewerId)
    List<EmployeeComment> selectByReviewerId(int reviewerId);

    @Select(selectByMId)
    List<EmployeeComment> selectByMId(int mid);

    @Insert(insertOne)
    int insertOne(int commentatorID,int reviewerID,int mid,String content);

    @Delete(deleteOneByCommentatorId)
    int deleteOneByCommentatorId(int commentatorID);

    @Delete(deleteOneByReviewerId)
    int deleteOneByReviewerId(int reviewerID);

    @Delete(deleteOneByMId)
    int deleteOneByMId(int mid);
}
