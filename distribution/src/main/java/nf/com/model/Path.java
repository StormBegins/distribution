package nf.com.model;

public class Path {
    private String pathid;

    private String pathname;

    private String orderid;

    private String provinceid;

    private Long pathprice;

    private String pathnotes;

    public String getPathid() {
        return pathid;
    }

    public void setPathid(String pathid) {
        this.pathid = pathid == null ? null : pathid.trim();
    }

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname == null ? null : pathname.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    public Long getPathprice() {
        return pathprice;
    }

    public void setPathprice(Long pathprice) {
        this.pathprice = pathprice;
    }

    public String getPathnotes() {
        return pathnotes;
    }

    public void setPathnotes(String pathnotes) {
        this.pathnotes = pathnotes == null ? null : pathnotes.trim();
    }
}