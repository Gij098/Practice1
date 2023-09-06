fun main(args: Array<String>) {
    // Задание 1
    /* Объявили константу exercises со значением 13 и переменную
exercisesSolved со значением 0. По условию увеличили переменную exercisesSolved */

    var exercisesSolved : Int = 0
    val exercises : Int = 13
    exercisesSolved++

    // Задание 2
    /* Объявили константу типа Int, дали ей название myage,и присвоили ей наш возраст.
    * По условию увеличили переменную exercisesSolved*/

    val myage : Int = 18
    exercisesSolved++

    // Задание 3
    /*Объявили переменную типа Double, дали ей название youngerage и присвоили наш возраст в качестве
    начального значения.
    После, меняем значение переменной на среднее арифметическое нашего возраста и человека, которому 30 лет.
    По условию увеличили переменную exercisesSolved */

    var youngerage : Double = 18.0
    youngerage = (youngerage + 30) / 2
    println(youngerage)
    exercisesSolved++

    // Задание 4
    /* Создали константу под названием testNumber, взяли целое число на наш вкус.
    Создали другую константу под названием evenOdd, значением которой будет остаток от деления testNumber на 2.*/
    /*. Теперь меняем testNumber на какое-то другое число.
    И нас спрашивают "Что случилось с evenOdd?", evenOdd покажет остаток от деления числа на 2, которое хранит testNumber.
    По условию увеличили переменную exercisesSolved */

    val testNumber : Int = 3
    val evenOdd : Int = testNumber % 2 // 6 четное = 0 , 3 нечетное = 1
    println(evenOdd)
    exercisesSolved++

    // Задание 5
    /* Создали переменную под названием answer со значением 0.Увеличили ее значение на 1 и  добавили к результату 10.
     Умножили полученное число на 10 и сделали смещение вправо на 3.
     Тем самым получили конечный результат в ввиде числа 13.
     По условию увеличили переменную exercisesSolved*/
    var answer : Int = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3
    println(answer) // результат = 13
    exercisesSolved++

    // Задание 6
    /* Объявили age для компиляции. По условию нам необходимо выбрать var или val.
    Выбираем var так как переменная не постоянная. По условию увеличили переменную exercisesSolved */
    var age : Int
    age = 16
    print(age)
    age = 30
    print(age)
    exercisesSolved++

    //Задание 7
    /*Выяснили чему равен answer*/
    val a1 : Int = 46
    val b1 : Int = 10
    val answer1 : Int = (a1 * 100) + b1
    val answer2 : Int = (a1 * 100) + (b1 * 100)
    val answer3 : Int = (a1 * 100) + (b1 / 100)
    exercisesSolved++


    // Задание 8
    /*Здесь нас просят добавить скобки , сохраняя порядок осуществляемых операций,
    которые не должны влиять на результат. По условию увеличили переменную exercisesSolved */
    var brackets  =  (5 * 3) - ((4 / 2 )* 2)
    println(brackets)
    exercisesSolved++

    // Задание 9
    /*Объявили две константы а и b типа Double и присвоили обеим значения.
    Вычислили среднее арифметическое чисел a и b и поместили
    результат в константу под названием average. По условию увеличили переменную exercisesSolved*/
    val a : Double = 8.0
    val b : Double = 2.0
    val average : Double = (a + b) / 2
    println(average)
    exercisesSolved++

    // Задание 10
    /*Нас просят конвертировать температуру из °F в °С. Объявили константу под названием fahrenheit
    типа Double и присвоили ей значение.
    Вычислили температуру в °С и поместили результат в константу под названием celcius.
    По условию увеличили переменную exercisesSolved
*/
    val fahrenheit : Double = 60.0
    val celcius : Double = (fahrenheit - 32) / 1.8
    println(celcius)
    exercisesSolved++

    //Задание 12
    /* Объявили константу degrees типа Double и присвоили ей начальное значение.
    * Вычислили угол в радианах и сохранили результат в константе под названием radians.
    * По условию увеличили переменную exercisesSolved*/
    val degrees : Double = 45.0
    val radians : Double = degrees * Math.PI / 180
    exercisesSolved++
}
