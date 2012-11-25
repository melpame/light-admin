package org.lightadmin.test.model;
import org.lightadmin.demo.model.AbstractEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Entity
@Table( name = "TestOrders" )
public class TestOrder extends AbstractEntity {

	private String name;

	@OneToMany( cascade = CascadeType.ALL, orphanRemoval = true )
	@JoinColumn( name = "order_id" )
	private List<TestLineItem> lineItems = newArrayList();

	public TestOrder( final String name ) {
		this.name = name;
	}

	public TestOrder() {

	}

	public String getName() {
		return name;
	}

	public void setName( final String name ) {
		this.name = name;
	}

	public void addLineItems( TestLineItem entity ) {
		this.lineItems.add( entity );
	}

	public List<TestLineItem> getLineItems() {
		return Collections.unmodifiableList( lineItems );
	}
}