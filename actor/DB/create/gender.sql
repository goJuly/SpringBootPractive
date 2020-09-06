create table if not exists gender (
  id smallint not null,
  gender_text varchar(6) not null,
  primary key (id)
) engine = INNODB;