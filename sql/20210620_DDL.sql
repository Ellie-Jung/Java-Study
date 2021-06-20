---2021-06-20 
-- DDL 복습 

CREATE TABLE PHONEINFO_BASIC (
                                IDX NUMBER(6) CONSTRAINT PBASIC_IDX_PK PRIMARY KEY,
                                FR_NAME VARCHAR2(20) CONSTRAINT PBASIC_NAME_NN NOT NULL,
                                FR_PHONENUMBER VARCHAR2(20)CONSTRAINT PBASIC_PNB_NN NOT NULL,
                                FR_EMAIL  VARCHAR2(20),
                                FR_ADDRESS VARCHAR2(20),
                                FR_REGDATE DATE DEFAULT SYSDATE
                              ) ;
                              
CREATE TABLE PHONEINFO_UNIV (
                                IDX NUMBER(6) CONSTRAINT UNIV_IDX_PK PRIMARY KEY,
                                FR_U_MAJOR VARCHAR2(20) DEFAULT 'N' CONSTRAINT UNIV_MAJOR_NN NOT NULL ,
                                FR_U_YEAR NUMBER(2) DEFAULT 1 CONSTRAINT UNIV_YEAR_NN  CHECK (FR_U_YEAR BETWEEN 0 AND 5) NOT NULL,
                                FR_REF NUMBER(7) CONSTRAINT UNIV_REF_FK REFERENCES PHONEINFO_BASIC(IDX) NOT NULL
                            );
                            
                            
CREATE TABLE PHONEINFO_COM (
                                IDX NUMBER(6) CONSTRAINT COM_IDX_PK PRIMARY KEY,
                                FR_C_COMPANY VARCHER2(20) DEFAULT 'N' CONSTRAINT COM_COMPANY_NN NOT NULL,
                                FR_REF NUMBER(6) CONSTRAINT COM_REF_FK REFRENCES PHONEINFO_BASIC(IDX) NOT NULL
                            );