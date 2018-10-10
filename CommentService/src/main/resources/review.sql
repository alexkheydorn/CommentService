connect flashcard/p4ssw0rd;
drop table review; 
drop sequence review_seq;

create table review
(
    reviewId number(20) primary key,
    flashcardId number(20) not null,
    userId number(20) not null,
    commentStr varchar2(1000),
    rating number(5),
    reviewDate timestamp
);

create sequence review_seq;

create or replace trigger review_pk_trigger
before insert or update on review
for each row
begin 
    if inserting then
        select review_seq.nextVal into :new.reviewId from dual;
    elsif updating then 
        select :old.reviewId into :new.reviewId from dual;
    end if; 
end;
/

insert into review(reviewId, flashcardId, userId, commentStr, rating) 
    select review_seq.nextVal, 1, 1, 'This flashcard is alright.', 53 from dual;