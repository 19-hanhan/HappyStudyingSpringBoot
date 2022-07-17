package cn.edu.jxnu.admin.entity;

public class User {
    private Integer uId; // 用户编号
    private String uName; // 用户姓名
    private String uEmail; // 电子邮件
    private String uPassword; // 用户密码
    private String isPost; // 职位
    private String uNo; // 工号、学号
    private String uAvatar; // 用户头像
    private String uSubDivision; // 用户权限
    private String uDiamondNumber; // 钻石数

    public User() { }
    public User(String uName, String uEmail, String uPassword, String isPost, String uNo, String uSubDivision, String uDiamondNumber) {
        this.uName = uName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        this.isPost = isPost;
        this.uNo = uNo;
        this.uSubDivision = uSubDivision;
        this.uDiamondNumber = uDiamondNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", isPost='" + isPost + '\'' +
                ", uNo='" + uNo + '\'' +
                ", uAvatar='" + uAvatar + '\'' +
                ", uSubDivision='" + uSubDivision + '\'' +
                ", uDiamondNumber='" + uDiamondNumber + '\'' +
                '}';
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getIsPost() {
        return isPost;
    }

    public void setIsPost(String isPost) {
        this.isPost = isPost;
    }

    public String getuNo() {
        return uNo;
    }

    public void setuNo(String uNo) {
        this.uNo = uNo;
    }

    public String getuAvatar() {
        return uAvatar;
    }

    public void setuAvatar(String uAvatar) {
        this.uAvatar = uAvatar;
    }

    public String getuSubDivision() {
        return uSubDivision;
    }

    public void setuSubDivision(String uSubDivision) {
        this.uSubDivision = uSubDivision;
    }

    public String getuDiamondNumber() {
        return uDiamondNumber;
    }

    public void setuDiamondNumber(String uDiamondNumber) {
        this.uDiamondNumber = uDiamondNumber;
    }
}
