package team.xiangxiao.xiangxiao.basic.basicService;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xiangxiao.xiangxiao.basic.basicMapper.UserMapper;
import team.xiangxiao.xiangxiao.pojo.User;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int updateIsIdentified(int isIdentified,String openid){
        return userMapper.updateIsIdentified(isIdentified,openid);
    }

    public List<User> selectByIsEnterpriseAndIsIdentified(int isIndentified,int isEnterprise){
        return userMapper.selectByIsEnterpriseAndIsIdentified(isIndentified,isEnterprise);
    }

    public User selectByUId(int id){
        return userMapper.selectByUId(id);
    }

    public User selectByOpenID(String openID){
        return userMapper.selectByOpenID(openID);
    }

    public List<User> selectByIsManager(int isManager){
        return userMapper.selectByIsManager(isManager);
    }

    public int insertOne(User user){
        return userMapper.insertOne(user.getOpenID(),user.getPosition(),user.getAvater(),user.getNickname(),user.getIsManager(),user.getIsIdentified(),user.getIsEnterprise(),user.getEnterpriseName());
    }
}
