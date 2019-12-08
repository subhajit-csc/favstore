CREATE TABLE region(
    id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
	code VARCHAR(50) NOT NULL,
	country VARCHAR(50) NOT NULL,
	status BOOLEAN NOT NULL,        
    created_on DATE  NULL, 
    PRIMARY KEY (id)		
);
CREATE TABLE currency(
    id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
	code VARCHAR(50) NOT NULL,
	region_id INT NOT NULL,
	status BOOLEAN NOT NULL,        
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);
ALTER TABLE currency ADD FOREIGN KEY ( region_id ) REFERENCES region ( id );

CREATE TABLE category_type(
    id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
	description VARCHAR(150),	        
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);
CREATE TABLE category(
    id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
	description VARCHAR(50) NOT NULL,
    category_type INT NOT NULL,	
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);	
ALTER TABLE category ADD FOREIGN KEY ( category_type ) REFERENCES  category_type ( id );


CREATE TABLE  product(
    id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
	description VARCHAR(50),
    category_id	VARCHAR(50) NOT NULL,	
	status BOOLEAN NOT NULL, 
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);
ALTER TABLE  product ADD FOREIGN KEY ( category_id ) REFERENCES  category ( id );

CREATE TABLE  brand(
    id INT NOT NULL,
	code VARCHAR(50) NOT NULL,
    name VARCHAR(50) NOT NULL,
	description VARCHAR(50),
    web_address VARCHAR(50),
	contact_details VARCHAR(150),
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);

CREATE TABLE  product_category(
    id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
	description VARCHAR(50),
    product_id	INT NOT NULL,
	brand_id	INT NOT NULL,	
	colour VARCHAR(50),
	size VARCHAR(50),
	status BOOLEAN NOT NULL, 
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);
ALTER TABLE  product_category ADD FOREIGN KEY ( product_id ) REFERENCES  product ( id );
ALTER TABLE  product_category ADD FOREIGN KEY ( brand_id ) REFERENCES  brand ( id );

CREATE TABLE  product_pricing(
    id INT NOT NULL,    
	details VARCHAR(50) NOT NULL,
    product_category	INT NOT NULL,
	currency_id	INT NOT NULL,
	rate double,
	discount double,	
	status BOOLEAN NOT NULL, 
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);
ALTER TABLE  product_pricing ADD FOREIGN KEY ( product_category ) REFERENCES  product_category ( id );
ALTER TABLE  product_pricing ADD FOREIGN KEY ( currency_id ) REFERENCES  currency ( id );

CREATE TABLE  seller(
    id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
	code VARCHAR(50) NOT NULL,
	address VARCHAR(50) NOT NULL,
	rating	INT NOT NULL,
	status BOOLEAN NOT NULL,        
    created_on DATE  NULL, 
    PRIMARY KEY ( id )		
);

CREATE TABLE  inventory(
    id INT NOT NULL,    
	details VARCHAR(50) NOT NULL,
	sku VARCHAR(50) NOT NULL,
    product_category	INT NOT NULL,
	product_pricing	INT NOT NULL,
	seller_id	INT NOT NULL,
	stock_unit double,	
	is_available BOOLEAN NOT NULL, 
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);
ALTER TABLE  inventory ADD FOREIGN KEY ( product_category ) REFERENCES  product_category ( id );
ALTER TABLE  inventory ADD FOREIGN KEY ( product_pricing ) REFERENCES  product_pricing ( id );

CREATE TABLE  inventory_item(
    id INT NOT NULL,    
	details VARCHAR(50) NOT NULL,
	sku VARCHAR(50) NOT NULL,
	uuid VARCHAR(50) NOT NULL,
    inventory_id	INT NOT NULL,    
	sale_status BOOLEAN NOT NULL, 
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);
ALTER TABLE  inventory_item ADD FOREIGN KEY ( inventory_id ) REFERENCES  inventory ( id );
