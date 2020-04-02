INSERT INTO CUSTOMERS( customer_name,created_at,updated_at) VALUES ('John',current_timestamp, current_timestamp );
INSERT INTO CUSTOMERS( customer_name,created_at,updated_at ) VALUES ('Steve',current_timestamp, current_timestamp );


INSERT INTO orders (customer_id,order_date,shipping_date,order_status, created_at,updated_at )
VALUES(2, to_date('01-Jan-2020','dd-mon-yyyy'), to_date('01-Mar-2020', 'dd-mon-yyyy'), 'S',current_timestamp, current_timestamp );

INSERT INTO items(item_number,description,   item_price, created_at, updated_at )
VALUES ('AS400', 'Lenova AS 400 Laptop', 1000, current_timestamp, current_timestamp );

INSERT INTO order_items(order_id ,item_id,quantity, created_at, updated_at)
VALUES (1,1,2, current_timestamp, current_timestamp );

INSERT INTO order_payments (order_id,payment_type_id,payment_amount,created_at,updated_at)
VALUES (1,1,2000, current_timestamp , current_timestamp );

INSERT INTO payment_types(payment_type_name,description, created_at,updated_at)
VALUES ('CC', 'Credit Card', current_timestamp , current_timestamp );

INSERT INTO payment_types(payment_type_name,description, created_at, updated_at)
VALUES ('NB', 'Net Banking',current_timestamp , current_timestamp );