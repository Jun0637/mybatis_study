--회원관리 프로그램에 필요한 테이블 정보

-- 컬럼 :
DROP TABLE addr;
DROP TABLE members;
DROP SEQUENCE addr_seq;

CREATE TABLE addr
(
    addrno        NUMBER PRIMARY KEY
    , city            VARCHAR2(20) CHECK (city IN ('서울시', '인천시', '부산시', '제주시'))
    , address      VARCHAR2(20)
);

INSERT INTO members VALUES('hong', '홍길동', 'hong@naver.com', 1);
INSERT INTO members VALUES('son', '손오공', 'son@naver.com', 2);
INSERT INTO members VALUES('ssao', '사오정', 'ssao@korea.com', 5);
INSERT INTO members VALUES('aaa', '저팔계', 'aaa@korea.com', 3);

SELECT * FROM members;

COMMIT;

CREATE TABLE members
(
    usrid             VARCHAR2(15) PRIMARY KEY
    , usrname     VARCHAR2(20) NOT NULL
    , email       VARCHAR2(30) UNIQUE NOT NULL
    , addrno     NUMBER REFERENCES addr(addrno)
);

CREATE SEQUENCE addr_seq;

INSERT INTO addr VALUES (addr_seq.NEXTVAL, '서울시', '종로구');
INSERT INTO addr VALUES (addr_seq.NEXTVAL, '인천시', '연수구');
INSERT INTO addr VALUES (addr_seq.NEXTVAL, '서울시', '강남구');
INSERT INTO addr VALUES (addr_seq.NEXTVAL, '부산시', '연제구');
INSERT INTO addr VALUES (addr_seq.NEXTVAL, '제주시', '북제주군');

SELECT * FROM addr;

COMMIT;


/*
	테이블 : member
	아이디(usrid pk 15), 이름(usrname not null 20), 이메일(email unique, not null 30)

	테이블 : addr
	일련번호 : (addrno PK -N)
	지역 : (city check('서울시', '인천시', '부산시', '제주시'), 20)
	구 : (address, 20)
	아이디 : (usrid FK 15)
	시퀀스 : addr_seq
*/

