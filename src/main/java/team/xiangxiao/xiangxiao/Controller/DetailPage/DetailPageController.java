package team.xiangxiao.xiangxiao.Controller.DetailPage;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.xiangxiao.xiangxiao.basic.basicService.CollectionService;
import team.xiangxiao.xiangxiao.basic.basicService.RecruitmentMSGService;
import team.xiangxiao.xiangxiao.basic.basicService.SignUpService;
import team.xiangxiao.xiangxiao.basic.basicService.UserService;
import team.xiangxiao.xiangxiao.pojo.Collection;
import team.xiangxiao.xiangxiao.pojo.SignUp;

import java.util.List;

/*
* private User employer;//这是招工发布者的信息
    private int isStar;//表示是否收藏
    private RecruitmentMSG recruitmentMSG;//返回整个recruitmentMSG
    private int numberForSign;
* */

@RestController
@RequestMapping("/detail")
public class DetailPageController {

    @Autowired
    public UserService userService;

    @Autowired
    public CollectionService collectionService;

    @Autowired
    public RecruitmentMSGService recruitmentMSGService;

    @Autowired
    public SignUpService signUpService;

    @RequestMapping("/getInfo")
    public DetailInfo getInfo(@RequestParam("openid")String openid, @RequestParam("mid")int mid){

        DetailInfo detailInfo = new DetailInfo();

        int uid = userService.selectByOpenID(openid).getId();

        //0表示未收藏，1表示已收藏
        if(collectionService.selectByUIdAndMid(uid,mid)==null){
            detailInfo.setIsStar(0);
        }else{
            detailInfo.setIsStar(1);
        }

        detailInfo.setRecruitmentMSG(recruitmentMSGService.selectByMId(mid));

        detailInfo.setEmployer(userService.selectByUId(recruitmentMSGService.selectByMId(mid).getEmployerID()));

        List<SignUp> list = signUpService.selectByUIdAndMId(mid,uid);

        int num = list.size();

        detailInfo.setNumberForSign(num);

        return detailInfo;
    }

    @RequestMapping("/shoucang")
    public int soucang(@RequestParam("mid")int mid,@RequestParam("openid")String openid,@RequestParam("isStar")String isStar){
        if(isStar == "true"){
            Collection collection = new Collection();
            collection.setMid(mid);
            collection.setUid(userService.selectByOpenID(openid).getId());
            return collectionService.insertOne(collection);
        }else{
            return collectionService.deleteOneByUidAndMid(userService.selectByOpenID(openid).getId(),mid);
        }
    }

    @RequestMapping("/baoming")
    public int baoming(@RequestParam("mid")int mid,@RequestParam("openid")String openid,@RequestParam("signup-time")String signup_time,@RequestParam("numOfpeople")int numOfpeople){

        int uid = userService.selectByOpenID(openid).getId();

        SignUp signUp = new SignUp();
        signUp.setMid(mid);
        signUp.setUid(uid);

        int result = 0;

        for (int i = 0; i < numOfpeople; i++) {
            result += signUpService.insertOne(signUp);
        }

        return result;
    }
}
