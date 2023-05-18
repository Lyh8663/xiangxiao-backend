package team.xiangxiao.xiangxiao.pojo;

//招工信息
public class RecruitmentMSG {
    private int mid;
    private int employerID;
    private String position;
    private String tag_publisher;
    private String tag_lengthOfTime;
    private String tag_meals;
    private String tag_sex;
    private String tag_nature;
    private String tag_education;
    private String tag_welfare;
    private String predictDay;
    private int peopleNumber;
    private String description;
    private String requirement;
    private String salary;
    private String phoneNum;
    private String create_time;
    private String start_time;
    private String end_time;
    private int min_age;
    private int max_age;
    private String name;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getEmployerID() {
        return employerID;
    }

    public void setEmployerID(int employerID) {
        this.employerID = employerID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTag_publisher() {
        return tag_publisher;
    }

    public void setTag_publisher(String tag_publisher) {
        this.tag_publisher = tag_publisher;
    }

    public String getTag_lengthOfTime() {
        return tag_lengthOfTime;
    }

    public void setTag_lengthOfTime(String tag_lengthOfTime) {
        this.tag_lengthOfTime = tag_lengthOfTime;
    }

    public String getTag_meals() {
        return tag_meals;
    }

    public void setTag_meals(String tag_meals) {
        this.tag_meals = tag_meals;
    }

    public String getTag_sex() {
        return tag_sex;
    }

    public void setTag_sex(String tag_sex) {
        this.tag_sex = tag_sex;
    }

    public String getTag_nature() {
        return tag_nature;
    }

    public void setTag_nature(String tag_nature) {
        this.tag_nature = tag_nature;
    }

    public String getTag_education() {
        return tag_education;
    }

    public void setTag_education(String tag_education) {
        this.tag_education = tag_education;
    }

    public String getTag_welfare() {
        return tag_welfare;
    }

    public void setTag_welfare(String tag_welfare) {
        this.tag_welfare = tag_welfare;
    }

    public String getPredictDay() {
        return predictDay;
    }

    public void setPredictDay(String predictDay) {
        this.predictDay = predictDay;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public int getMin_age() {
        return min_age;
    }

    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }

    public int getMax_age() {
        return max_age;
    }

    public void setMax_age(int max_age) {
        this.max_age = max_age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RecruitmentMSG{" +
                "mid=" + mid +
                ", employerID=" + employerID +
                ", position='" + position + '\'' +
                ", tag_publisher='" + tag_publisher + '\'' +
                ", tag_lengthOfTime='" + tag_lengthOfTime + '\'' +
                ", tag_meals='" + tag_meals + '\'' +
                ", tag_sex='" + tag_sex + '\'' +
                ", tag_nature='" + tag_nature + '\'' +
                ", tag_education='" + tag_education + '\'' +
                ", tag_welfare='" + tag_welfare + '\'' +
                ", predictDay=" + predictDay +
                ", peopleNumber=" + peopleNumber +
                ", description='" + description + '\'' +
                ", requirement='" + requirement + '\'' +
                ", salary='" + salary + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", create_time='" + create_time + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", min_age=" + min_age +
                ", max_age=" + max_age +
                ", name='" + name + '\'' +
                '}';
    }
}
