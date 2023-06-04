INSERT INTO users (IDUtilisateur, Login, Password, Type) VALUES (0, 'biblio', 'employee', 'Employee');
INSERT INTO users (IDUtilisateur, Login, Password, Type) VALUES (nextval('user_seq'), 'ks', 'passtest', 'Abonne');
INSERT INTO users (IDUtilisateur, Login, Password, Type) VALUES (nextval('user_seq'), 'sw', 'passtest', 'Abonne');
INSERT INTO users (IDUtilisateur, Login, Password, Type) VALUES (nextval('user_seq'), 'fa', 'passtest', 'Abonne');
INSERT INTO users (IDUtilisateur, Login, Password, Type) VALUES (nextval('user_seq'), 'ca', 'passtest', 'Abonne');
INSERT INTO users (IDUtilisateur, Login, Password, Type) VALUES (nextval('user_seq'), 'mt', 'passtest', 'Abonne');

INSERT INTO abonne (num_abonne, last_name, first_name, telephone, IDUtilisateur) VALUES (nextval('abonne_seq'),'KING', 'SMITH', '+33896321596',1);
INSERT INTO abonne (num_abonne, last_name, first_name, telephone, IDUtilisateur) VALUES (nextval('abonne_seq'),'SCOTT', 'WARD', '+33896321596',2);
INSERT INTO abonne (num_abonne, last_name, first_name, telephone, IDUtilisateur) VALUES (nextval('abonne_seq'),'FORD', 'ADAMS', '+33289921596',3);
INSERT INTO abonne (num_abonne, last_name, first_name, telephone, IDUtilisateur) VALUES (nextval('abonne_seq'),'CLARCK', 'ADAMS', '+33696323596',4);
INSERT INTO abonne (num_abonne, last_name, first_name, telephone, IDUtilisateur) VALUES (nextval('abonne_seq'),'MARTIN', 'FURMER', '+335578323596',5);


insert into auteur (num_auteur, nationalite_auteur, nom_auteur, prenom_auteur)
values(nextval('auteur_seq'), 'FRANC', 'NOIRAULT', 'CLAIRE');

insert into auteur (num_auteur, nationalite_auteur, nom_auteur, prenom_auteur)
values(nextval('auteur_seq'), 'FRANC', 'HEURTEL', 'OLIVIER');

insert into auteur (num_auteur, nationalite_auteur, nom_auteur, prenom_auteur)
values(nextval('auteur_seq'), 'SUI', 'BOISGON', 'HERVE');

insert into auteur (num_auteur, nationalite_auteur, nom_auteur, prenom_auteur)
values(nextval('auteur_seq'), 'ESPAG', 'BRUCHE', 'RUDI');

insert into auteur (num_auteur, nationalite_auteur, nom_auteur, prenom_auteur)
values(nextval('auteur_seq'), 'ANG', 'MULER', 'ANDRES');


insert into livre(isbn_livre, editeur, nbre_pages, titre, num_auteur)
values(1, 'ENI', 200, 'Administrer une BD', 1);

insert into livre(isbn_livre, editeur, nbre_pages, titre, num_auteur)
values(2, 'LAVOISIER', 300, 'Oracle 12c', 2);

insert into livre(isbn_livre, editeur, nbre_pages, titre, num_auteur)
values(3, 'EYROLLES', 450, 'Oracle SQL Server 2019', 3);

insert into livre(isbn_livre, editeur, nbre_pages, titre, num_auteur)
values(4, 'ENI', 125, 'NOSQL en pratique', 5);

insert into livre(isbn_livre, editeur, nbre_pages, titre, num_auteur)
values(5, 'LAVOISIER', 225, 'AMachine Learning', 2);

insert into livre(isbn_livre, editeur, nbre_pages, titre, num_auteur)
values(6, 'BOOK EDITION', 115, 'Python', 3);

insert into livre(isbn_livre, editeur, nbre_pages, titre, num_auteur)
values(7, 'EYROLLES', 320, 'IA vulgarisée', 4);

insert into livre(isbn_livre, editeur, nbre_pages, titre, num_auteur)
values(8, 'BOOK EDITION', 325, 'SQL server en pratique', 3);


insert into emprunt  (date_emprunt, date_retour_effective, date_retour_prevue, isbn_livre, num_abonne)
values(to_date('2020-02-20','yyyy-mm-dd'), to_date('2020-03-23','yyyy-mm-dd'), to_date('2020-03-20','yyyy-mm-dd'),2,1);

insert into emprunt (date_emprunt, date_retour_effective, date_retour_prevue, isbn_livre, num_abonne)
values(to_date('2020-03-22','yyyy-mm-dd'), to_date('2020-04-19','yyyy-mm-dd'), to_date('2020-04-22','yyyy-mm-dd'),3,2);
	  
insert into emprunt (date_emprunt, date_retour_effective, date_retour_prevue, isbn_livre, num_abonne)
values(to_date('2020-01-19','yyyy-mm-dd'), to_date('2020-01-20','yyyy-mm-dd'), to_date('2020-02-20','yyyy-mm-dd'),5,3);
	   
insert into emprunt (date_emprunt, date_retour_effective, date_retour_prevue, isbn_livre, num_abonne)
values(to_date('2021-05-01','yyyy-mm-dd'), to_date('2020-05-03','yyyy-mm-dd'), to_date('2020-06-02','yyyy-mm-dd'),6,4);
	   
insert into emprunt (date_emprunt, date_retour_effective, date_retour_prevue, isbn_livre, num_abonne)
values(to_date('2022-11-30','yyyy-mm-dd'), to_date('2023-01-02','yyyy-mm-dd'), to_date('2022-12-30','yyyy-mm-dd'),7,5);
	   
insert into emprunt (date_emprunt, date_retour_prevue, isbn_livre, num_abonne)
values(to_date('2023-03-30','yyyy-mm-dd'), to_date('2023-03-12','yyyy-mm-dd'),8,2);	 

insert into emprunt (date_emprunt, date_retour_prevue, isbn_livre, num_abonne)
values(to_date('2022-06-23','yyyy-mm-dd'), to_date('2022-05-22','yyyy-mm-dd'),8,2);

insert into emprunt (date_emprunt, date_retour_effective, date_retour_prevue, isbn_livre, num_abonne)
values(to_date('2022-09-22','yyyy-mm-dd'), to_date('2022-11-23','yyyy-mm-dd'), to_date('2022-10-23','yyyy-mm-dd'),5,5);

