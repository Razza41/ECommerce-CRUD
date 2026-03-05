CREATE TABLE produtos (
                          id BIGINT NOT NULL AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          description VARCHAR(255),
                          price DECIMAL(19, 2) NOT NULL,
                          sku VARCHAR(100) NOT NULL,
                          category VARCHAR(100) NOT NULL,
                          PRIMARY KEY (id)
);