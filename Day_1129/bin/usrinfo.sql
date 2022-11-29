-- 11월 29일
-- java와 연동하기 위한 샘플 테이블 작성

-- 회원정보 테이블
CREATE TABLE usrinfo
(
    usrid VARCHAR2(20) PRIMARY KEY,
    usrname VARCHAR2(20)NOT NULL,
    age NUMBER(3) DEFAULT 0
);

--샘플 데이터 넣어보기
INSERT INTO usrinfo VALUES('aaa','손오공',29);
INSERT INTO usrinfo VALUES('bbb','저팔계',31);
INSERT INTO usrinfo VALUES('ccc','사오정',25);
INSERT INTO usrinfo VALUES('ddd','임꺽정',39);
INSERT INTO usrinfo VALUES('fff','홍길동',22);

--데이터 확인
SELECT*FROM usrinfo;

-- 트렌잭션 마무리(저장)
COMMIT;