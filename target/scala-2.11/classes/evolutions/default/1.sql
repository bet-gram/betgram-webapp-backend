# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table betting_odd (
  id                        bigserial not null,
  constraint pk_betting_odd primary key (id))
;

create table blog (
  id                        bigserial not null,
  constraint pk_blog primary key (id))
;

create table city (
  id                        bigserial not null,
  name                      varchar(255),
  website                   varchar(255),
  constraint pk_city primary key (id))
;

create table club (
  id                        bigserial not null,
  full_name                 varchar(255),
  founded                   timestamp,
  owner                     varchar(255),
  website                   varchar(255),
  constraint pk_club primary key (id))
;

create table confederation (
  id                        bigserial not null,
  name                      varchar(255),
  founded                   timestamp,
  website                   varchar(255),
  constraint pk_confederation primary key (id))
;

create table country (
  id                        bigserial not null,
  name                      varchar(255),
  national_language         varchar(255),
  currency                  varchar(255),
  constraint pk_country primary key (id))
;

create table ground (
  id                        bigserial not null,
  name                      varchar(255),
  capacity                  integer,
  record_attendance         integer,
  opened                    timestamp,
  constraint pk_ground primary key (id))
;

create table human (
  id                        bigserial not null,
  name                      varchar(255),
  date_of_birth             timestamp,
  constraint pk_human primary key (id))
;

create table league (
  id                        bigserial not null,
  founded                   timestamp,
  name                      varchar(255),
  website                   varchar(255),
  constraint pk_league primary key (id))
;

create table payment (
  id                        bigserial not null,
  amount                    float,
  constraint pk_payment primary key (id))
;

create table position (
  id                        bigserial not null,
  name                      varchar(255),
  constraint pk_position primary key (id))
;

create table statistic (
  id                        bigserial not null,
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
  b365h                     float,
  b365d                     float,
  b365a                     float,
  bsh                       float,
  bsd                       float,
  bsa                       float,
  bwh                       float,
  bwd                       float,
  bwa                       float,
  gbh                       float,
  gbd                       float,
  gba                       float,
  iwh                       float,
  iwd                       float,
  iwa                       float,
  lbh                       float,
  lbd                       float,
  lba                       float,
  psh                       float,
  psd                       float,
  psa                       float,
  soh                       float,
  sod                       float,
  soa                       float,
  sbh                       float,
  sbd                       float,
  sba                       float,
  sjh                       float,
  sjd                       float,
  sja                       float,
  syh                       float,
  syd                       float,
  sya                       float,
  vch                       float,
  vcd                       float,
  vca                       float,
  whh                       float,
  whd                       float,
  wha                       float,
  bb1x2                     integer,
  bb_mx_h                   float,
  bb_av_h                   float,
  bb_mx_d                   float,
  bb_av_d                   float,
  bb_mx_a                   float,
  bb_av_a                   float,
  bb_ou                     integer,
  bb_mx_more                float,
  bb_av_more                float,
  bb_mx_less                float,
  bb_av_less                float,
  gbmore                    float,
  gbless                    float,
  b365more                  float,
  b365less                  float,
  bb_ah                     float,
  bb_ahh                    float,
  bb_mx_ahh                 float,
  bb_av_ahh                 float,
  bb_mx_aha                 float,
  bb_av_aha                 float,
  constraint pk_statistic primary key (id))
;

create table subscription (
  id                        bigserial not null,
  expiration_date           timestamp,
  start_date                timestamp,
  active                    boolean,
  constraint pk_subscription primary key (id))
;

create table user (
  id                        bigserial not null,
  username                  varchar(255),
  password                  varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  email                     varchar(255),
  date_of_birth             timestamp,
  country                   varchar(255),
  city                      varchar(255),
  constraint pk_user primary key (id))
;




# --- !Downs

drop table if exists betting_odd cascade;

drop table if exists blog cascade;

drop table if exists city cascade;

drop table if exists club cascade;

drop table if exists confederation cascade;

drop table if exists country cascade;

drop table if exists ground cascade;

drop table if exists human cascade;

drop table if exists league cascade;

drop table if exists payment cascade;

drop table if exists position cascade;

drop table if exists statistic cascade;

drop table if exists subscription cascade;

drop table if exists user cascade;

