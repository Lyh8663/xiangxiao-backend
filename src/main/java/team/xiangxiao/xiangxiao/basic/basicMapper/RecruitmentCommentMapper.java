package team.xiangxiao.xiangxiao.basic.basicMapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import team.xiangxiao.xiangxiao.pojo.RecruitmentComment;

import java.util.List;

@Mapper
@Repository
public interface RecruitmentCommentMapper {
    //通过招工信息编号employmentID（mid）获得评论信息
    final String selectByEmploymentId = "SELECT * FROM recruitmentcomment WHERE employmentID = #{employmentID}";
    //通过评论者id获得评论信息
    final String selectByCommentatorId = "SELECT * FROM recruitmentcomment WHERE commentatorID = #{commentatorID}";
    //通过招工编号和星级获得评论信息
    final String selectByEmploymentIdAndStarNum =
            "SELECT * FROM recruitmentcomment WHERE employmentID = #{employmentID} AND starNum = #{starNum}";
    //添加对于招工的评论信息
    final String insertOne =
            "INSERT INTO recruitmentcomment(employmentID,commentatorID,content,starNum)" +
                    "VALUES(#{employmentID},#{commentatorID},#{content},#{starNum})";
    //通过评论者和招工编号删除评论信息
    final String deleteOneByEmploymentIdAndCommentatorId =
            "DELETE FROM recruitmentcomment WHERE employmentID = #{employmentID} AND commentatorID = #{commentatorID}";

    @Select(selectByEmploymentId)
    List<RecruitmentComment> selectByEmploymentId(int employmentID);

    @Select(selectByCommentatorId)
    List<RecruitmentComment> selectByCommentatorId(int commentatorID);

    @Select(selectByEmploymentIdAndStarNum)
    List<RecruitmentComment> selectByEmploymentIdAndStarNum(int employmentID,int starNum);

    @Insert(insertOne)
    int insertOne(int employmentID,int commentatorID,String content,int starNum);

    @Delete(deleteOneByEmploymentIdAndCommentatorId)
    int deleteOneByEmploymentIdAndCommentatorId(int employmentID,int commentatorID);
}
