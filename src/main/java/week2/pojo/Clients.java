package week2.pojo;

public class Clients {
    private int clientId;
    private String name;
    public Clients (){
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Clients(int clientId, String name) {
        this.clientId = clientId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
