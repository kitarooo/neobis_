CREATE TABLE users
(
    user_id      bigint PRIMARY KEY NOT NULL,
    user_role    varchar(10)        NOT NULL,
    first_name   varchar(50)        NOT NULL,
    last_name    varchar(50)        NOT NULL,
    email        varchar(20)        NOT NULL,
    phone_number varchar(11)        NOT NULL,
    password     varchar(12)        NOT NULL
);

CREATE TABLE orders
(
    order_id bigint PRIMARY KEY NOT NULL,
    user_id  bigint             NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (user_id)
);

CREATE TABLE order_details
(
    order_details_id bigint PRIMARY KEY NOT NULL,
    order_id         bigint             NOT NULL,
    product_id       bigint             NOT NULL,
    quantity         integer            NOT NULL,
    total_price      double precision,
    FOREIGN KEY (order_id) REFERENCES orders (order_id),
    FOREIGN KEY (product_id) REFERENCES products (product_id)
);

CREATE TABLE categories
(
    category_id bigint PRIMARY KEY NOT NULL,
    chancery    varchar(50),
    groceries   varchar(50)
);

CREATE TABLE products
(
    product_id       bigint PRIMARY KEY,
    category_id      bigint           NOT NULL,
    order_details_id bigint           NOT NULL,
    product_name     varchar(20)      NOT NULL,
    product_price    double precision NOT NULL,
    description      varchar(255)     NOT NULL,
    FOREIGN KEY (category_id) REFERENCES categories (category_id),
    FOREIGN KEY (order_details_id) REFERENCES order_details (order_details_id)
);

