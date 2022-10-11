package com.playmarket.playmarketapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="User")
@Getter
@Setter
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String walletId;
	
	public String getWalletId() {
	    return this.walletId;
	  }

	  public void setWalletId(String walletId) {
	    this.walletId = walletId;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }
	  
	  public Long getId() {
		 return this.id;
	  }

	  
}
