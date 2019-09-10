drop table if exists model;
drop table if exists auto;

create table if not exists auto
(
  id    varchar(36) primary key,
  name  varchar(255),
  year  integer,
  owner varchar(255)
);

create table if not exists model
(
  id      varchar(36) primary key,
  name    varchar(255),
  auto_id varchar(36)
);

ALTER TABLE IF EXISTS model
  ADD CONSTRAINT model_auto_fkey FOREIGN KEY (auto_id) REFERENCES auto (id);

insert into auto (id, name, year, owner)
values ('00000000-0000-0000-0000-000000000000', 'TOYOTA', 1980, 'Owner1'),
       ('00000000-0000-0000-0000-000000000001', 'HONDA', 1990, 'Owner2'),
       ('00000000-0000-0000-0000-000000000002', 'NISSAN', 1995, 'Owner3');

insert into model (id, name, auto_id)
values ('00000000-0000-0000-0000-000000000000', 'SUPRA', '00000000-0000-0000-0000-000000000000'),
       ('00000000-0000-0000-0000-000000000001', 'SURF', '00000000-0000-0000-0000-000000000000'),
       ('00000000-0000-0000-0000-000000000002', 'FIT', '00000000-0000-0000-0000-000000000001'),
       ('00000000-0000-0000-0000-000000000003', 'ACCORD', '00000000-0000-0000-0000-000000000001'),
       ('00000000-0000-0000-0000-000000000004', 'SKYLINE', '00000000-0000-0000-0000-000000000002'),
       ('00000000-0000-0000-0000-000000000005', 'JUKE', '00000000-0000-0000-0000-000000000002');