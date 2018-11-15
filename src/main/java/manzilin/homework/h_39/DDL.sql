CREATE SCHEMA "Homework";
CREATE TABLE "Homework"."Вещи на складе"
(
    "ID вещи" integer NOT NULL,
    "Тип вещи" text ,
    "Название вещи" text ,
    "Количество на складе" integer,
    "Фирма-производитель" text ,
    "Тип системы" text default "Yokogawa Centum CS3000",
    "Область учета" text default "СИ",
    "Дата последней проверки" text ,
    "Дата поставки" text ,
    PRIMARY KEY ("ID вещи"),
	CONSTRAINT positive_count CHECK ("Количество на складе" >= 0 )
);


CREATE TABLE "Homework"."Вещи на складе"
(
  "ID _места_уст"                     integer NOT NULL,
  "Области технологического процесса" text,
  "Шкаф"                              text,
  "Уровень_1_или_Узел"                text,
  "Уровень_2_Панель_или_Модуль"       text,
  "Уровень3_или_Канал"                text,
  "Количество  установлено"           integer,
  "ID вещи"                           integer,
  PRIMARY KEY ("ID _места_уст"),
  CONSTRAINT "Общее условие" FOREIGN KEY ("ID вещи")
  REFERENCES "Homework"."Вещи на складе" ("ID вещи"),
  CONSTRAINT data_valid CHECK ("Количество  установлено" >= 0
                               AND
                               "Уровень_1_или_Узел" is not null
                               AND
                               "Уровень_2_Панель_или_Модуль" is not null 
                               AND
                               "Уровень3_или_Канал" is not null);



CREATE TABLE "Homework"."Место хранения"
(
    "id_места_хрн" integer NOT NULL,
    "Стеллаж" integer,
    "Полка" integer,
    "№_коробки" text ,
    "Способ хранения вещи" text ,
    "Единица измерения вещей" text ,
    "ID вещи" integer,
    PRIMARY KEY ("id_места_хрн"),
    CONSTRAINT "Общее условие" FOREIGN KEY ("ID вещи")
        REFERENCES "Homework"."Вещи на складе" ("ID вещи") 
);

	


CREATE TABLE "Homework"."Модули ввода-вывода"
(
    "ID модуля" integer NOT NULL,
    "Тип вещи внутренний" text ,
    "Общее количество" integer,
    "ТИП колодки" text ,
    "клеммная колодка" text ,
    "ID вещи" integer,
    PRIMARY KEY ("ID модуля"),
    CONSTRAINT "Общее условие" FOREIGN KEY ("ID вещи")
        REFERENCES "Homework"."Вещи на складе" ("ID вещи") 
);

CREATE TABLE "Homework"."Тестовая станция"
(
    "id_тест" integer NOT NULL,
    "Название тестовой станции" text ,
    "Количество на тест станции" integer,
    "ID вещи" integer,
    PRIMARY KEY ("id_тест"),
    CONSTRAINT "Общее условие" FOREIGN KEY ("ID вещи")
        REFERENCES "Homework"."Вещи на складе" ("ID вещи") 
);
