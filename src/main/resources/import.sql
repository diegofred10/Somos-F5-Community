-- INSERT INTO profiles (id_profile, github, linkedin, location, name, surname) VALUES (default, "github", "linkedin", "Gijon", "Pedro", "picapiedras")
-- INSERT INTO user_roles (user_id, role_id) VALUES (1,1)
-- INSERT INTO users (id_user, email, password, profile_id) VALUES (default, "hola@jaja.xd", "1234", 1)
INSERT INTO users (id, username, password) VALUES (default, "enol", "1234")
INSERT INTO roles (id, role_name) VALUES (default, "ROLE_ADMIN")
INSERT INTO roles (id, role_name) VALUES (default, "ROLE_USER")
INSERT INTO user_roles (user_id, role_id) VALUES (1,1)

-- INSERT INTO users_roles (id_user,id_role) VALUES (1, 1)

