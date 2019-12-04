public class Company {

    String name, address;
    ProductionType productionType;
    Device devices;

    public Company(String name, String address, ProductionType productionType, Device devices) {
        this.name = name;
        this.address = address;
        this.productionType = productionType;
        this.devices = devices;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ProductionType getProductionType() {
        return productionType;
    }

    public Device getDevices() {
        return devices;
    }
}
