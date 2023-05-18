package team.xiangxiao.xiangxiao.Controller.CompanyCheckPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.xiangxiao.xiangxiao.basic.basicService.UserService;
import team.xiangxiao.xiangxiao.pojo.User;

import java.util.List;

@RestController
@RequestMapping("/companyCheck")
public class CompanyCheckPageController {

    @Autowired
    public UserService userService;

    @RequestMapping("/getIdentifiedInfo")
    public List<User> getIndentifiedInfo(){
        return userService.selectByIsEnterpriseAndIsIdentified(1,0);
    }

    @RequestMapping("/passOrNotPass")
    public int passOrNotPass(@RequestParam("openid") String openid,@RequestParam("isIndentified")int isIndentified){
        return userService.updateIsIdentified(isIndentified,openid);
    }

}
