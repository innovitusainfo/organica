package com.organica.payload;

import com.organica.entities.CartDetalis;
import com.organica.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private int Id;

    private UserDto user;

    private float TotalAmount;

    private List<CartDetailDto> cartDetalis;

	public CartDto(int id, UserDto user, float totalAmount, List<CartDetailDto> cartDetalis) {
		super();
		Id = id;
		this.user = user;
		TotalAmount = totalAmount;
		this.cartDetalis = cartDetalis;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public float getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		TotalAmount = totalAmount;
	}

	public List<CartDetailDto> getCartDetalis() {
		return cartDetalis;
	}

	public void setCartDetalis(List<CartDetailDto> cartDetalis) {
		this.cartDetalis = cartDetalis;
	}
    
    
}
