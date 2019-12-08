CREATE TABLE sales_order(
    id INT NOT NULL,
    order_number VARCHAR(50) NOT NULL,
    description VARCHAR(150) NOT NULL,
	customer_id VARCHAR(50) NOT NULL,
    items_quantity double NOT NULL,
	subtotal double NOT NULL,
    discount double NOT NULL,
    total double NOT NULL,
    currency VARCHAR(50) NOT NULL,
    payment_id VARCHAR(50) NOT NULL,
    payment_details VARCHAR(50) NOT NULL,
	payment_status VARCHAR(50) NOT NULL,
	order_status VARCHAR(50) NOT NULL,        
    created_on DATE  NULL, 
    PRIMARY KEY (id)		
);
CREATE TABLE order_item(
    id INT NOT NULL,
    description VARCHAR(150) NOT NULL,
	name VARCHAR(50) NOT NULL,
	order_id INT NOT NULL,
    product_id INT NOT NULL,
    catagory_id INT NOT NULL,
    sku VARCHAR(50) NOT NULL,
    quantity double,
    rate double,
    subtotal double,	     
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);
ALTER TABLE order_item ADD FOREIGN KEY ( order_id ) REFERENCES sales_order ( id );

