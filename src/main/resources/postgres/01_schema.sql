
DROP TABLE IF EXISTS bikes;
DROP SEQUENCE IF EXISTS bikes_id_seq;


CREATE SEQUENCE bikes_id_seq
    INCREMENT BY 1
    MINVALUE 30
    MAXVALUE 1000
    CACHE 1;


CREATE TABLE bikes (
    "id" int DEFAULT nextval('bikes_id_seq') NOT NULL,
    "name" varchar(100),
    "brand" varchar(100),
    "image" varchar(500),
    "description" varchar(1000),
    "units" int,
    "review" float8,
    PRIMARY KEY ("id")
);

