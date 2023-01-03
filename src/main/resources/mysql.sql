create table article(
    articleId varchar(128) primary key ,
    userId varchar(128),
    title varchar(128),
    createDate datetime,
    subsNum bigint,
    commentNum bigint
);

create table article_content(
    articleId varchar(128),
    content varchar(1024),
    serial_number bigint
);

insert into article values ()

select title,createDate from article order by (subsNum + commentNum) DESC limit 20;

select title,createDate from article where userId like ? or title like ? or content like ?;