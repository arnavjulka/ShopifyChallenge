create table inventory_group
(
    group_id   varchar(255) not null,
    department varchar(255),
    group_name varchar(255),
    primary key (group_id)
);


create table inventory_item
(
    product_id         bigint not null,
    added_on_date      date,
    brand              varchar(255),
    is_removed         boolean default false,
    product_code       varchar(255),
    product_name       varchar(255),
    quantity           integer,
    supplier_code      varchar(255),
    inventory_group_id varchar(255),
    primary key (product_id)
);
insert into inventory_item (added_on_date, brand, inventory_group_id, is_removed, product_code, product_name, quantity,
                            supplier_code, product_id)
values ('2022-01-18', "pepsi", "psp",false,"psp", "soda", 10, "asd",1);
values ('2022-01-18', "coca cola", "psp",false,"psp", "soda", 10, "asd",2);