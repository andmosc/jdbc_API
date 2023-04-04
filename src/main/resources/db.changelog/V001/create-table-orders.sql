--liquibase formatted sql

--changeset andmosc:create-table-orders
CREATE TABLE jdbc.orders
(
    id           serial primary key,
    date         date         not null,
    customer_id  int
        CONSTRAINT orders_customer_id_customer_id references jdbc.customer(id),
    product_name varchar(255) not null,
    amount       int check (amount > 0)
);