create table if not exists category
(
    id bigint not null primary key,
    description varchar(255),
    name varchar(255) not null unique
);

create table if not exists product
(
    id bigint not null primary key,
    description varchar(255),
    name varchar(255) not null unique,
    inStock integer not null,
    price numeric(38, 2),
    category_id bigint not null
        constraint product_category_id_fk
            references category
);

create sequence if not exists category_id_seq increment by 50;
create sequence if not exists product_id_seq increment by 50;