package com.organica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private float TotalAmount;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cart")
    private List<CartDetalis> cartDetalis;


    public void setCartDetalis(List<CartDetalis> pro) {
    	this.cartDetalis=pro;
    }


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public float getTotalAmount() {
		return TotalAmount;
	}


	public void setTotalAmount(float totalAmount) {
		TotalAmount = totalAmount;
	}


	public List<CartDetalis> getCartDetalis() {
		return cartDetalis;
	}


	public Cart(int id, User user, float totalAmount, List<CartDetalis> cartDetalis) {
		super();
		Id = id;
		this.user = user;
		TotalAmount = totalAmount;
		this.cartDetalis = cartDetalis;
	}


	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
