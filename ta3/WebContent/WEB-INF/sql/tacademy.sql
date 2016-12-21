CREATE DATABASE tacademydb;
DROP DATABASE tacademydb;

use tacademydb;

create table tbl_count(
	uid int(10) not null AUTO_INCREMENT PRIMARY key,
	account VARCHAR(64),
	password VARCHAR(64),
	address VARCHAR(512),
	phoneNO VARCHAR(64)
);


drop table tbl_count;

insert into
	 tbl_count (account, password, address, phoneNo) 
    values ('aaa', '111', '서울시 어디쯤', '010-2222-5678');

update tbl_count set password ='2222', address ='경기도 어디쯤' 
                     where account='IU';

delete from tbl_count where account='IU';

select * from tbl_count;


desc tbl_count;