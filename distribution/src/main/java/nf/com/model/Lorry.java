package nf.com.model;

import java.util.Date;

public class Lorry {
    private String lorryid;

    private String lorrymodel;

    private String lorryco;

    private String pathid;

    private Date lorryyield;

    private Date lorrybuy;

    private String yieldnotes;

    public String getLorryid() {
        return lorryid;
    }

    public void setLorryid(String lorryid) {
        this.lorryid = lorryid == null ? null : lorryid.trim();
    }

    public String getLorrymodel() {
        return lorrymodel;
    }

    public void setLorrymodel(String lorrymodel) {
        this.lorrymodel = lorrymodel == null ? null : lorrymodel.trim();
    }

    public String getLorryco() {
        return lorryco;
    }

    public void setLorryco(String lorryco) {
        this.lorryco = lorryco == null ? null : lorryco.trim();
    }

    public String getPathid() {
        return pathid;
    }

    public void setPathid(String pathid) {
        this.pathid = pathid == null ? null : pathid.trim();
    }

    public Date getLorryyield() {
        return lorryyield;
    }

    public void setLorryyield(Date lorryyield) {
        this.lorryyield = lorryyield;
    }

    public Date getLorrybuy() {
        return lorrybuy;
    }

    public void setLorrybuy(Date lorrybuy) {
        this.lorrybuy = lorrybuy;
    }

    public String getYieldnotes() {
        return yieldnotes;
    }

    public void setYieldnotes(String yieldnotes) {
        this.yieldnotes = yieldnotes == null ? null : yieldnotes.trim();
    }
}