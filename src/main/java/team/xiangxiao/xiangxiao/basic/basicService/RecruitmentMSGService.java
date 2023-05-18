package team.xiangxiao.xiangxiao.basic.basicService;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xiangxiao.xiangxiao.basic.basicMapper.RecruitmentCommentMapper;
import team.xiangxiao.xiangxiao.basic.basicMapper.RecruitmentMSGMapper;
import team.xiangxiao.xiangxiao.pojo.RecruitmentMSG;

import java.util.List;

@Service
public class RecruitmentMSGService {
    @Autowired
    RecruitmentMSGMapper recruitmentMSGMapper;

    public List<RecruitmentMSG> selectByTags(String tag_publish,String tag_time,String tag_lanch,String tag_sex,String tag_character,String tag_edu,String tag_welfare){
        return recruitmentMSGMapper.selectByTags(tag_publish,tag_time,tag_lanch,tag_sex,tag_character,tag_edu,tag_welfare);
    }

    public List<RecruitmentMSG> selectByName(String name){
        return recruitmentMSGMapper.selectByName(name);
    }

    public RecruitmentMSG selectByMId(int mid){
        return recruitmentMSGMapper.selectByMId(mid);
    }

    public List<RecruitmentMSG> selectByEmployerID(int employerID){
        return recruitmentMSGMapper.selectByEmployerID(employerID);
    }

    public List<RecruitmentMSG> selectByPosition(String position){
        return recruitmentMSGMapper.selectByPosition(position);
    }

    public List<RecruitmentMSG> selectByTag_publisher(String tag_publisher){
        return recruitmentMSGMapper.selectByTag_publisher(tag_publisher);
    }

    public List<RecruitmentMSG> selectByTag_lengthOfTime(String tag_lengthOfTime){
        return recruitmentMSGMapper.selectByTag_lengthOfTime(tag_lengthOfTime);
    }

    public List<RecruitmentMSG> selectByTag_meals(String tag_meals){
        return recruitmentMSGMapper.selectByTag_meals(tag_meals);
    }

    public List<RecruitmentMSG> selectByTag_sex(String tag_sex){
        return recruitmentMSGMapper.selectByTag_sex(tag_sex);
    }

    public List<RecruitmentMSG> selectByTag_nature(String tag_nature){
        return recruitmentMSGMapper.selectByTag_nature(tag_nature);
    }

    public List<RecruitmentMSG> selectByTag_education(String tag_education){
        return recruitmentMSGMapper.selectByTag_education(tag_education);
    }

    public List<RecruitmentMSG> selectByTag_welfare(String tag_welfare){
        return recruitmentMSGMapper.selectByTag_welfare(tag_welfare);
    }

    public int insertOne(RecruitmentMSG recruitmentMSG){
        return recruitmentMSGMapper.insertOne(recruitmentMSG.getMid(),recruitmentMSG.getEmployerID(),recruitmentMSG.getPosition(),recruitmentMSG.getTag_publisher(),recruitmentMSG.getTag_lengthOfTime(),recruitmentMSG.getTag_meals(),recruitmentMSG.getTag_sex(),recruitmentMSG.getTag_nature(),recruitmentMSG.getTag_education(),recruitmentMSG.getTag_welfare(),recruitmentMSG.getPredictDay(),recruitmentMSG.getPeopleNumber(),recruitmentMSG.getDescription(),recruitmentMSG.getRequirement(),recruitmentMSG.getSalary(),recruitmentMSG.getPhoneNum(),recruitmentMSG.getStart_time(),recruitmentMSG.getEnd_time(), recruitmentMSG.getMin_age(), recruitmentMSG.getMax_age(),recruitmentMSG.getName());
    }
//    int insertOne(int mid,int employerID,String position,String tag_publisher,String tag_lengthOfTime,String tag_meals,String tag_sex,String tag_nature,String tag_education,String tag_welfare,String peopleNumber,String description,String requirement,String salary,String phoneNum,String start_time);

    public int deleteOne(int mid){
        return recruitmentMSGMapper.deleteOne(mid);
    }
}
