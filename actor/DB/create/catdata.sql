create table if not exists catdata (
  id smallint not null,
  name varchar(20) not null,
  place varchar(40) not null,
  primary key (id)
) engine = INNODB;