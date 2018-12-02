CREATE TABLE public.category
(
  id   int PRIMARY KEY,
  name varchar(20)
);
insert into category
values (1, 'Овощи'),
       (2, 'Фрукты'),
       (3, 'Прочее');
CREATE TABLE public.sales
(
  id          int PRIMARY KEY,
  customer_id int,
  product_id  int,
  count       int
);
insert into sales
values (1, 1, 1, 2),
       (2, 2, 1, 3),
       (3, 2, 2, 1),
       (4, 3, 3, 1),
       (5, 3, 1, 4);
CREATE TABLE public.products
(
  id          int PRIMARY KEY,
  name        varchar(20),
  category_id int,
  quantity    int
);
insert into products
values (1, 'Огурцы', 1, 10),
       (2, 'Помидоры', 1, 2),
       (3, 'Бананы', 2, 5);
CREATE TABLE public.customer
(
  id   int PRIMARY KEY,
  name varchar(20)
);
insert into customer
values (1, 'John'),
       (2, 'Mike'),
       (3, 'Ann');
ALTER TABLE public.sales
  ADD CONSTRAINT S_C_fk FOREIGN KEY (customer_id)
    REFERENCES public.customer (id),
  ADD CONSTRAINT S_P_fk FOREIGN KEY (product_id)
    REFERENCES public.products (id);
ALTER TABLE public.products
  ADD CONSTRAINT P_C_fk FOREIGN KEY (category_id)
    REFERENCES public.category (id);