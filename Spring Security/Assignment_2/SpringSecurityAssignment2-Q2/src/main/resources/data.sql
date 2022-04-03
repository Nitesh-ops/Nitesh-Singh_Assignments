INSERT INTO users(username,password,enabled)
values('Nitesh','$2a$10$lW9ncH/6LM0w5XuCNfBVee/DHNpH4shm1V/4njmLDf/nR8SgIPWsm',true);

INSERT INTO users(username,password,enabled)
values('Mohit','$2a$10$7j0CIOn0v4.z3306kucfq.8obSKAxiDdvinjBM6SORo3VwtgW17mi',true);

INSERT INTO authorities(username,authority)
values('Nitesh','ROLE_USER');

INSERT INTO authorities(username,authority)
values('Mohit','ROLE_ADMIN');