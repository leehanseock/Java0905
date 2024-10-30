package jdbc3.entity;

public class Product {
    private String proNum;
    private String proName;
    private int proStock;
    private int proPrice;
    private String produceName;

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getProStock() {
        return proStock;
    }

    public void setProStock(int proStock) {
        this.proStock = proStock;
    }

    public int getProPrice() {
        return proPrice;
    }

    public void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }

    public String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }
}
