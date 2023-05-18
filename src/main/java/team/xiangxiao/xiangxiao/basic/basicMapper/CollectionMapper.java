package team.xiangxiao.xiangxiao.basic.basicMapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import team.xiangxiao.xiangxiao.pojo.Collection;

import java.util.List;

@Mapper
@Repository
public interface CollectionMapper {
    //使用用户id和招募信息id获取收藏信息
    final String selectByUIdAndMid = "SELECT * FROM collection WHERE uid = #{uid} AND mid = #{mid}";
    //使用用户id获取收藏信息
    final String selectByUId = "SELECT * FROM collection WHERE uid = #{uid}";
    //使用招募信息id获取收藏信息
    final String selectByMId = "SELECT * FROM collection WHERE mid = #{mid}";
    //添加收藏信息
    final String insertOne = "INSERT INTO collection(uid,mid) " +
            "VALUES(#{uid},#{mid})";
    //通过用户id删除收藏信息
    final String deleteOne = "DELETE FROM collection WHERE uid = #{uid}";
    //通过用户id和信息id删除收藏信息
    final String deleteOneByUidAndMid = "DELETE FROM collection WHERE uid = #{uid} AND mid = #{mid}";

    @Select(selectByUIdAndMid)
    Collection selectByUIdAndMid(int uid,int mid);

    @Select(selectByUId)
    List<Collection> selectByUId(int uid);

    @Select(selectByMId)
    List<Collection> selectByMId(int mid);

    @Insert(insertOne)
    int insertOne(int uid,int mid);

    @Delete(deleteOne)
    int deleteOne(int uid);

    @Delete(deleteOneByUidAndMid)
    int deleteOneByUidAndMid(int uid,int mid);
}
