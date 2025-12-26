package classwork_1;

public class Classwork_1 {
	public static void main(String[] args) {
		// 1
		int age = 20;
        if (age >= 18) System.out.println("Вы взрослый");
        else System.out.println("Вы ещё ребёнок");
		// 2
        int num = -3;
        if (num > 0) System.out.println("Положительное");
        else System.out.println("Отрицательное или ноль");
		// 3
        int grade = 4;
        if (grade == 5) System.out.println("Отлично");
        else if (grade == 4) System.out.println("Хорошо");
        else if (grade == 3) System.out.println("Удовлетворительно");
        else System.out.println("Неудовлетворительно");
		// 4
        int temp = 15;
        if (temp > 25) System.out.println("Жарко");
        else if (temp >= 10) System.out.println("Тепло");
        else System.out.println("Холодно");
        //5
        int day = 3;
        switch (day) {
            case 1: System.out.println("Понедельник"); break;
            case 2: System.out.println("Вторник"); break;
            case 3: System.out.println("Среда"); break;
            case 4: System.out.println("Четверг"); break;
            case 5: System.out.println("Пятница"); break;
            case 6: System.out.println("Суббота"); break;
            case 7: System.out.println("Воскресенье"); break;
        //6
            char letter = 'B';
            switch (letter) {
                case 'A': System.out.println("Отлично"); break;
                case 'B': System.out.println("Хорошо"); break;
                case 'C': System.out.println("Средне"); break;
                case 'D': System.out.println("Плохо"); break;
                case 'F': System.out.println("Не сдал"); break;

         //7
                int a = 10, b = 5;
                if (a > b) System.out.println("Первое больше");
                else System.out.println("Второе не меньше");
         //8
                int hour = 21;
                if (hour >= 6 && hour <= 11) System.out.println("Утро");
                else if (hour >= 12 && hour <= 17) System.out.println("День");
                else if (hour >= 18 && hour <= 22) System.out.println("Вечер");
                else System.out.println("Ночь");

                // 9
                int month = 4;
                switch (month) {
                    case 12: case 1: case 2: System.out.println("Зима"); break;
                    case 3: case 4: case 5: System.out.println("Весна"); break;
                    case 6: case 7: case 8: System.out.println("Лето"); break;
                    case 9: case 10: case 11: System.out.println("Осень"); break;
                }

                // 10
                int n = 7;
                if (n % 2 == 0) System.out.println("Чётное");
                else System.out.println("Нечётное");

                // 11
                char gender = 'Ж';
                if (gender == 'М') System.out.println("Привет, парень!");
                else if (gender == 'Ж') System.out.println("Привет, девочка!");
                else System.out.println("Не понял пол");

                // 12
                int score = 88;
                if (score >= 90) System.out.println("5");
                else if (score >= 75) System.out.println("4");
                else if (score >= 50) System.out.println("3");
                else System.out.println("2");

                // 13
                String color = "зелёный";
                switch (color) {
                    case "красный": System.out.println("Стоять!"); break;
                    case "жёлтый": System.out.println("Ждать"); break;
                    case "зелёный": System.out.println("Идти"); break;
                }
//14
                int age2 = 10;
                if (age2 < 7) System.out.println("Детский сад");
                else if (age2 <= 17) System.out.println("Школа");
                else System.out.println("Взрослый");
//15
                int quarter = 2;
                switch (quarter) {
                    case 1: System.out.println("Зима"); break;
                    case 2: System.out.println("Весна"); break;
                    case 3: System.out.println("Лето"); break;
                    case 4: System.out.println("Осень"); break;
//16
                    int height = 185;
                    if (height < 150) System.out.println("Низкий");
                    else if (height <= 180) System.out.println("Средний");
                    else System.out.println("Высокий");
            //17
                    int points = 120;
                    if (points > 100) System.out.println("Победитель");
                    else System.out.println("Попробуй ещё");
//18
                    char op = '+';
                    switch (op) {
                        case '+': System.out.println("Сложение"); break;
                        case '-': System.out.println("Вычитание"); break;
                        case '*': System.out.println("Умножение"); break;
                        case '/': System.out.println("Деление"); break;
//19
                        String dayWord = "суббота";
                        switch (dayWord) {
                            case "понедельник": case "вторник": case "среда": case "четверг": case "пятница":
                                System.out.println("Рабочий день"); break;
                            case "суббота": case "воскресенье":
                                System.out.println("Выходной"); break;
//20
                                int lucky = 10, guess = 7;
                                if (guess == lucky) System.out.println("Угадал");
                                else System.out.println("Не угадал");
                                //21
                                int x = 10, y = 10;
                                if (x == y) System.out.println("Равны");
                                else System.out.println("Разные");
//22
                                int water = 50;
                                if (water <= 0) System.out.println("Лёд");
                                else if (water < 100) System.out.println("Вода");
                                else System.out.println("Пар");
//23
                                int code = 404;
                                switch (code) {
                                    case 200: System.out.println("OK"); break;
                                    case 404: System.out.println("Не найдено"); break;
                                    case 500: System.out.println("Ошибка сервера"); break;

//24
                                    int pets = 2;
                                    if (pets == 0) System.out.println("Нет питомцев");
                                    else if (pets == 1) System.out.println("Один питомец");
                                    else System.out.println("Много питомцев");
//25
                                    int behavior = 3;
                                    if (behavior < 4) System.out.println("Поговорим с родителями и получишь ремнем");
                                    else System.out.println("Молодец");
//26
                                    int planet = 3;
                                    switch (planet) {
                                        case 1: System.out.println("Меркурий"); break;
                                        case 2: System.out.println("Венера"); break;
                                        case 3: System.out.println("Земля"); break;
                                        case 4: System.out.println("Марс"); break;
                                        case 5: System.out.println("Юпитер"); break;
                                        case 6: System.out.println("Сатурн"); break;
                                        case 7: System.out.println("Уран"); break;
                                        case 8: System.out.println("Нептун"); break;
//27
                                        int wind = 40;
                                        if (wind > 50) System.out.println("Ураган");
                                        else if (wind >= 30) System.out.println("Сильный ветер");
                                        else System.out.println("Спокойно");
//28
                                        int answer = 4;
                                        if (answer == 4) System.out.println("Правильно!");
                                        else System.out.println("Неправильно");
//29
                                        int size = 36;
                                        if (size < 35)
                                            System.out.println("Детский");
                                        else if (size <= 42)
                                            System.out.println("Женский");
                                        else
                                            System.out.println("Мужской");
                                        //30
                                        String lang = "ru";
                                        switch (lang) {
                                            case "en": System.out.println("Hello"); break;
                                            case "ru": System.out.println("Здарова братишка"); break;
                                            case "es": System.out.println("Hola"); break;
                                            case "fr": System.out.println("Bonjour"); break;
                                        }
//31
                                        int players = 3;
                                        if (players == 2)
                                            System.out.println("Дуэль");
                                        else if (players <= 4)
                                            System.out.println("Малая команда");
                                        else
                                            System.out.println("Большая команда");
//32
                                        int battery = 15;
                                        if (battery < 20)
                                            System.out.println("Заряди телефон");
                                        else
                                            System.out.println("Всё ок");
//33
                                        int floor = 5;
                                        if (floor > 10)
                                            System.out.println("Высокий этаж");
                                        else
                                            System.out.println("Низкий этаж");
//34
                                        String subject = "математика";
                                        switch (subject) {
                                            case "математика": System.out.println("Любишь форумлы"); break;
                                            case "русский": System.out.println("Любишь морфологию"); break;
                                            case "физкультура": System.out.println("Любишь спорт"); break;
                                            default: System.out.println("Крутой предмет"); break;
//35
                                            int dice = 4;
                                            switch (dice) {
                                                case 1: System.out.println("Пропусти ход"); break;
                                                case 2: System.out.println("Иди вперёд"); break;
                                                case 3: System.out.println("Возьми карту"); break;
                                                case 4: System.out.println("Отдай деньги"); break;
                                                case 5: System.out.println("Бонус"); break;
                               //36
                                                int zodiak = 8;
                                                switch (zodiak) {
                                                    case 1: System.out.println("Козерог"); break;
                                                    case 2: System.out.println("Водолей"); break;
                                                    case 3: System.out.println("Рыбы"); break;
                                                    case 4: System.out.println("Овен"); break;
                                                    case 5: System.out.println("Телец"); break;
                                                    case 6: System.out.println("Близнецы"); break;
                                                    case 7: System.out.println("Рак"); break;
                                                    case 8: System.out.println("Лев(я лев кста)"); break;
                                                    case 9: System.out.println("Дева"); break;
                                                    case 10: System.out.println("Весы"); break;
                                                    case 11: System.out.println("Скорпион"); break;
                                                    case 12: System.out.println("Стрелец"); break;
                                                    //37
                                                    int candies = 8;
                                                    if (candies > 10)
                                                        System.out.println("не ешь а то слипнешься");
                                                    else
                                                        System.out.println("Можешь съесть");
                                                    //38
                                                    int country = 7;
                                                    switch (country) {
                                                        case 7: System.out.println("Москва"); break;
                                                        case 1: System.out.println("Вашингтон"); break;
                                                        case 2: System.out.println("Лондон"); break;
                                                        //39
                                                        String answer = "нет";
                                                        if (answer.equals("да"))
                                                            System.out.println("Согласен");
                                                        else if (answer.equals("нет"))
                                                            System.out.println("Не согласен");
                                                        else
                                                            System.out.println("Не понял");
//40
                                                    
                                                        int minutes = 2;
                                                        if (minutes < 5)
                                                            System.out.println("Ура уже бдует звонок");
                                                        else
                                                            System.out.println("Ещё долго");
                                                        //41
                                                        String transport = "автобус";
                                                        switch (transport) {
                                                            case "автобус": System.out.println("60 км/ч"); break;
                                                            case "метро": System.out.println("90 км/ч"); break;
                                                            case "велосипед": System.out.println("20 км/ч"); break;
                                                            //42
                                                            int react = 5;
                                                            switch (react) {
                                                                case 1: System.out.println("😢"); break;
                                                                case 2: System.out.println("🙂"); break;
                                                                case 3: System.out.println("😊"); break;
                                                                case 4: System.out.println("😁"); break;
                                                                case 5: System.out.println("🤩"); break;
//43
                                                                int mistakes = 4;
                                                                if (mistakes == 0)
                                                                    System.out.println("Отличнот");
                                                                else if (mistakes <= 3)
                                                                    System.out.println("Хорошо");
                                                                else
                                                                    System.out.println("Надо выучить");















            











                                    




































         
        
	}
}
