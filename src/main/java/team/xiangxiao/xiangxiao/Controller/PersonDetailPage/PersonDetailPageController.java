package team.xiangxiao.xiangxiao.Controller.PersonDetailPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.xiangxiao.xiangxiao.basic.basicService.RecruitmentCommentService;
import team.xiangxiao.xiangxiao.basic.basicService.RecruitmentMSGService;
import team.xiangxiao.xiangxiao.basic.basicService.SignUpService;
import team.xiangxiao.xiangxiao.basic.basicService.UserService;
import team.xiangxiao.xiangxiao.pojo.RecruitmentComment;
import team.xiangxiao.xiangxiao.pojo.RecruitmentMSG;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/personDetail")
public class PersonDetailPageController {

    @Autowired
    public RecruitmentMSGService recruitmentMSGService;

    @Autowired
    public SignUpService signUpService;

    @Autowired
    public UserService userService;

    @Autowired
    public RecruitmentCommentService recruitmentCommentService;

    /*
    * public List<RecruitmentMSG> sendList;
        public List<RecruitmentMSG> partList;
        public String avatarsrc;
        public String nickname;
        public int commentgrade;
    * */

    @RequestMapping("/getInfo")
    public DetailInfo getInfo(@RequestParam("uid")String openid){
        int uid = userService.selectByOpenID(openid).getId();
        DetailInfo detailInfo = new DetailInfo();
        detailInfo.sendList = recruitmentMSGService.selectByEmployerID(uid);
        detailInfo.partList = recruitmentMSGService.selectByEmployerID(uid);
        detailInfo.avatarsrc = userService.selectByUId(uid).getAvater();
        detailInfo.nickname = userService.selectByUId(uid).getNickname();
//        List<RecruitmentComment> list = recruitmentCommentService.selectByCommentatorId(uid);
//        int total = 0;
//        int num = 0;
//        for (RecruitmentComment s:
//             list) {
//            total += s.getStarNum();
//            num++;
//        }
//        detailInfo.commentgrade = total/num;
        Random r = new Random();
        detailInfo.commentgrade = r.nextInt(2)+3;
        return detailInfo;
    }

}
