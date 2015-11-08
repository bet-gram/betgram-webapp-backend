# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table betting_odd (
  id                        bigint not null,
  constraint pk_betting_odd primary key (id))
;

create table blog (
  id                        bigint not null,
  constraint pk_blog primary key (id))
;

create table city (
  id                        bigint not null,
  name                      varchar(255),
  website                   varchar(255),
  constraint pk_city primary key (id))
;

create table club (
  id                        bigint not null,
  full_name                 varchar(255),
  founded                   timestamp,
  owner                     varchar(255),
  website                   varchar(255),
  constraint pk_club primary key (id))
;

create table confederation (
  id                        bigint not null,
  name                      varchar(255),
  founded                   timestamp,
  website                   varchar(255),
  constraint pk_confederation primary key (id))
;

create table country (
  id                        bigint not null,
  name                      varchar(255),
  national_language         varchar(255),
  currency                  varchar(255),
  constraint pk_country primary key (id))
;

create table ground (
  id                        bigint not null,
  name                      varchar(255),
  capacity                  integer,
  record_attendance         integer,
  opened                    timestamp,
  constraint pk_ground primary key (id))
;

create table human (
  id                        bigint not null,
  name                      varchar(255),
  date_of_birth             timestamp,
  constraint pk_human primary key (id))
;

create table league (
  id                        bigint not null,
  founded                   timestamp,
  name                      varchar(255),
  website                   varchar(255),
  constraint pk_league primary key (id))
;

create table payment (
  id                        bigint not null,
  amount                    double,
  constraint pk_payment primary key (id))
;

create table position (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_position primary key (id))
;

create table statistic (
  id                        bigint not null,
  home                      varchar(255),
  away                      varchar(255),
  league                    varchar(255),
  fthg                      integer,
  ftag                      integer,
  ftr                       varchar(255),
  hthg                      integer,
  htag                      integer,
  htr                       varchar(255),
  attendance                integer,
  referee                   varchar(255),
  hs                        integer,
  as                        integer,
  hst                       integer,
  ast                       integer,
  hhw                       integer,
  ahw                       integer,
  hc                        integer,
  ac                        integer,
  hf                        integer,
  aw                        integer,
  ho                        integer,
  ao                        integer,
  hy                        integer,
  ay                        integer,
  hr                        integer,
  ar                        integer,
  hbp                       integer,
  abp                       integer,
  b365h                     double,
  b365d                     double,
  b365a                     double,
  bsh                       double,
  bsd                       double,
  bsa                       double,
  bwh                       double,
  bwd                       double,
  bwa                       double,
  gbh                       double,
  gbd                       double,
  gba                       double,
  iwh                       double,
  iwd                       double,
  iwa                       double,
  lbh                       double,
  lbd                       double,
  lba                       double,
  psh                       double,
  psd                       double,
  psa                       double,
  soh                       double,
  sod                       double,
  soa                       double,
  sbh                       double,
  sbd                       double,
  sba                       double,
  sjh                       double,
  sjd                       double,
  sja                       double,
  syh                       double,
  syd                       double,
  sya                       double,
  vch                       double,
  vcd                       double,
  vca                       double,
  whh                       double,
  whd                       double,
  wha                       double,
  bb1x2                     integer,
  bb_mx_h                   double,
  bb_av_h                   double,
  bb_mx_d                   double,
  bb_av_d                   double,
  bb_mx_a                   double,
  bb_av_a                   double,
  bb_ou                     integer,
  bb_mx_more                double,
  bb_av_more                double,
  bb_mx_less                double,
  bb_av_less                double,
  gbmore                    double,
  gbless                    double,
  b365more                  double,
  b365less                  double,
  bb_ah                     double,
  bb_ahh                    double,
  bb_mx_ahh                 double,
  bb_av_ahh                 double,
  bb_mx_aha                 double,
  bb_av_aha                 double,
  constraint pk_statistic primary key (id))
;

create sequence betting_odd_seq;

create sequence blog_seq;

create sequence city_seq;

create sequence club_seq;

create sequence confederation_seq;

create sequence country_seq;

create sequence ground_seq;

create sequence human_seq;

create sequence league_seq;

create sequence payment_seq;

create sequence position_seq;

create sequence statistic_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists betting_odd;

drop table if exists blog;

drop table if exists city;

drop table if exists club;

drop table if exists confederation;

drop table if exists country;

drop table if exists ground;

drop table if exists human;

drop table if exists league;

drop table if exists payment;

drop table if exists position;

drop table if exists statistic;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists betting_odd_seq;

drop sequence if exists blog_seq;

drop sequence if exists city_seq;

drop sequence if exists club_seq;

drop sequence if exists confederation_seq;

drop sequence if exists country_seq;

drop sequence if exists ground_seq;

drop sequence if exists human_seq;

drop sequence if exists league_seq;

drop sequence if exists payment_seq;

drop sequence if exists position_seq;

drop sequence if exists statistic_seq;

