package nf.com.model;

public class User {
    private String userid;

    private String username;

    private String usernotes;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsernotes() {
        return usernotes;
    }

    public void setUsernotes(String usernotes) {
        this.usernotes = usernotes == null ? null : usernotes.trim();
    }
}