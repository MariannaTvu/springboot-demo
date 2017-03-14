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



insert into user  (login,password,email, roleId) values ('admin','admin','admin@gmail.com',1);
insert into user  (login,password,email, roleId) values ('Anna','annaPass','demoanna@gmail.com',2);
insert into user  (login,password,email, roleId) values ('Peter','peterthebest','peter86@mail.ru',3);
insert into user  (login,password,email, roleId) values ('Finn','demopass','finnthehuman@gmail.com',4);
insert into user  (login,password,email, roleId) values ('Karla','pass','turk@gmail.com',2);
