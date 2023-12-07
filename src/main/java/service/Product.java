package service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Product {
    private int id;
    private String name;
    private int cost;

    public Product(int id, String name, int cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

}
