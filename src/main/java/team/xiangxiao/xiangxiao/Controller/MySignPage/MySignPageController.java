package team.xiangxiao.xiangxiao.Controller.MySignPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.xiangxiao.xiangxiao.basic.basicService.RecruitmentMSGService;
import team.xiangxiao.xiangxiao.basic.basicService.SignUpService;
import team.xiangxiao.xiangxiao.basic.basicService.UserService;
import team.xiangxiao.xiangxiao.pojo.RecruitmentMSG;
import team.xiangxiao.xiangxiao.pojo.SignUp;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mySign")
public class MySignPageController {

    @Autowired
    public UserService userService;

    @Autowired
    public SignUpService signUpService;

    @Autowired
    public RecruitmentMSGService recruitmentMSGService;

    @RequestMapping("/getInfo")
    public List<RecruitmentMSG> getInfo(@RequestParam("openid") String openid){
        int id = userService.selectByOpenID(openid).getId();
        List<RecruitmentMSG> list1 = new ArrayList<>();
        List<SignUp> list = signUpService.selectByUId(id);
        for (SignUp s:
             list) {

            list1.add(recruitmentMSGService.selectByMId(s.getMid()));
        }
        return list1;
    }

}
