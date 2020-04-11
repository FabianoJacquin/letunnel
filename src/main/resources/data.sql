INSERT INTO users (first_name, last_name, address, city, telephone,
    mail, username, password)
    VALUES ('Fabiano', 'Jacquin', 'Frazione Cerisey 21 - 11010 - Saint Rhemy en Bosses', 'Aosta', '347 3423385',
    'fabiano.jacquin@gmail.com', 'fjacquin', '12021973');
INSERT INTO users (first_name, last_name, address, city, telephone,
    mail, username, password)
    VALUES ('Carole', 'Proment', 'Frazione Cerisey 21 - 11010 - Saint Rhemy en Bosses', 'Aosta', '328 3826219',
    'carole.proment@gmail.com', 'cproment', '27031980');

INSERT INTO procedures_types (name, description) VALUES ( 'PCE', 'Procedura Comune di Esercizio');
INSERT INTO procedures_types (name, description) VALUES ( 'PCT', 'Procedura Tecnica di Esercizio');

INSERT INTO procedures (number, name, procedures_types_id) VALUES ( '03', 'Senso unico alernato', 1);
