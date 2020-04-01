package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@SpringBootApplication
public class OrderApiApplication {
	private OrderDAO orderdao = new OrderDAO();
	
	public static void main(String[] args) {
		SpringApplication.run(OrderApiApplication.class, args);
	}
	
	@RequestMapping("/")
	public String showPage() {
	return "HomePage";	
	}

	@PostMapping("/orderAPI/createOrder/")
	public Order createUser() {
		int id =(int)(Math.random()*1000);
		Order obj = new Order(id,"Aniket","Panchkula","Haryana");
		orderdao.createOrder(obj);
		return obj;
	}
	
	@RequestMapping("/orderAPI/deleteOrders/{id}")
	public String deleteOrder(@PathVariable("id") String id) {
		return orderdao.deleteOrder(Integer.parseInt(id));
	}
	
	@PostMapping("/orderAPI/updateorder/{id}")
	public Order updateOrder(@PathVariable("id") String id) {
		Order object = new Order(Integer.parseInt(id),"MyOrder" ,"Bangalore","Karnataka");
		if(orderdao.updateOrder(Integer.parseInt(id), object) == null) {
			System.err.println("ID doesn't Exisit");
		}
		return object;
}
	
	
	@RequestMapping("/orderAPI/getAllOrders")
	public ArrayList<Order> getAllOrger(){
		return orderdao.showAllOrder();
	}
	
	
	@RequestMapping("/orderAPI/getOrderById/{id}")
	public Order getOrderByID(@PathVariable("id") String id) {
		return orderdao.getOrderById(Integer.parseInt(id));
	}
}
