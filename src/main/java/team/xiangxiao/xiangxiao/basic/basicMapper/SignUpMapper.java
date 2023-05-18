package team.xiangxiao.xiangxiao.basic.basicMapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import team.xiangxiao.xiangxiao.pojo.SignUp;

import java.util.List;

@Mapper
@Repository
public interface SignUpMapper {
    final String selectByUId =
            "SELECT * FROM signup WHERE uid = #{uid}";
    final String selectByMId =
            "SELECT * FROM signup WHERE mid = #{mid}";
    final String selectByUIdAndMId =
            "SELECT * FROM signup WHERE mid = #{mid} AND uid = #{uid}";
    final String insertOne =
            "INSERT INTO signup(uid,mid,state,failReason,failStarNum) " +
                    "VALUES(#{uid},#{mid},#{state},#{failReason},#{failStarNum})";
    final String deleteByUIdAndMId =
            "DELETE FROM signup WHERE uid = #{uid} AND mid = #{mid}";
    final String deleteByMId =
            "DELETE FROM signup WHERE mid=#{mid}";
    @Select(selectByUId)
    List<SignUp> selectByUId(int uid);
    @Select(selectByMId)
    List<SignUp> selectByMId(int mid);
    @Select(selectByUIdAndMId)
    List<SignUp> selectByUIdAndMId(int mid,int uid);
    @Insert(insertOne)
    int insertOne(int uid,int mid,String state,String failReason,int failStarNum);
    @Delete(deleteByMId)
    int deleteByMId(int mid);
    @Delete(deleteByUIdAndMId)
    int deleteByUIdAndMId(int uid,int mid);

}
