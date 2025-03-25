package binario;

import java.io.Serializable;

public class BDCredentials implements Serializable {
    private final String url;
    private final String user;
    private final String password;
    private final int puerto;
    private final String database;

    public BDCredentials(String url, String user, String password, int puerto, String database) {
        this.user = user;
        this.password = password;
        this.puerto = puerto;
        this.database = database;

        this.url = url + ":" + puerto + "/" + database;
    }

    @Override
    public String toString() {
        return "BDCredentials{\n" +
                "url='" + url + "'\n" +
                ", user='" + user + "'\n" +
                ", password='" + password + "'\n" +
                ", puerto=" + puerto + "\n" +
                ", database='" + database + "'\n" +
                '}';
    }
}
