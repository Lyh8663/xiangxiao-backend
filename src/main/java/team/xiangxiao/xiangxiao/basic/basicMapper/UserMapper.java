package team.xiangxiao.xiangxiao.basic.basicMapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import team.xiangxiao.xiangxiao.pojo.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    final String updateIsIdentified = "UPDATE user SET isIdentified = #{isIdentified} WHERE openID = #{openid}";

    final String selectByIsEnterpriseAndIsIdentified = "SELECT * FROM user WHERE isIdentified = #{isIdentified} AND isEnterprise = #{isEnterprise}";

    final String selectByUId =
            "SELECT * FROM user WHERE id = #{id}";
    final String selectByOpenID =
            "SELECT * FROM user WHERE openID = #{openID}";
    final String selectByIsManager =
            "SELECT * FROM user WHERE isManager = #{isManager}";
    final String insertOne =
            "INSERT INTO user(openID,position,avater,nickname,age,isManager,isIdentified,isEnterprise,enterpriseName)" +
                    "VALUES(#{openID},#{position},#{avater},#{nickname},#{isManager},#{isIdentified},#{isEnterprise},#{enterpriseName})";
    @Update(updateIsIdentified)
    int updateIsIdentified(int isIndentified,String openid);
    @Select(selectByIsEnterpriseAndIsIdentified)
    List<User> selectByIsEnterpriseAndIsIdentified(int isIdentified,int isEnterprise);
    @Select(selectByUId)
    User selectByUId(int id);
    @Select(selectByOpenID)
    User selectByOpenID(String openID);
    @Select(selectByIsManager)
    List<User> selectByIsManager(int isManager);
    @Insert(insertOne)
    int insertOne(String openID,String position,String avater,String nickname,int isManager,int isIdentified,int isEnterprise,String enterpriseName);
}
