CREATE TABLE products (
    product_id integer PRIMARY KEY,
    product_name varchar(255),
    product_price integer
);

CREATE TABLE clients (
    client_id integer PRIMARY KEY,
    client_name varchar(255)
);

CREATE TABLE purchases (
   purchases_id integer PRIMARY KEY,
   client_id integer,
   product_id integer,
   FOREIGN KEY (client_id) REFERENCES clients (client_id),
   FOREIGN KEY (product_id) REFERENCES clients (client_id)
);
