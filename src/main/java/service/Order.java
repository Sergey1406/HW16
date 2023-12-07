package service;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {
    private int id;
    private int cost;
    private Date date;
    private Product p;


    public Order(int id, int cost, Date date, Product p){
        this.id = id;
        this.cost = cost;
        this.date = date;
        this.p = p;
    }



}
