package team.xiangxiao.xiangxiao.basic.basicService;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xiangxiao.xiangxiao.basic.basicMapper.SignUpMapper;
import team.xiangxiao.xiangxiao.pojo.SignUp;

import java.util.List;

@Service
public class SignUpService {
    @Autowired
    SignUpMapper signUpMapper;

    public List<SignUp> selectByUId(int uid){
        return signUpMapper.selectByUId(uid);
    }

    public List<SignUp> selectByMId(int mid){
        return signUpMapper.selectByMId(mid);
    }

    public List<SignUp> selectByUIdAndMId(int mid,int uid){
        return signUpMapper.selectByUIdAndMId(mid,uid);
    }

    public int insertOne(SignUp signUp){
        return signUpMapper.insertOne(signUp.getUid(),signUp.getMid(),signUp.getState(),signUp.getFailReason(),signUp.getFailStarNum());
    }

    public int deleteByMId(int mid){
        return signUpMapper.deleteByMId(mid);
    }

    public int deleteByUIdAndMId(int uid,int mid){
        return signUpMapper.deleteByUIdAndMId(uid,mid);
    }
}
