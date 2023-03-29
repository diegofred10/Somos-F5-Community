
INSERT INTO profiles VALUES (default, 'https://github.com/SaulAguinaga', 'https://www.linkedin.com/in/saulaguinagaestevez/', 'Gijón', 'Saul', 'Aguinaga')
INSERT INTO users VALUES (default, 'saul@gmail.com','password', 1)
INSERT INTO posts VALUES (default, '2023-02-01','Recurso de prueba', 'Titulo de prueba', 1)
INSERT INTO users (id, username, password) VALUES (default, "enol", "1234",2)
INSERT INTO roles (id, role_name) VALUES (default, "ROLE_ADMIN")
INSERT INTO roles (id, role_name) VALUES (default, "ROLE_USER")
INSERT INTO user_roles (user_id, role_id) VALUES (1,1)


