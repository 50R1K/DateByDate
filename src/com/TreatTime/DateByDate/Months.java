package com.TreatTime.DateByDate;

//Данный enum имеет стандартный модификатор доступа, так как нет смысла использовать его
//За пределами данного пакета
 enum Months {
    JANUARY(1),
    FEBRUARY(4),
    MARCH(4),
    APRIL(0),
    MAY(2),
    JUNE(5),
    JULY(0),
    AUGUST(3),
    SEPTEMBER(6),
    OCTOBER(1),
    NOVEMBER(4),
    DECEMBER(6);

    //Для вычисления дня недели у месяца есть специальный код
    private final int monthCode;

    Months(int monthCode) {
        this.monthCode = monthCode;
    }

    public int getMonthCode() {
        return monthCode;
    }

}
