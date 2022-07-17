package cn.edu.jxnu.admin.entity;

public class Admin {
    private Integer aId; // 管理员编号
    private String aPassword; // 管理员密码
    private String aName; // 管理员姓名
    private String aEmail; // 电子邮件

    public Admin() {
    }

    public Admin(String aPassword, String aName, String aEmail) {
        this.aPassword = aPassword;
        this.aName = aName;
        this.aEmail = aEmail;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aId=" + aId +
                ", aPassword='" + aPassword + '\'' +
                ", aName='" + aName + '\'' +
                ", aEmail='" + aEmail + '\'' +
                '}';
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaEmail() {
        return aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }
}
