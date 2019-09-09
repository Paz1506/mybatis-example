drop table if exists auto;

create table if not exists auto
(
  id    varchar(36),
  name  varchar(255),
  year  integer,
  owner varchar(255)
);

insert into auto (id, name, year, owner)
values ('00000000-0000-0000-0000-000000000000', 'TOYOTA', 1980, 'Owner1'),
       ('00000000-0000-0000-0000-000000000001', 'HONDA', 1990, 'Owner2'),
       ('00000000-0000-0000-0000-000000000002', 'NISSAN', 1995, 'Owner3');