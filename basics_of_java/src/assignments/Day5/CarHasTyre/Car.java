package assignments.Day5.CarHasTyre;

public class Car{

    private String company;
    private String model;
    private int price;

    private Tyre tyre;

    Car() {
        tyre = new Tyre();
    }

    // Getters --> read the value
    public String getCompany() {
        return company;
    }
    // Setters --> write the value
    public void setCompany(String company) {
        this.company = company;
    }

    // Getters --> read the value
    public String getModel() {
        return model;
    }
    // Setters --> write the value
    public void setModel(String model) {
        this.model = model;
    }

    // Getters --> read the value
    public int getPrice() {
        return price;
    }
    // Setters --> write the value
    public void setPrice(int price) {
        this.price = price;
    }

    public Tyre getTyre() {
        return tyre;
    }





}