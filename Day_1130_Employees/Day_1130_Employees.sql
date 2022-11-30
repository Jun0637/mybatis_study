CREATE TABLE usrinfo
(
    usrid VARCHAR2(20) PRIMARY KEY
);
SELECT
    e.employee_id empid
    ,e.first_name||''||e.last_name as ename
    ,e.hire_date as hiredate
    ,e.salary as salary
    ,d.department_name as departmentname   
FROM
    employees e, departments d
WHERE
    e.department_id = d.department_id
    ORDER BY 2;
---------
SELECT
    e.employee_id empid
    ,e.first_name||''||e.last_name as ename
    ,e.hire_date as hiredate
    ,e.salary as salary
    ,d.department_name as departmentname   
FROM
    employees e, departments d
WHERE
    e.department_id = d.department_id
AND
    e.employee_id = 100;
-------
SELECT
    e.employee_id empid
    ,e.first_name||''||e.last_name as ename
    ,e.hire_date as hiredate
    ,e.salary as salary
    ,d.department_name as departmentname   
FROM
    employees e, departments d
WHERE
    e.department_id = d.department_id
    AND
    e.department_id = 80;