package service;

import com.example.orderservice.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OrderServiceApplication implements OrderService {
    List<Order> orders = new ArrayList<>();
    @Override
    public void deleteOrder(int id){
        for(int i = 0; i < orders.size(); i++){
            if(orders.get(i).getId() == id){
                orders.remove(i);
            }
        }
    }

    @Override
    public List<Order> getOrders(){
       return orders;
    }

    @Override
    public Order getOrder(int id){
        Order o = null;
        for(int i = 0; i < orders.size(); i++){
            if(orders.get(i).getId() == id){
                o = orders.get(i);
            }
        }

       return o;
    }

    @Override
    public void addOrder(Order o){
         orders.add(o);
    }


    @Override
    public void correctOrder(int id){
        for(int i = 0; i < orders.size(); i++){
            if(orders.get(i).getId() == id){
                orders.get(i).setId(6);
                orders.get(i).setCost(15);
            }
        }
    }


    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);

    }



}



