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
  betgram_code              varchar(255),
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
  ashots                    integer,
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
  b365h                     REAL,
  b365d                     REAL,
  b365a                     REAL,
  bsh                       REAL,
  bsd                       REAL,
  bsa                       REAL,
  bwh                       REAL,
  bwd                       REAL,
  bwa                       REAL,
  gbh                       REAL,
  gbd                       REAL,
  gba                       REAL,
  iwh                       REAL,
  iwd                       REAL,
  iwa                       REAL,
  lbh                       REAL,
  lbd                       REAL,
  lba                       REAL,
  psh                       REAL,
  psd                       REAL,
  psa                       REAL,
  soh                       REAL,
  sod                       REAL,
  soa                       REAL,
  sbh                       REAL,
  sbd                       REAL,
  sba                       REAL,
  sjh                       REAL,
  sjd                       REAL,
  sja                       REAL,
  syh                       REAL,
  syd                       REAL,
  sya                       REAL,
  vch                       REAL,
  vcd                       REAL,
  vca                       REAL,
  whh                       REAL,
  whd                       REAL,
  wha                       REAL,
  bb1x2                     integer,
  bb_mx_h                   REAL,
  bb_av_h                   REAL,
  bb_mx_d                   REAL,
  bb_av_d                   REAL,
  bb_mx_a                   REAL,
  bb_av_a                   REAL,
  bb_ou                     integer,
  bb_mx_more                REAL,
  bb_av_more                REAL,
  bb_mx_less                REAL,
  bb_av_less                REAL,
  gbmore                    REAL,
  gbless                    REAL,
  b365more                  float,
  b365less                  REAL,
  bb_ah                     REAL,
  bb_ahh                    REAL,
  bb_mx_ahh                 REAL,
  bb_av_ahh                 REAL,
  bb_mx_aha                 REAL,
  bb_av_aha                 REAL,
  constraint pk_statistic primary key (id))
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

