--liquibase formatted sql

--changeset AndMosc:insert-value-table-orders
INSERT INTO jdbc.orders (date, customer_id, product_name, amount)
VALUES ('2023-03-28', 1, 'Сок', 2),
       ('2023-03-12', 2, 'Молоко', 1),
       ('2023-03-25', 3, 'Чай', 3),
       ('2023-04-01', 3, 'Спички', 10),
       ('2023-01-04', 4, 'Вода', 2),
       ('2023-02-12', 5, 'Сахар', 4),
       ('2023-01-05', 6, 'Хлеб', 2),
       ('2023-01-27', 6, 'Водка', 1);