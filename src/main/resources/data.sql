insert into teachers (id, name, profession) values (2, 'Roberto', 'Pedreiro');
insert into categories (id, title) values (1, 'construction');
insert into courses (title, category_id, teacher_id) values ('how to lay bricks', 1, 2);
insert into students (id, name, email) values (1, 'mauro', 'mauro@m.com');
insert into reviews (content, rating, student_id, course_id) values ('very nice', 4, 1, 1);