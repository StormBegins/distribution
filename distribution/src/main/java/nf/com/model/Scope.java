package nf.com.model;

public class Scope {
    private String scopeid;

    private String scopename;

    private Long scopeprice;

    private String stationid;

    private String scopenotes;

    public String getScopeid() {
        return scopeid;
    }

    public void setScopeid(String scopeid) {
        this.scopeid = scopeid == null ? null : scopeid.trim();
    }

    public String getScopename() {
        return scopename;
    }

    public void setScopename(String scopename) {
        this.scopename = scopename == null ? null : scopename.trim();
    }

    public Long getScopeprice() {
        return scopeprice;
    }

    public void setScopeprice(Long scopeprice) {
        this.scopeprice = scopeprice;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid == null ? null : stationid.trim();
    }

    public String getScopenotes() {
        return scopenotes;
    }

    public void setScopenotes(String scopenotes) {
        this.scopenotes = scopenotes == null ? null : scopenotes.trim();
    }
}