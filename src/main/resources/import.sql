INSERT INTO profiles (id_profile, github, linkedin, location, name, surname) VALUES (default, "github", "linkedin", "Gijon", "Pedro", "picapiedras")
INSERT INTO users (id_user, email, password, profile_id) VALUES (default, "hola@jaja.xd", "1234", 1)
INSERT INTO roles (id_role, name) VALUES (1, "ROLE_ADMIN")
INSERT INTO roles (id_role, name) VALUES (2, "ROLE_USER")
INSERT INTO user_roles (id_user,id_role) VALUES (1, 2)

