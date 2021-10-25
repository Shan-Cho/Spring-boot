package com.sxworkz.GunShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name="gundetails")
public class GunDetails {
	@Id
	private int id;
	private String modelNo;
	private double price;
	private String type;
	
}
