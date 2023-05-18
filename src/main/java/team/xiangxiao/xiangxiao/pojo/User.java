package team.xiangxiao.xiangxiao.pojo;

//用户
public class User {
    private int id;
    private String openID;
    private String position;
    private String avater;
    private String nickname;
    private int age;
    private int isManager;
    private int isIdentified;
    private int isEnterprise;
    private String enterpriseName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", openID='" + openID + '\'' +
                ", position='" + position + '\'' +
                ", avater='" + avater + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", isManager=" + isManager +
                ", isIdentified=" + isIdentified +
                ", isEnterprise=" + isEnterprise +
                ", enterpriseName='" + enterpriseName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpenID() {
        return openID;
    }

    public void setOpenID(String openID) {
        this.openID = openID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIsManager() {
        return isManager;
    }

    public void setIsManager(int isManager) {
        this.isManager = isManager;
    }

    public int getIsIdentified() {
        return isIdentified;
    }

    public void setIsIdentified(int isIdentified) {
        this.isIdentified = isIdentified;
    }

    public int getIsEnterprise() {
        return isEnterprise;
    }

    public void setIsEnterprise(int isEnterprise) {
        this.isEnterprise = isEnterprise;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
}
