package nf.com.model;

public class Admin {
    private String adminid;

    private String adminname;

    private Integer adminsex;

    private String userid;

    private Integer admintype;

    private String adminchina;

    private String adminsite;

    private String adminpwd;

    private String admintel;

    private String adminnotes;

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public Integer getAdminsex() {
        return adminsex;
    }

    public void setAdminsex(Integer adminsex) {
        this.adminsex = adminsex;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getAdmintype() {
        return admintype;
    }

    public void setAdmintype(Integer admintype) {
        this.admintype = admintype;
    }

    public String getAdminchina() {
        return adminchina;
    }

    public void setAdminchina(String adminchina) {
        this.adminchina = adminchina == null ? null : adminchina.trim();
    }

    public String getAdminsite() {
        return adminsite;
    }

    public void setAdminsite(String adminsite) {
        this.adminsite = adminsite == null ? null : adminsite.trim();
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }

    public String getAdmintel() {
        return admintel;
    }

    public void setAdmintel(String admintel) {
        this.admintel = admintel == null ? null : admintel.trim();
    }

    public String getAdminnotes() {
        return adminnotes;
    }

    public void setAdminnotes(String adminnotes) {
        this.adminnotes = adminnotes == null ? null : adminnotes.trim();
    }
}