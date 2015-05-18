-- drop table
DROP TABLE rel_number_lot;
DROP TABLE drawn_number;
DROP TABLE lot;

-- create
CREATE TABLE drawn_number(
  drawn_number_id NUMBER(19) PRIMARY KEY,
  number_val NUMBER(19) NOT NULL,
  CONSTRAINT uniq_number_val UNIQUE (number_val)
);

CREATE TABLE lot(
  lot_id NUMBER(19) PRIMARY KEY ,
  lot_number NUMBER(19) NOT NULL,
  lot_date DATE NOT NULL
);

CREATE TABLE rel_number_lot(
  rel_number_id NUMBER(19) PRIMARY KEY,
  drawn_number_id NUMBER(19) NOT NULL ,
  lot_id NUMBER(19) NOT NULL ,
  CONSTRAINT fk_drawn_number FOREIGN KEY (drawn_number_id) REFERENCES drawn_number(drawn_number_id),
  CONSTRAINT fk_lot FOREIGN KEY (lot_id) REFERENCES lot(lot_id)
);

-- drop sequence
DROP SEQUENCE lot_seq;
DROP SEQUENCE draw_number_seq;
DROP SEQUENCE rel_number_lot_seq;

-- create sequence

CREATE SEQUENCE lot_seq
START WITH     1
INCREMENT BY   1
NOCACHE
NOCYCLE;

CREATE SEQUENCE draw_number_seq
START WITH     1
INCREMENT BY   1
NOCACHE
NOCYCLE;


CREATE SEQUENCE rel_number_lot_seq
START WITH     1
INCREMENT BY   1
NOCACHE
NOCYCLE;




