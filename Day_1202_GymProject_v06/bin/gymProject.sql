-- 12월 2일 Gym Project 테이블 생성
CREATE TABLE gymmember
(
	usrid VARCHAR2(20) PRIMARY KEY,   -- 가입한 회원 아이디
	usrname VARCHAR2(30) NOT NULL,	  -- 회원 이름
	height NUMBER(6, 2) DEFAULT 0.0,  -- 회원의 키
	weight NUMBER(6, 2) DEFAULT 0.0,  -- 회원의 몸무게
	bmi NUMBER(6, 2) DEFAULT 0.0,     -- 회원의 BMI
	result VARCHAR2(30) CHECK(result IN('고도미만','중도비만','경도비만','과체중','정상','저체중')),
	joindate DATE DEFAULT SYSDATE

);
