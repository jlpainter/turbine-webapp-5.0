-- -----------------------------------------------------------------------
-- mysql SQL script for schema turbine
-- -----------------------------------------------------------------------


drop table if exists ID_TABLE;



# -----------------------------------------------------------------------
# ID_TABLE
# -----------------------------------------------------------------------
CREATE TABLE ID_TABLE
(
    ID_TABLE_ID INTEGER NOT NULL,
    TABLE_NAME VARCHAR(255) NOT NULL,
    NEXT_ID INTEGER NOT NULL,
    QUANTITY INTEGER NOT NULL,
    PRIMARY KEY(ID_TABLE_ID),
    UNIQUE ID_TABLE_UQ_1 (TABLE_NAME)
);





