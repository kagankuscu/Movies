insert into ticket_update (id,comment, ticket_id) values (1,'amazing',1),
                                                        (2,'nice',1),
                                                        (3,'i love Ireland', 1),
                                                        (4, 'nice movie', 2),
                                                        (5, 'i like it.', 3),
                                                        (6, 'I love.', 4),
                                                        (7, 'lorem in', 5),
                                                        (8, 'cat', 6),
                                                        (9, 'dog', 6),
                                                        (10, 'good', 7),
                                                        (11, 'o', 8),
                                                        (12, 'Muge Anli', 9),
                                                        (13, 'Zeynep', 7);


select TICKET.SUBJECT, TICKET_UPDATE.COMMENT from TICKET inner join TICKET_UPDATE  on TICKET.ID = TICKET_UPDATE.TICKET_ID 