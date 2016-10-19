package patterns.strategyAndFactory.bikes.components;

/**
 * Created by pavel on 07.09.16.
 */
public class Frame {
    public Frame(String company) {
        this.company = company;
    }

    String company;


    public String getCompany() {
        return company;
    }
}
