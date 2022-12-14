DROP TABLE todolist;
DROP TABLE personal;
DROP SEQUENCE todolist_seq;

CREATE TABLE personal
(
    email  VARCHAR2(20) PRIMARY KEY
    , passwd VARCHAR2(20) NOT NULL
    , usrname VARCHAR2(20) NOT NULL
);

CREATE TABLE todolist
(
    seqno NUMBER PRIMARY KEY
    , email VARCHAR2(20) NOT NULL REFERENCES personal(email) ON DELETE CASCADE
    , regdate DATE DEFAULT sysdate
    , todo VARCHAR2(3000) DEFAULT '���� ����'
    , importance VARCHAR2(10) CHECK (importance IN ( '����', '����', '����')) 
    , categories CHAR(6) DEFAULT '����' CHECK (categories IN ( '����', 'ȸ��')) 
);

CREATE SEQUENCE todolist_seq;

INSERT INTO personal (email, passwd,usrname)
    VALUES('sonie@gmail.com', 'sonie','�����');
INSERT INTO personal (email, passwd,usrname)
    VALUES('kimya@gmail.com', 'kimya','�迬��');

INSERT INTO todolist (seqnon, email,todo, importance, categories)
    VALUES(todolist_seq.NEXTVAL,'sonie@gmail.com', '������Ʈ ��ȹ�� ����', '����','����');
INSERT INTO todolist (seqnon, email,todo, importance, categories)
    VALUES(todolist_seq.NEXTVAL,'kimya@gmail.com','������Ʈ ����', '����','����');


select * from personal;
INSERT INTO todolist (seqno, email,todo, importance, categories)
    VALUES(todolist_seq.NEXTVAL,'aa','������Ʈ ����', '����','����');
commit;


