create table inventory_group (
                                          groupId varchar(255),
                                          groupName varchar(255),
                                          primary key (groupId)
);


create table inventory_item (
                              productId bigint auto_increment,
                              productCode varchar(255),
                              date TIMESTAMP,
                              sellDate TIMESTAMP,
                              supplierCode varchar(255),
                              productName varchar(255),
                              quantity bigint,
                              costPrice DECIMAL,
                              sellPrice DECIMAL,
                              brand varchar(255),
                              primary key (productId),
                              FOREIGN KEY (inventory_group_id) REFERENCES inventory_group(groupId)
);