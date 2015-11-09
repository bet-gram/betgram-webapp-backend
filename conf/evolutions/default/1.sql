# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table climate (
  city                      varchar(255) not null,
  weather                   varchar(255),
  temp                      varchar(255),
  feelslike                 varchar(255),
  wind                      varchar(255),
  constraint pk_climate primary key (city))
;

create table ground (
  id                        bigserial not null,
  name                      varchar(255),
  city                      varchar(255),
  latitude                  REAL,
  longitude                 REAL,
  capacity                  integer,
  constraint pk_ground primary key (id))
;

create table historic_data (
  team                      varchar(255) not null,
  gs                        integer,
  gc                        integer,
  anp                       REAL,
  constraint pk_historic_data primary key (team))
;

create table match (
  id                        bigserial not null,
  date                      timestamp,
  home_betgram_code         varchar(255),
  away_betgram_code         varchar(255),
  home_goals                integer,
  away_goals                integer,
  winner                    varchar(255),
  location                  varchar(255),
  image                     varchar(255),
  past                      boolean,
  constraint pk_match primary key (id))
;

create table metrics (
  team                      varchar(255) not null,
  follower_count            integer,
  retweet_count             integer,
  weighted_retweet_index    integer,
  constraint pk_metrics primary key (team))
;

create table team (
  betgram_code              varchar(255) not null,
  name                      varchar(255),
  ground_id                 bigint,
  website                   varchar(255),
  logo                      varchar(255),
  constraint uq_team_ground_id unique (ground_id),
  constraint pk_team primary key (betgram_code))
;

alter table match add constraint fk_match_home_1 foreign key (home_betgram_code) references team (betgram_code);
create index ix_match_home_1 on match (home_betgram_code);
alter table match add constraint fk_match_away_2 foreign key (away_betgram_code) references team (betgram_code);
create index ix_match_away_2 on match (away_betgram_code);
alter table team add constraint fk_team_ground_3 foreign key (ground_id) references ground (id);
create index ix_team_ground_3 on team (ground_id);



# --- !Downs

drop table if exists climate cascade;

drop table if exists ground cascade;

drop table if exists historic_data cascade;

drop table if exists match cascade;

drop table if exists metrics cascade;

drop table if exists team cascade;

