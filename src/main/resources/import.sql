
INSERT INTO users (id, username, password) VALUES (default, "enol", "1234")
INSERT INTO roles (id, role_name) VALUES (default, "ROLE_ADMIN")
INSERT INTO roles (id, role_name) VALUES (default, "ROLE_USER")
INSERT INTO user_roles (user_id, role_id) VALUES (1,1)


