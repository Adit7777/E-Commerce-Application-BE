package com.be.EcommerceApplication.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long prodId;
	
	@Column(name = "prod_name")
	private String prodName;
	
	@Column(name = "prod_desc")
	private String prodDesc;
	
	@Column(name = "prod_price")
	private BigDecimal prodPrice;
	
	@Column(name = "created_date")
	private LocalDateTime  CreatedDate;
	
	@Column(name = "updated_date")
	private LocalDateTime  UpdatedDate;
	
	@Column(name = "status")
	private String Status;

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public BigDecimal getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(BigDecimal prodPrice) {
		this.prodPrice = prodPrice;
	}

	public LocalDateTime  getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(LocalDateTime  createdDate) {
		CreatedDate = createdDate;
	}

	public LocalDateTime  getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(LocalDateTime  updatedDate) {
		UpdatedDate = updatedDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodDesc=" + prodDesc + ", prodPrice="
				+ prodPrice + ", CreatedDate=" + CreatedDate + ", UpdatedDate=" + UpdatedDate + ", Status=" + Status
				+ "]";
	}
	
	
	
}
