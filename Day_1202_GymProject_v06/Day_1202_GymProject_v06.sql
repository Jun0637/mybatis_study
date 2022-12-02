DROP TABLE gymmember;
CREATE TABLE gymmember
(
	usrid VARCHAR2(20) PRIMARY KEY,   -- ������ ȸ�� ���̵�
	usrname VARCHAR2(30) NOT NULL,	  -- ȸ�� �̸�
	height NUMBER(6, 2) DEFAULT 0.0,  -- ȸ���� Ű
	weight NUMBER(6, 2) DEFAULT 0.0,  -- ȸ���� ������
	bmi NUMBER(6, 2) DEFAULT 0.0,     -- ȸ���� BMI
	result VARCHAR2(30) CHECK(result IN('���̸�','�ߵ���','�浵��','��ü��','����','��ü��')),
	joindate DATE DEFAULT SYSDATE

);
SELECT * FROM gymmember;