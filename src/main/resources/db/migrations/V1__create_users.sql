CREATE SEQUENCE IF NOT EXISTS users_seq INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS users(
    id INT CHECK (id > 0) PRIMARY KEY NOT NULL DEFAULT NEXTVAL ('users_seq'),
    username VARCHAR(20) UNIQUE NOT NULL,
    password VARCHAR(20) UNIQUE NOT NULL
);