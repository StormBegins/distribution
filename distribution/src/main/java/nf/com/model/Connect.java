package nf.com.model;

import java.util.Date;

public class Connect {
    private String connectid;

    private String connectstart;

    private String connectmiddle;

    private String connectterminus;

    private Integer connecttype;

    private Date connectdate;

    private String connectnotes;

    public String getConnectid() {
        return connectid;
    }

    public void setConnectid(String connectid) {
        this.connectid = connectid == null ? null : connectid.trim();
    }

    public String getConnectstart() {
        return connectstart;
    }

    public void setConnectstart(String connectstart) {
        this.connectstart = connectstart == null ? null : connectstart.trim();
    }

    public String getConnectmiddle() {
        return connectmiddle;
    }

    public void setConnectmiddle(String connectmiddle) {
        this.connectmiddle = connectmiddle == null ? null : connectmiddle.trim();
    }

    public String getConnectterminus() {
        return connectterminus;
    }

    public void setConnectterminus(String connectterminus) {
        this.connectterminus = connectterminus == null ? null : connectterminus.trim();
    }

    public Integer getConnecttype() {
        return connecttype;
    }

    public void setConnecttype(Integer connecttype) {
        this.connecttype = connecttype;
    }

    public Date getConnectdate() {
        return connectdate;
    }

    public void setConnectdate(Date connectdate) {
        this.connectdate = connectdate;
    }

    public String getConnectnotes() {
        return connectnotes;
    }

    public void setConnectnotes(String connectnotes) {
        this.connectnotes = connectnotes == null ? null : connectnotes.trim();
    }
}