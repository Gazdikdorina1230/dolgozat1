public class Network implements Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Kapcsolódás a következő hálózathoz: " + networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Hálózati kapcsolat megszakítva.");
    }

    public static void main(String[] args) {
        Network myNetwork = new Network();

        myNetwork.connectToNetwork("WiFi_1234");

        myNetwork.disconnectFromNetwork();
    }
}
