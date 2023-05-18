package team.xiangxiao.xiangxiao.Controller.IndexPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.xiangxiao.xiangxiao.basic.basicService.RecruitmentMSGService;
import team.xiangxiao.xiangxiao.pojo.RecruitmentMSG;

import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexPageController {

    @Autowired
    public RecruitmentMSGService recruitmentMSGService;

    @RequestMapping("/searchByPosition")
    public List<RecruitmentMSG> searchByPosition(@RequestParam("location")String location){
        return recruitmentMSGService.selectByPosition(location);
    }

}
