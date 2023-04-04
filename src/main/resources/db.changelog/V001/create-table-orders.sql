--liquibase formatted sql

--changeset AndMosc:create-table-orders
CREATE TABLE jdbc.orders
(
    id           serial primary key,
    date         date         not null,
    customer_id  int
        CONSTRAINT orders_customer_id_customer_id references jdbc.customer(id) ON DELETE CASCADE,
    product_name varchar(255) not null,
    amount       int check (amount > 0)
);