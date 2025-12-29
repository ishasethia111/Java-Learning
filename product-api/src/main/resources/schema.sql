DROP TABLE IF EXISTS products;

CREATE TABLE IF NOT EXISTS products (
    id bigint auto_increment PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(500),
    price NUMERIC(10, 2) NOT NULL CHECK (price > 0)
);
