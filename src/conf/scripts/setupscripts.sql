
CREATE TABLE  product_category(
  id serial NOT NULL,
  category_name VARCHAR(255),
  CONSTRAINT product_category_pkey PRIMARY KEY (id));



CREATE TABLE product (
  id serial NOT NULL,
  sku VARCHAR(255),
  name VARCHAR(255),
  description VARCHAR(255),
  unit_price NUMERIC(13,2),
  image_url VARCHAR(255),
  active boolean DEFAULT true,
  units_in_stock integer,
  date_created timestamp without time zone,
  last_updated timestamp without time zone,
  category_id BIGINT NOT NULL,
  CONSTRAINT product_pkey PRIMARY KEY (id),
  CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES product_category (id)
)


-- -----------------------------------------------------
-- Add sample data
-- -----------------------------------------------------

select * from product_category

INSERT INTO product_category(id, category_name) VALUES (1, 'BOOKS');

INSERT INTO product (sku, name, description, image_url, active, units_in_stock,
unit_price, category_id, date_created)
VALUES ('BOOK-TECH-1000', 'JavaScript - The Fun Parts', 'Learn JavaScript',
'assets/images/products/placeholder.png'
,true,100,19.99,1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock,
unit_price, category_id, date_created)
VALUES ('BOOK-TECH-1001', 'Spring Framework Tutorial', 'Learn Spring',
'assets/images/products/placeholder.png'
,true,100,29.99,1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock,
unit_price, category_id, date_created)
VALUES ('BOOK-TECH-1002', 'Kubernetes - Deploying Containers', 'Learn Kubernetes',
'assets/images/products/placeholder.png'
,true,100,24.99,1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock,
unit_price, category_id, date_created)
VALUES ('BOOK-TECH-1003', 'Internet of Things (IoT) - Getting Started', 'Learn IoT',
'assets/images/products/placeholder.png'
,true,100,29.99,1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock,
unit_price, category_id, date_created)
VALUES ('BOOK-TECH-1004', 'The Go Programming Language: A to Z', 'Learn Go',
'assets/images/products/placeholder.png'
,true,100,24.99,1, NOW());
