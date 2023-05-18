package team.xiangxiao.xiangxiao.basic.basicMapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import team.xiangxiao.xiangxiao.pojo.RecruitmentMSG;

import java.util.List;

@Mapper
@Repository

public interface RecruitmentMSGMapper {
    //通过招工名查找招工信息
    final String selectByName =
            "SELECT * FROM recruitmentmsg WHERE name = #{name}";

    //通过招工信息编号查找招工信息
    final String selectByMId =
            "SELECT * FROM recruitmentmsg WHERE mid = #{mid}";

    //通过雇主id查找招工信息
    final String selectByEmployerID =
            "SELECT * FROM recruitmentmsg WHERE employerID = #{employerID}";

    //通过地点查找招工信息
    final String selectByPosition =
            "SELECT * FROM recruitmentmsg WHERE position = #{position}";

    //通过发布者身份查找招工信息
    final String selectByTag_publisher =
            "SELECT * FROM recruitmentmsg WHERE tag_publisher = #{tag_publisher}";

    //通过长期短期查找招工信息
    final String selectByTag_lengthOfTime =
            "SELECT * FROM recruitmentmsg WHERE tag_lengthOfTime = #{tag_lengthOfTime}";

    //通过餐食条件查找招工信息
    final String selectByTag_meals =
            "SELECT * FROM recruitmentmsg WHERE tag_meals = #{tag_meals}";

    //通过性别条件查找招工信息
    final String selectByTag_sex =
            "SELECT * FROM recruitmentmsg WHERE tag_sex = #{tag_sex}";

    //通过招工性质查找招工信息
    final String selectByTag_nature =
            "SELECT * FROM recruitmentmsg WHERE tag_nature = #{tag_nature}";

    //通过教育条件查找招工信息
    final String selectByTag_education =
            "SELECT * FROM recruitmentmsg WHERE tag_education = #{tag_education}";

    //通过福利条件查找招工信息
    final String selectByTag_welfare =
            "SELECT * FROM recruitmentmsg WHERE tag_welfare = #{tag_welfare}";

    //添加一条招工信息
    final String insertOne =
            "INSERT INTO " +
                    "recruitmentmsg(mid,employerID,position,tag_publisher,tag_lengthOfTime,tag_meals,tag_sex,tag_nature,tag_education,tag_welfare,predictDay,peopleNumber,description,requirement,salary,phoneNum,start_time,end_time,min_age,max_age,name) " +
                    "VALUES(#{mid},#{employerID},#{position},#{tag_publisher},#{tag_lengthOfTime},#{tag_meals},#{tag_sex},#{tag_nature},#{tag_education},#{tag_welfare},#{predictDay},#{peopleNumber},#{description},#{requirement},#{salary},#{phoneNum},#{start_time},#{end_time},#{min_age},#{max_age},#{name})";

    //根据删除一条招工信息
    final String deleteOne =
            "DELETE FROM recruitmentmsg WHERE mid = #{mid}";

    //通过tag值查找招工信息
    final String selectByTags = "SELECT * FROM recruitmentmsg WHERE tag_publisher = #{tag_publish} AND tag_lengthOfTime = #{tag_time} AND tag_meals = #{tag_lanch}" +
            "AND tag_sex = #{tag_sex} AND tag_nature = #{tag_character} AND tag_education = #{tag_edu} AND tag_welfare = #{tag_welfare}";


    @Select(selectByTags)
    List<RecruitmentMSG> selectByTags(String tag_publish,String tag_time,String tag_lanch,String tag_sex,String tag_character,String tag_edu,String tag_welfare);
    @Select(selectByName)
    List<RecruitmentMSG> selectByName(String name);
    @Select(selectByMId)
    RecruitmentMSG selectByMId(int mid);
    @Select(selectByEmployerID)
    List<RecruitmentMSG> selectByEmployerID(int employerID);
    @Select(selectByPosition)
    List<RecruitmentMSG> selectByPosition(String position);
    @Select(selectByTag_publisher)
    List<RecruitmentMSG> selectByTag_publisher(String tag_publisher);
    @Select(selectByTag_lengthOfTime)
    List<RecruitmentMSG> selectByTag_lengthOfTime(String tag_lengthOfTime);
    @Select(selectByTag_meals)
    List<RecruitmentMSG> selectByTag_meals(String tag_meals);
    @Select(selectByTag_sex)
    List<RecruitmentMSG> selectByTag_sex(String tag_sex);
    @Select(selectByTag_nature)
    List<RecruitmentMSG> selectByTag_nature(String tag_nature);
    @Select(selectByTag_education)
    List<RecruitmentMSG> selectByTag_education(String tag_education);
    @Select(selectByTag_welfare)
    List<RecruitmentMSG> selectByTag_welfare(String tag_welfare);
    @Insert(insertOne)
    int insertOne(int mid,int employerID,String position,String tag_publisher,String tag_lengthOfTime,String tag_meals,String tag_sex,String tag_nature,String tag_education,String tag_welfare,String predictDay,int peopleNumber,String description,String requirement,String salary,String phoneNum,String start_time,String end_time,int min_age,int max_age,String name);
    @Delete(deleteOne)
    int deleteOne(int mid);
}
