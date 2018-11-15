create table CapeClassesFromWorm (
  Mover  int default 0,
  Shaker int default 0,
  Brute  int default 0,
  --   Breaker  int default 0,
  --   Master   int default 0,
  --   Tinker   int default 0,
  --   Blaster  int default 0,
  --   Thinker  int default 0,
  --   Striker  int default 0,
  --   Changer  int default 0,
  --   Trump    int default 0,
  --   Stranger int default 0,
  --   Sum      int default 0
  constraint must_be_positive
  check (Mover >= 0 and Shaker >= 0 and Brute >= 0)
);

create function skill()
  returns int as $$
SELECT cast(round(abs(random() * 10)) as int)
$$
language sql;

create function skills()
  RETURNS TABLE(Mover int, Shaker int) as $$
WITH RECURSIVE result AS (
    -- стартовая часть рекурсии (т.н. "anchor")
    SELECT 1 AS i, skill() AS Mover, skill() AS Shaker
        UNION
        -- рекурсивная часть
        SELECT i + 1 AS i, skill() AS Mover, skill() AS Shaker
        FROM result
        WHERE i < 1000)
select Mover, Shaker
from result
$$
language sql;

insert into CapeClasses (Mover, Shaker) SELECT * from skills()