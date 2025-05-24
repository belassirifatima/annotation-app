-- Rôles
INSERT INTO role (id, nom_role) VALUES (1, 'ADMIN_ROLE'), (2, 'ANNOTATOR_ROLE');

-- Admin par défaut
INSERT INTO user (id, username, prenom, password, role_id) VALUES (1, 'admin', 'admin', '$2a$10$8y9h2y4Z3W8X1m2Y5v7QzO9KjX8t9p7s2b4r6w8x9y2z3q5w7e', 1);

-- Dataset de test
INSERT INTO dataset (id, nom_dataset, description, created_at) VALUES (1, 'Dataset1', 'Description test', '2025-05-21 17:00:00');

-- Tâche de test
INSERT INTO tache (id, id_limit, dataset_id) VALUES (1, 100, 1);