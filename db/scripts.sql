-- Database tables for sqlite
drop table mutant_dna;
-- Create mutant_person table
create table mutant_dna
(
	id integer
		constraint mutant_person_pk
			primary key autoincrement,
	mutant integer default 0 not null,
	dna text default "{dna:""}" not null
);

-- Database tables for mysql
-- Create mutant_person table
create table mutant_dna(
	id int not null AUTO_INCREMENT,
	mutant tinyint default 0 not null,
	dna text not null,
	primary key(id)
);
