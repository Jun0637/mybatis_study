-- 11�� 29��
-- java�� �����ϱ� ���� ���� ���̺� �ۼ�

-- ȸ������ ���̺�
CREATE TABLE usrinfo
(
    usrid VARCHAR2(20) PRIMARY KEY,
    usrname VARCHAR2(20)NOT NULL,
    age NUMBER(3) DEFAULT 0
);

--���� ������ �־��
INSERT INTO usrinfo VALUES('aaa','�տ���',29);
INSERT INTO usrinfo VALUES('bbb','���Ȱ�',31);
INSERT INTO usrinfo VALUES('ccc','�����',25);
INSERT INTO usrinfo VALUES('ddd','�Ӳ���',39);
INSERT INTO usrinfo VALUES('fff','ȫ�浿',22);

--������ Ȯ��
SELECT*FROM usrinfo;

-- Ʈ����� ������(����)
COMMIT;