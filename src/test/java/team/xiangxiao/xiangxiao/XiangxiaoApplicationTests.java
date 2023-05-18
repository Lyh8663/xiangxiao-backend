package team.xiangxiao.xiangxiao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.xiangxiao.xiangxiao.basic.basicMapper.CollectionMapper;
import team.xiangxiao.xiangxiao.basic.basicMapper.EmployeeCommentMapper;
import team.xiangxiao.xiangxiao.basic.basicMapper.RecruitmentMSGMapper;
import team.xiangxiao.xiangxiao.basic.basicService.*;
import team.xiangxiao.xiangxiao.pojo.RecruitmentComment;
import team.xiangxiao.xiangxiao.pojo.RecruitmentMSG;
import team.xiangxiao.xiangxiao.pojo.SignUp;

@SpringBootTest
class XiangxiaoApplicationTests {

    @Autowired
    CollectionMapper collectionMapper;
    @Autowired
    EmployeeCommentMapper employeeCommentMapper;
    @Autowired
    CollectionService collectionService;
    @Autowired
    RecruitmentCommentService recruitmentCommentService;
    @Autowired
    EmployeeCommentService employeeCommentService;
    @Autowired
    RecruitmentMSGService recruitmentMSGService;
    @Autowired
    SignUpService signUpService;

    @Test
    void contextLoads() {
        SignUp signUp = new SignUp();
        signUp.setUid(10086);
        signUp.setMid(2222);
        signUp.setState("待审核");
        signUpService.insertOne(signUp);
    }

}
