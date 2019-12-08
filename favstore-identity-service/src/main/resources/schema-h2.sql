CREATE TABLE user(
    id INT NOT NULL,
    user_id VARCHAR(50) NOT NULL,
    name VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	phone VARCHAR(50) NOT NULL,
	status BOOLEAN NOT NULL,        
    created_on DATE  NULL, 
    PRIMARY KEY (id)		
);
CREATE TABLE user_address(
    id INT NOT NULL,    
	user_id INT NOT NULL,
    house_no VARCHAR(50) NOT NULL,
    street VARCHAR(50) NOT NULL,	
    city VARCHAR(50) NOT NULL,
	country VARCHAR(50) NOT NULL,
	status BOOLEAN NOT NULL,        
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NOT NULL ,
    PRIMARY KEY ( id )		
);
ALTER TABLE user_address ADD FOREIGN KEY ( user_id ) REFERENCES user ( id );

