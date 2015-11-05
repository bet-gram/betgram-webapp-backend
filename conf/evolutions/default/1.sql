# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table blog (
  id                        varchar(255) not null,
  constraint pk_blog primary key (id))
;

create table club (
  id                        varchar(255) not null,
  full_name                 varchar(255),
  founded                   timestamp,
  owner                     varchar(255),
  website                   varchar(255),
  constraint pk_club primary key (id))
;

create sequence blog_seq;

create sequence club_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists blog;

drop table if exists club;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists blog_seq;

drop sequence if exists club_seq;

