DROP table if exists customers;
CREATE TABLE customers(
  customer_id serial PRIMARY KEY,
  customer_name VARCHAR (50) NOT NULL,
  created_at TIMESTAMP NOT NULL ,
  updated_at  TIMESTAMP NOT NULL
);

DROP table if exists orders;
CREATE TABLE orders(
order_id serial PRIMARY KEY,
customer_id integer NOT NULL,
order_date date NOT NULL,
shipping_date date,
order_status char(1) NOT NULL,
created_at TIMESTAMP NOT NULL ,
updated_at  TIMESTAMP NOT NULL
);

DROP table if exists items;
CREATE TABLE items(
   item_id serial PRIMARY KEY,
   item_number VARCHAR(50),
   description VARCHAR(100),
   item_price money,
created_at TIMESTAMP NOT NULL ,
updated_at  TIMESTAMP NOT NULL
);
DROP table if exists order_items;
CREATE TABLE order_items(
  order_items_id serial PRIMARY KEY,
  order_id integer NOT NULL,
  item_id integer NOT NULL,
  quantity integer,
created_at TIMESTAMP NOT NULL ,
updated_at  TIMESTAMP NOT NULL
);

DROP table if exists order_payments;
CREATE TABLE order_payments(
  order_payments_id serial PRIMARY KEY,
  order_id integer NOT NULL,
  payment_type_id integer NOT NULL,
  payment_amount money,
created_at TIMESTAMP NOT NULL ,
updated_at  TIMESTAMP NOT NULL
);

DROP table if exists payment_types;
CREATE TABLE payment_types(
  payment_type_id serial PRIMARY KEY,
  payment_type_name VARCHAR(50) NOT NULL,
  description VARCHAR(100),
  created_at TIMESTAMP NOT NULL ,
  updated_at  TIMESTAMP NOT NULL
);
