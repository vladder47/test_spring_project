BEGIN;

CREATE TABLE products
(
    id          BIGSERIAL PRIMARY KEY,
    title       VARCHAR(255),
    description VARCHAR(5000),
    category    VARCHAR(255),
    price       NUMERIC(8, 2),
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO products (title, description, category, price)
VALUES ('Notebook DELL', 'Very fast and ultra light', 'NOTEBOOKS', 400.0),
       ('Iphone', 'Fast charge', 'PHONES', 200.0),
       ('Samsung TV', 'Bright colors and 4K resolution', 'TV', 600.0),
       ('Notebook HP', 'Notebook for business', 'NOTEBOOKS', 500.0),
       ('Samsung Galaxy A10', 'Ultra performance', 'PHONES', 150.0),
       ('Philips TV', 'Bright colors and high resolution', 'TV', 450.0);

CREATE TABLE furniture
(
    id          BIGSERIAL PRIMARY KEY,
    title       VARCHAR(255),
    description VARCHAR(5000),
    price       NUMERIC(8, 2),
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO furniture (title, description, price)
VALUES ('Desk', 'FULLERTON MODULAR BLACK DESK WITH TWO LEGS', 600.0),
       ('Bed', 'PARKER STORAGE BED', 1000.0),
       ('Chair', 'GRANT LOW-BACK OFFICE CHAIR', 400.0),
       ('Cabinet', 'INLINE BRASS FILING CABINET', 650.0);

CREATE TABLE document
(
    id          BIGSERIAL PRIMARY KEY,
    title       VARCHAR(255),
    description VARCHAR(5000),
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO document (title, description)
VALUES  ('Document 1', 'Description document 1'),
        ('Document 2', 'Description document 2'),
        ('Document 3', 'Description document 3'),
        ('Document 4', 'Description document 4');