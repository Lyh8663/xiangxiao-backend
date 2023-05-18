package team.xiangxiao.xiangxiao.Controller.IWantToCommentPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.xiangxiao.xiangxiao.basic.basicService.RecruitmentCommentService;
import team.xiangxiao.xiangxiao.pojo.RecruitmentComment;
import team.xiangxiao.xiangxiao.pojo.User;

@RestController
@RequestMapping("/iwanttocomment")
public class IWantToCommentPageController {

    @Autowired
    public RecruitmentCommentService recruitmentCommentService;

    @RequestMapping("/getInfo")
    public User getInfo(@RequestParam("")){}

}
