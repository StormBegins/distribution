package nf.com.model;

import java.util.Date;

public class Client {
    private String clientid;

    private String clientname;

    private Integer clientsex;

    private String userid;

    private String clientpwd;

    private String clienttel;

    private Date clientdate;

    private String clientsite;

    private String clientnotes;

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public Integer getClientsex() {
        return clientsex;
    }

    public void setClientsex(Integer clientsex) {
        this.clientsex = clientsex;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getClientpwd() {
        return clientpwd;
    }

    public void setClientpwd(String clientpwd) {
        this.clientpwd = clientpwd == null ? null : clientpwd.trim();
    }

    public String getClienttel() {
        return clienttel;
    }

    public void setClienttel(String clienttel) {
        this.clienttel = clienttel == null ? null : clienttel.trim();
    }

    public Date getClientdate() {
        return clientdate;
    }

    public void setClientdate(Date clientdate) {
        this.clientdate = clientdate;
    }

    public String getClientsite() {
        return clientsite;
    }

    public void setClientsite(String clientsite) {
        this.clientsite = clientsite == null ? null : clientsite.trim();
    }

    public String getClientnotes() {
        return clientnotes;
    }

    public void setClientnotes(String clientnotes) {
        this.clientnotes = clientnotes == null ? null : clientnotes.trim();
    }
}