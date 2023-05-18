package team.xiangxiao.xiangxiao.Controller.TagsPage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.xiangxiao.xiangxiao.basic.basicService.RecruitmentMSGService;
import team.xiangxiao.xiangxiao.pojo.RecruitmentMSG;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagsPageController {

    @Autowired
    public RecruitmentMSGService recruitmentMSGService;

    @RequestMapping("/getInfo")
    public List<RecruitmentMSG> getInfo(@RequestParam("tag_publish")String tag_public,@RequestParam("tag_time")String tag_time,
                                        @RequestParam("tag_lanch")String tag_lanch,@RequestParam("tag_sex")String tag_sex,
                                        @RequestParam("tag_charater")String tag_charater,@RequestParam("tag_age_min")int tag_age_min,
                                        @RequestParam("tag_age_max")int tag_age_max,@RequestParam("tag_edu")String tag_edu,
                                        @RequestParam("tag_welfare")String tag_welfare){
        List<RecruitmentMSG> list = recruitmentMSGService.selectByTags(tag_public,tag_time,tag_lanch,tag_sex,tag_charater,tag_edu,tag_welfare);
        List<RecruitmentMSG> list1 = new ArrayList<>();
        for (RecruitmentMSG r:
             list) {
            int min = r.getMin_age();
            int max = r.getMax_age();
            if(min>=tag_age_min&&max<=tag_age_max){
                list1.add(r);
            }
        }
        return list1;
    }

}
