-- Insert categories
INSERT INTO category (id, name, description) VALUES
    (nextval('category_id_seq'), 'Electronics', 'Devices and gadgets'),
    (nextval('category_id_seq'), 'Books', 'Printed and digital books'),
    (nextval('category_id_seq'), 'Clothing', 'Apparel and accessories'),
    (nextval('category_id_seq'), 'Furniture', 'Home and office furniture'),
    (nextval('category_id_seq'), 'Toys', 'Children toys and games');

-- Insert products
INSERT INTO product (id, name, description, in_stock, price, category_id) VALUES
     (nextval('product_id_seq'), 'Smartphone', 'Latest model smartphone', 100, 699.99, (SELECT id FROM category WHERE name = 'Electronics')),
     (nextval('product_id_seq'), 'Laptop', 'High-performance laptop', 50, 1299.99, (SELECT id FROM category WHERE name = 'Electronics')),
     (nextval('product_id_seq'), 'E-book Reader', 'Digital book reader', 150, 129.99, (SELECT id FROM category WHERE name = 'Books')),
     (nextval('product_id_seq'), 'Mystery Novel', 'A gripping mystery novel', 200, 9.99, (SELECT id FROM category WHERE name = 'Books')),
     (nextval('product_id_seq'), 'T-shirt', 'Cotton T-shirt', 300, 19.99, (SELECT id FROM category WHERE name = 'Clothing')),
     (nextval('product_id_seq'), 'Jeans', 'Denim jeans', 150, 49.99, (SELECT id FROM category WHERE name = 'Clothing')),
     (nextval('product_id_seq'), 'Office Chair', 'Ergonomic office chair', 80, 199.99, (SELECT id FROM category WHERE name = 'Furniture')),
     (nextval('product_id_seq'), 'Dining Table', 'Wooden dining table', 20, 499.99, (SELECT id FROM category WHERE name = 'Furniture')),
     (nextval('product_id_seq'), 'Action Figure', 'Superhero action figure', 500, 14.99, (SELECT id FROM category WHERE name = 'Toys')),
     (nextval('product_id_seq'), 'Board Game', 'Family board game', 120, 29.99, (SELECT id FROM category WHERE name = 'Toys'));