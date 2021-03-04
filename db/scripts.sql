drop table person_dna;
-- Create mutant_person table
create table person_dna
(
	id integer
		constraint mutant_person_pk
			primary key autoincrement,
	mutant integer default 0 not null,
	dna text default "{dna:""}" not null
);

