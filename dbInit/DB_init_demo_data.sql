use baglab;

insert into baglab.role (name, description) values ('Administrator', 'Administrator has permissions. Have to manage baglab system.');
insert into baglab.role (name, description) values ('Moderator', 'Have to help customer make a valid order');
insert into baglab.role (name, description) values ('Customer', 'Confihure and order product.');
insert into baglab.role (name, description) values ('Factory', 'Create products according to orders.');
insert into baglab.role (name, description) values ('Guest', 'Configure bags, view info.');

insert into baglab.user_status (code, description) values ('Active', 'Default status');
insert into baglab.user_status (code, description) values ('Inactive', 'User lost of permission');
insert into baglab.user_status (code, description) values ('Bane', 'User is banned');

insert into baglab.order_status (code, description) values ('accepted', 'order is accepted and send to factory');
insert into baglab.order_status (code, description) values ('processing', 'order is processing by moderator');
insert into baglab.order_status (code, description) values ('denied', 'order is denied by moderator');

insert into baglab.material (name, price) values ('cotton', 20.2);
insert into baglab.material (name, price) values ('jeans', 28.1);
insert into baglab.material (name, price) values ('leather', 38.5);


insert into user  (login,password,email, firstname, lastname, roleId) values ('admin','admin','admin@gmail.com',  'Ivan', 'Onobrenko',1);
insert into user  (login,password,email, firstname, lastname, roleId) values ('Anna','annaPass', 'demoanna@gmail.com',  'John', 'Doe', 2);
insert into user  (login,password,email, firstname, lastname, roleId) values ('Peter','peterthebest','peter86@mail.ru','Petruchio','Petrov', 3);
insert into user  (login,password,email, firstname, lastname, roleId) values ('Finn','demopass','finnthehuman@gmail.com', 'John','Doe2',4);
insert into user  (login,password,email, firstname, lastname, roleId) values ('Karla','pass','turk@gmail.com', 'John','Doe3',2);

insert into baglab.shipping_adress (contact_name, country, street, apartment, state, city, zipcode, mobile, userId) values ('Ivan Onobrenko','Ukraine','Tkachenko','23','Kiev','Kiev','08187','+380683842905', 1);
insert into baglab.shipping_adress (contact_name, country, street, apartment, state, city, zipcode, mobile, userId) values ('John Doe','USA','Main Avenu','3','Alabama', 'Calera','AL 35040','+1 205-668-0402', 2);
