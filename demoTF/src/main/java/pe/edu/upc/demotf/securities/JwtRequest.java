package pe.edu.upc.demotf.securities;

public class JwtRequest {
    private static final long serialVersionUID = 5926468583005150707L;
    private String username;
    private String password;
    public JwtRequest() {
        super();
        // TODO Auto-generated constructor stub
    }
    public JwtRequest(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
