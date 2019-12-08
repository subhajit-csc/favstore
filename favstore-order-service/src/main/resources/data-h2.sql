INSERT INTO  sales_order  ( id,order_number,description,customer_id,items_quantity,subtotal,discount,total,currency,payment_id,payment_details,payment_status,order_status,created_on)
VALUES (1, 'O1001','T Shirt','C1001',2,1500,50,1450,'INR','P1001','PayTM-T10001','PAID','PLACED',sysdate());

INSERT INTO  order_item  ( id,description,name,order_id,product_id,catagory_id,sku,quantity,rate,subtotal,created_on)
VALUES (1, 'T Shirt Black','T Shirt Black',1,1,1,'I1001',2,1500,1500,sysdate());