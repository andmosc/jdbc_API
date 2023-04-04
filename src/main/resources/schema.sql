create schema IF NOT EXISTS jdbc;

CREATE TABLE IF NOT EXISTS jdbc.customers
(
    id           serial primary key,
    name         varchar(30) not null,
    surname      varchar(30) not null,
    age          smallint check ( age >= 0 and age < 110),
    phone_number varchar(30)
);

CREATE TABLE IF NOT EXISTS jdbc.orders
(
    id           serial primary key,
    date         date         not null,
    customer_id  int
        CONSTRAINT orders_customer_id_customer_id references jdbc.customers (id),
    product_name varchar(255) not null,
    amount       int check (amount > 0)
);