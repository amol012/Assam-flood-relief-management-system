package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Column;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FoodAndMedical")
public class FoodAndMedical {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int item_id;
	
	@Column(name = "ITEM_NAME")
    private String item_name;
	
	@Column(name = "ITEM_QTY")
    private int item_qty;
    
    
    public FoodAndMedical()
    {
    	
    }


	public FoodAndMedical(int item_id, String item_name, int item_qty) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_qty = item_qty;
	}


	public int getItem_id() {
		return item_id;
	}


	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public int getItem_qty() {
		return item_qty;
	}


	public void setItem_qty(int item_qty) {
		this.item_qty = item_qty;
	}


	@Override
	public String toString() {
		return "FoodAndMedical [item_id=" + item_id + ", item_name=" + item_name + ", item_qty=" + item_qty + "]";
	}
    
    
    
	

	
    
	
}
