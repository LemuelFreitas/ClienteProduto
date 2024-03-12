package com.ClienteProduto.Entities;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="vendas")
public class VendasEntities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable  =false)
	private Integer id;

	@Column(name = "DataVenda", nullable = false, length = 100)
	private Date DataVenda;

		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="cliente_id",nullable = false)
	private ClienteEntities clienteEntities;

}