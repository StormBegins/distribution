package nf.com.model;

public class Station {
    private String stationid;

    private String stationname;

    private String provinceid;

    private String cityid;

    private String adminid;

    private String stationphone;

    private String stationsite;

    private String stationnotes;

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid == null ? null : stationid.trim();
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname == null ? null : stationname.trim();
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getStationphone() {
        return stationphone;
    }

    public void setStationphone(String stationphone) {
        this.stationphone = stationphone == null ? null : stationphone.trim();
    }

    public String getStationsite() {
        return stationsite;
    }

    public void setStationsite(String stationsite) {
        this.stationsite = stationsite == null ? null : stationsite.trim();
    }

    public String getStationnotes() {
        return stationnotes;
    }

    public void setStationnotes(String stationnotes) {
        this.stationnotes = stationnotes == null ? null : stationnotes.trim();
    }
}