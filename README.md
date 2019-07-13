# BirthDayFinder

This is an App Which Finds the WeekDay of any Date.

Here is the Logic of the App......

The Formula:

    (Year Code + Month Code + Century Code + Date Number – Leap Year Code) mod 7

Here’s How it Works
    I’ll run through an example with the date, 14 March 1897 — Einstein’s birthday.

The Year Code
    To calculate the Year Code, use this formula:

    (YY + (YY div 4)) mod 7

    YY is the last two digits of the year. For the year 1897, it’s 97.

    First, divide YY by 4 and discard the remainder: 97 div 4 = 24.

    Then add 24 back into the YY number, which is 97 in this case, resulting in 121.

    The next step is: 121 mod 7.

    “Mod” means to divide the number and keep only the remainder. For 121 mod 7, start removing sevens:

    10 x 7 is 70, leaving us with 51, because 121 – 70 = 51.
    7 x 7 = 49, and 51 – 49 = 2.
    We’ve removed all the sevens from 121 until we are left with a remainder of 2. That is the Year Code for 1897.

    You could use a number shape image like a swan to hold that in memory while you calculate the items below.

The Month Code
    This is easy — just memorize the number 033614625035:

    January = 0
    February = 3
    March = 3
    April = 6
    May = 1
    June = 4
    July = 6
    August = 2
    September = 5
    October = 0
    November = 3
    December = 5
    Now you have the Month Code. For Einsteins birthday in March, it is 3.


The Century Code
    You then need to apply an adjustment based on the century. In Great Britain, and what was to become the USA, the calendar system changed from the Julian Calendar to the Gregorian Calendar on 2 September 1752. The Gregorian Calendar began on 14 September 1752, skipping 11 days.

    Gregorian Dates
    For the Gregorian Calendar, remember the number 4206420:

    1700s = 4
    1800s = 2
    1900s = 0
    2000s = 6
    2100s = 4
    2200s = 2

Leap Year Code
    The other thing to take into account is whether you are dealing with a leap year. EDIT: If the date is in a January or February of a leap year, you have to subtract one from your total before the final step.

Gregorian Calendar
    If you can divide a Gregorian year by 4, it’s a leap year, unless it’s divisible by 100. But it is a leap year if it’s divisible by 400.

    1992 is a leap year because you can divide it by four.
    1900 is not a leap year because you can divide it by 100.
    2000 is a leap year because you can divide it by 400.

Einstein’s birthday was in 1897 which was not a leap year (0), so it doesn’t affect the outcome.

Calculating the Day
    Back to the original formula:

    (Year Code + Month Code + Century Code + Date Number – Leap Year Code) mod 7

For 14 March 1897, here are the results:

    Year Code: 2
    Month Code: 3
    Century Code: 2
    Date Number: 14 (the 14th of the month)
    Leap Year Code: 0
    So:

    (2 + 3 + 2 + 14) mod 7 = 21 mod 7 = 0

Match the resulting number in the list below, and you’ll have the day of the week:

    0 = Sunday
    1 = Monday
    2 = Tuesday
    3 = Wednesday
    4 = Thursday
    5 = Friday
    6 = Saturday
Einstein was born on a Sunday.
