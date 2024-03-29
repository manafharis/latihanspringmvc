package com.eksad.latihanspringmvc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product")
public class Product {
		
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column(name ="brand_id")
	

		private Long brand_Id;

		private String name;

		private Long price;
		
		private String type;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getBrandId() {
			
			return brand_Id;
		}
		public void setBrandId(Long brandId) {
			
			this.brand_Id = brandId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getPrice() {
			return price;
		}
		public void setPrice(Long price) {
			this.price = price;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
	
		}
// buat getter setter