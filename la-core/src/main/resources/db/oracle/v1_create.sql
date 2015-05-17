-- drop table
drop table number_lot;
drop table drawn_number;
drop table lot;


-- create
create table drawn_number(
  drawn_number number primary key
);

create table lot(
  lot_id number primary key,
  lot_number number,
  lot_date date
);

create table number_lot(
  drawn_number number not null,
  lot_id number not null,
  constraint fk_drawn_number foreign key (drawn_number) references drawn_number(drawn_number),
  constraint fk_lot foreign key (lot_id) references lot(lot_id)
);


-- drop sequence
drop SEQUENCE lot_seq;

-- create sequence
CREATE SEQUENCE lot_seq
START WITH     1
INCREMENT BY   1
NOCACHE
NOCYCLE;



