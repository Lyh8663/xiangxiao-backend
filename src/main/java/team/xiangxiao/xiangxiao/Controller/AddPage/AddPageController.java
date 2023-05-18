package team.xiangxiao.xiangxiao.Controller.AddPage;


import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.xiangxiao.xiangxiao.basic.basicService.RecruitmentMSGService;
import team.xiangxiao.xiangxiao.basic.basicService.UserService;
import team.xiangxiao.xiangxiao.pojo.RecruitmentMSG;

@RequestMapping("/add")
@RestController
public class AddPageController {

    @Autowired
    public RecruitmentMSGService recruitmentMSGService;

    @Autowired
    public UserService userService;

    /*
    * time_tag是周月年之类的
    * selftime是工期的时间数字
    * 两个应该合成时间变量
    * tag中包含sexTag 0表示仅限男性，1表示仅限女性，2表示男士优先，3表示女士优先，4表示性别不限
    *         kindTag 0表示全职，1表示兼职
    *         educationTag 0表示本科，1表示专科，2表示无要求，3表示其他要求
    *         awardTag 0表示提供三餐，1表示提供午餐，2表示五险一金，3表示有双休，4表示其他福利
    *         mealTag 0表示包三餐，1表示包早餐，2表示包午餐，3表示包晚餐，4表示包早午，5表示包午晚
    * */

    @RequestMapping("/addOne")
    public int addOne(@RequestParam("slot")String tag_publisher,@RequestParam("self_name") String name,
                      @RequestParam("self_describe")String description,@RequestParam("self_request")String requirement,
                      @RequestParam("self_place")String position,@RequestParam("self_need")int peopleNumber,
                      @RequestParam("self_salary")String salary,@RequestParam("self_contact")String phoneNum,
                      @RequestParam("self_time")int timeNum,@RequestParam("time_tag")String time_tag,
                      @RequestParam("self_min")int min_age,@RequestParam("self_max")int max_age,
                      @RequestParam("longtag")String tag_lengthOfTime,@RequestParam("tag")int[] tag,
                      @RequestParam("enter_name")String enter_name,@RequestParam("enter_describe")String enter_describe,
                      @RequestParam("enter_request")String enter_request,@RequestParam("enter_place")String enter_place,
                      @RequestParam("enter_need")int enter_need,@RequestParam("enter_salary")String enter_salary,
                      @RequestParam("enter_contact")String enter_contact,@RequestParam("enter_min")int enter_min,
                      @RequestParam("enter_max")int enter_max,@RequestParam("openid")String openid){

        //先通过前端openid获取uid
        int uid = userService.selectByOpenID(openid).getId();

        //创建一个pojo
        RecruitmentMSG recruitmentMSG = new RecruitmentMSG();
        recruitmentMSG.setEmployerID(uid);


        //判断是企业还是个人
        if(tag_publisher == "one"){//个人招工

            recruitmentMSG.setTag_publisher("个人");
            recruitmentMSG.setName(name);
            recruitmentMSG.setDescription(description);
            recruitmentMSG.setRequirement(requirement);
            recruitmentMSG.setPosition(position);
            recruitmentMSG.setPeopleNumber(peopleNumber);
            recruitmentMSG.setSalary(salary);
            recruitmentMSG.setPhoneNum(phoneNum);
            recruitmentMSG.setPredictDay(timeNum+time_tag);
            recruitmentMSG.setMax_age(max_age);
            recruitmentMSG.setMin_age(min_age);
            recruitmentMSG.setTag_lengthOfTime(tag_lengthOfTime);
            //设置性别需要判断
            if(tag[0]==0){
                recruitmentMSG.setTag_sex(0+"");
            }else if(tag[0]==1){
                recruitmentMSG.setTag_sex(1+"");
            }else if(tag[0]==2){
                recruitmentMSG.setTag_sex(2+"");
            }else if(tag[0]==3){
                recruitmentMSG.setTag_sex(3+"");
            }else if(tag[0]==4){
                recruitmentMSG.setTag_sex(4+"");
            }else{
                recruitmentMSG.setTag_sex("");
            }

            //设置类型需要判断
            if(tag[1]==0){
                recruitmentMSG.setTag_nature(0+"");
            }else if(tag[1]==1){
                recruitmentMSG.setTag_nature(1+"");
            }else {
                recruitmentMSG.setTag_nature("");
            }

            //教育类型
            if(tag[2]==0){
                recruitmentMSG.setTag_education(0+"");
            }else if(tag[2]==1){
                recruitmentMSG.setTag_education(1+"");
            }else if(tag[2]==2){
                recruitmentMSG.setTag_education(2+"");
            }else if(tag[2]==3){
                recruitmentMSG.setTag_education(3+"");
            }else{
                recruitmentMSG.setTag_education("");
            }

            //福利类型
            if(tag[3]==0){
                recruitmentMSG.setTag_welfare(0+"");
            }else if(tag[3]==1){
                recruitmentMSG.setTag_welfare(1+"");
            }else if(tag[3]==2){
                recruitmentMSG.setTag_welfare(2+"");
            }else if(tag[3]==3){
                recruitmentMSG.setTag_welfare(3+"");
            }else if(tag[3]==4){
                recruitmentMSG.setTag_welfare(4+"");
            }else{
                recruitmentMSG.setTag_welfare("");
            }

            //餐食条件
            if(tag[4]==0){
                recruitmentMSG.setTag_meals(0+"");
            }else if(tag[4]==1){
                recruitmentMSG.setTag_meals(1+"");
            }else if(tag[4]==2){
                recruitmentMSG.setTag_meals(2+"");
            }else if(tag[4]==3){
                recruitmentMSG.setTag_meals(3+"");
            }else if(tag[4]==4){
                recruitmentMSG.setTag_meals(4+"");
            }else if(tag[4]==5){
                recruitmentMSG.setTag_meals(5+"");
            }else{
                recruitmentMSG.setTag_meals("");
            }

            return recruitmentMSGService.insertOne(recruitmentMSG);

        }else if(tag_publisher == "two"){//企业招工

            recruitmentMSG.setTag_publisher("企业");
            recruitmentMSG.setName(enter_name);
            recruitmentMSG.setDescription(enter_describe);
            recruitmentMSG.setRequirement(enter_request);
            recruitmentMSG.setPosition(enter_place);
            recruitmentMSG.setPeopleNumber(enter_need);
            recruitmentMSG.setSalary(enter_salary);
            recruitmentMSG.setPhoneNum(enter_contact);
            recruitmentMSG.setPredictDay(timeNum+time_tag);
            recruitmentMSG.setMax_age(enter_max);
            recruitmentMSG.setMin_age(enter_min);
            recruitmentMSG.setTag_lengthOfTime(tag_lengthOfTime);
            //设置性别需要判断
            if(tag[0]==0){
                recruitmentMSG.setTag_sex(0+"");
            }else if(tag[0]==1){
                recruitmentMSG.setTag_sex(1+"");
            }else if(tag[0]==2){
                recruitmentMSG.setTag_sex(2+"");
            }else if(tag[0]==3){
                recruitmentMSG.setTag_sex(3+"");
            }else if(tag[0]==4){
                recruitmentMSG.setTag_sex(4+"");
            }else{
                recruitmentMSG.setTag_sex("");
            }

            //设置类型需要判断
            if(tag[1]==0){
                recruitmentMSG.setTag_nature(0+"");
            }else if(tag[1]==1){
                recruitmentMSG.setTag_nature(1+"");
            }else {
                recruitmentMSG.setTag_nature("");
            }

            //教育类型
            if(tag[2]==0){
                recruitmentMSG.setTag_education(0+"");
            }else if(tag[2]==1){
                recruitmentMSG.setTag_education(1+"");
            }else if(tag[2]==2){
                recruitmentMSG.setTag_education(2+"");
            }else if(tag[2]==3){
                recruitmentMSG.setTag_education(3+"");
            }else{
                recruitmentMSG.setTag_education("");
            }

            //福利类型
            if(tag[3]==0){
                recruitmentMSG.setTag_welfare(0+"");
            }else if(tag[3]==1){
                recruitmentMSG.setTag_welfare(1+"");
            }else if(tag[3]==2){
                recruitmentMSG.setTag_welfare(2+"");
            }else if(tag[3]==3){
                recruitmentMSG.setTag_welfare(3+"");
            }else if(tag[3]==4){
                recruitmentMSG.setTag_welfare(4+"");
            }else{
                recruitmentMSG.setTag_welfare("");
            }

            //餐食条件
            if(tag[4]==0){
                recruitmentMSG.setTag_meals(0+"");
            }else if(tag[4]==1){
                recruitmentMSG.setTag_meals(1+"");
            }else if(tag[4]==2){
                recruitmentMSG.setTag_meals(2+"");
            }else if(tag[4]==3){
                recruitmentMSG.setTag_meals(3+"");
            }else if(tag[4]==4){
                recruitmentMSG.setTag_meals(4+"");
            }else if(tag[4]==5){
                recruitmentMSG.setTag_meals(5+"");
            }else{
                recruitmentMSG.setTag_meals("");
            }

            return recruitmentMSGService.insertOne(recruitmentMSG);

        }else{
            return -1;
        }

    }

}
