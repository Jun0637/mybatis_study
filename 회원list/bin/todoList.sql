
DROP TABLE todolist;
DROP TABLE personal;
DROP SEQUENCE todolist_seq;


CREATE TABLE personal
(   email VARCHAR2(20) PRIMARY KEY,
    passwd VARCHAR2(20)NOT NULL,
    usrname VARCHAR2(20) NOT NULL
);



CREATE TABLE todolist
(   seqnon NUMBER PRIMARY KEY,
    email VARCHAR2(20) NOT NULL REFERENCES personal(email)on delete cascade ,
    regdate DATE DEFAULT sysdate,
    todo VARCHAR2(3000)DEFAULT '���Ͼ���',
    importance VARCHAR2(10) CHECK (importance IN ('����', '����', '����')),
    categories VARCHAR2(6)DEFAULT CHECK (categories IN ('����','ȸ��'))
);


CREATE SEQUENCE todolist_seq;


