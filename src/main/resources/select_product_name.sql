select c.phone_number, o.date, o.product_name, o.amount
from jdbc.orders o
         left join jdbc.customers c on o.customer_id = c.id
WHERE c.name ILIKE :name;