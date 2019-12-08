  
INSERT INTO  region  ( id,name,code,country,status,created_on)
VALUES (1, 'India-Kolkata','IN-KOL','India','true',sysdate());
INSERT INTO  region  ( id,name,code,country,status,created_on)
VALUES (2, 'India-Delhi','IN-DEL','India','true',sysdate());

INSERT INTO  currency  ( id,name,code,region_id,status,created_on)
VALUES (1, 'India Currency','INR',1,true,sysdate());
INSERT INTO  currency  ( id,name,code,region_id,status,created_on)
VALUES (2, 'India Currency','INR',2,true,sysdate());

INSERT INTO  category_type  ( id,name,description,created_on)
VALUES (1, 'Topwear','Topwear',sysdate());
INSERT INTO  category_type  ( id,name,description,created_on)
VALUES (2, 'Bottomwear','Bottomwear',sysdate());
INSERT INTO  category_type  ( id,name,description,created_on)
VALUES (3, 'Footwear','Bottomwear',sysdate());

INSERT INTO  category  ( id,name,description,category_type,created_on)
VALUES (1, 'Shirt','Shirt',1,sysdate());
INSERT INTO  category  ( id,name,description,category_type,created_on)
VALUES (2, 'T-Shirt','T-Shirt',1,sysdate());
INSERT INTO  category  ( id,name,description,category_type,created_on)
VALUES (3, 'Jeans','Jeans',2,sysdate());
INSERT INTO  category  ( id,name,description,category_type,created_on)
VALUES (4, 'Trouser','Trouser',2,sysdate());
INSERT INTO  category  ( id,name,description,category_type,created_on)
VALUES (5, 'Sports Shoes','Sports Shoes',3,sysdate());
INSERT INTO  category  ( id,name,description,category_type,created_on)
VALUES (6, 'Sleeper','Sleeper',3,sysdate());

INSERT INTO  product  ( id,name,description,category_id,status,created_on)
VALUES (1, 'Formal Shirt','Formal Shirt',1,true,sysdate());
INSERT INTO  product  ( id,name,description,category_id,status,created_on)
VALUES (2, 'Round neck shape T- Shirt','Round neck shape T- Shirt',2,true,sysdate());
INSERT INTO  product  ( id,name,description,category_id,status,created_on)
VALUES (3, 'Reguler Jeans','Reguler Jeans',3,true,sysdate());
INSERT INTO  product  ( id,name,description,category_id,status,created_on)
VALUES (4, 'Running Sports Shoe','Running Sports Shoe',4,true,sysdate());


INSERT INTO  brand  ( id,code,name,description,web_address,contact_details,created_on)
VALUES (1, 'Lee','Lee Inc','Lee','Lee','Lee',sysdate());
INSERT INTO  brand  ( id,code,name,description,web_address,contact_details,created_on)
VALUES (2, 'Nike','Nike Inc','Lee','Lee','Lee',sysdate());

INSERT INTO  product_category  ( id,name,description,product_id,brand_id,colour,size,status,created_on)
VALUES (1, 'Shirt','Lee Shirt',1,1,'BLACK','M',true,sysdate());

INSERT INTO  product_pricing  ( id,details,product_category,currency_id,rate,discount,status,created_on)
VALUES (1, 'Shirt',1,1,1500,50,true,sysdate());

INSERT INTO  seller  ( id,name,code,address,rating,status,created_on)
VALUES (1, 'Myntra Seller','Myntra','Myntra Pvt Ltd',5,true,sysdate());

INSERT INTO  inventory  ( id,details,sku,product_category,product_pricing,seller_id,stock_unit,is_available,created_on)
VALUES (1, 'Shirt','S1001',1,1,1,10,true,sysdate());

INSERT INTO  inventory_item  ( id,details,sku,uuid,inventory_id,sale_status,created_on)
VALUES (1, 'Shirt','S1001','bin9h889u2huxx99ve8yg8bieqw8jdqjkjdy',1,true,sysdate());
