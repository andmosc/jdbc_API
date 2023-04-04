--liquibase formatted sql

--changeset AndMosc:insert-value-table-customers
INSERT INTO jdbc.customer (name, surname, age, phone_number)
VALUES ('Андрей', 'Иванов', '29', '+79020010001'),
       ('Максим', 'Петров', '35', '+79020010002'),
       ('Виталий', 'Сидоров', '47', '+79020010003'),
       ('Александр', 'Третьяков', '18', '+79020010004'),
       ('Никита', 'Лаптев', '59', '+79020010005'),
       ('Виктор', 'Васильев', '17', '+79020010006');