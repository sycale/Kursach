create table jogs (
    id serial primary key,
    jogger_name varchar(255) not null,
    distance integer not null,
    date varchar(255) not null,
    time integer not null
);